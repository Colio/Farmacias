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

/**
 * Model definition for Farmacias.
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
public final class Farmacias extends GenericJson {

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
  @com.google.api.client.util.Key
  private String imagen;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String nombre;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("pagina_Web")
  private String paginaWeb;

  /**

   * The value returned may be {@code null}.
   */
  public String getCordenadas() {
    return cordenadas;
  }

  /**

   * The value set may be {@code null}.
   */
  public Farmacias setCordenadas(String cordenadas) {
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
  public Farmacias setDireccion(String direccion) {
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
  public Farmacias setEmail(String email) {
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
  public Farmacias setId(Key id) {
    this.id = id;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public String getImagen() {
    return imagen;
  }

  /**

   * The value set may be {@code null}.
   */
  public Farmacias setImagen(String imagen) {
    this.imagen = imagen;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public String getNombre() {
    return nombre;
  }

  /**

   * The value set may be {@code null}.
   */
  public Farmacias setNombre(String nombre) {
    this.nombre = nombre;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public String getPaginaWeb() {
    return paginaWeb;
  }

  /**

   * The value set may be {@code null}.
   */
  public Farmacias setPaginaWeb(String paginaWeb) {
    this.paginaWeb = paginaWeb;
    return this;
  }

}
