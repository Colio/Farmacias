package com.fachada.usuario;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Nullable;
import javax.inject.Named;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import com.fachada.util.Util;
import com.google.api.server.spi.response.CollectionResponse;
import com.google.appengine.api.datastore.Cursor;
import com.google.appengine.datanucleus.query.JDOCursorHelper;
import com.hefesoft.pharmacy.PMF;

public class CrudUsuario {

	@SuppressWarnings("unchecked")
	public CollectionResponse<Usuario> listUsuario(
			String cursorString,
			Integer limit,
			Boolean cargarTodos
			) {

		if(cargarTodos == null)
		{
			cargarTodos = false;
		}
		
		PersistenceManager mgr = null;
		Cursor cursor = null;
		List<Usuario> execute = null;

		try {
			mgr = getPersistenceManager();
			Query query = mgr.newQuery(Usuario.class);
			if (cursorString != null && cursorString != "") {
				cursor = Cursor.fromWebSafeString(cursorString);
				HashMap<String, Object> extensionMap = new HashMap<String, Object>();
				extensionMap.put(JDOCursorHelper.CURSOR_EXTENSION, cursor);
				query.setExtensions(extensionMap);
			}

			if (limit != null) {
				query.setRange(0, limit);
			}

			execute = (List<Usuario>) query.execute();
			cursor = JDOCursorHelper.getCursor(execute);
			if (cursor != null)
				cursorString = cursor.toWebSafeString();

			// Tight loop for fetching all entities from datastore and accomodate
			// for lazy fetch.
			for (Usuario obj : execute)
			{
				if(cargarTodos)
				{
					obj.cargarGerenteDistrito();
					obj.cargarGerenteDivision();
					obj.cargarGerenteEmpresa();
					obj.cargarGerenteLineas();
					obj.cargarGerentePais();
					obj.cargarGerenteRegional();
					obj.cargarGerentesCluster();
					obj.cargarLineas();
				}
			}
				
		} finally {
			mgr.close();
		}

		return CollectionResponse.<Usuario> builder().setItems(execute)
				.setNextPageToken(cursorString).build();
	}

	
	public Usuario getUsuario(@Named("id") Long id,
			@Nullable @Named("todos") Boolean todos
			) {
		
		
		if(todos == null)
		{
			todos = false;
		}
		
		PersistenceManager mgr = getPersistenceManager();
		Usuario usuario = null;
		try {
			usuario = mgr.getObjectById(Usuario.class, id);
			if(todos)
			{
				usuario.cargarGerenteDistrito().cargarUsuario(todos);
				usuario.cargarGerenteDivision().cargarUsuario(todos);
				usuario.cargarGerenteEmpresa().cargarUsuario(todos);
				usuario.cargarGerenteLineas().cargarUsuario(todos);
				usuario.cargarGerentePais().cargarUsuario(todos);
				usuario.cargarGerenteRegional().cargarUsuario(todos);
				usuario.cargarGerentesCluster().cargarUsuario(todos);
				usuario.cargarLineas();
			}
		} finally {
			mgr.close();
		}
		return usuario;
	}
	
		
	public Usuario getUsuarioEmailPassword(String id, String password) {
		PersistenceManager mgr = getPersistenceManager();
		Usuario usuario = null;
		try {
			
			Util util = new Util();
			usuario = util.getUsuarioEmailPassword(id, password);
			
		} finally {
			mgr.close();
		}
		return usuario;
	}


	public Usuario insertUsuario(Usuario usuario) {
		PersistenceManager mgr = getPersistenceManager();
		try {
			mgr.makePersistent(usuario);
		} finally {
			mgr.close();
		}
		return usuario;
	}

	
	public Usuario updateUsuario(Usuario usuario) {
		PersistenceManager mgr = getPersistenceManager();
		try {
			mgr.makePersistent(usuario);
		} finally {
			mgr.close();
		}
		return usuario;
	}
	
	public Usuario removeUsuario(String id) {
		PersistenceManager mgr = getPersistenceManager();
		Usuario usuario = null;
		try {
			usuario = mgr.getObjectById(Usuario.class, id);
			mgr.deletePersistent(usuario);
		} finally {
			mgr.close();
		}
		return usuario;
	}
	
	private static PersistenceManager getPersistenceManager() {
		return PMF.get().getPersistenceManager();
	}
	
}
