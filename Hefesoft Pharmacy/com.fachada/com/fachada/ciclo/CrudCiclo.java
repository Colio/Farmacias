package com.fachada.ciclo;

import java.util.ArrayList;
import java.util.HashMap;
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

	
	@SuppressWarnings("unchecked")
	public Ciclo obtenerCicloActivo() {
		PersistenceManager mgr = getPersistenceManager();
		Ciclo ciclo = null;

		Query query = mgr.newQuery(Ciclo.class);

		query.setFilter("Activo == ActivoParam");

		//query.setOrdering("UsuarioKey desc");
		query.declareParameters("Boolean ActivoParam");

		HashMap<String, Object> params = new HashMap<String, Object>();
		//params.put( "UsuarioKey", panel.getUsuarioKey() );
		params.put( "ActivoParam", true);


		try {				
			try {
				for (Object obj : (List<Object>) query.executeWithMap(params))
				{
					ciclo = (((Ciclo) obj));
					break;
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ciclo = null;
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
				cicloActualizar = ciclo;
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
