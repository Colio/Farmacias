package com.fachada.gerencias;

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

public class CrudGerencias {

	
	@SuppressWarnings("unchecked")
	public CollectionResponse<GerenteCluster> listGerenteCluster(
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit, 
			Boolean traerTodosDatos
			
			
			) {

		PersistenceManager mgr = null;
		Cursor cursor = null;
		List<GerenteCluster> execute = null;

		try {
			mgr = getPersistenceManager();
			Query query = mgr.newQuery(GerenteCluster.class);
			if (cursorString != null && cursorString != "") {
				cursor = Cursor.fromWebSafeString(cursorString);
				HashMap<String, Object> extensionMap = new HashMap<String, Object>();
				extensionMap.put(JDOCursorHelper.CURSOR_EXTENSION, cursor);
				query.setExtensions(extensionMap);
			}

			if (limit != null) {
				query.setRange(0, limit);
			}

			execute = (List<GerenteCluster>) query.execute();
			cursor = JDOCursorHelper.getCursor(execute);
			if (cursor != null)
				cursorString = cursor.toWebSafeString();

			// Tight loop for fetching all entities from datastore and accomodate
			// for lazy fetch.
			for (GerenteCluster obj : execute)
			{		
				if(traerTodosDatos)
				{
					obj.cargarUsuario(traerTodosDatos);
				}
			}
				
		} finally {
			mgr.close();
		}

		return CollectionResponse.<GerenteCluster> builder().setItems(execute)
				.setNextPageToken(cursorString).build();
	}

	
	public GerenteCluster getGerenteCluster(@Named("id") Long id, 
			Boolean traerTodosDatos
			
			) {
		PersistenceManager mgr = getPersistenceManager();
		GerenteCluster gerentecluster = null;
		try {
			gerentecluster = mgr.getObjectById(GerenteCluster.class, id);
			
			if(traerTodosDatos)
			{
				gerentecluster.cargarUsuario(traerTodosDatos);
			}
			
		} finally {
			mgr.close();
		}
		return gerentecluster;
	}

	public GerenteCluster insertGerenteCluster(GerenteCluster gerentecluster) {
		PersistenceManager mgr = getPersistenceManager();
		try {		
			mgr.makePersistent(gerentecluster);
		} finally {
			mgr.close();
		}
		return gerentecluster;
	}

	
	public GerenteCluster updateGerenteCluster(GerenteCluster gerentecluster) {
		PersistenceManager mgr = getPersistenceManager();
		try {
			
			mgr.makePersistent(gerentecluster);
		} finally {
			mgr.close();
		}
		return gerentecluster;
	}

	
	public GerenteCluster removeGerenteCluster(@Named("id") Long id) {
		PersistenceManager mgr = getPersistenceManager();
		GerenteCluster gerentecluster = null;
		try {
			gerentecluster = mgr.getObjectById(GerenteCluster.class, id);
			mgr.deletePersistent(gerentecluster);
		} finally {
			mgr.close();
		}
		return gerentecluster;
	}
	
	@SuppressWarnings("unchecked")
	public CollectionResponse<GerenteDistrito> listGerenteDistrito(
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit,
			Boolean traerTodosDatos
			
			) {

		PersistenceManager mgr = null;
		Cursor cursor = null;
		List<GerenteDistrito> execute = null;

		try {
			mgr = getPersistenceManager();
			Query query = mgr.newQuery(GerenteDistrito.class);
			if (cursorString != null && cursorString != "") {
				cursor = Cursor.fromWebSafeString(cursorString);
				HashMap<String, Object> extensionMap = new HashMap<String, Object>();
				extensionMap.put(JDOCursorHelper.CURSOR_EXTENSION, cursor);
				query.setExtensions(extensionMap);
			}

			if (limit != null) {
				query.setRange(0, limit);
			}

			execute = (List<GerenteDistrito>) query.execute();
			cursor = JDOCursorHelper.getCursor(execute);
			if (cursor != null)
				cursorString = cursor.toWebSafeString();

			// Tight loop for fetching all entities from datastore and accomodate
			// for lazy fetch.
			for (GerenteDistrito obj : execute)
			{
				obj.cargarUsuario(traerTodosDatos);
			}
		} finally {
			mgr.close();
		}

		return CollectionResponse.<GerenteDistrito> builder().setItems(execute)
				.setNextPageToken(cursorString).build();
	}
	
