package com.fachada.medicos;

import javax.jdo.PersistenceManager;

import com.hefesoft.pharmacy.PMF;

public class MedicosFachada {

	
	public Medicos updateMedicos(Medicos medicos) {
		PersistenceManager mgr = getPersistenceManager();
		
		try {
			Medicos medicoActualizar = mgr.getObjectById(Medicos.class, medicos.getIdEntidad());
			
			if(!(medicos.getIdEntidad() != -1))
			{
				medicoActualizar.setIdEntidad(medicos.getIdEntidad());
			}
			
			if(!medicos.getApellidos().isEmpty())
			{
				medicoActualizar.setApellidos(medicos.getApellidos());
			}
			
			if(!medicos.getCedula().isEmpty())
			{
				medicoActualizar.setCedula(medicos.getCedula());
			}
			
			if(!medicos.getCordenadas().isEmpty())
			{
				medicoActualizar.setCordenadas(medicos.getCordenadas());
			}
			
			if(!medicos.getDireccion().isEmpty())
			{
				medicoActualizar.setDireccion(medicos.getDireccion());
			}
			
			if(!medicos.getEmail().isEmpty())
			{
				medicoActualizar.setEmail(medicos.getEmail());
			}
			
			if(!medicos.getImagenUrl().isEmpty())
			{
				medicoActualizar.setImagenUrl(medicos.getImagenUrl());
			}
			
			if(!medicos.getNombres().isEmpty())
			{
				medicoActualizar.setNombres(medicos.getNombres());
			}
			
			if(!medicos.getTelefono().isEmpty())
			{
				medicoActualizar.setTelefono(medicos.getTelefono());
			}
			
			if(!medicos.getTelefono_Celular().isEmpty())
			{
				medicoActualizar.setTelefono_Celular(medicos.getTelefono_Celular());
			}
			
		} finally {
			mgr.close();
		}
		return medicos;
	}
	
	private static PersistenceManager getPersistenceManager() {
		return PMF.get().getPersistenceManager();
	}
}
