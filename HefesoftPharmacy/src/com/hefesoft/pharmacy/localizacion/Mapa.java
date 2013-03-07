package com.hefesoft.pharmacy.localizacion;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.Menu;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.hefesoftpharmacy.R;

public class Mapa extends Activity {

	MapFragment mMapFragment;
	GoogleMap mMap;
	private String Cordenadas;
	private String Marcador;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.templatemapas);
		
		Bundle b = getIntent().getExtras();
		Cordenadas = b.getString("Cordenada");
		Marcador = b.getString("Marcador");
		
		GoogleMapOptions opciones = new GoogleMapOptions();
        opciones.mapType(GoogleMap.MAP_TYPE_NORMAL);
        
        
        mMapFragment = MapFragment.newInstance(opciones);
        
        FragmentTransaction fragmentTransaction =  getFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.map, mMapFragment, "Mapa");
        fragmentTransaction.commit();
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		mMapFragment = ((MapFragment) getFragmentManager().findFragmentByTag("Mapa"));
		mMap = mMapFragment.getMap();
		
		
		mMap.setIndoorEnabled(true);
		mMap.setMyLocationEnabled(true);
		
		
		mMap.setTrafficEnabled(true);
		
		String[] cordenadas = Cordenadas.split(",");
		
		CameraUpdate camUpd1 =
			    CameraUpdateFactory.newLatLngZoom(new LatLng(Double.parseDouble(cordenadas[0]), Double.parseDouble(cordenadas[1])),mMap.getMaxZoomLevel() -2);
			 
		mMap.moveCamera(camUpd1);
		
	
		
		mMap.moveCamera(camUpd1);
		
		mMap.addMarker(new MarkerOptions()
        .position(new LatLng(Double.parseDouble(cordenadas[0]), Double.parseDouble(cordenadas[1])))
        .title(Marcador));
	}

	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		
		return true;
	}

}