	public GerenteDistrito getGerenteDistrito(@Named("id") Long id,
			Boolean traerTodosDatos
			
			) {
		PersistenceManager mgr = getPersistenceManager();
		GerenteDistrito gerentedistrito = null;
		try {
			gerentedistrito = mgr.getObjectById(GerenteDistrito.class, id);
			gerentedistrito.cargarUsuario(traerTodosDatos);
		} finally {
			mgr.close();
		}
		return gerentedistrito;
	}
	
	public GerenteDistrito insertGerenteDistrito(GerenteDistrito gerentedistrito) {
		PersistenceManager mgr = getPersistenceManager();
		try {			
			mgr.makePersistent(gerentedistrito);
		} finally {
			mgr.close();
		}
		return gerentedistrito;
	}
	
	public GerenteDistrito updateGerenteDistrito(GerenteDistrito gerentedistrito) {
		PersistenceManager mgr = getPersistenceManager();
		try {
			
			mgr.makePersistent(gerentedistrito);
		} finally {
			mgr.close();
		}
		return gerentedistrito;
	}

	public GerenteDistrito removeGerenteDistrito(@Named("id") Long id) {
		PersistenceManager mgr = getPersistenceManager();
		GerenteDistrito gerentedistrito = null;
		try {
			gerentedistrito = mgr.getObjectById(GerenteDistrito.class, id);
			mgr.deletePersistent(gerentedistrito);
		} finally {
			mgr.close();
		}
		return gerentedistrito;
	}
	
	
	@SuppressWarnings("unchecked")
	public CollectionResponse<GerenteDivision> listGerenteDivision(
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit,
			Boolean traerTodosDatos
			
			) {

		PersistenceManager mgr = null;
		Cursor cursor = null;
		List<GerenteDivision> execute = null;

		try {
			mgr = getPersistenceManager();
			Query query = mgr.newQuery(GerenteDivision.class);
			if (cursorString != null && cursorString != "") {
				cursor = Cursor.fromWebSafeString(cursorString);
				HashMap<String, Object> extensionMap = new HashMap<String, Object>();
				extensionMap.put(JDOCursorHelper.CURSOR_EXTENSION, cursor);
				query.setExtensions(extensionMap);
			}

			if (limit != null) {
				query.setRange(0, limit);
			}

			execute = (List<GerenteDivision>) query.execute();
			cursor = JDOCursorHelper.getCursor(execute);
			if (cursor != null)
				cursorString = cursor.toWebSafeString();

			// Tight loop for fetching all entities from datastore and accomodate
			// for lazy fetch.
			for (GerenteDivision obj : execute)
			{
				obj.cargarUsuario(traerTodosDatos);
			}
		} finally {
			mgr.close();
		}

		return CollectionResponse.<GerenteDivision> builder().setItems(execute)
				.setNextPageToken(cursorString).build();
	}

	
	public GerenteDivision getGerenteDivision(@Named("id") Long id,
			Boolean traerTodosDatos
			
			) {
		PersistenceManager mgr = getPersistenceManager();
		GerenteDivision gerentedivision = null;
		try {
			gerentedivision = mgr.getObjectById(GerenteDivision.class, id);
			gerentedivision.cargarUsuario(traerTodosDatos);
		} finally {
			mgr.close();
		}
		return gerentedivision;
	}

	
	public GerenteDivision insertGerenteDivision(GerenteDivision gerentedivision) {
		PersistenceManager mgr = getPersistenceManager();
		try {			
			mgr.makePersistent(gerentedivision);
		} finally {
			mgr.close();
		}
		return gerentedivision;
	}

	
	public GerenteDivision updateGerenteDivision(GerenteDivision gerentedivision) {
		PersistenceManager mgr = getPersistenceManager();
		try {			
			mgr.makePersistent(gerentedivision);
		} finally {
			mgr.close();
		}
		return gerentedivision;
	}

	
	public GerenteDivision removeGerenteDivision(@Named("id") Long id) {
		PersistenceManager mgr = getPersistenceManager();
		GerenteDivision gerentedivision = null;
		try {
			gerentedivision = mgr.getObjectById(GerenteDivision.class, id);
			mgr.deletePersistent(gerentedivision);
		} finally {
			mgr.close();
		}
		return gerentedivision;
	}

	
	@SuppressWarnings("unchecked")
	public CollectionResponse<GerenteEmpresa> listGerenteEmpresa(
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit,
			Boolean traerTodosDatos
			
			) {

		PersistenceManager mgr = null;
		Cursor cursor = null;
		List<GerenteEmpresa> execute = null;

		try {
			mgr = getPersistenceManager();
			Query query = mgr.newQuery(GerenteEmpresa.class);
			if (cursorString != null && cursorString != "") {
				cursor = Cursor.fromWebSafeString(cursorString);
				HashMap<String, Object> extensionMap = new HashMap<String, Object>();
				extensionMap.put(JDOCursorHelper.CURSOR_EXTENSION, cursor);
				query.setExtensions(extensionMap);
			}

			if (limit != null) {
				query.setRange(0, limit);
			}

			execute = (List<GerenteEmpresa>) query.execute();
			cursor = JDOCursorHelper.getCursor(execute);
			if (cursor != null)
				cursorString = cursor.toWebSafeString();

			// Tight loop for fetching all entities from datastore and accomodate
			// for lazy fetch.
			for (GerenteEmpresa obj : execute)
			{
				obj.cargarUsuario(traerTodosDatos);
			}
		} finally {
			mgr.close();
		}

		return CollectionResponse.<GerenteEmpresa> builder().setItems(execute)
				.setNextPageToken(cursorString).build();
	}

	
	public GerenteEmpresa getGerenteEmpresa(@Named("id") Long id,
			Boolean traerTodosDatos
			
			) {
		PersistenceManager mgr = getPersistenceManager();
		GerenteEmpresa gerenteempresa = null;
		try {
			gerenteempresa = mgr.getObjectById(GerenteEmpresa.class, id);
			gerenteempresa.cargarUsuario(traerTodosDatos);
		} finally {
			mgr.close();
		}
		return gerenteempresa;
	}

	
	public GerenteEmpresa insertGerenteEmpresa(GerenteEmpresa gerenteempresa) {
		PersistenceManager mgr = getPersistenceManager();
		try {			
			mgr.makePersistent(gerenteempresa);
		} finally {
			mgr.close();
		}
		return gerenteempresa;
	}


