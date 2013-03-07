package com.fachada.files;

import javax.inject.Named;

import com.fachada.util.Util;
import com.google.appengine.api.blobstore.BlobstoreService;
import com.google.appengine.api.blobstore.BlobstoreServiceFactory;

public class CrudFiles {

	public BlobResult getUrlBlob(@Named("Ruta") String url) {
		BlobResult blob = new BlobResult();
		String action_POST_URL = "Vacio";		
		blob.setId("1");
		blob.setPath(action_POST_URL);
		
		try {
			BlobstoreService blobstoreService = BlobstoreServiceFactory.getBlobstoreService(); 
			action_POST_URL= blobstoreService.createUploadUrl("/image/uploadImage");
			blob.setPath(action_POST_URL);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return blob;
	}	

	public FileHefesoftProperties FileHefesoftProperties(@Named("Filename") String filenameofImage)
	{
		Util u = new Util();		
		return u.getFileByname(filenameofImage);
	}	
}
