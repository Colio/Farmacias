package com.hefesoftpharmacy.parametrizacion;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;

import com.hefesoftpharmacy.R;
import com.hefesoftpharmacy.menu.MenuParametrizacion;
import com.hefesoftpharmacy.util.SectionsPagerAdapter;
import com.korovyansk.android.slideout.SlideoutActivity;

public class Medicos extends FragmentActivity implements ActionBar.TabListener {

	 SectionsPagerAdapter mSectionsPagerAdapter;    
	 ViewPager mViewPager;
	 ActionBar actionBar;
	 public com.google.api.services.hefesoftpharmacy.model.Medicos MedicoSeleccionado = null;
	 
	 
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fragment_template);
		
		mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager()); 
        actionBar = getActionBar();
        
        	
	    actionBar.setHomeButtonEnabled(true);
	    getActionBar().setDisplayHomeAsUpEnabled(true);
	    actionBar.setIcon(R.drawable.ic_parametrizacion);
        
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(mSectionsPagerAdapter);
        
        mViewPager.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {
                actionBar.setSelectedNavigationItem(position);
                
                if(position == 1)
                {
                	((Fragment_Insertar_Medicos)mSectionsPagerAdapter.getItem(1)).modo = "Guardar";
                	((Fragment_Insertar_Medicos)mSectionsPagerAdapter.getItem(1)).limpiarCajarTexto();
                	actionBar.getSelectedTab().setText("Nuevo medico");
                }
            }
        });
        
		cargarOpciones();
	}

	// Agrega fragmentos a la actividad
	private void cargarOpciones() {
		mSectionsPagerAdapter.notifyDataSetChanged();
		mSectionsPagerAdapter.addFragment(new Fragment_listado_medicos(), "Medicos");
		mSectionsPagerAdapter.addFragment(new Fragment_Insertar_Medicos(), "Nuevo medico");
		mSectionsPagerAdapter.notifyDataSetChanged();
		generarMenu();
	}

	public void modoInsertarActualizar() {
		actionBar.getSelectedTab().setText("Actualizar " + MedicoSeleccionado.getNombres() + " " + MedicoSeleccionado.getApellidos());
		((Fragment_Insertar_Medicos)mSectionsPagerAdapter.getItem(1)).inicializarGuardarActualizar(MedicoSeleccionado);
	}
	
	public void adicionarElementoCreado(com.google.api.services.hefesoftpharmacy.model.Medicos medico) {
		((Fragment_listado_medicos)mSectionsPagerAdapter.getItem(0)).adicionarEelemnto(medico);
		mViewPager.setCurrentItem(0);
		actionBar.getSelectedTab().setText("Nuevo medico");
	}
	
	public void actualizarElementoCreado(com.google.api.services.hefesoftpharmacy.model.Medicos medico) {
		((Fragment_listado_medicos)mSectionsPagerAdapter.getItem(0)).actualizarEelemnto(medico);
		mViewPager.setCurrentItem(0);
		actionBar.getSelectedTab().setText("Nuevo medico");
	}
	
	
	
	
	private void generarMenu() {
		
		getActionBar().removeAllTabs();
		
        for (int i = 0; i < mSectionsPagerAdapter.getCount(); i++) {        
            actionBar.addTab(
                    actionBar.newTab()
                            .setText(mSectionsPagerAdapter.getPageTitle(i))
                            .setTabListener(this));
        }
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_panel_visitador, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		if(item.getItemId() == android.R.id.home){
			
			int Orientation = getResources().getConfiguration().orientation;
			int width = 0;
			
			if(android.content.res.Configuration.ORIENTATION_LANDSCAPE == Orientation)
			{
				width = (int)TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 400, getResources().getDisplayMetrics());
			}
			
			else if(android.content.res.Configuration.ORIENTATION_PORTRAIT == Orientation)
			{
				width = (int)TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 50, getResources().getDisplayMetrics());
			}
			
			else 
			{
				width = (int)TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 30, getResources().getDisplayMetrics());
			}
			
			SlideoutActivity.prepare(Medicos.this, R.id.Medicos_Contenedor, width);
			startActivity(new Intent(Medicos.this, MenuParametrizacion.class));
			overridePendingTransition(0, 0);
		}	
		return true;
	}

	@Override
	public void onTabReselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTabSelected(Tab tab, FragmentTransaction ft) {
		mViewPager.setCurrentItem(tab.getPosition());
		
	}

	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}
}
