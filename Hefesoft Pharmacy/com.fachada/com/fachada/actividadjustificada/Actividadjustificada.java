package com.fachada.actividadjustificada;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class Actividadjustificada {
	
	public void setId(Key id) {
		Id = id;
	}

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key Id;
	
	@Persistent
	private String Descripcion;

	public String getDescripcion() {
		return Descripcion;
	}

	public Key getId() {
		return Id;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

}
