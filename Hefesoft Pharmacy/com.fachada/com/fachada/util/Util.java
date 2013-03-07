package com.fachada.util;

import java.util.HashMap;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import com.fachada.files.FileHefesoftProperties;
import com.fachada.usuario.Usuario;
import com.google.appengine.api.blobstore.BlobKey;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.FetchOptions;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query.FilterOperator;
import com.google.appengine.api.images.ImagesService;
import com.google.appengine.api.images.ImagesServiceFactory;
import com.hefesoft.pharmacy.PMF;

public class Util {

	@SuppressWarnings("unchecked")
	public Usuario getUsuarioEmailPassword(String id, String password) {
		PersistenceManager mgr = getPersistenceManager();
		Usuario usuario = null;
		try {
			
			Query query = mgr.newQuery(Usuario.class);
			query.setFilter("Email == email && Password == password");
			query.setOrdering("Email desc");
			query.declareParameters("String email, String password");
						
			HashMap<String, Object> params = new HashMap<String, Object>();
			params.put( "email", id );
			params.put( "password", password );
			
			
			try {
				usuario = ((List<Usuario>) query.executeWithMap(params)).get(0);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				usuario = null;
			}
			
		} finally {
			mgr.close();
		}
		return usuario;
	}
	
	
	@SuppressWarnings("deprecation")
	public FileHefesoftProperties getFileByname(String filenameofImage)
	{
		FileHefesoftProperties file = new FileHefesoftProperties();
		
		com.google.appengine.api.datastore.Query query = new com.google.appengine.api.datastore.Query("__BlobInfo__"); 
		query.addFilter("filename", FilterOperator.EQUAL, filenameofImage); 
		DatastoreService datastore = DatastoreServiceFactory.getDatastoreService(); 
		PreparedQuery pq = datastore.prepare(query); 
		List<Entity> entList = pq.asList(FetchOptions.Builder.withLimit(1)); 
		String name = entList.get(0).getKey().getName();
		
		ImagesService imagesService = ImagesServiceFactory.getImagesService();
		BlobKey blobKey = new BlobKey(name);
		String nameurl = imagesService.getServingUrl(blobKey);
		
		
		file.setName(nameurl);
		
		return file;
	}

	
	private static PersistenceManager getPersistenceManager() {
		return PMF.get().getPersistenceManager();
	}
	
}
