package com.fachada.farmacias;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class Farmacias {

	public void setId(Key id) {
		Id = id;
	}

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key Id;
	
	@Persistent
	private String Nombre;
	
	@Persistent
	private String Direccion;
	
	@Persistent
	private String Email;
	
	@Persistent
	private String Pagina_Web;
	
	 @Persistent
	 private String Cordenadas;
	 
	 @Persistent
	 private String Imagen;

	public Farmacias(String nombre, String direccion, String email,
			String pagina_Web) {
		super();
		Nombre = nombre;
		Direccion = direccion;
		Email = email;
		Pagina_Web = pagina_Web;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPagina_Web() {
		return Pagina_Web;
	}

	public void setPagina_Web(String pagina_Web) {
		Pagina_Web = pagina_Web;
	}

	public String getCordenadas() {
		return Cordenadas;
	}

	public void setCordenadas(String cordenadas) {
		Cordenadas = cordenadas;
	}

	public String getImagen() {
		return Imagen;
	}

	public void setImagen(String imagen) {
		Imagen = imagen;
	}

	public Key getId() {
		return Id;
	}

	
	
}
