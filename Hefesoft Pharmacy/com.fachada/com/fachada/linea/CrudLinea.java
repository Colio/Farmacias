package com.fachada.linea;

import java.util.HashMap;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import com.google.api.server.spi.response.CollectionResponse;
import com.google.appengine.api.datastore.Cursor;
import com.google.appengine.datanucleus.query.JDOCursorHelper;
import com.hefesoft.pharmacy.PMF;

public class CrudLinea {

	@SuppressWarnings({ "unchecked", "unused" })
	public CollectionResponse<Linea> listLinea(
			String cursorString,
			Integer limit) {

		PersistenceManager mgr = null;
		Cursor cursor = null;
		List<Linea> execute = null;

		try {
			mgr = getPersistenceManager();
			Query query = mgr.newQuery(Linea.class);
			if (cursorString != null && cursorString != "") {
				cursor = Cursor.fromWebSafeString(cursorString);
				HashMap<String, Object> extensionMap = new HashMap<String, Object>();
				extensionMap.put(JDOCursorHelper.CURSOR_EXTENSION, cursor);
				query.setExtensions(extensionMap);
			}

			if (limit != null) {
				query.setRange(0, limit);
			}

			execute = (List<Linea>) query.execute();
			cursor = JDOCursorHelper.getCursor(execute);
			if (cursor != null)
				cursorString = cursor.toWebSafeString();

			// Tight loop for fetching all entities from datastore and accomodate
			// for lazy fetch.
			for (Linea obj : execute)
				;
		} finally {
			mgr.close();
		}

		return CollectionResponse.<Linea> builder().setItems(execute)
				.setNextPageToken(cursorString).build();
	}

	
	public Linea getLinea(Long id) {
		PersistenceManager mgr = getPersistenceManager();
		Linea linea = null;
		try {
			linea = mgr.getObjectById(Linea.class, id);
		} finally {
			mgr.close();
		}
		return linea;
	}

	
	public Linea insertLinea(Linea linea) {
		PersistenceManager mgr = getPersistenceManager();
		try {			
			mgr.makePersistent(linea);
		} finally {
			mgr.close();
		}
		return linea;
	}

	
	public Linea updateLinea(Linea linea) {
		PersistenceManager mgr = getPersistenceManager();
		try {		
			mgr.makePersistent(linea);
		} finally {
			mgr.close();
		}
		return linea;
	}

	
	public Linea removeLinea(Long id) {
		PersistenceManager mgr = getPersistenceManager();
		Linea linea = null;
		try {
			linea = mgr.getObjectById(Linea.class, id);
			mgr.deletePersistent(linea);
		} finally {
			mgr.close();
		}
		return linea;
	}

	private static PersistenceManager getPersistenceManager() {
		return PMF.get().getPersistenceManager();
	}

	
}
