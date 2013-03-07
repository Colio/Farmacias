package com.fachada.medicos;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class Medicos {

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key Id;
	
	@Persistent
	 private long idEntidad = -1;

	@Persistent
	 private String Nombres = "";
	 
	 @Persistent
	 private String Apellidos = "";
	 
	 @Persistent
	 private String Cedula = "";
	 
	 @Persistent
	 private String Email = "";
	 
	 @Persistent
	 private String Telefono = "";
	 
	 @Persistent
	 private String Telefono_Celular = "";
	 
	 @Persistent
	 private String Direccion = "";
	 
	 @Persistent
	 private String Cordenadas = "";
	 
	 @Persistent
	 private String  ImagenUrl = "";

	public Key getId() {
		return Id;
	}

	public void setId(Key id) {
		Id = id;
	}

	public long getIdEntidad() {
		return idEntidad;
	}

	public void setIdEntidad(long idEntidad) {
		this.idEntidad = idEntidad;
	}

	public String getNombres() {
		return Nombres;
	}

	public void setNombres(String nombres) {
		Nombres = nombres;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public String getCedula() {
		return Cedula;
	}

	public void setCedula(String cedula) {
		Cedula = cedula;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	public String getTelefono_Celular() {
		return Telefono_Celular;
	}

	public void setTelefono_Celular(String telefono_Celular) {
		Telefono_Celular = telefono_Celular;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public String getCordenadas() {
		return Cordenadas;
	}

	public void setCordenadas(String cordenadas) {
		Cordenadas = cordenadas;
	}

	public String getImagenUrl() {
		return ImagenUrl;
	}

	public void setImagenUrl(String imagenUrl) {
		ImagenUrl = imagenUrl;
	}
	 
	 
	
}
