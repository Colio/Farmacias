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
	 
	 @Persistent
	 private com.fachada.panel.Panel PanelEntity;
	 
	 
	 private Date FechaYHora;
	 
	 private String Email;

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
	
	
}
