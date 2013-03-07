package com.fachada.visita;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Nullable;
import javax.inject.Named;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import com.fachada.panel.Panel;
import com.google.api.server.spi.response.CollectionResponse;
import com.google.appengine.api.datastore.Cursor;
import com.google.appengine.datanucleus.query.JDOCursorHelper;
import com.hefesoft.pharmacy.PMF;


public class CrudVisita {
	
	@SuppressWarnings({ "unchecked", "unused" })
	public CollectionResponse<VisitaPlaneada> listVisitaPlaneada(
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit) {

		PersistenceManager mgr = null;
		Cursor cursor = null;
		List<VisitaPlaneada> execute = null;

		try {
			mgr = getPersistenceManager();
			Query query = mgr.newQuery(VisitaPlaneada.class);
			if (cursorString != null && cursorString != "") {
				cursor = Cursor.fromWebSafeString(cursorString);
				HashMap<String, Object> extensionMap = new HashMap<String, Object>();
				extensionMap.put(JDOCursorHelper.CURSOR_EXTENSION, cursor);
				query.setExtensions(extensionMap);
			}

			if (limit != null) {
				query.setRange(0, limit);
			}

			execute = (List<VisitaPlaneada>) query.execute();
			cursor = JDOCursorHelper.getCursor(execute);
			if (cursor != null)
				cursorString = cursor.toWebSafeString();

			// Tight loop for fetching all entities from datastore and accomodate
			// for lazy fetch.
			for (VisitaPlaneada obj : execute)
				;
		} finally {
			mgr.close();
		}

		return CollectionResponse.<VisitaPlaneada> builder().setItems(execute)
				.setNextPageToken(cursorString).build();
	}	
	
	@SuppressWarnings("unchecked")
	public CollectionResponse<VisitaPlaneada> listVisitaPlaneadaByDate(
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit,
			@Nullable @Named("dependencias") Boolean dependencias,
			@Nullable @Named("Date") Date date
			
			) {

		PersistenceManager mgr = null;
		Cursor cursor = null;
		List<VisitaPlaneada> execute = null;

		try {
			mgr = getPersistenceManager();
			Query query = mgr.newQuery(VisitaPlaneada.class);
			query.setFilter("FechaYHora == dateParam");
			query.declareParameters("java.util.Date dateParam");
			
			if (cursorString != null && cursorString != "") {
				cursor = Cursor.fromWebSafeString(cursorString);
				HashMap<String, Object> extensionMap = new HashMap<String, Object>();
				extensionMap.put(JDOCursorHelper.CURSOR_EXTENSION, cursor);
				query.setExtensions(extensionMap);
			}

			if (limit != null) {
				query.setRange(0, limit);
			}

			execute = (List<VisitaPlaneada>) query.execute(date);
			cursor = JDOCursorHelper.getCursor(execute);
			if (cursor != null)
				cursorString = cursor.toWebSafeString();

			// Tight loop for fetching all entities from datastore and accomodate
			// for lazy fetch.
			for (VisitaPlaneada obj : execute)
			{
				obj.cargarDatos(dependencias, obj.getPanel().getId());
			}
		} finally {
			mgr.close();
		}

		return CollectionResponse.<VisitaPlaneada> builder().setItems(execute)
				.setNextPageToken(cursorString).build();
	}
	
