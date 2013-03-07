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
 * Model definition for Productos.
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
public final class Productos extends GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String alias;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String formaFarmaceutica;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Key id;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String presentacion;

  /**

   * The value returned may be {@code null}.
   */
  public String getAlias() {
    return alias;
  }

  /**

   * The value set may be {@code null}.
   */
  public Productos setAlias(String alias) {
    this.alias = alias;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public String getFormaFarmaceutica() {
    return formaFarmaceutica;
  }

  /**

   * The value set may be {@code null}.
   */
  public Productos setFormaFarmaceutica(String formaFarmaceutica) {
    this.formaFarmaceutica = formaFarmaceutica;
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
  public Productos setId(Key id) {
    this.id = id;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public String getPresentacion() {
    return presentacion;
  }

  /**

   * The value set may be {@code null}.
   */
  public Productos setPresentacion(String presentacion) {
    this.presentacion = presentacion;
    return this;
  }

}
