package com.hefesoftpharmacy.parametrizacion;

import java.util.ArrayList;
import java.util.List;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ListView;
import android.widget.TextView;

import com.google.api.services.hefesoftpharmacy.model.MedicosCollection;
import com.hefesoft.pharmacy.localizacion.Mapa;
import com.hefesoftpharmacy.GlobalVars;
import com.hefesoftpharmacy.R;
import com.hefesoftpharmacy.AsyncTask.AsyncTaskCompleteListener;
import com.hefesoftpharmacy.AsyncTask.Listar_Medicos_Async;
import com.hefesoftpharmacy.adaptadores.AdaptadorMedicos;

public class Fragment_listado_ciclos extends Fragment {

	private View view;
	private ListView listaMedicos;
	private com.hefesoftpharmacy.adaptadores.AdaptadorMedicos AdaptadorMedicos;
	private FragmentActivity activity;
	private View mLoginFormView;
	private View mLoginStatusView;
	private List<com.google.api.services.hefesoftpharmacy.model.Medicos> listaCargada = new ArrayList<com.google.api.services.hefesoftpharmacy.model.Medicos>();
	private com.google.api.services.hefesoftpharmacy.model.Medicos MedicoSeleccionado;
	
	

	@Override
	public void onResume() {
		cargarMedicos();
		super.onResume();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		view = inflater.inflate(com.hefesoftpharmacy.R.layout.activity_lista_seleccion, container, false);
		
		if(listaCargada.size() == 0)
		{
			activity = getActivity();
			listaMedicos = (ListView)view.findViewById(R.id.list_seleccion);
			mLoginFormView = view.findViewById(R.id.contenedor_list_seleccion);
			mLoginStatusView = view.findViewById(R.id.progressanimator_container);
			
			listaMedicos.setOnItemLongClickListener(elementoSeleccionado);
			
			Listar_Medicos_Async listarMedicos = new Listar_Medicos_Async(activity, cargaMedicos);
			listarMedicos.execute(this);
			
			showProgress(true, "Cargando medicos");
			registerForContextMenu(listaMedicos);
		}
		return view;
	}	
	
	
	private OnItemLongClickListener elementoSeleccionado = new OnItemLongClickListener() {

		@Override
		public boolean onItemLongClick(AdapterView<?> parent, View view,
				int position, long id) {
			GlobalVars.PosicionSeleccionada = position;
			MedicoSeleccionado = listaCargada.get(position);
			return false;
		}
	};
	
	
	@Override
	public void onCreateContextMenu(ContextMenu menu, View v,
			ContextMenuInfo menuInfo) {
		// TODO Auto-generated method stub
		super.onCreateContextMenu(menu, v, menuInfo);
		menu.add("Editar");
		menu.add("Mapa");
	}

	@Override
	public boolean onContextItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		super.onContextItemSelected(item);
		
		if(item.getTitle() == "Editar")
		{
			((Medicos)getActivity()).mViewPager.setCurrentItem(1);			
			((Medicos)getActivity()).MedicoSeleccionado=MedicoSeleccionado;
			((Medicos)getActivity()).modoInsertarActualizar();
		}
		if(item.getTitle() == "Mapa")
		{	
			Intent in = new Intent(activity, Mapa.class);
			in.putExtra("Cordenada", MedicoSeleccionado.getCordenadas());
			in.putExtra("Marcador", MedicoSeleccionado.getNombres() + " " + MedicoSeleccionado.getApellidos());
	    	startActivity(in);
		}
		return super.onContextItemSelected(item);
	}

	public void adicionarEelemnto(com.google.api.services.hefesoftpharmacy.model.Medicos medico)
	{
		if(listaCargada == null)
		{
			listaCargada = new ArrayList<com.google.api.services.hefesoftpharmacy.model.Medicos>();
		}
		
		listaCargada.add(medico);
		AdaptadorMedicos = new AdaptadorMedicos(activity, listaCargada);
		AdaptadorMedicos.notifyDataSetChanged();
		listaMedicos.setAdapter(AdaptadorMedicos);
	}


	AsyncTaskCompleteListener<MedicosCollection> cargaMedicos = new AsyncTaskCompleteListener<MedicosCollection>() {
				@Override
		public void onTaskComplete(MedicosCollection result) {
			
			listaCargada = result.getItems();
			if(listaCargada != null)
			{
				cargarMedicos();
			}
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
		
		void cargarMedicos() {
			if(listaCargada == null)
			{
				listaCargada = new ArrayList<com.google.api.services.hefesoftpharmacy.model.Medicos>();
			}
			
			AdaptadorMedicos = new AdaptadorMedicos(activity, listaCargada);
			AdaptadorMedicos.notifyDataSetChanged();
			listaMedicos.setAdapter(AdaptadorMedicos);
			showProgress(false, "Cargando");
		}

		public void actualizarEelemnto(com.google.api.services.hefesoftpharmacy.model.Medicos medico) {
			
			if(GlobalVars.PosicionSeleccionada != -1)
			{
				listaCargada.remove(GlobalVars.PosicionSeleccionada);
				listaCargada.add(GlobalVars.PosicionSeleccionada, medico);
				
				AdaptadorMedicos = new AdaptadorMedicos(activity, listaCargada);
				AdaptadorMedicos.notifyDataSetChanged();
				listaMedicos.setAdapter(AdaptadorMedicos);
				showProgress(false, "Cargando");
			}
			
		}

}
