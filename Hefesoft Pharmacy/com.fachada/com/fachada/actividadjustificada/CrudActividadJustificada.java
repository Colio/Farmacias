package com.fachada.actividadjustificada;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import com.hefesoft.pharmacy.PMF;

public class CrudActividadJustificada {

	@SuppressWarnings({ "cast", "unchecked" })
	public List<Actividadjustificada> listActividadjustificada() {
		PersistenceManager mgr = getPersistenceManager();
		List<Actividadjustificada> result = new ArrayList<Actividadjustificada>();
		try {
			Query query = mgr.newQuery(Actividadjustificada.class);
			for (Object obj : (List<Object>) query.execute()) {
				result.add(((Actividadjustificada) obj));
			}
		} finally {
			mgr.close();
		}
		return result;
	}


	public Actividadjustificada getActividadjustificada(@Named("id") Long id) {
		PersistenceManager mgr = getPersistenceManager();
		Actividadjustificada actividadjustificada = null;
		try {
			actividadjustificada = mgr.getObjectById(
					Actividadjustificada.class, id);
		} finally {
			mgr.close();
		}
		return actividadjustificada;
	}

	
	public Actividadjustificada insertActividadjustificada(
			Actividadjustificada actividadjustificada) {
		PersistenceManager mgr = getPersistenceManager();
		try {
			mgr.makePersistent(actividadjustificada);
		} finally {
			mgr.close();
		}
		return actividadjustificada;
	}

	
	public Actividadjustificada updateActividadjustificada(
			Actividadjustificada actividadjustificada) {
		PersistenceManager mgr = getPersistenceManager();
		try {
			mgr.makePersistent(actividadjustificada);
		} finally {
			mgr.close();
		}
		return actividadjustificada;
	}

	private static PersistenceManager getPersistenceManager() {
		return PMF.get().getPersistenceManager();
	}
}