	public GerenteEmpresa updateGerenteEmpresa(GerenteEmpresa gerenteempresa) {
		PersistenceManager mgr = getPersistenceManager();
		try {			
			mgr.makePersistent(gerenteempresa);
		} finally {
			mgr.close();
		}
		return gerenteempresa;
	}

	
	public GerenteEmpresa removeGerenteEmpresa(@Named("id") Long id) {
		PersistenceManager mgr = getPersistenceManager();
		GerenteEmpresa gerenteempresa = null;
		try {
			gerenteempresa = mgr.getObjectById(GerenteEmpresa.class, id);
			mgr.deletePersistent(gerenteempresa);
		} finally {
			mgr.close();
		}
		return gerenteempresa;
	}
	
	
	@SuppressWarnings("unchecked")
	public CollectionResponse<GerentePais> listGerentePais(
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit,
			Boolean traerTodosDatos
			
			) {

		PersistenceManager mgr = null;
		Cursor cursor = null;
		List<GerentePais> execute = null;

		try {
			mgr = getPersistenceManager();
			Query query = mgr.newQuery(GerentePais.class);
			if (cursorString != null && cursorString != "") {
				cursor = Cursor.fromWebSafeString(cursorString);
				HashMap<String, Object> extensionMap = new HashMap<String, Object>();
				extensionMap.put(JDOCursorHelper.CURSOR_EXTENSION, cursor);
				query.setExtensions(extensionMap);
			}

			if (limit != null) {
				query.setRange(0, limit);
			}

			execute = (List<GerentePais>) query.execute();
			cursor = JDOCursorHelper.getCursor(execute);
			if (cursor != null)
				cursorString = cursor.toWebSafeString();

			// Tight loop for fetching all entities from datastore and accomodate
			// for lazy fetch.
			for (GerentePais obj : execute)
			{
				obj.cargarUsuario(traerTodosDatos);
			}
		} finally {
			mgr.close();
		}

		return CollectionResponse.<GerentePais> builder().setItems(execute)
				.setNextPageToken(cursorString).build();
	}

	
	public GerentePais getGerentePais(@Named("id") Long id,
			Boolean traerTodosDatos
			
			) {
		PersistenceManager mgr = getPersistenceManager();
		GerentePais gerentepais = null;
		try {
			gerentepais = mgr.getObjectById(GerentePais.class, id);
			gerentepais.cargarUsuario(traerTodosDatos);
		} finally {
			mgr.close();
		}
		return gerentepais;
	}

	
	public GerentePais insertGerentePais(GerentePais gerentepais) {
		PersistenceManager mgr = getPersistenceManager();
		try {			
			mgr.makePersistent(gerentepais);
		} finally {
			mgr.close();
		}
		return gerentepais;
	}


