package com.hefesoftpharmacy.AsyncTask;

import android.content.Context;
import android.os.AsyncTask;

public class Put_Medicos_Async extends AsyncTask<Object, Object, Object>
{
	//private ProgressDialog dialog;
	protected Context applicationContext;
	
	public com.google.api.services.hefesoftpharmacy.model.Medicos medico;
	
	@Override
	protected Object doInBackground(Object... params) {
		
		com.hefesoftpharmacy.jsonUtil.MejicosJson.PostString(medico);
		return true;
	}   
 
    public Put_Medicos_Async(Context ctx)
    {
        this.applicationContext = ctx;
    }  
}