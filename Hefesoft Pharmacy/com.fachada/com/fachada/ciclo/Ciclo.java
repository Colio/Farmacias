package com.fachada.ciclo;

import java.util.Date;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class Ciclo {

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key Id;
	
	@Persistent
	private String IdUPES;
	
	@Persistent
	private String Nombre;
	
	@Persistent
	private Date FechaInicial;
	
	@Persistent
	private Date FechaReunionCiclo;
	
	@Persistent
	private int DiasHabiles;
	
	@Persistent
	private int PlazoReportarVisita;
	
	@Persistent
	private int DiasReunionCiclo;
	
	@Persistent
	private int PlazoRegistrarPedido;

	public Key getId() {
		return Id;
	}

	public void setId(Key id) {
		Id = id;
	}

	public String getIdUPES() {
		return IdUPES;
	}

	public void setIdUPES(String idUPES) {
		IdUPES = idUPES;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public Date getFechaInicial() {
		return FechaInicial;
	}

	public void setFechaInicial(Date fechaInicial) {
		FechaInicial = fechaInicial;
	}

	public Date getFechaReunionCiclo() {
		return FechaReunionCiclo;
	}

	public void setFechaReunionCiclo(Date fechaReunionCiclo) {
		FechaReunionCiclo = fechaReunionCiclo;
	}

	public int getDiasHabiles() {
		return DiasHabiles;
	}

	public void setDiasHabiles(int diasHabiles) {
		DiasHabiles = diasHabiles;
	}

	public int getPlazoReportarVisita() {
		return PlazoReportarVisita;
	}

	public void setPlazoReportarVisita(int plazoReportarVisita) {
		PlazoReportarVisita = plazoReportarVisita;
	}

	public int getDiasReunionCiclo() {
		return DiasReunionCiclo;
	}

	public void setDiasReunionCiclo(int diasReunionCiclo) {
		DiasReunionCiclo = diasReunionCiclo;
	}

	public int getPlazoRegistrarPedido() {
		return PlazoRegistrarPedido;
	}

	public void setPlazoRegistrarPedido(int plazoRegistrarPedido) {
		PlazoRegistrarPedido = plazoRegistrarPedido;
	}
}
