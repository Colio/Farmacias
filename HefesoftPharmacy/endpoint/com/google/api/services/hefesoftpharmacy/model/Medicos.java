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
 * Model definition for Medicos.
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
public final class Medicos extends GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String apellidos;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String cedula;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String cordenadas;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String direccion;

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
  private Long idEntidad;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String imagenUrl;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String nombres;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String telefono;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("telefono_Celular")
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
  public Medicos setApellidos(String apellidos) {
    this.apellidos = apellidos;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public String getCedula() {
    return cedula;
  }

  /**

   * The value set may be {@code null}.
   */
  public Medicos setCedula(String cedula) {
    this.cedula = cedula;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public String getCordenadas() {
    return cordenadas;
  }

  /**

   * The value set may be {@code null}.
   */
  public Medicos setCordenadas(String cordenadas) {
    this.cordenadas = cordenadas;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public String getDireccion() {
    return direccion;
  }

  /**

   * The value set may be {@code null}.
   */
  public Medicos setDireccion(String direccion) {
    this.direccion = direccion;
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
  public Medicos setEmail(String email) {
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
  public Medicos setId(Key id) {
    this.id = id;
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
  public Medicos setIdEntidad(Long idEntidad) {
    this.idEntidad = idEntidad;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public String getImagenUrl() {
    return imagenUrl;
  }

  /**

   * The value set may be {@code null}.
   */
  public Medicos setImagenUrl(String imagenUrl) {
    this.imagenUrl = imagenUrl;
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
  public Medicos setNombres(String nombres) {
    this.nombres = nombres;
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
  public Medicos setTelefono(String telefono) {
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
  public Medicos setTelefonoCelular(String telefonoCelular) {
    this.telefonoCelular = telefonoCelular;
    return this;
  }

}
