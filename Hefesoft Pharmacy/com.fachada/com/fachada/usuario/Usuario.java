package com.fachada.usuario;

import java.util.ArrayList;
import java.util.List;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.NotPersistent;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.fachada.gerencias.CrudGerencias;
import com.fachada.linea.CrudLinea;
import com.fachada.linea.Linea;
import com.google.api.server.spi.response.CollectionResponse;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

@PersistenceCapable
public class Usuario {

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key Id;
	
	@Persistent
	public String Email;
	
	@Persistent
	public String Password;
	

	@Persistent
	public String Nombres;
	
	@Persistent
	public String Apellidos;
	
	@Persistent
	public String Telefono;
	
	@Persistent
	public String TelefonoCelular;
	
	@Persistent
    private Key GerenteCluster;
	
	@Persistent
    private com.fachada.gerencias.GerenteCluster GerenteClusterEntity;
	
	@NotPersistent
	private long idGerenteCluster;
	
	@Persistent
    private Key GerenteDistrito;
	
	@Persistent
    private com.fachada.gerencias.GerenteDistrito GerenteDistritoEntity;
	
	@NotPersistent
	private long idGerenteDistrito;
	
	@Persistent
    private Key GerenteDivision;
	
	@Persistent
    private com.fachada.gerencias.GerenteDivision GerenteDivisionEntity;
	
	@NotPersistent
	private long idGerenteDivision;
	
	@Persistent
    private Key GerenteEmpresa;
	
	@Persistent
    private com.fachada.gerencias.GerenteEmpresa GerenteEmpresaEntity;
	
	@NotPersistent
	private long idGerenteEmpresa;
	
	@Persistent
    private Key GerentePais;
	
	@Persistent
    private com.fachada.gerencias.GerentePais GerentePaisEntity;
	
	@NotPersistent
	private long idGerentePais;
	
	@Persistent
    private Key GerenteRegional;
	
	@Persistent
    private com.fachada.gerencias.GerenteRegional GerenteRegionalEntity;
	
	@NotPersistent
	private long idGerenteRegional;
	
	@Persistent
    private Key GerenteLinea;
	
	@Persistent
    private com.fachada.gerencias.GerenteLinea GerenteLineaEntity;
	
	@NotPersistent
	private long idGerenteLinea;
	
	@Persistent    
	private List<Key> Lineas = new ArrayList<Key>();
	
	@Persistent
    private List<Long> idsLineas = new ArrayList<Long>();
	
	@NotPersistent
    private List<Linea> LineasEntitys = new ArrayList<Linea>();

	public Key getId() {
		return Id;
	}

