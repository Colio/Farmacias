package com.hefesoftpharmacy.panel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import java.lang.reflect.Field;
import org.json.JSONException;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.DragShadowBuilder;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.api.client.util.DateTime;
import com.google.api.services.hefesoftpharmacy.model.Panel;
import com.google.api.services.hefesoftpharmacy.model.VisitaPlaneada;
import com.hefesoft.pharmacy.localizacion.Mapa;
import com.hefesoftpharmacy.GlobalVars;
import com.hefesoftpharmacy.R;
import com.hefesoftpharmacy.AsyncTask.AsyncTaskCompleteListener;
import com.hefesoftpharmacy.AsyncTask.Eliminar_Visita_Planeada_Async;
import com.hefesoftpharmacy.AsyncTask.Insertar_Visita_Planeada_Async;
import com.hefesoftpharmacy.AsyncTask.Listar_Panel_Async;
import com.hefesoftpharmacy.AsyncTask.Listar_Visitas_Planeadas_Async;
import com.hefesoftpharmacy.interaction.Interface_Interacion;
import com.hefesoftpharmacy.interaction.MyDragEventListener;
import com.hefesoftpharmacy.util.CalendarsHandler;

public class Fragment_listado_panel extends Fragment {

	LinearLayout targetLayout;
	Calendar dateAndTime=Calendar.getInstance();
	private View view;
	MyDragEventListener myDragEventListener;
	private int global_year;
	private int global_monthOfYear;
	private int global_dayOfMonth;
	private ListView listaPanel, listTarget;
	private com.hefesoftpharmacy.adaptadores.AdaptadorPanel AdaptadorPanel;
	private com.hefesoftpharmacy.adaptadores.AdaptadorPanel AdaptadorPanelTarget;
	private FragmentActivity activity;
	private View mLoginFormView;
	private View mLoginStatusView;
	private List<com.google.api.services.hefesoftpharmacy.model.Panel> listaCargada = new ArrayList<com.google.api.services.hefesoftpharmacy.model.Panel>();
	private List<com.google.api.services.hefesoftpharmacy.model.Panel> listaCargadaTarget = new ArrayList<com.google.api.services.hefesoftpharmacy.model.Panel>();
	int posicionSeleccionadoSource;
	int posicionSeleccionadoTarget;
	private com.google.api.services.hefesoftpharmacy.model.Panel PanelSeleccionado;
	private com.google.api.services.hefesoftpharmacy.model.Panel PanelSeleccionadoTarget;
	Boolean Guardando = false;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		view = inflater.inflate(com.hefesoftpharmacy.R.layout.activity_lista_seleccion_drag_drop, container, false);
		
		setHasOptionsMenu(true);
		
		targetLayout = (LinearLayout)view.findViewById(R.id.targetlayout);
		
		//Evento de drag and drop
        myDragEventListener = new MyDragEventListener(drag);
		
		if(listaCargada.size() == 0)
		{
			activity = getActivity();
			listaPanel = (ListView)view.findViewById(R.id.list_seleccion);
			listTarget = (ListView)view.findViewById(R.id.list_seleccion_drop);
			
			mLoginFormView = view.findViewById(R.id.contenedor_list_seleccion);
			mLoginStatusView = view.findViewById(R.id.progressanimator_container);
			
			Listar_Panel_Async listarMedicos = new Listar_Panel_Async(activity, cargaPaneles);
			listarMedicos.execute(this);
			
			Listar_Visitas_Planeadas_Async visitasPlaneadas = new Listar_Visitas_Planeadas_Async(activity, visitasPlaneadasCargadas);
			
			global_year = dateAndTime.get(Calendar.YEAR);
			global_monthOfYear = dateAndTime.get(Calendar.MONTH);
			global_dayOfMonth = dateAndTime.get(Calendar.DAY_OF_MONTH);
			
			visitasPlaneadas.year = dateAndTime.get(Calendar.YEAR);
			visitasPlaneadas.month = dateAndTime.get(Calendar.MONTH);
			visitasPlaneadas.day = dateAndTime.get(Calendar.DAY_OF_MONTH);
			visitasPlaneadas.dependencias = true;
			visitasPlaneadas.execute(this);
			
			showProgress(true, "Cargando paneles");
			registerForContextMenu(listTarget);
			
		}
		
