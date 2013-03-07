package com.fachada.unidadvisita;

import java.util.ArrayList;
import java.util.List;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.NotPersistent;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.fachada.actividadjustificada.Actividadjustificada;
import com.fachada.actividadjustificada.CrudActividadJustificada;
import com.fachada.farmacias.CrudFarmacias;
import com.fachada.farmacias.Farmacias;
import com.fachada.medicos.CrudMedicos;
import com.fachada.medicos.Medicos;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

@PersistenceCapable
public class UnidadVisita {

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key Id;
	
	@Persistent
    private Key UnidadVisita;

	@Persistent
	private List<Long> idUnidadVisita = new ArrayList<Long>();
	
	
	@NotPersistent
	private com.fachada.medicos.Medicos MedicosEntity;
	
	@NotPersistent
	private com.fachada.farmacias.Farmacias FarmaciasEntity;
	
	@NotPersistent
	private com.fachada.actividadjustificada.Actividadjustificada ActividadjustificadaEntity;
	
	public Key getId() {
		return Id;
	}

	public void setId(Key id) {
		Id = id;
	}

	public Key getUnidadVisita() {
		return UnidadVisita;
	}

	public void setUnidadVisita(Key unidadVisita) {
		UnidadVisita = unidadVisita;
	}



	public List<Long> getIdUnidadVisita() {
		return idUnidadVisita;
	}

	public void setIdUnidadVisita(List<Long> idUnidadVisita) {		
		guardarReferencias(idUnidadVisita);
		this.idUnidadVisita = idUnidadVisita;
	}

	private void guardarReferencias(List<Long> idUnidadVisita) {
		if(idUnidadVisita.get(0) == 1)
		{
			UnidadVisita = KeyFactory.createKey("Medicos", idUnidadVisita.get(1));
		}
		else if(idUnidadVisita.get(0) == 2)
		{
			UnidadVisita = KeyFactory.createKey("Farmacias", idUnidadVisita.get(1));
		}
		else if(idUnidadVisita.get(0) == 3)
		{
			UnidadVisita = KeyFactory.createKey("Actividadjustificada", idUnidadVisita.get(1));
		}
	}

	public com.fachada.medicos.Medicos getMedicosEntity() {
		return MedicosEntity;
	}
	
	
	public com.fachada.farmacias.Farmacias getFarmaciasEntity() {		
		return FarmaciasEntity;
	}	

	public com.fachada.actividadjustificada.Actividadjustificada getActividadjustificadaEntity() {		
		return ActividadjustificadaEntity;
	}
	
	public Farmacias cargarFarmacias() {
		if(UnidadVisita != null && idUnidadVisita.get(0) == 2)
		{
			CrudFarmacias crud = new CrudFarmacias();
			return FarmaciasEntity = crud.getFarmacias(UnidadVisita.getId());
		}
		return FarmaciasEntity;
	}
	
	public Medicos cargarMedicos() {
		if(UnidadVisita != null && idUnidadVisita.get(0) == 1)
		{
			CrudMedicos crud = new CrudMedicos();
			return MedicosEntity = crud.getMedicos(UnidadVisita.getId());
		}
		return MedicosEntity;
	}	
	
	public Actividadjustificada cargarActividadesJustificadas() {
		if(UnidadVisita != null && idUnidadVisita.get(0) == 3)
		{
			CrudActividadJustificada crud = new CrudActividadJustificada();
			return ActividadjustificadaEntity = crud.getActividadjustificada(UnidadVisita.getId());
		}
		return ActividadjustificadaEntity;
	}
}
