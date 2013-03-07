package com.fachada.panel;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.NotPersistent;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.fachada.ciclo.CrudCiclo;
import com.fachada.unidadvisita.CrudUnidadVisita;
import com.fachada.usuario.CrudUsuario;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

@PersistenceCapable
public class Panel {

	 @PrimaryKey
	 @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	 private Key Id;
	 
	 @Persistent
     private Key UnidadVisita;
	 
	 @Persistent
	 private long idUnidadVisita;
	 
	 @NotPersistent
	 private com.fachada.unidadvisita.UnidadVisita UnidadVisitaEntity;
	 
	 @Persistent
     private Key Ciclo;
	 
	 @Persistent
	 private long idCiclo;
	 
	 @NotPersistent
	 private com.fachada.ciclo.Ciclo CicloEntity;
	 
	 @Persistent
     private Key Usuario;	
	
	 @NotPersistent
	 private long idUsuario;
	 
	 private int ContactosOriginal;
	 
	 private int ContactosActual;
	 
	 private int ContactosNuevo;
	 
	 private Boolean Alta;
	 
	 private Boolean Baja;
	 
	 private Boolean Activo;
	 
	 private int Aprobado;
	 
	 private String Categoria;
	 
	 private String Email;
	 
	 @NotPersistent
	 private long idEntidad = -1;
	 
	 @NotPersistent
	 private long Comodin = -1;
	 
	 @NotPersistent
	 private com.fachada.usuario.Usuario UsuarioEntity;
	 
	 public void setIdUsuario(long idUsuario) {
			Usuario = KeyFactory.createKey("Usuario", idUsuario);
			this.idUsuario = idUsuario;
		}
	 
	 public com.fachada.usuario.Usuario getUsuarioEntity(Boolean cargarTodosDatos) {
			
		if(Usuario != null)
		{
			CrudUsuario crud = new CrudUsuario();			
			UsuarioEntity = crud.getUsuario(Usuario.getId(),cargarTodosDatos);
		}
		return UsuarioEntity;		
	 }

	public com.fachada.ciclo.Ciclo getCicloEntity() {
		
		if(Ciclo != null)
		{
			CrudCiclo crud = new CrudCiclo();			
			CicloEntity = crud.getCiclo(Ciclo.getId());
		}
		
		return CicloEntity;
	}

	public void setIdCiclo(long idCiclo) {
		Ciclo = KeyFactory.createKey("Ciclo", idCiclo);
		this.idCiclo = idCiclo;
	}
	
	public com.fachada.unidadvisita.UnidadVisita getUnidadVisitaEntity() {
		return UnidadVisitaEntity;
	}

	public void cargarUnidadVisita(Boolean todosDatos) {
		if(UnidadVisita != null && UnidadVisita.getId() != 0)
		{
			CrudUnidadVisita crud = new CrudUnidadVisita();			
			UnidadVisitaEntity = crud.getUnidadVisita(UnidadVisita.getId(), todosDatos);
		}
	}
	
	public void setIdUnidadVisita(long idUnidadVisita) {
		UnidadVisita = KeyFactory.createKey("UnidadVisita", idUnidadVisita);
		this.idUnidadVisita = idUnidadVisita;
	}

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

	public Key getCiclo() {
		return Ciclo;
	}

	public void setCiclo(Key ciclo) {
		Ciclo = ciclo;
	}

	public Key getUsuario() {
		return Usuario;
	}

	public void setUsuario(Key usuario) {
		Usuario = usuario;
	}

	public int getContactosOriginal() {
		return ContactosOriginal;
	}

	public void setContactosOriginal(int contactosOriginal) {
		ContactosOriginal = contactosOriginal;
	}

	public int getContactosActual() {
		return ContactosActual;
	}

	public void setContactosActual(int contactosActual) {
		ContactosActual = contactosActual;
	}

	public int getContactosNuevo() {
		return ContactosNuevo;
	}

	public void setContactosNuevo(int contactosNuevo) {
		ContactosNuevo = contactosNuevo;
	}

	public Boolean getAlta() {
		return Alta;
	}

	public void setAlta(Boolean alta) {
		Alta = alta;
	}

	public Boolean getBaja() {
		return Baja;
	}

	public void setBaja(Boolean baja) {
		Baja = baja;
	}

	public Boolean getActivo() {
		return Activo;
	}

	public void setActivo(Boolean activo) {
		Activo = activo;
	}

	public int getAprobado() {
		return Aprobado;
	}

	public void setAprobado(int aprobado) {
		Aprobado = aprobado;
	}

	public String getCategoria() {
		return Categoria;
	}

	public void setCategoria(String categoria) {
		Categoria = categoria;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public void setIdEntidad(long idEntidad) {
		this.idEntidad = idEntidad;
	}

	public long getIdEntidad() {
		return idEntidad;
	}

	public long getIdUnidadVisita() {
		return idUnidadVisita;
	}

	public long getIdCiclo() {
		return idCiclo;
	}

	public long getIdUsuario() {
		return idUsuario;
	}

	public long getComodin() {
		return Comodin;
	}

	public void setComodin(long comodin) {
		Comodin = comodin;
	}	
	
	
}
