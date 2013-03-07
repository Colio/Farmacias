package com.fachada.tipounidad;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import com.hefesoft.pharmacy.PMF;

public class CrudTipoUnidad {

	@SuppressWarnings({ "cast", "unchecked" })
	public List<Tipounidad> listTipounidad() {
		PersistenceManager mgr = getPersistenceManager();
		List<Tipounidad> result = new ArrayList<Tipounidad>();
		try {
			Query query = mgr.newQuery(Tipounidad.class);
			for (Object obj : (List<Object>) query.execute()) {
				result.add(((Tipounidad) obj));
			}
		} finally {
			mgr.close();
		}
		return result;
	}

	
	public Tipounidad getTipounidad(@Named("id") Long id) {
		PersistenceManager mgr = getPersistenceManager();
		Tipounidad tipounidad = null;
		try {
			tipounidad = mgr.getObjectById(Tipounidad.class, id);
		} finally {
			mgr.close();
		}
		return tipounidad;
	}

	
	public Tipounidad insertTipounidad(Tipounidad tipounidad) {
		PersistenceManager mgr = getPersistenceManager();
		try {
			mgr.makePersistent(tipounidad);
		} finally {
			mgr.close();
		}
		return tipounidad;
	}

	
	public Tipounidad updateTipounidad(Tipounidad tipounidad) {
		PersistenceManager mgr = getPersistenceManager();
		try {
			mgr.makePersistent(tipounidad);
		} finally {
			mgr.close();
		}
		return tipounidad;
	}

	
	public Tipounidad removeTipounidad(@Named("id") Long id) {
		PersistenceManager mgr = getPersistenceManager();
		Tipounidad tipounidad = null;
		try {
			tipounidad = mgr.getObjectById(Tipounidad.class, id);
			mgr.deletePersistent(tipounidad);
		} finally {
			mgr.close();
		}
		return tipounidad;
	}

	private static PersistenceManager getPersistenceManager() {
		return PMF.get().getPersistenceManager();
	}
	
}
