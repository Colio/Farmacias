package com.fachada.productos;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class Productos {

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key Id;
	
	private String Alias;
	
	private String Presentacion;
	
	private String FormaFarmaceutica;

	public Key getId() {
		return Id;
	}

	public void setId(Key id) {
		Id = id;
	}

	public String getAlias() {
		return Alias;
	}

	public void setAlias(String alias) {
		Alias = alias;
	}

	public String getPresentacion() {
		return Presentacion;
	}

	public void setPresentacion(String presentacion) {
		Presentacion = presentacion;
	}

	public String getFormaFarmaceutica() {
		return FormaFarmaceutica;
	}

	public void setFormaFarmaceutica(String formaFarmaceutica) {
		FormaFarmaceutica = formaFarmaceutica;
	}
	
	
	
}
