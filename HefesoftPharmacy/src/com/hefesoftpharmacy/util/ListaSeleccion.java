package com.hefesoftpharmacy.util;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

import com.hefesoftpharmacy.R;

public class ListaSeleccion extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lista_seleccion);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_lista_seleccion, menu);
		return true;
	}

}
