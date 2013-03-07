package com.hefesoftpharmacy.menu;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.KeyEvent;

import com.korovyansk.android.slideout.SlideoutHelper;

public class MenuParametrizacion extends FragmentActivity{

	private ActionBar actionBar;

	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	   
	     actionBar = getActionBar();	
	    
	    mSlideoutHelper = new SlideoutHelper(this);
	    mSlideoutHelper.activate();
	    getSupportFragmentManager().beginTransaction().add(com.korovyansk.android.slideout.R.id.slideout_placeholder, new Menu_Fragment_parametrizacion(), "menu").commit();
	    
	    actionBar.hide();	    
	    mSlideoutHelper.open();
	}

	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if(keyCode == KeyEvent.KEYCODE_BACK){
			mSlideoutHelper.close();
			actionBar.show();
			return true;
		}
		return super.onKeyDown(keyCode, event);
	}


	public SlideoutHelper getSlideoutHelper(){
		return mSlideoutHelper;
	}
	
	private SlideoutHelper mSlideoutHelper;
	
	public void gotoMap()
	{
//		Intent in = new Intent(MenuActivity.this, Mapa_Oficinas.class);
//		startActivity(in);
	}
	
	public void gotoIngresos()
	{
//		Intent in = new Intent(MenuActivity.this, Ingresos.class);
//		startActivity(in);
	}
	
	public void gotoCentrosCosto()
	{
//		Intent in = new Intent(MenuActivity.this, Centros_Costo.class);
//		startActivity(in);
	}
	
	public void closeMenu()
	{
		mSlideoutHelper.close();
		actionBar.hide();
	}


	public void gotoGraficas() {
//		Intent in = new Intent(MenuActivity.this, Graficas.class);
//		startActivity(in);
	}


	public void gotoMedicos() {
		// TODO Auto-generated method stub
		Intent in = new Intent(MenuParametrizacion.this, com.hefesoftpharmacy.parametrizacion.Medicos.class);
		startActivity(in);
	}

}
