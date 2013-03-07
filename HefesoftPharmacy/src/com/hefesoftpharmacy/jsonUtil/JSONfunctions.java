package com.hefesoftpharmacy.jsonUtil;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntity;
import org.apache.http.entity.mime.content.ContentBody;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.InputStreamBody;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpParams;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.util.Log;

import com.hefesoftpharmacy.GlobalVars;

public class JSONfunctions {

		
	public static String getJSONfromURL(String url, String UserName, String Password){
		InputStream is = null;
		String result = "";
		try{
	            HttpClient httpclient = new DefaultHttpClient();
	            HttpGet request = new HttpGet();
	            // jose.douglas y Iguazo26! Membership
	            String login = Authorization.getB64Auth(UserName, Password);
	            request.setHeader("Authorization",login);
	            request.setURI(new URI(url));
	            HttpResponse response = httpclient.execute(request);
	            HttpEntity entity = response.getEntity();
	            is = entity.getContent();	            
	            
	    }catch(Exception e){
	            Log.e("log_tag", "Error in http connection "+e.toString());
	    }
	    
	  //convert response to string
	    try{
	            BufferedReader reader = new BufferedReader(new InputStreamReader(is,"iso-8859-1"),8);
	            StringBuilder sb = new StringBuilder();
	            String line = null;
	            while ((line = reader.readLine()) != null) {
	                    sb.append(line + "\n");
	            }
	            is.close();
	            result=sb.toString();	
	            
	    }catch(Exception e){
	            Log.e("log_tag", "Error converting result "+e.toString());
	    }	
	    
	    return result;
	    
	}

	public static JSONArray cargarArray(String Url)
			throws URISyntaxException, IOException
			{	
		
		String result1 = "";
		JSONArray jArray = null;
		InputStream is1;
		HttpClient httpclient1 = new DefaultHttpClient();
		HttpGet request1 = new HttpGet();
		String login = Authorization.getJWT(GlobalVars.Token);
		request1.setHeader("Authorization",login);
		request1.setURI(new URI(Url));
		HttpResponse response1 = httpclient1.execute(request1);
		HttpEntity entity1 = response1.getEntity();
		is1 = entity1.getContent();
		
		  //convert response to string
	    try{
	            BufferedReader reader = new BufferedReader(new InputStreamReader(is1,"iso-8859-1"),8);
	            StringBuilder sb = new StringBuilder();
	            String line = null;
	            while ((line = reader.readLine()) != null) {
	                    sb.append(line + "\n");
	            }
	            is1.close();
	            result1=sb.toString();
	    }catch(Exception e){
	            Log.e("log_tag", "Error converting result "+e.toString());
	    }
	    
	    try{
	    	
	    	return new JSONArray(result1);
                        
	    }catch(JSONException e){
	            Log.e("log_tag", "Error parsing data "+e.toString());
	    }
    
	    return jArray;
		
	}

	
	public static JSONObject cargarObjeto(String Url)
			throws URISyntaxException, IOException
			{	
		
		String result1 = "";
		JSONObject jArray = null;
		InputStream is1;
		HttpClient httpclient1 = new DefaultHttpClient();
		HttpGet request1 = new HttpGet();
		String login = Authorization.getJWT(GlobalVars.Token);
		request1.setHeader("Authorization",login);
		request1.setURI(new URI(Url));
		HttpResponse response1 = httpclient1.execute(request1);
		HttpEntity entity1 = response1.getEntity();
		is1 = entity1.getContent();
		
		  //convert response to string
	    try{
	            BufferedReader reader = new BufferedReader(new InputStreamReader(is1,"iso-8859-1"),8);
	            StringBuilder sb = new StringBuilder();
	            String line = null;
	            while ((line = reader.readLine()) != null) {
	                    sb.append(line + "\n");
	            }
	            is1.close();
	            result1=sb.toString();
	    }catch(Exception e){
	            Log.e("log_tag", "Error converting result "+e.toString());
	    }
	    
	    try{
	    	
	    	return new JSONObject(result1);
                        
	    }catch(JSONException e){
	            Log.e("log_tag", "Error parsing data "+e.toString());
	    }
    
	    return jArray;
		
	}

	public static void PostString(String url, String string) 
	{
		HttpClient httpClient = new DefaultHttpClient();
        
		HttpPost post = new HttpPost(url);
		post.setHeader("content-type", "application/json");
		
		//Para Autorizacion en web api
		
		//String login = Authorization.getJWT(GlobalVars.Token);
		//post.setHeader("Authorization",login);
		
		
		try
        {		
			
			//Construimos el objeto cliente en formato JSON
		   JSONObject dato = new JSONObject();			
//		   dato.put("Id", 1);
//	       dato.put("Fecha", visitaRealizada.getFecha().toString());
//		   dato.put("Hora", visitaRealizada.getHora().toString());
//		   dato.put("IdPanelVisitador", visitaRealizada.getIdPanelVisitador().toString());
//		   dato.put("Observaciones", visitaRealizada.getObservaciones().toString());
//		   dato.put("IdActividadJustificada", "");
			
		   StringEntity entity = new StringEntity(dato.toString());
		   post.setEntity(entity);
			
        	HttpResponse resp = httpClient.execute(post);
        	String respStr = EntityUtils.toString(resp.getEntity());
        	
        	if(respStr.equals("true"))
        	{
        		
        	}
        		
        }
        catch(Exception ex)
        {
        	Log.e("ServicioRest","Error!", ex);
        }			
	}


	 public static Boolean uploadImage(String url,Bitmap imagen, String idImagen) {
		 
		 ByteArrayOutputStream bos = new ByteArrayOutputStream();		 
		 imagen.compress(CompressFormat.JPEG, 60, bos);
		 
		 try {

			 HttpClient client = new DefaultHttpClient();  
	         String postURL = url;
	         HttpPost post = new HttpPost(postURL);
		     InputStream in = new ByteArrayInputStream(bos.toByteArray());
	         MultipartEntity reqEntity = new MultipartEntity(HttpMultipartMode.BROWSER_COMPATIBLE);
	         reqEntity.addPart(idImagen, new InputStreamBody(in, idImagen));
	         post.setEntity(reqEntity);  
	         HttpResponse response = client.execute(post);
	         
	        HttpEntity resEntity;
			try {
				resEntity = response.getEntity();
				  if (resEntity != null) {    
		                Log.i("RESPONSE",EntityUtils.toString(resEntity));
		          }
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
		 } catch (Exception e) {
		     e.printStackTrace();
		 }
		 
		 return true;
	 }

		
}
