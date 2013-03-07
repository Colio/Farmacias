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
 * Model definition for UnidadVisita.
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
public final class UnidadVisita extends GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Actividadjustificada actividadjustificadaEntity;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Farmacias farmaciasEntity;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Key id;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @JsonString
  private java.util.List<Long> idUnidadVisita;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Medicos medicosEntity;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Key unidadVisita;

  /**

   * The value returned may be {@code null}.
   */
  public Actividadjustificada getActividadjustificadaEntity() {
    return actividadjustificadaEntity;
  }

  /**

   * The value set may be {@code null}.
   */
  public UnidadVisita setActividadjustificadaEntity(Actividadjustificada actividadjustificadaEntity) {
    this.actividadjustificadaEntity = actividadjustificadaEntity;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public Farmacias getFarmaciasEntity() {
    return farmaciasEntity;
  }

  /**

   * The value set may be {@code null}.
   */
  public UnidadVisita setFarmaciasEntity(Farmacias farmaciasEntity) {
    this.farmaciasEntity = farmaciasEntity;
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
  public UnidadVisita setId(Key id) {
    this.id = id;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public java.util.List<Long> getIdUnidadVisita() {
    return idUnidadVisita;
  }

  /**

   * The value set may be {@code null}.
   */
  public UnidadVisita setIdUnidadVisita(java.util.List<Long> idUnidadVisita) {
    this.idUnidadVisita = idUnidadVisita;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public Medicos getMedicosEntity() {
    return medicosEntity;
  }

  /**

   * The value set may be {@code null}.
   */
  public UnidadVisita setMedicosEntity(Medicos medicosEntity) {
    this.medicosEntity = medicosEntity;
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
  public UnidadVisita setUnidadVisita(Key unidadVisita) {
    this.unidadVisita = unidadVisita;
    return this;
  }

}