	public GerentePais updateGerentePais(GerentePais gerentepais) {
		PersistenceManager mgr = getPersistenceManager();
		try {			
			mgr.makePersistent(gerentepais);
		} finally {
			mgr.close();
		}
		return gerentepais;
	}

	public GerentePais removeGerentePais(@Named("id") Long id) {
		PersistenceManager mgr = getPersistenceManager();
		GerentePais gerentepais = null;
		try {
			gerentepais = mgr.getObjectById(GerentePais.class, id);
			mgr.deletePersistent(gerentepais);
		} finally {
			mgr.close();
		}
		return gerentepais;
	}
	
	
	@SuppressWarnings("unchecked")
	public CollectionResponse<GerenteRegional> listGerenteRegional(
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit,
			Boolean traerTodosDatos
			
			) {

		PersistenceManager mgr = null;
		Cursor cursor = null;
		List<GerenteRegional> execute = null;

		try {
			mgr = getPersistenceManager();
			Query query = mgr.newQuery(GerenteRegional.class);
			if (cursorString != null && cursorString != "") {
				cursor = Cursor.fromWebSafeString(cursorString);
				HashMap<String, Object> extensionMap = new HashMap<String, Object>();
				extensionMap.put(JDOCursorHelper.CURSOR_EXTENSION, cursor);
				query.setExtensions(extensionMap);
			}

			if (limit != null) {
				query.setRange(0, limit);
			}

			execute = (List<GerenteRegional>) query.execute();
			cursor = JDOCursorHelper.getCursor(execute);
			if (cursor != null)
				cursorString = cursor.toWebSafeString();

			// Tight loop for fetching all entities from datastore and accomodate
			// for lazy fetch.
			for (GerenteRegional obj : execute)
			{
				obj.cargarUsuario(traerTodosDatos);
			}
		} finally {
			mgr.close();
		}

		return CollectionResponse.<GerenteRegional> builder().setItems(execute)
				.setNextPageToken(cursorString).build();
	}

	
	public GerenteRegional getGerenteRegional(@Named("id") Long id,
			Boolean traerTodosDatos
			
			) {
		PersistenceManager mgr = getPersistenceManager();
		GerenteRegional gerenteregional = null;
		try {
			gerenteregional = mgr.getObjectById(GerenteRegional.class, id);
			gerenteregional.cargarUsuario(traerTodosDatos);
		} finally {
			mgr.close();
		}
		return gerenteregional;
	}

	
	public GerenteRegional insertGerenteRegional(GerenteRegional gerenteregional) {
		PersistenceManager mgr = getPersistenceManager();
		try {			
			mgr.makePersistent(gerenteregional);
		} finally {
			mgr.close();
		}
		return gerenteregional;
	}

	
	public GerenteRegional updateGerenteRegional(GerenteRegional gerenteregional) {
		PersistenceManager mgr = getPersistenceManager();
		try {			
			mgr.makePersistent(gerenteregional);
		} finally {
			mgr.close();
		}
		return gerenteregional;
	}

	
	public GerenteRegional removeGerenteRegional(@Named("id") Long id) {
		PersistenceManager mgr = getPersistenceManager();
		GerenteRegional gerenteregional = null;
		try {
			gerenteregional = mgr.getObjectById(GerenteRegional.class, id);
			mgr.deletePersistent(gerenteregional);
		} finally {
			mgr.close();
		}
		return gerenteregional;
	}
	
	
	@SuppressWarnings("unchecked")
	public CollectionResponse<GerenteLinea> listGerenteLinea(
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit,
			Boolean traerTodosDatos
			
			) {

		PersistenceManager mgr = null;
		Cursor cursor = null;
		List<GerenteLinea> execute = null;

		try {
			mgr = getPersistenceManager();
			Query query = mgr.newQuery(GerenteLinea.class);
			if (cursorString != null && cursorString != "") {
				cursor = Cursor.fromWebSafeString(cursorString);
				HashMap<String, Object> extensionMap = new HashMap<String, Object>();
				extensionMap.put(JDOCursorHelper.CURSOR_EXTENSION, cursor);
				query.setExtensions(extensionMap);
			}

			if (limit != null) {
				query.setRange(0, limit);
			}

			execute = (List<GerenteLinea>) query.execute();
			cursor = JDOCursorHelper.getCursor(execute);
			if (cursor != null)
				cursorString = cursor.toWebSafeString();

			// Tight loop for fetching all entities from datastore and accomodate
			// for lazy fetch.
			for (GerenteLinea obj : execute)
			{
				obj.cargarUsuario(traerTodosDatos);
			}
		} finally {
			mgr.close();
		}

		return CollectionResponse.<GerenteLinea> builder().setItems(execute)
				.setNextPageToken(cursorString).build();
	}

	
	public GerenteLinea getGerenteLinea(@Named("id") Long id) {
		PersistenceManager mgr = getPersistenceManager();
		GerenteLinea gerentelinea = null;
		try {
			gerentelinea = mgr.getObjectById(GerenteLinea.class, id);
		} finally {
			mgr.close();
		}
		return gerentelinea;
	}

	
	public GerenteLinea insertGerenteLinea(GerenteLinea gerentelinea) {
		PersistenceManager mgr = getPersistenceManager();
		try {
			
			mgr.makePersistent(gerentelinea);
		} finally {
			mgr.close();
		}
		return gerentelinea;
	}

	
	public GerenteLinea updateGerenteLinea(GerenteLinea gerentelinea) {
		PersistenceManager mgr = getPersistenceManager();
		try {			
			mgr.makePersistent(gerentelinea);
		} finally {
			mgr.close();
		}
		return gerentelinea;
	}

	
	public GerenteLinea removeGerenteLinea(@Named("id") Long id) {
		PersistenceManager mgr = getPersistenceManager();
		GerenteLinea gerentelinea = null;
		try {
			gerentelinea = mgr.getObjectById(GerenteLinea.class, id);
			mgr.deletePersistent(gerentelinea);
		} finally {
			mgr.close();
		}
		return gerentelinea;
	}

	private static PersistenceManager getPersistenceManager() {
		return PMF.get().getPersistenceManager();
	}
}
