package com.hefesoftpharmacy.AsyncTask;

import java.io.IOException;

import android.content.Context;
import android.os.AsyncTask;

import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.gson.GsonFactory;
import com.google.api.services.hefesoftpharmacy.Hefesoftpharmacy;
import com.google.api.services.hefesoftpharmacy.model.MedicosCollection;

public class Listar_Medicos_Async extends AsyncTask<Object, Object, Object>
{	
	protected Context applicationContext;
	
	Hefesoftpharmacy service;	
	final HttpTransport transport = AndroidHttp.newCompatibleTransport();
	final JsonFactory jsonFactory = new GsonFactory();
	
	protected void onPreExecute() {
		service = new Hefesoftpharmacy(transport, jsonFactory, null);		
	}
	
	@Override
	protected Object doInBackground(Object... params) {
		
		MedicosCollection lst = null;
		try {
			lst = service.medicos().listarMedicos().execute();
			return lst;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return lst ;
		}
		 
	}
 
    private AsyncTaskCompleteListener<MedicosCollection> listener;
 
    public Listar_Medicos_Async(Context ctx, AsyncTaskCompleteListener<MedicosCollection> listener)
    {
        this.applicationContext = ctx;        
        this.listener = listener;
    }
  
    @Override
    protected void onPostExecute(Object result)
    {
    	//this.dialog.cancel();
		super.onPostExecute((MedicosCollection)result);
		listener.onTaskComplete((MedicosCollection)result);
    }
}