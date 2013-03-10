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
import com.google.api.services.hefesoftpharmacy.model.VisitaRealizada;

public class Insertar_Visita_Realizada_Async extends AsyncTask<Object, Object, Object>
{	
	protected Context applicationContext;
	
	Hefesoftpharmacy service;	
	final HttpTransport transport = AndroidHttp.newCompatibleTransport();
	final JsonFactory jsonFactory = new GsonFactory();

	public VisitaRealizada visita;
	
	protected void onPreExecute() {
		service = new Hefesoftpharmacy(transport, jsonFactory, null);		
	}
	
	@Override
	protected Object doInBackground(Object... params) {
		
		
		VisitaRealizada result = null;
		try {
			result = service.visitas().realizada().adicionar(visita).execute();		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		return result;
	}
 
    private AsyncTaskCompleteListener<VisitaRealizada> listener;
 
    public Insertar_Visita_Realizada_Async(Context ctx, AsyncTaskCompleteListener<VisitaRealizada> listener)
    {
        this.applicationContext = ctx;        
        this.listener = listener;
    }
  
    @Override
    protected void onPostExecute(Object result)
    {
    	//this.dialog.cancel();
		super.onPostExecute((VisitaRealizada)result);
		listener.onTaskComplete((VisitaRealizada)result);
    }
}