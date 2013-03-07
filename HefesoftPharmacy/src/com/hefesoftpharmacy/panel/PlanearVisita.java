package com.hefesoftpharmacy.panel;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import com.hefesoftpharmacy.R;
import com.hefesoftpharmacy.util.SectionsPagerAdapter;

public class PlanearVisita extends FragmentActivity implements ActionBar.TabListener {

	SectionsPagerAdapter mSectionsPagerAdapter;    
	ViewPager mViewPager;
	ActionBar actionBar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fragment_template);
		
		mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager()); 
        actionBar = getActionBar();
        
        	
	    actionBar.setHomeButtonEnabled(true);
	    getActionBar().setDisplayHomeAsUpEnabled(true);
	    
	    
	    actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(mSectionsPagerAdapter);
        
        mViewPager.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {
                actionBar.setSelectedNavigationItem(position);
            }
        });
        
        cargarOpciones();
	}
	
	// Agrega fragmentos a la actividad
		private void cargarOpciones() {
			mSectionsPagerAdapter.notifyDataSetChanged();
			mSectionsPagerAdapter.addFragment(new Fragment_listado_panel(), "Planear");
			mSectionsPagerAdapter.notifyDataSetChanged();
			generarMenu();
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
		getMenuInflater().inflate(R.menu.activity_planear_visita, menu);
		return true;
	}

	@Override
	public void onTabReselected(Tab arg0, FragmentTransaction arg1) {
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
