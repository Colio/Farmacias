package com.fachada.medicos;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import com.hefesoft.pharmacy.PMF;

public class CrudMedicos {

	@SuppressWarnings({ "cast", "unchecked" })
	public List<Medicos> listMedicos() {
		PersistenceManager mgr = getPersistenceManager();
		List<Medicos> result = new ArrayList<Medicos>();
		try {
			Query query = mgr.newQuery(Medicos.class);
			for (Object obj : (List<Object>) query.execute()) {
				result.add(((Medicos) obj));
			}
		} finally {
			mgr.close();
		}
		return result;
	}

	
	public Medicos getMedicos(@Named("id") Long id) {
		PersistenceManager mgr = getPersistenceManager();
		Medicos medicos = null;
		try {
			medicos = mgr.getObjectById(Medicos.class, id);
		} finally {
			mgr.close();
		}
		return medicos;
	}

	public Medicos insertMedicos(Medicos medicos) {
		PersistenceManager mgr = getPersistenceManager();
		try {
			mgr.makePersistent(medicos);
		} finally {
			mgr.close();
		}
		return medicos;
	}

	public Medicos updateMedicos(Medicos medicos) {
	
		MedicosFachada medicoUpdate = new MedicosFachada();
		return medicoUpdate.updateMedicos(medicos);
	}

	
	public Medicos removeMedicos(@Named("id") Long id) {
		PersistenceManager mgr = getPersistenceManager();
		Medicos medicos = null;
		try {
			medicos = mgr.getObjectById(Medicos.class, id);
			mgr.deletePersistent(medicos);
		} finally {
			mgr.close();
		}
		return medicos;
	}

	private static PersistenceManager getPersistenceManager() {
		return PMF.get().getPersistenceManager();
	}
	
}
