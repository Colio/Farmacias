package com.hefesoftpharmacy.AsyncTask;

import java.io.IOException;

import android.content.Context;
import android.os.AsyncTask;

import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.gson.GsonFactory;
import com.google.api.services.hefesoftpharmacy.Hefesoftpharmacy;
import com.google.api.services.hefesoftpharmacy.model.VisitaPlaneada;

public class Insertar_Visita_Planeada_Async extends AsyncTask<Object, Object, Object>
{	
	protected Context applicationContext;
	
	Hefesoftpharmacy service;	
	final HttpTransport transport = AndroidHttp.newCompatibleTransport();
	final JsonFactory jsonFactory = new GsonFactory();

	public VisitaPlaneada visita;
	
	protected void onPreExecute() {
		service = new Hefesoftpharmacy(transport, jsonFactory, null);		
	}
	
	@Override
	protected Object doInBackground(Object... params) {
		
		
		VisitaPlaneada result = null;
		try {
			result = service.visitas().planeacion().adicionar(visita).execute();		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		return result;
	}
 
    private AsyncTaskCompleteListener<VisitaPlaneada> listener;
 
    public Insertar_Visita_Planeada_Async(Context ctx, AsyncTaskCompleteListener<VisitaPlaneada> listener)
    {
        this.applicationContext = ctx;        
        this.listener = listener;
    }
  
    @Override
    protected void onPostExecute(Object result)
    {
    	//this.dialog.cancel();
		super.onPostExecute((VisitaPlaneada)result);
		listener.onTaskComplete((VisitaPlaneada)result);
    }
}