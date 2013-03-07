package com.hefesoftpharmacy.AsyncTask;

import java.io.IOException;
import java.util.List;

import android.content.Context;
import android.os.AsyncTask;

import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.gson.GsonFactory;
import com.google.api.services.hefesoftpharmacy.Hefesoftpharmacy;
import com.google.api.services.hefesoftpharmacy.model.Panel;

public class Listar_Panel_Async extends AsyncTask<Object, Object, Object>
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
		
		List<Panel> lst = null;
		try {
			lst = service.panel().listarPaneles().setDependencias(true).execute().getItems();
			return lst;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return lst ;
		}
		 
	}
 
    private AsyncTaskCompleteListener<List<Panel>> listener;
 
    public Listar_Panel_Async(Context ctx, AsyncTaskCompleteListener<List<Panel>> listener)
    {
        this.applicationContext = ctx;        
        this.listener = listener;
    }
  
    @SuppressWarnings("unchecked")
	@Override
    protected void onPostExecute(Object result)
    {
    	//this.dialog.cancel();
		super.onPostExecute((List<Panel>)result);
		listener.onTaskComplete((List<Panel>)result);
    }
}