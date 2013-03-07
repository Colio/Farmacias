package com.fachada.panel;

import java.util.ArrayList;
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

public class CrudPanel {
	
	@SuppressWarnings("unchecked")
	public CollectionResponse<Panel> listPanel(
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit,
			@Nullable @Named("cargarTodosDatos") Boolean cargarTodosDatos
			) {

		
		if(cargarTodosDatos == null)
		{
			cargarTodosDatos = false;
		}
		
		PersistenceManager mgr = null;
		Cursor cursor = null;
		List<Panel> execute = null;

		try {
			mgr = getPersistenceManager();
			Query query = mgr.newQuery(Panel.class);
			if (cursorString != null && cursorString != "") {
				cursor = Cursor.fromWebSafeString(cursorString);
				HashMap<String, Object> extensionMap = new HashMap<String, Object>();
				extensionMap.put(JDOCursorHelper.CURSOR_EXTENSION, cursor);
				query.setExtensions(extensionMap);
			}

			if (limit != null) {
				query.setRange(0, limit);
			}

			execute = (List<Panel>) query.execute();
			cursor = JDOCursorHelper.getCursor(execute);
			if (cursor != null)
				cursorString = cursor.toWebSafeString();

			// Tight loop for fetching all entities from datastore and accomodate
			// for lazy fetch.
			for (Panel obj : execute)
			{
				if(cargarTodosDatos)
				{
					obj.cargarUnidadVisita(cargarTodosDatos);
				}
			}
		} finally {
			mgr.close();
		}

		return CollectionResponse.<Panel> builder().setItems(execute)
				.setNextPageToken(cursorString).build();
	}
	
	
	@SuppressWarnings("unchecked")
	public List<Panel> mostrarPanel(Panel panel) {
	
		PersistenceManager mgr = getPersistenceManager();
		List<Panel> result = new ArrayList<Panel>();
		
		try {
			
			Query query = mgr.newQuery(Panel.class);
			query.setFilter("Email == EmailParam ");
			
			//query.setOrdering("UsuarioKey desc");
			query.declareParameters("String EmailParam");
						
			HashMap<String, Object> params = new HashMap<String, Object>();
			//params.put( "UsuarioKey", panel.getUsuarioKey() );
			params.put( "EmailParam", panel.getEmail());			
			
			try {				
				for (Object obj : (List<Object>) query.executeWithMap(params)) {
					result.add(((Panel) obj));
				}				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				result = null;
			}
			
		} finally {
			mgr.close();
		}
		
		return result;
	}
	


	public Panel getPanel(Long id,
			Boolean todosDatos
			) {
		PersistenceManager mgr = getPersistenceManager();
		Panel panel = null;
		try {
			panel = mgr.getObjectById(Panel.class, id);
			panel.cargarUnidadVisita(todosDatos);
		} finally {
			mgr.close();
		}
		return panel;
	}

	
	public Panel insertPanel(Panel panel) {
		PersistenceManager mgr = getPersistenceManager();
		try {
			mgr.makePersistent(panel);
		} finally {
			mgr.close();
		}
		return panel;
	}


	public Panel updatePanel(Panel panel) {
		PersistenceManager mgr = getPersistenceManager();
		
		Panel panelActualizar = mgr.getObjectById(Panel.class, panel.getIdEntidad());
		
		panelActualizar.setContactosActual(panel.getContactosActual());
		panelActualizar.setContactosOriginal(panel.getContactosOriginal());
		panelActualizar.setContactosNuevo(panel.getContactosNuevo());
		
		try {
			mgr.makePersistent(panelActualizar);
		} finally {
			mgr.close();
		}
		return panelActualizar;
	}

	
	public Panel removePanel(Long id) {
		PersistenceManager mgr = getPersistenceManager();
		Panel panel = null;
		try {
			panel = mgr.getObjectById(Panel.class, id);
			mgr.deletePersistent(panel);
		} finally {
			mgr.close();
		}
		return panel;
	}
	
	private static PersistenceManager getPersistenceManager() {
		return PMF.get().getPersistenceManager();
	}

}
