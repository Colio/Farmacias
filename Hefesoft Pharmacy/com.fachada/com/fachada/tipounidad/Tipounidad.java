package com.fachada.tipounidad;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class Tipounidad {

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key Id;
	
	private String Tipo;

	public Key getId() {
		return Id;
	}

	public void setId(Key id) {
		Id = id;
	}

	public Tipounidad(String tipo) {
		super();		
		Tipo = tipo;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	
}
