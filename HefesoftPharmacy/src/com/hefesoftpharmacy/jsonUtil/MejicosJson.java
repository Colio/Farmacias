package com.hefesoftpharmacy.jsonUtil;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import android.util.Log;

import com.google.api.services.hefesoftpharmacy.model.Medicos;
import com.hefesoftpharmacy.GlobalVars;

public class MejicosJson {

	public static Medicos PostString(Medicos medico) 
	{
		HttpClient httpClient = new DefaultHttpClient();
        
		HttpPut post = new HttpPut(GlobalVars.urlServices + "medicos");
		post.setHeader("content-type", "application/json");
		
		try
        {
		   JSONObject dato = new JSONObject();			
		   dato.put("cedula", medico.getCedula());
		   dato.put("cordenadas", medico.getCordenadas());
		   dato.put("direccion", medico.getDireccion());
		   dato.put("imagenUrl", medico.getImagenUrl());
		   dato.put("idEntidad", medico.getId().getId());
		   dato.put("nombres", medico.getNombres());
		   dato.put("telefono", medico.getTelefono());
		   dato.put("telefono_Celular", medico.getTelefonoCelular());
		   dato.put("apellidos", medico.getApellidos());
		   dato.put("email", medico.getEmail());
	       
	       
		   StringEntity entity = new StringEntity(dato.toString());
		   post.setEntity(entity);
			
        	HttpResponse resp = httpClient.execute(post);
        	
        	HttpEntity resEntity;
 			try {
 				resEntity = resp.getEntity();
 				  if (resEntity != null) {    
 		                Log.i("RESPONSE",EntityUtils.toString(resEntity));
 		          }
 			} catch (Exception e) {
 				// TODO Auto-generated catch block
 				e.printStackTrace();
 			}
        		
        }
        catch(Exception ex)
        {
        	Log.e("ServicioRest","Error!", ex);
        }	
		
		return medico;
	}
	
}
