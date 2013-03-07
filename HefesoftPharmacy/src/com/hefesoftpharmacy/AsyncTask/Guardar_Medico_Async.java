package com.hefesoftpharmacy.AsyncTask;

import java.io.IOException;

import android.content.Context;
import android.os.AsyncTask;

import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.gson.GsonFactory;
import com.google.api.services.hefesoftpharmacy.Hefesoftpharmacy;

public class Guardar_Medico_Async extends AsyncTask<Object, Object, Object>
{	
	protected Context applicationContext;
	
	Hefesoftpharmacy service;	
	final HttpTransport transport = AndroidHttp.newCompatibleTransport();
	final JsonFactory jsonFactory = new GsonFactory();
	
	public com.google.api.services.hefesoftpharmacy.model.Medicos medico;
	
	protected void onPreExecute() {
		service = new Hefesoftpharmacy(transport, jsonFactory, null);
		//this.dialog = ProgressDialog.show(applicationContext, "Llamando", "Cargando centros de costo", true);
	}
	
	@Override
	protected Object doInBackground(Object... params) {
		
		try {
			return service.medicos().adicionarMedico(medico).execute();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return medico;
		}
		 
	}
 
    private AsyncTaskCompleteListener<com.google.api.services.hefesoftpharmacy.model.Medicos> listener;
 
    public Guardar_Medico_Async(Context ctx, AsyncTaskCompleteListener<com.google.api.services.hefesoftpharmacy.model.Medicos> listener)
    {
        this.applicationContext = ctx;        
        this.listener = listener;
    }
  
    @Override
    protected void onPostExecute(Object result)
    {
    	//this.dialog.cancel();
		super.onPostExecute((com.google.api.services.hefesoftpharmacy.model.Medicos)result);
		listener.onTaskComplete((com.google.api.services.hefesoftpharmacy.model.Medicos)result);
    }
}