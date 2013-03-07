package com.hefesoftpharmacy.AsyncTask;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.AsyncTask;

public class Post_Big_String_Async extends AsyncTask<Object, Object, Object>
{
	//private ProgressDialog dialog;
	protected Context applicationContext;
	
	public String Url;
	public String idImagen;
	public Bitmap Imagen;
	
	protected void onPreExecute() {
		//this.dialog = ProgressDialog.show(applicationContext, "Llamando", "Cargando centros de costo", true);
	}
	
	@Override
	protected Object doInBackground(Object... params) {
		
		com.hefesoftpharmacy.jsonUtil.JSONfunctions.uploadImage(Url,Imagen, idImagen);
		return true;
	}
 
    private AsyncTaskCompleteListener<Boolean> listener;
 
    public Post_Big_String_Async(Context ctx, AsyncTaskCompleteListener<Boolean> listener)
    {
        this.applicationContext = ctx;        
        this.listener = listener;
    }
  
    @Override
    protected void onPostExecute(Object result)
    {
    	//this.dialog.cancel();
		super.onPostExecute((Boolean)result);
		listener.onTaskComplete((Boolean)result);
    }
}