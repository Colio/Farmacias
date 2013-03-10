package com.hefesoftpharmacy.menu;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.KeyEvent;

import com.korovyansk.android.slideout.SlideoutHelper;

public class MenuPanel extends FragmentActivity{

	private ActionBar actionBar;

	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	   
	    actionBar = getActionBar();	
	    
	    mSlideoutHelper = new SlideoutHelper(this);
	    mSlideoutHelper.activate();
	    getSupportFragmentManager().beginTransaction().add(com.korovyansk.android.slideout.R.id.slideout_placeholder, new Menu_Fragment_panel(), "menu").commit();
	    
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
	
	public void closeMenu()
	{
		mSlideoutHelper.close();
		actionBar.hide();
	}


	public void gotoPlaneacion() {
		
		Intent in = new Intent(MenuPanel.this, com.hefesoftpharmacy.panel.PlanearVisita.class);
		startActivity(in);
		
	}
}