	public VisitaPlaneada getVisitaPlaneada(@Named("id") Long id) {
		PersistenceManager mgr = getPersistenceManager();
		VisitaPlaneada visitaplaneada = null;
		try {
			visitaplaneada = mgr.getObjectById(VisitaPlaneada.class, id);
		} finally {
			mgr.close();
		}
		return visitaplaneada;
	}

	
	public VisitaPlaneada insertVisitaPlaneada(VisitaPlaneada visitaplaneada) {
		PersistenceManager mgr = getPersistenceManager();
		try {		
			mgr.makePersistent(visitaplaneada);
			
			try {
				Panel panel = mgr.getObjectById(Panel.class, visitaplaneada.getPanel().getId());
				panel.setContactosActual(panel.getContactosActual() + 1);
				mgr.makePersistent(panel);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} finally {
			mgr.close();
		}
		return visitaplaneada;
	}

	
	public VisitaPlaneada updateVisitaPlaneada(VisitaPlaneada visitaplaneada) {
		PersistenceManager mgr = getPersistenceManager();
		try {		
			mgr.makePersistent(visitaplaneada);
		} finally {
			mgr.close();
		}
		return visitaplaneada;
	}

	
	public VisitaPlaneada removeVisitaPlaneada(@Named("id") Long id) {
		PersistenceManager mgr = getPersistenceManager();
		VisitaPlaneada visitaplaneada = null;
		try {
			visitaplaneada = mgr.getObjectById(VisitaPlaneada.class, id);
			mgr.deletePersistent(visitaplaneada);
			
			try {
				Panel panel = mgr.getObjectById(Panel.class, visitaplaneada.getPanel().getId());
				panel.setContactosActual(panel.getContactosActual() - 1);
				mgr.makePersistent(panel);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} finally {
			mgr.close();
		}
		return visitaplaneada;
	}

	@SuppressWarnings({ "unchecked", "unused" })
	public CollectionResponse<VisitaRealizada> listVisitaRealizada(
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit) {

		PersistenceManager mgr = null;
		Cursor cursor = null;
		List<VisitaRealizada> execute = null;

		try {
			mgr = getPersistenceManager();
			Query query = mgr.newQuery(VisitaRealizada.class);
			if (cursorString != null && cursorString != "") {
				cursor = Cursor.fromWebSafeString(cursorString);
				HashMap<String, Object> extensionMap = new HashMap<String, Object>();
				extensionMap.put(JDOCursorHelper.CURSOR_EXTENSION, cursor);
				query.setExtensions(extensionMap);
			}

			if (limit != null) {
				query.setRange(0, limit);
			}

			execute = (List<VisitaRealizada>) query.execute();
			cursor = JDOCursorHelper.getCursor(execute);
			if (cursor != null)
				cursorString = cursor.toWebSafeString();

			// Tight loop for fetching all entities from datastore and accomodate
			// for lazy fetch.
			for (VisitaRealizada obj : execute)
				;
		} finally {
			mgr.close();
		}

		return CollectionResponse.<VisitaRealizada> builder().setItems(execute)
				.setNextPageToken(cursorString).build();
	}

	
	public VisitaRealizada getVisitaRealizada(@Named("id") Long id) {
		PersistenceManager mgr = getPersistenceManager();
		VisitaRealizada visitarealizada = null;
		try {
			visitarealizada = mgr.getObjectById(VisitaRealizada.class, id);
		} finally {
			mgr.close();
		}
		return visitarealizada;
	}

	
	public VisitaRealizada insertVisitaRealizada(VisitaRealizada visitarealizada) {
		PersistenceManager mgr = getPersistenceManager();
		try {			
			mgr.makePersistent(visitarealizada);
			
			
			
		} finally {
			mgr.close();
		}
		return visitarealizada;
	}

	
	public VisitaRealizada updateVisitaRealizada(VisitaRealizada visitarealizada) {
		PersistenceManager mgr = getPersistenceManager();
		try {			
			mgr.makePersistent(visitarealizada);
		} finally {
			mgr.close();
		}
		return visitarealizada;
	}

	
	public VisitaRealizada removeVisitaRealizada(@Named("id") Long id) {
		PersistenceManager mgr = getPersistenceManager();
		VisitaRealizada visitarealizada = null;
		try {
			visitarealizada = mgr.getObjectById(VisitaRealizada.class, id);
			
			
			
			mgr.deletePersistent(visitarealizada);
		} finally {
			mgr.close();
		}
		return visitarealizada;
	}

	private static PersistenceManager getPersistenceManager() {
		return PMF.get().getPersistenceManager();
	}

}
