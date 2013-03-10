package com.fachada.visita;

import java.util.Date;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.NotPersistent;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.fachada.panel.CrudPanel;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.sun.xml.internal.bind.v2.TODO;

@PersistenceCapable
public class VisitaRealizada {

	 @PrimaryKey
	 @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	 private Key Id;
	 
	 @Persistent
     private Key Panel;
	 
	 @NotPersistent
	 private long idPanel;
	 
	 @NotPersistent
	 private com.fachada.panel.Panel PanelEntity;
	 
	 private Date FechaYHora;
	 
	 private String Email;
	 
	 private Boolean Realizada = false;
	 
	 private long idVisitaPlaneada = -1;
	 

	public Boolean getRealizada() {
		return Realizada;
	}

	public void setRealizada(Boolean realizada) {
		Realizada = realizada;
	}

	public com.fachada.panel.Panel getPanelEntity(Boolean TodosDatos) {
		
		if(Panel != null)
		{
			CrudPanel crud = new CrudPanel();			
			PanelEntity = crud.getPanel(Panel.getId(), TodosDatos);
		}
		
		return PanelEntity;
	}

	public void setIdPanel(long idPanel) {
		
		Panel = KeyFactory.createKey("Panel", idPanel);		
		this.idPanel = idPanel;
	}

	public Date getFechaYHora() {
		return FechaYHora;
	}

	public void setFechaYHora(Date fechaYHora) {
		FechaYHora = fechaYHora;
	}
	
	public void cargarDatos(Boolean TodosDatos, long idPanel) {
		
		CrudPanel crud = new CrudPanel();			
		PanelEntity = crud.getPanel(idPanel,TodosDatos);
	
}

	public Key getId() {
		return Id;
	}

	public void setId(Key id) {
		Id = id;
	}

	public Key getPanel() {
		return Panel;
	}

	public void setPanel(Key panel) {
		Panel = panel;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public com.fachada.panel.Panel getPanelEntity() {
		return PanelEntity;
	}

	public void setPanelEntity(com.fachada.panel.Panel panelEntity) {
		PanelEntity = panelEntity;
	}

	public long getIdVisitaPlaneada() {
		return idVisitaPlaneada;
	}

	public void setIdVisitaPlaneada(long idVisitaPlaneada) {
		this.idVisitaPlaneada = idVisitaPlaneada;
	}
	
	
}
