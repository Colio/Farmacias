package com.hefesoftpharmacy.menu;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.ProgressBar;

import com.hefesoftpharmacy.R;
import com.hefesoftpharmacy.adaptadores.Adaptador_Menu_Parametrizacion;

public class Menu_Fragment_parametrizacion extends Fragment
{

	View view;
	List<com.hefesoftpharmacy.menu.Menu> lstMenu = new ArrayList<com.hefesoftpharmacy.menu.Menu>();
	Activity actividad;
	ListView lstMenuControl;
	ProgressBar barraProgreso;
	Adaptador_Menu_Parametrizacion adaptador_Menu;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		actividad = getActivity();
		view = inflater.inflate(R.layout.template_lista, container, false);
		lstMenuControl = (ListView)view.findViewById(R.id.template_lista_listview);
		barraProgreso = (ProgressBar)view.findViewById(R.id.template_list_progress_bar);
		
		lstMenuControl.setOnItemClickListener(elementoSeleccionado);
		
		adaptador_Menu = new Adaptador_Menu_Parametrizacion(actividad, lstMenu);
		lstMenuControl.setAdapter(adaptador_Menu);
		adaptador_Menu.notifyDataSetChanged();
		
		return view;
	}
	
	OnItemClickListener elementoSeleccionado = new OnItemClickListener() {

		@Override
		public void onItemClick(AdapterView<?> arg0, View arg1, int position,
				long id) {
			
			com.hefesoftpharmacy.menu.Menu ElementoSeleccionado = (com.hefesoftpharmacy.menu.Menu)lstMenuControl.getItemAtPosition(position);
			
			if(ElementoSeleccionado.id == 1)
			{
				((MenuParametrizacion)getActivity()).closeMenu();
				((MenuParametrizacion)getActivity()).gotoMedicos();
			}
			
			else if(ElementoSeleccionado.id == 2)
			{
				((MenuParametrizacion)getActivity()).closeMenu();
				((MenuParametrizacion)getActivity()).gotoIngresos();
			}
			
			else if(ElementoSeleccionado.id == 3)
			{
				((MenuParametrizacion)getActivity()).closeMenu();
				((MenuParametrizacion)getActivity()).gotoMap();
			}
			
			else if(ElementoSeleccionado.id == 4)
			{
				((MenuParametrizacion)getActivity()).closeMenu();
				((MenuParametrizacion)getActivity()).gotoGraficas();
			}
			
		}
	};
	
	
	@Override
	public void onCreate(Bundle savedInstanceState) {		
		super.onCreate(savedInstanceState);
		lstMenu.add(new com.hefesoftpharmacy.menu.Menu("Medicos", "Medicos", "1",1));
	}	
	
	
	

}
