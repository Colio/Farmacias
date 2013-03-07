package com.hefesoftpharmacy.AsyncTask;

import java.io.IOException;

import android.content.Context;
import android.os.AsyncTask;

import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.gson.GsonFactory;
import com.google.api.services.hefesoftpharmacy.Hefesoftpharmacy;
import com.google.api.services.hefesoftpharmacy.model.FileHefesoftProperties;

public class Blob_Url_By_Filename_Async extends AsyncTask<Object, Object, Object>
{
	//private ProgressDialog dialog;
	protected Context applicationContext;

	Hefesoftpharmacy service;
	final HttpTransport transport = AndroidHttp.newCompatibleTransport();
	final JsonFactory jsonFactory = new GsonFactory();

	public String filename;

	
	protected void onPreExecute() {
		service = new Hefesoftpharmacy(transport, jsonFactory, null);
	}
	
	@Override
	protected Object doInBackground(Object... params) {
		
		try {
			return service.blob().obtenerRutaImagenAlojada(filename).execute();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "";
		}
		
	}
 
    private AsyncTaskCompleteListener<FileHefesoftProperties> listener;
 
    public Blob_Url_By_Filename_Async(Context ctx, AsyncTaskCompleteListener<FileHefesoftProperties> listener)
    {
        this.applicationContext = ctx;        
        this.listener = listener;
    }
  
    @Override
    protected void onPostExecute(Object result)
    {
    	//this.dialog.cancel();
		super.onPostExecute((FileHefesoftProperties)result);
		listener.onTaskComplete((FileHefesoftProperties)result);
    }
}