		 final String SOURCELIST_TAG = "listSource";
	     final String TARGETLIST_TAG = "listTarget";
	     final String TARGETLAYOUT_TAG = "targetLayout";
	     listaPanel.setTag(SOURCELIST_TAG);
	     listTarget.setTag(TARGETLIST_TAG);
	     targetLayout.setTag(TARGETLAYOUT_TAG);
		
		listaPanel.setOnItemLongClickListener(clickSource);
		listTarget.setOnItemClickListener(targetClickListener);
		listTarget.setOnItemLongClickListener(targetLongClickListener);
		
		listaPanel.setOnDragListener(myDragEventListener);
        targetLayout.setOnDragListener(myDragEventListener);
		
		return view;
	}
	
	
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		
		if(item.getItemId() == R.id.menu_cambiar_fecha)
		{
			DatePickerDialog dialog = createDialogWithoutDateField(cambioFecha);					
			dialog.setTitle("Visualizar para el mes");
			dialog.show();
		}
		
		return super.onOptionsItemSelected(item);
	}


	private OnItemLongClickListener targetLongClickListener = new OnItemLongClickListener() {

		@Override
		public boolean onItemLongClick(AdapterView<?> arg0, View arg1,
				int postionTarget, long arg3) {
			posicionSeleccionadoTarget = postionTarget;			
			PanelSeleccionadoTarget = listaCargadaTarget.get(postionTarget);
			return false;
		}
	};

	OnItemClickListener targetClickListener = new OnItemClickListener() {

		@Override
		public void onItemClick(AdapterView<?> arg0, View arg1, int postionTarget,
				long arg3) {
			posicionSeleccionadoTarget = postionTarget;			
			PanelSeleccionadoTarget = listaCargadaTarget.get(postionTarget);
		}
	};
	
	AsyncTaskCompleteListener<List<VisitaPlaneada>> visitasPlaneadasCargadas = new AsyncTaskCompleteListener<List<VisitaPlaneada>>() {
		
		@Override
		public void onTaskComplete(List<VisitaPlaneada> result) {
		
			if(result != null)
			{			
				if(listaCargadaTarget.size() > 0)
				{
					listaCargadaTarget.clear();
				}
				
				for(VisitaPlaneada pivot : result)
				{
					pivot.getPanelEntity().setComodin(pivot.getId().getId());
					listaCargadaTarget.add(pivot.getPanelEntity());
				}
				
				AdaptadorPanelTarget = new com.hefesoftpharmacy.adaptadores.AdaptadorPanel(activity, listaCargadaTarget);
				AdaptadorPanelTarget.notifyDataSetChanged();
				listTarget.setAdapter(AdaptadorPanelTarget);
			}
			else
			{
				listaCargadaTarget.clear();
				AdaptadorPanelTarget = new com.hefesoftpharmacy.adaptadores.AdaptadorPanel(activity, listaCargadaTarget);
				AdaptadorPanelTarget.notifyDataSetChanged();
				listTarget.setAdapter(AdaptadorPanelTarget);
			}

		}
	};
	
	private OnItemLongClickListener clickSource = new OnItemLongClickListener() {

		@Override
		public boolean onItemLongClick(AdapterView<?> arg0, View v,
				int position, long arg3) {

			DragShadowBuilder myShadow = new com.hefesoftpharmacy.interaction.Interaction_Planeacion.MyDragShadowBuilder(v);
			PanelSeleccionado = (com.google.api.services.hefesoftpharmacy.model.Panel) listaCargada.toArray()[position]; 	
			ClipData.Item item = new ClipData.Item("Panel");
			
		     String[] clipDescription = {ClipDescription.MIMETYPE_TEXT_PLAIN};
		     ClipData dragData = new ClipData((CharSequence)v.getTag(),
		       clipDescription,
		       item);
			
		     
			 v.startDrag(dragData, //ClipData
		                    myShadow,  //View.DragShadowBuilder
		                    (com.google.api.services.hefesoftpharmacy.model.Panel) listaCargada.toArray()[position],  //Object myLocalState
		                    0);    //flags
			return true;
		}
	};

	
	private Interface_Interacion<View> drag = new Interface_Interacion<View>() {
		
		@Override
		public void onDragToListViewComplete(View result) throws JSONException {
			if(result == targetLayout){				
				
				if(!validarVisitado(PanelSeleccionado))
				{
					Toast.makeText(activity, "El elmento ya se encuentra en la lista", Toast.LENGTH_SHORT).show();
				}
				else if(listaCargada.get(posicionSeleccionadoSource).getContactosOriginal() > 0 )
				{
					guardarVisita(global_year, global_monthOfYear, global_dayOfMonth);
				}
				else 
				{
					Toast.makeText(activity, "Sin contactos restantes", Toast.LENGTH_SHORT).show();
				}
			}
		}
	};
	
	
	private void quitarContacto() {
		listaCargada.get(posicionSeleccionadoSource).setContactosOriginal(listaCargada.get(posicionSeleccionadoSource).getContactosOriginal() -1);
		AdaptadorPanel.notifyDataSetChanged();
	}; 
	
	@Override
	public void onCreateContextMenu(ContextMenu menu, View v,
			ContextMenuInfo menuInfo) {
		// TODO Auto-generated method stub
		super.onCreateContextMenu(menu, v, menuInfo);		
		menu.add("Mapa");
		menu.add("Eliminar");
	}

	@Override
	public boolean onContextItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		super.onContextItemSelected(item);
		
		if(item.getTitle() == "Mapa")
		{
			   String NombreVisitar = "";			   
			   String Cordenada  = "";
			   
			   
		        if(PanelSeleccionadoTarget.getUnidadVisitaEntity().getMedicosEntity() != null )
		        {	        	
		        	com.google.api.services.hefesoftpharmacy.model.Medicos medico = PanelSeleccionadoTarget.getUnidadVisitaEntity().getMedicosEntity();
		        	try {
						NombreVisitar = medico.getNombres() + " " + medico.getApellidos();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}		        	
		        
		        	
		        	try {
						Cordenada = medico.getCordenadas();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		        }
		        
		        else if(PanelSeleccionadoTarget.getUnidadVisitaEntity().getFactory() != null )
		        {
		           	com.google.api.services.hefesoftpharmacy.model.Farmacias farmacia = PanelSeleccionadoTarget.getUnidadVisitaEntity().getFarmaciasEntity();
		        	try {
						NombreVisitar = farmacia.getNombre();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}		        
		        	
		        	try {
						Cordenada = farmacia.getCordenadas();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		        }
			
			
			Intent in = new Intent(activity, Mapa.class);
			in.putExtra("Cordenada", Cordenada);
			in.putExtra("Marcador", NombreVisitar);
	    	startActivity(in);
		}
		
		if(item.getTitle() == "Eliminar")
		{	
			Eliminar_Visita_Planeada_Async eliminar = new Eliminar_Visita_Planeada_Async(activity, eliminarListener);
			eliminar.idVisitaPlaneada = PanelSeleccionadoTarget.getComodin();
			eliminar.execute(this);
			
			listaCargadaTarget.remove(posicionSeleccionadoTarget);
			AdaptadorPanelTarget = new com.hefesoftpharmacy.adaptadores.AdaptadorPanel(activity, listaCargadaTarget);
			AdaptadorPanelTarget.notifyDataSetChanged();
			listTarget.setAdapter(AdaptadorPanelTarget);
		}
	
		return super.onContextItemSelected(item);
	}
	
	AsyncTaskCompleteListener<VisitaPlaneada> eliminarListener = new AsyncTaskCompleteListener<VisitaPlaneada>() {
		
		@Override
		public void onTaskComplete(VisitaPlaneada result) {
			// TODO Auto-generated method stub
			
		}
	};
	
	private DatePickerDialog createDialogWithoutDateField(OnDateSetListener ExpiryDateSetListener){		
	    DatePickerDialog dpd = new DatePickerDialog(activity, ExpiryDateSetListener,dateAndTime.get(Calendar.YEAR), dateAndTime.get(Calendar.MONTH), dateAndTime.get(Calendar.DAY_OF_MONTH));
	    try{
	    Field[] datePickerDialogFields = dpd.getClass().getDeclaredFields();
	    for (Field datePickerDialogField : datePickerDialogFields) { 
	        if (datePickerDialogField.getName().equals("mDatePicker")) {
	            datePickerDialogField.setAccessible(true);
	            DatePicker datePicker = (DatePicker) datePickerDialogField.get(dpd);
	            Field datePickerFields[] = datePickerDialogField.getType().getDeclaredFields();
	            for (Field datePickerField : datePickerFields) {
	               if ("mCalendarView".equals(datePickerField.getName())
	            		   ) {
	                  datePickerField.setAccessible(true);
	                  Object dayPicker = new Object();
	                  dayPicker = datePickerField.get(datePicker);
	                  ((View) dayPicker).setVisibility(View.GONE);
	               }
	            }
	         }
	      }
	    }catch(Exception ex){
	    }
	  return dpd;
	}
	
	
	public OnDateSetListener cambioFecha = new OnDateSetListener() {
		
		@Override
		public void onDateSet(DatePicker view, int year, int monthOfYear,
				int dayOfMonth) {
			
			Listar_Visitas_Planeadas_Async visitasPlaneadas = new Listar_Visitas_Planeadas_Async(activity, visitasPlaneadasCargadas);
			visitasPlaneadas.year = year;
			visitasPlaneadas.month = monthOfYear;
			visitasPlaneadas.day = dayOfMonth;
			visitasPlaneadas.dependencias = true;
			visitasPlaneadas.execute(this);
			
			global_year = year;
			global_monthOfYear = monthOfYear;
			global_dayOfMonth = dayOfMonth;
		}
	};
	
	 public OnDateSetListener ExpiryDateSetListener = new OnDateSetListener() {
			
			@Override
			public void onDateSet(DatePicker datePicker, int year, int monthOfYear,
					int dayOfMonth) {
				
			   if(!Guardando)
			   {   
			   }
			}

				};
	
		
		
		
		private AsyncTaskCompleteListener<VisitaPlaneada> visitaInsertada = new AsyncTaskCompleteListener<VisitaPlaneada>() {
			
			@Override
			public void onTaskComplete(VisitaPlaneada result) {
				
				listaCargadaTarget.add(PanelSeleccionado);
				
				if(listaCargadaTarget != null)
				AdaptadorPanelTarget = new com.hefesoftpharmacy.adaptadores.AdaptadorPanel(activity, listaCargadaTarget);
				AdaptadorPanelTarget.notifyDataSetChanged();
				listTarget.setAdapter(AdaptadorPanelTarget);

				quitarContacto();
				showProgress(false, "Cargando");
				Guardando = false;
			}
		};
		
		
		public Boolean validarVisitado(Panel elementoAgregar)
		{
			Boolean result = true;
			for(Panel panel : listaCargadaTarget)
			{
				if(elementoAgregar.getId().getId() == panel.getId().getId())
				{
					result = false;
					break;
				}
				if(elementoAgregar.getId().getId().equals(panel.getId().getId()))
				{
					result = false;
					break;
				}
			}
			
			return result;
		}
	
	AsyncTaskCompleteListener<List<Panel>> cargaPaneles = new AsyncTaskCompleteListener<List<Panel>>() {
		
		@Override
		public void onTaskComplete(List<Panel> result) {
			
			if(listaCargada == null)
			{
				listaCargada = new ArrayList<com.google.api.services.hefesoftpharmacy.model.Panel>();
			}
			
			listaCargada = result;
			
			if(listaCargada != null && listaCargada.size() > 0)
			{
				AdaptadorPanel = new com.hefesoftpharmacy.adaptadores.AdaptadorPanel(activity, listaCargada);
				AdaptadorPanel.notifyDataSetChanged();
				listaPanel.setAdapter(AdaptadorPanel);
			}
			showProgress(false, "Cargando");			
		}
	};

	
	private void guardarVisita(int year,
			int monthOfYear, int dayOfMonth) {
		@SuppressWarnings("deprecation")
		   Date date = new Date(year - 1900, monthOfYear, dayOfMonth,0,0,0);
		   
		   String NombreVisitar = "";
		   String Direccion  = "";
		   String Cordenada  = "";
		   int ColorAgenda = Color.YELLOW; 
		   
	        if(PanelSeleccionado.getUnidadVisitaEntity().getMedicosEntity() != null )
	        {
	        	ColorAgenda = Color.BLUE;
	        	
	        	com.google.api.services.hefesoftpharmacy.model.Medicos medico = PanelSeleccionado.getUnidadVisitaEntity().getMedicosEntity();
	        	try {
					NombreVisitar = medico.getNombres() + " " + medico.getApellidos();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	        	
	        	try {
					Direccion = medico.getDireccion();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        	
	        	try {
					Cordenada = medico.getCordenadas();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        }
	        
	        else if(PanelSeleccionado.getUnidadVisitaEntity().getFactory() != null )
	        {
	        	ColorAgenda = Color.RED;
	        	
	        	com.google.api.services.hefesoftpharmacy.model.Farmacias farmacia = PanelSeleccionado.getUnidadVisitaEntity().getFarmaciasEntity();
	        	try {
					NombreVisitar = farmacia.getNombre();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	        	try {
					Direccion = farmacia.getDireccion();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        	
	        	try {
					Cordenada = farmacia.getCordenadas();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        }
		   
		   
		   
			
			long idGeneradoCalendario = CalendarsHandler.addEvent(year,
					monthOfYear+1,
					dayOfMonth,0,"Visita planeada a " + NombreVisitar ,
					"Se a planeado una visita a " + NombreVisitar,
					"Hefesoft Pharmacy", 
					Direccion ,ColorAgenda);
			
			CalendarsHandler.showCalendar(idGeneradoCalendario);
		   
		   
		    Guardando = true;
			Insertar_Visita_Planeada_Async insertarVisitaPlaneada = new Insertar_Visita_Planeada_Async(activity, visitaInsertada);
			
			VisitaPlaneada visita = new VisitaPlaneada();
			visita.setEmail(GlobalVars.UsuarioEmail);
			visita.setIdPanel(PanelSeleccionado.getId().getId());
			visita.setIdGeneradoCalendario(idGeneradoCalendario);
			visita.setCordenadas(Cordenada);
			
			Date value = date;
			DateTime fechaYHora = new DateTime(value);
			visita.setFechaYHora(fechaYHora);
			
			insertarVisitaPlaneada.visita = visita;
			insertarVisitaPlaneada.execute(activity);
			showProgress(true, "Guardadndo visita");
	}

	

		// Metodo que muestra la animacion del cargador
		@TargetApi(Build.VERSION_CODES.HONEYCOMB_MR2)
		public void showProgress(final boolean show, String mensaje) {
			
			TextView tx = (TextView)view.findViewById(R.id.progressanimator_text);
			tx.setText(mensaje);
			
			if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB_MR2) {
				int shortAnimTime = getResources().getInteger(
						android.R.integer.config_shortAnimTime);
		
							
				mLoginStatusView.setVisibility(View.VISIBLE);
				mLoginStatusView.animate().setDuration(shortAnimTime)
						.alpha(show ? 1 : 0)
						.setListener(new AnimatorListenerAdapter() {
							@Override
							public void onAnimationEnd(Animator animation) {
								mLoginStatusView.setVisibility(show ? View.VISIBLE
										: View.GONE);
							}
						});
		
				mLoginFormView.setVisibility(View.VISIBLE);
				mLoginFormView.animate().setDuration(shortAnimTime)
						.alpha(show ? 0 : 1)
						.setListener(new AnimatorListenerAdapter() {
							@Override
							public void onAnimationEnd(Animator animation) {
								mLoginFormView.setVisibility(show ? View.GONE
										: View.VISIBLE);
							}
						});
			} else {
				
				mLoginStatusView.setVisibility(show ? View.VISIBLE : View.GONE);
				mLoginFormView.setVisibility(show ? View.GONE : View.VISIBLE);
			}
		}
}
