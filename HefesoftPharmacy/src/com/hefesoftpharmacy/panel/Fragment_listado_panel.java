package com.hefesoftpharmacy.panel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.provider.CalendarContract.Events;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ContextMenu.ContextMenuInfo;
import android.widget.ListView;
import android.widget.TextView;

import com.google.api.services.hefesoftpharmacy.model.Panel;
import com.hefesoft.pharmacy.localizacion.Mapa;
import com.hefesoftpharmacy.R;
import com.hefesoftpharmacy.AsyncTask.AsyncTaskCompleteListener;
import com.hefesoftpharmacy.AsyncTask.Listar_Panel_Async;
import com.hefesoftpharmacy.parametrizacion.Medicos;

public class Fragment_listado_panel extends Fragment {

	private View view;
	private ListView listaPanel;
	private com.hefesoftpharmacy.adaptadores.AdaptadorPanel AdaptadorPanel;
	private FragmentActivity activity;
	private View mLoginFormView;
	private View mLoginStatusView;
	private List<com.google.api.services.hefesoftpharmacy.model.Panel> listaCargada = new ArrayList<com.google.api.services.hefesoftpharmacy.model.Panel>();
	private com.google.api.services.hefesoftpharmacy.model.Panel PanelSeleccionado;
	
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		view = inflater.inflate(com.hefesoftpharmacy.R.layout.activity_lista_seleccion, container, false);
		
//		long result = CalendarsHandler.addEvent(2013,3,3,0,"Otra cosa","Descripcion de prueba","jose douglas", "Casa" ,Color.YELLOW);
//		CalendarsHandler.showCalendar(result);
		
		if(listaCargada.size() == 0)
		{
			activity = getActivity();
			listaPanel = (ListView)view.findViewById(R.id.list_seleccion);
			mLoginFormView = view.findViewById(R.id.contenedor_list_seleccion);
			mLoginStatusView = view.findViewById(R.id.progressanimator_container);
			
			Listar_Panel_Async listarMedicos = new Listar_Panel_Async(activity, cargaPaneles);
			listarMedicos.execute(this);
			
			showProgress(true, "Cargando paneles");
			registerForContextMenu(listaPanel);
		}
		return view;
	}	
	
	@Override
	public void onCreateContextMenu(ContextMenu menu, View v,
			ContextMenuInfo menuInfo) {
		// TODO Auto-generated method stub
		super.onCreateContextMenu(menu, v, menuInfo);
		menu.add("Planear");
	}

	@Override
	public boolean onContextItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		super.onContextItemSelected(item);
		
		if(item.getTitle() == "Planear")
		{
			
		}
	
		return super.onContextItemSelected(item);
	}
	
	
	AsyncTaskCompleteListener<List<Panel>> cargaPaneles = new AsyncTaskCompleteListener<List<Panel>>() {
		
		@Override
		public void onTaskComplete(List<Panel> result) {
			
			if(listaCargada == null)
			{
				listaCargada = new ArrayList<com.google.api.services.hefesoftpharmacy.model.Panel>();
			}
			
			listaCargada = result;
			
			AdaptadorPanel = new com.hefesoftpharmacy.adaptadores.AdaptadorPanel(activity, listaCargada);
			AdaptadorPanel.notifyDataSetChanged();
			listaPanel.setAdapter(AdaptadorPanel);
			showProgress(false, "Cargando");			
		}
	};


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
