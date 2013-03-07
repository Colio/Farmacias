package com.fachada.pais;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Nullable;
import javax.inject.Named;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import com.google.api.server.spi.response.CollectionResponse;
import com.google.appengine.api.datastore.Cursor;
import com.google.appengine.datanucleus.query.JDOCursorHelper;
import com.hefesoft.pharmacy.PMF;

public class CrudPais {

	@SuppressWarnings({ "unchecked", "unused" })
	public CollectionResponse<Pais> listPais(
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit) {

		PersistenceManager mgr = null;
		Cursor cursor = null;
		List<Pais> execute = null;

		try {
			mgr = getPersistenceManager();
			Query query = mgr.newQuery(Pais.class);
			if (cursorString != null && cursorString != "") {
				cursor = Cursor.fromWebSafeString(cursorString);
				HashMap<String, Object> extensionMap = new HashMap<String, Object>();
				extensionMap.put(JDOCursorHelper.CURSOR_EXTENSION, cursor);
				query.setExtensions(extensionMap);
			}

			if (limit != null) {
				query.setRange(0, limit);
			}

			execute = (List<Pais>) query.execute();
			cursor = JDOCursorHelper.getCursor(execute);
			if (cursor != null)
				cursorString = cursor.toWebSafeString();

			// Tight loop for fetching all entities from datastore and accomodate
			// for lazy fetch.
			for (Pais obj : execute)
				;
		} finally {
			mgr.close();
		}

		return CollectionResponse.<Pais> builder().setItems(execute)
				.setNextPageToken(cursorString).build();
	}

	
	public Pais getPais(@Named("id") Long id) {
		PersistenceManager mgr = getPersistenceManager();
		Pais pais = null;
		try {
			pais = mgr.getObjectById(Pais.class, id);
		} finally {
			mgr.close();
		}
		return pais;
	}

	
	public Pais insertPais(Pais pais) {
		PersistenceManager mgr = getPersistenceManager();
		try {			
			mgr.makePersistent(pais);
		} finally {
			mgr.close();
		}
		return pais;
	}

	
	public Pais updatePais(Pais pais) {
		PersistenceManager mgr = getPersistenceManager();
		try {			
			mgr.makePersistent(pais);
		} finally {
			mgr.close();
		}
		return pais;
	}

	
	public Pais removePais(@Named("id") Long id) {
		PersistenceManager mgr = getPersistenceManager();
		Pais pais = null;
		try {
			pais = mgr.getObjectById(Pais.class, id);
			mgr.deletePersistent(pais);
		} finally {
			mgr.close();
		}
		return pais;
	}
	

	private static PersistenceManager getPersistenceManager() {
		return PMF.get().getPersistenceManager();
	}
	
}
