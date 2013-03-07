package com.fachada.gerencias;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.NotPersistent;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.fachada.usuario.CrudUsuario;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

@PersistenceCapable
public class GerenteCluster {

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key Id;

	@Persistent
    private Key Usuario;
	
		
	@NotPersistent
	private long idUsuario;
	
	@NotPersistent
	private com.fachada.usuario.Usuario UsuarioEntity;	

	public Key getId() {
		return Id;
	}

	public void setId(Key id) {
		Id = id;
	}

	public void setIdUsuario(long idUsuario) {
		Usuario = KeyFactory.createKey("Usuario", idUsuario);
		this.idUsuario = idUsuario;
	}

	public com.fachada.usuario.Usuario getUsuarioEntity() {
		return UsuarioEntity;
	}
	
	public void cargarUsuario(Boolean cargarTodosDatos) {
		if(Usuario != null)
		{
			CrudUsuario crud = new CrudUsuario();			
			UsuarioEntity = crud.getUsuario(Usuario.getId(),
					cargarTodosDatos 
					
					);
		}
	}
}
