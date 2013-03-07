package com.fachada.unidadvisita;

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


public class CrudUnidadVisita {

	
	@SuppressWarnings("unchecked")
	public CollectionResponse<UnidadVisita> listUnidadVisita(
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit,
			@Nullable @Named("todasEntidades") boolean todasEntidades			
			) {

		PersistenceManager mgr = null;
		Cursor cursor = null;
		List<UnidadVisita> execute = null;

		try {
			mgr = getPersistenceManager();
			Query query = mgr.newQuery(UnidadVisita.class);
			if (cursorString != null && cursorString != "") {
				cursor = Cursor.fromWebSafeString(cursorString);
				HashMap<String, Object> extensionMap = new HashMap<String, Object>();
				extensionMap.put(JDOCursorHelper.CURSOR_EXTENSION, cursor);
				query.setExtensions(extensionMap);
			}

			if (limit != null) {
				query.setRange(0, limit);
			}

			execute = (List<UnidadVisita>) query.execute();
			cursor = JDOCursorHelper.getCursor(execute);
			if (cursor != null)
				cursorString = cursor.toWebSafeString();

			// Tight loop for fetching all entities from datastore and accomodate
			// for lazy fetch.
			for (UnidadVisita obj : execute)
			{
				if(todasEntidades)
				{
					obj.cargarActividadesJustificadas();
					obj.cargarMedicos();
					obj.cargarFarmacias();
				}
			}
		} finally {
			mgr.close();
		}

		return CollectionResponse.<UnidadVisita> builder().setItems(execute)
				.setNextPageToken(cursorString).build();
	}

	
	public UnidadVisita getUnidadVisita(@Named("id") Long id
			,@Nullable @Named("todasEntidades") boolean todasEntidades
			) {
		PersistenceManager mgr = getPersistenceManager();
		UnidadVisita unidadvisita = null;
		try {
			unidadvisita = mgr.getObjectById(UnidadVisita.class, id);
			
			if(todasEntidades)
			{
				unidadvisita.cargarActividadesJustificadas();
				unidadvisita.cargarMedicos();
				unidadvisita.cargarFarmacias();
			}
			
		} finally {
			mgr.close();
		}
		return unidadvisita;
	}

	
	public UnidadVisita insertUnidadVisita(UnidadVisita unidadvisita) {
		PersistenceManager mgr = getPersistenceManager();
		try {			
			mgr.makePersistent(unidadvisita);
		} finally {
			mgr.close();
		}
		return unidadvisita;
	}

	
	public UnidadVisita updateUnidadVisita(UnidadVisita unidadvisita) {
		PersistenceManager mgr = getPersistenceManager();
		try {		
			mgr.makePersistent(unidadvisita);
		} finally {
			mgr.close();
		}
		return unidadvisita;
	}

	
	public UnidadVisita removeUnidadVisita(@Named("id") Long id) {
		PersistenceManager mgr = getPersistenceManager();
		UnidadVisita unidadvisita = null;
		try {
			unidadvisita = mgr.getObjectById(UnidadVisita.class, id);
			mgr.deletePersistent(unidadvisita);
		} finally {
			mgr.close();
		}
		return unidadvisita;
	}
	
	private static PersistenceManager getPersistenceManager() {
		return PMF.get().getPersistenceManager();
	}

}
