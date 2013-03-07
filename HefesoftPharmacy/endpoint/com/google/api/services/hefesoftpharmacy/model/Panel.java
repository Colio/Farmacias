/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * Warning! This file is generated. Modify at your own risk.
 */

package com.google.api.services.hefesoftpharmacy.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.json.JsonString;

/**
 * Model definition for Panel.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the . For a detailed explanation see:
 * <a href="http://code.google.com/p/google-api-java-client/wiki/Json">http://code.google.com/p/google-api-java-client/wiki/Json</a>
 * </p>
 *
 * <p>
 * Upgrade warning: starting with version 1.12 {@code getResponseHeaders()} is removed, instead use
 * {@link com.google.api.client.http.json.JsonHttpRequest#getLastResponseHeaders()}
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Panel extends GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Boolean activo;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Boolean alta;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Integer aprobado;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Boolean baja;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String categoria;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Key ciclo;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Ciclo cicloEntity;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Integer contactosActual;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Integer contactosNuevo;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Integer contactosOriginal;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String email;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Key id;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @JsonString
  private Long idCiclo;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @JsonString
  private Long idEntidad;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @JsonString
  private Long idUnidadVisita;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @JsonString
  private Long idUsuario;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Key unidadVisita;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private UnidadVisita unidadVisitaEntity;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Key usuario;

  /**

   * The value returned may be {@code null}.
   */
  public Boolean getActivo() {
    return activo;
  }

  /**

   * The value set may be {@code null}.
   */
  public Panel setActivo(Boolean activo) {
    this.activo = activo;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public Boolean getAlta() {
    return alta;
  }

  /**

   * The value set may be {@code null}.
   */
  public Panel setAlta(Boolean alta) {
    this.alta = alta;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public Integer getAprobado() {
    return aprobado;
  }

  /**

   * The value set may be {@code null}.
   */
  public Panel setAprobado(Integer aprobado) {
    this.aprobado = aprobado;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public Boolean getBaja() {
    return baja;
  }

  /**

   * The value set may be {@code null}.
   */
  public Panel setBaja(Boolean baja) {
    this.baja = baja;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public String getCategoria() {
    return categoria;
  }

  /**

   * The value set may be {@code null}.
   */
  public Panel setCategoria(String categoria) {
    this.categoria = categoria;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public Key getCiclo() {
    return ciclo;
  }

  /**

   * The value set may be {@code null}.
   */
  public Panel setCiclo(Key ciclo) {
    this.ciclo = ciclo;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public Ciclo getCicloEntity() {
    return cicloEntity;
  }

  /**

   * The value set may be {@code null}.
   */
  public Panel setCicloEntity(Ciclo cicloEntity) {
    this.cicloEntity = cicloEntity;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public Integer getContactosActual() {
    return contactosActual;
  }

  /**

   * The value set may be {@code null}.
   */
  public Panel setContactosActual(Integer contactosActual) {
    this.contactosActual = contactosActual;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public Integer getContactosNuevo() {
    return contactosNuevo;
  }

  /**

   * The value set may be {@code null}.
   */
  public Panel setContactosNuevo(Integer contactosNuevo) {
    this.contactosNuevo = contactosNuevo;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public Integer getContactosOriginal() {
    return contactosOriginal;
  }

  /**

   * The value set may be {@code null}.
   */
  public Panel setContactosOriginal(Integer contactosOriginal) {
    this.contactosOriginal = contactosOriginal;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public String getEmail() {
    return email;
  }

  /**

   * The value set may be {@code null}.
   */
  public Panel setEmail(String email) {
    this.email = email;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public Key getId() {
    return id;
  }

  /**

   * The value set may be {@code null}.
   */
  public Panel setId(Key id) {
    this.id = id;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public Long getIdCiclo() {
    return idCiclo;
  }

  /**

   * The value set may be {@code null}.
   */
  public Panel setIdCiclo(Long idCiclo) {
    this.idCiclo = idCiclo;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public Long getIdEntidad() {
    return idEntidad;
  }

  /**

   * The value set may be {@code null}.
   */
  public Panel setIdEntidad(Long idEntidad) {
    this.idEntidad = idEntidad;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public Long getIdUnidadVisita() {
    return idUnidadVisita;
  }

  /**

   * The value set may be {@code null}.
   */
  public Panel setIdUnidadVisita(Long idUnidadVisita) {
    this.idUnidadVisita = idUnidadVisita;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public Long getIdUsuario() {
    return idUsuario;
  }

  /**

   * The value set may be {@code null}.
   */
  public Panel setIdUsuario(Long idUsuario) {
    this.idUsuario = idUsuario;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public Key getUnidadVisita() {
    return unidadVisita;
  }

  /**

   * The value set may be {@code null}.
   */
  public Panel setUnidadVisita(Key unidadVisita) {
    this.unidadVisita = unidadVisita;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public UnidadVisita getUnidadVisitaEntity() {
    return unidadVisitaEntity;
  }

  /**

   * The value set may be {@code null}.
   */
  public Panel setUnidadVisitaEntity(UnidadVisita unidadVisitaEntity) {
    this.unidadVisitaEntity = unidadVisitaEntity;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public Key getUsuario() {
    return usuario;
  }

  /**

   * The value set may be {@code null}.
   */
  public Panel setUsuario(Key usuario) {
    this.usuario = usuario;
    return this;
  }

}
