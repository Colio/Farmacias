package com.fachada.ciclo;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import com.hefesoft.pharmacy.PMF;

public class CrudCiclo {

	@SuppressWarnings({ "cast", "unchecked" })
	public List<Ciclo> listCiclo() {
		PersistenceManager mgr = getPersistenceManager();
		List<Ciclo> result = new ArrayList<Ciclo>();
		try {
			Query query = mgr.newQuery(Ciclo.class);
			for (Object obj : (List<Object>) query.execute()) {
				result.add(((Ciclo) obj));
			}
		} finally {
			mgr.close();
		}
		return result;
	}


	public Ciclo getCiclo(@Named("id") Long id) {
		PersistenceManager mgr = getPersistenceManager();
		Ciclo ciclo = null;
		try {
			ciclo = mgr.getObjectById(Ciclo.class, id);
		} finally {
			mgr.close();
		}
		return ciclo;
	}

	
	public Ciclo insertCiclo(Ciclo ciclo) {
		PersistenceManager mgr = getPersistenceManager();
		try {
			mgr.makePersistent(ciclo);
		} finally {
			mgr.close();
		}
		return ciclo;
	}

	
	public Ciclo updateCiclo(Ciclo ciclo) {
		PersistenceManager mgr = getPersistenceManager();
		try {
			
			Ciclo cicloActualizar = mgr.getObjectById(Ciclo.class, ciclo.getIdEntidad());
			
			if(!(ciclo.getIdEntidad() != -1))
			{
				cicloActualizar.setIdEntidad(ciclo.getIdEntidad());
			}
			
			if(!(ciclo.getFechaInicial() != null))
			{
				cicloActualizar.setFechaInicial(ciclo.getFechaInicial());
			}
			
			if(!(ciclo.getFechaReunionCiclo() != null))
			{
				cicloActualizar.setFechaReunionCiclo(ciclo.getFechaReunionCiclo());
			}
			
			if(!ciclo.getNombre().isEmpty())
			{
				cicloActualizar.setNombre(ciclo.getNombre());
			}
			
			mgr.makePersistent(cicloActualizar);
		} finally {
			mgr.close();
		}
		return ciclo;
	}

	
	public Ciclo removeCiclo(@Named("id") Long id) {
		PersistenceManager mgr = getPersistenceManager();
		Ciclo ciclo = null;
		try {
			ciclo = mgr.getObjectById(Ciclo.class, id);
			mgr.deletePersistent(ciclo);
		} finally {
			mgr.close();
		}
		return ciclo;
	}

	private static PersistenceManager getPersistenceManager() {
		return PMF.get().getPersistenceManager();
	}
	
}
