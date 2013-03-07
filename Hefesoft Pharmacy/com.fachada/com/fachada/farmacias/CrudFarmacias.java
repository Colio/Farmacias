package com.fachada.farmacias;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import com.hefesoft.pharmacy.PMF;

public class CrudFarmacias {

	@SuppressWarnings({ "cast", "unchecked" })
	public List<Farmacias> listFarmacias() {
		PersistenceManager mgr = getPersistenceManager();
		List<Farmacias> result = new ArrayList<Farmacias>();
		try {
			Query query = mgr.newQuery(Farmacias.class);
			for (Object obj : (List<Object>) query.execute()) {
				result.add(((Farmacias) obj));
			}
		} finally {
			mgr.close();
		}
		return result;
	}

	
	public Farmacias getFarmacias(@Named("id") Long id) {
		PersistenceManager mgr = getPersistenceManager();
		Farmacias farmacias = null;
		try {
			farmacias = mgr.getObjectById(Farmacias.class, id);
		} finally {
			mgr.close();
		}
		return farmacias;
	}


	public Farmacias insertFarmacias(Farmacias farmacias) {
		PersistenceManager mgr = getPersistenceManager();
		try {
			mgr.makePersistent(farmacias);
		} finally {
			mgr.close();
		}
		return farmacias;
	}


	public Farmacias updateFarmacias(Farmacias farmacias) {
		PersistenceManager mgr = getPersistenceManager();
		try {
			mgr.makePersistent(farmacias);
		} finally {
			mgr.close();
		}
		return farmacias;
	}

	
	public Farmacias removeFarmacias(@Named("id") Long id) {
		PersistenceManager mgr = getPersistenceManager();
		Farmacias farmacias = null;
		try {
			farmacias = mgr.getObjectById(Farmacias.class, id);
			mgr.deletePersistent(farmacias);
		} finally {
			mgr.close();
		}
		return farmacias;
	}

	private static PersistenceManager getPersistenceManager() {
		return PMF.get().getPersistenceManager();
	}
}
