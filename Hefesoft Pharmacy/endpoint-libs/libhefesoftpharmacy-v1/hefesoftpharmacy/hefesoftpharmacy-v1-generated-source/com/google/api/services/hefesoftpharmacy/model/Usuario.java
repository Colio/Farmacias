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
 * Model definition for Usuario.
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
public final class Usuario extends GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String apellidos;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String email;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GerenteCluster gerenteClusterEntity;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GerenteDistrito gerenteDistritoEntity;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GerenteDivision gerenteDivisionEntity;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GerenteEmpresa gerenteEmpresaEntity;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GerenteLinea gerenteLineaEntity;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GerentePais gerentePaisEntity;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GerenteRegional gerenteRegionalEntity;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Key id;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @JsonString
  private Long idGerenteCluster;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @JsonString
  private Long idGerenteDistrito;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @JsonString
  private Long idGerenteDivision;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @JsonString
  private Long idGerenteEmpresa;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @JsonString
  private Long idGerenteLinea;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @JsonString
  private Long idGerentePais;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @JsonString
  private Long idGerenteRegional;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @JsonString
  private java.util.List<Long> idsLineas;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Linea> lineasEntitys;

  static {
    // hack to force ProGuard to consider Linea used, since otherwise it would be stripped out
    // see http://code.google.com/p/google-api-java-client/issues/detail?id=528
    com.google.api.client.util.Data.nullOf(Linea.class);
  }

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String nombres;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String password;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String telefono;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String telefonoCelular;

  /**

   * The value returned may be {@code null}.
   */
  public String getApellidos() {
    return apellidos;
  }

  /**

   * The value set may be {@code null}.
   */
  public Usuario setApellidos(String apellidos) {
    this.apellidos = apellidos;
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
  public Usuario setEmail(String email) {
    this.email = email;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public GerenteCluster getGerenteClusterEntity() {
    return gerenteClusterEntity;
  }

  /**

   * The value set may be {@code null}.
   */
  public Usuario setGerenteClusterEntity(GerenteCluster gerenteClusterEntity) {
    this.gerenteClusterEntity = gerenteClusterEntity;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public GerenteDistrito getGerenteDistritoEntity() {
    return gerenteDistritoEntity;
  }

  /**

   * The value set may be {@code null}.
   */
  public Usuario setGerenteDistritoEntity(GerenteDistrito gerenteDistritoEntity) {
    this.gerenteDistritoEntity = gerenteDistritoEntity;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public GerenteDivision getGerenteDivisionEntity() {
    return gerenteDivisionEntity;
  }

  /**

   * The value set may be {@code null}.
   */
  public Usuario setGerenteDivisionEntity(GerenteDivision gerenteDivisionEntity) {
    this.gerenteDivisionEntity = gerenteDivisionEntity;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public GerenteEmpresa getGerenteEmpresaEntity() {
    return gerenteEmpresaEntity;
  }

  /**

   * The value set may be {@code null}.
   */
  public Usuario setGerenteEmpresaEntity(GerenteEmpresa gerenteEmpresaEntity) {
    this.gerenteEmpresaEntity = gerenteEmpresaEntity;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public GerenteLinea getGerenteLineaEntity() {
    return gerenteLineaEntity;
  }

  /**

   * The value set may be {@code null}.
   */
  public Usuario setGerenteLineaEntity(GerenteLinea gerenteLineaEntity) {
    this.gerenteLineaEntity = gerenteLineaEntity;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public GerentePais getGerentePaisEntity() {
    return gerentePaisEntity;
  }

  /**

   * The value set may be {@code null}.
   */
  public Usuario setGerentePaisEntity(GerentePais gerentePaisEntity) {
    this.gerentePaisEntity = gerentePaisEntity;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public GerenteRegional getGerenteRegionalEntity() {
    return gerenteRegionalEntity;
  }

  /**

   * The value set may be {@code null}.
   */
  public Usuario setGerenteRegionalEntity(GerenteRegional gerenteRegionalEntity) {
    this.gerenteRegionalEntity = gerenteRegionalEntity;
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
  public Usuario setId(Key id) {
    this.id = id;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public Long getIdGerenteCluster() {
    return idGerenteCluster;
  }

  /**

   * The value set may be {@code null}.
   */
  public Usuario setIdGerenteCluster(Long idGerenteCluster) {
    this.idGerenteCluster = idGerenteCluster;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public Long getIdGerenteDistrito() {
    return idGerenteDistrito;
  }

  /**

   * The value set may be {@code null}.
   */
  public Usuario setIdGerenteDistrito(Long idGerenteDistrito) {
    this.idGerenteDistrito = idGerenteDistrito;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public Long getIdGerenteDivision() {
    return idGerenteDivision;
  }

  /**

   * The value set may be {@code null}.
   */
  public Usuario setIdGerenteDivision(Long idGerenteDivision) {
    this.idGerenteDivision = idGerenteDivision;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public Long getIdGerenteEmpresa() {
    return idGerenteEmpresa;
  }

  /**

   * The value set may be {@code null}.
   */
  public Usuario setIdGerenteEmpresa(Long idGerenteEmpresa) {
    this.idGerenteEmpresa = idGerenteEmpresa;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public Long getIdGerenteLinea() {
    return idGerenteLinea;
  }

  /**

   * The value set may be {@code null}.
   */
  public Usuario setIdGerenteLinea(Long idGerenteLinea) {
    this.idGerenteLinea = idGerenteLinea;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public Long getIdGerentePais() {
    return idGerentePais;
  }

  /**

   * The value set may be {@code null}.
   */
  public Usuario setIdGerentePais(Long idGerentePais) {
    this.idGerentePais = idGerentePais;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public Long getIdGerenteRegional() {
    return idGerenteRegional;
  }

  /**

   * The value set may be {@code null}.
   */
  public Usuario setIdGerenteRegional(Long idGerenteRegional) {
    this.idGerenteRegional = idGerenteRegional;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public java.util.List<Long> getIdsLineas() {
    return idsLineas;
  }

  /**

   * The value set may be {@code null}.
   */
  public Usuario setIdsLineas(java.util.List<Long> idsLineas) {
    this.idsLineas = idsLineas;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public java.util.List<Linea> getLineasEntitys() {
    return lineasEntitys;
  }

  /**

   * The value set may be {@code null}.
   */
  public Usuario setLineasEntitys(java.util.List<Linea> lineasEntitys) {
    this.lineasEntitys = lineasEntitys;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public String getNombres() {
    return nombres;
  }

  /**

   * The value set may be {@code null}.
   */
  public Usuario setNombres(String nombres) {
    this.nombres = nombres;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public String getPassword() {
    return password;
  }

  /**

   * The value set may be {@code null}.
   */
  public Usuario setPassword(String password) {
    this.password = password;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public String getTelefono() {
    return telefono;
  }

  /**

   * The value set may be {@code null}.
   */
  public Usuario setTelefono(String telefono) {
    this.telefono = telefono;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public String getTelefonoCelular() {
    return telefonoCelular;
  }

  /**

   * The value set may be {@code null}.
   */
  public Usuario setTelefonoCelular(String telefonoCelular) {
    this.telefonoCelular = telefonoCelular;
    return this;
  }

}