	public void setId(Key id) {
		Id = id;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
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

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	public String getTelefonoCelular() {
		return TelefonoCelular;
	}

	public void setTelefonoCelular(String telefonoCelular) {
		TelefonoCelular = telefonoCelular;
	}

	public void setIdGerenteCluster(long idGerenteCluster) {		
		GerenteCluster = KeyFactory.createKey("GerenteCluster", idGerenteCluster);
		this.idGerenteCluster = idGerenteCluster;
	}

	public void setIdGerenteDistrito(long idGerenteDistrito) {
		GerenteDistrito = KeyFactory.createKey("GerenteDistrito", idGerenteDistrito);
		this.idGerenteDistrito = idGerenteDistrito;
	}

	public void setIdGerenteDivision(long idGerenteDivision) {
		GerenteDivision = KeyFactory.createKey("GerenteDivision", idGerenteDivision);
		this.idGerenteDivision = idGerenteDivision;
	}

	public void setIdGerenteEmpresa(long idGerenteEmpresa) {
		GerenteEmpresa = KeyFactory.createKey("GerenteEmpresa", idGerenteEmpresa);
		this.idGerenteEmpresa = idGerenteEmpresa;
	}

	public void setIdGerentePais(long idGerentePais) {
		GerentePais = KeyFactory.createKey("GerentePais", idGerentePais);
		this.idGerentePais = idGerentePais;
	}

	public void setIdGerenteRegional(long idGerenteRegional) {
		GerenteRegional = KeyFactory.createKey("GerenteRegional", idGerenteRegional);
		this.idGerenteRegional = idGerenteRegional;
	}
	
	public void setIdGerenteLinea(long idGerenteLinea) {
		GerenteRegional = KeyFactory.createKey("GerenteLinea", idGerenteLinea);
		this.idGerenteLinea = idGerenteLinea;
	}

	public com.fachada.gerencias.GerenteDistrito getGerenteDistritoEntity() {		
		return GerenteDistritoEntity;
	}

	public com.fachada.gerencias.GerenteDivision getGerenteDivisionEntity() {
		return GerenteDivisionEntity;
	}
	
	public com.fachada.gerencias.GerenteEmpresa getGerenteEmpresaEntity() {		
		return GerenteEmpresaEntity;
	}

	public com.fachada.gerencias.GerentePais getGerentePaisEntity() {			
		return GerentePaisEntity;
	}

	public com.fachada.gerencias.GerenteRegional getGerenteRegionalEntity() {		
		return GerenteRegionalEntity;
	}
	
	public com.fachada.gerencias.GerenteLinea getGerenteLineaEntity() {		
		return GerenteLineaEntity;
	}
	
	public com.fachada.gerencias.GerenteCluster getGerenteClusterEntity() {		
		return GerenteClusterEntity;
	}

	public com.fachada.gerencias.GerenteCluster cargarGerentesCluster() {
		if(GerenteCluster != null)
		{
			CrudGerencias crud = new CrudGerencias();			
			return GerenteClusterEntity = crud.getGerenteCluster(GerenteCluster.getId(),true);
		}
		return GerenteClusterEntity;
	}
	
	public com.fachada.gerencias.GerenteDistrito cargarGerenteDistrito() {
		if(GerenteDistrito != null)
		{
			CrudGerencias crud = new CrudGerencias();			
			return GerenteDistritoEntity = crud.getGerenteDistrito(GerenteDistrito.getId(),true);
		}
		return GerenteDistritoEntity;
	}
	
	public com.fachada.gerencias.GerenteDivision cargarGerenteDivision() {
		if(GerenteDivision != null )
		{
			CrudGerencias crud = new CrudGerencias();			
			return GerenteDivisionEntity = crud.getGerenteDivision(GerenteDivision.getId(),true);
		}
		return GerenteDivisionEntity;
	}
	
	public com.fachada.gerencias.GerenteEmpresa cargarGerenteEmpresa() {
		if(GerenteEmpresa != null)
		{
			CrudGerencias crud = new CrudGerencias();			
			return GerenteEmpresaEntity = crud.getGerenteEmpresa(GerenteEmpresa.getId(),true);
		}
		return GerenteEmpresaEntity;
	}
	
	public com.fachada.gerencias.GerentePais cargarGerentePais() {
		if(GerentePais != null )
		{
			CrudGerencias crud = new CrudGerencias();			
			return GerentePaisEntity = crud.getGerentePais(GerentePais.getId(),true);
		}
		return GerentePaisEntity;
	}
	
	public com.fachada.gerencias.GerenteRegional cargarGerenteRegional() {
		if(GerenteRegional != null)
		{
			CrudGerencias crud = new CrudGerencias();			
			return GerenteRegionalEntity = crud.getGerenteRegional(GerenteRegional.getId(),true);
		}
		return GerenteRegionalEntity;
	}
	
	public com.fachada.gerencias.GerenteLinea cargarGerenteLineas() {
		if(GerenteLinea != null)
		{
			CrudGerencias crud = new CrudGerencias();			
			return GerenteLineaEntity = crud.getGerenteLinea(GerenteLinea.getId());
		}
		return GerenteLineaEntity;
	}
	
	public List<Linea> cargarLineas() {
		try {
			
			if(Lineas.size() > 0)
			{			
				CrudLinea crud = new CrudLinea();
				CollectionResponse<Linea> result = crud.listLinea(null, null);
				
				for(Linea pivote : result.getItems())
				{
					LineasEntitys.add(pivote);
				}
				
				return LineasEntitys;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return LineasEntitys;
	}

	public void setIdsLineas(List<Long> idsLineas) {
		
		
		for(Long pivote : idsLineas)
		{
			Lineas.add(KeyFactory.createKey("Linea", pivote));	
		}		
		
		this.idsLineas = idsLineas;
	}

	public List<Linea> getLineasEntitys() {
		return LineasEntitys;
	}
}
