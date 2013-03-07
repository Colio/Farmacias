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
import com.google.api.client.util.DateTime;

/**
 * Model definition for Ciclo.
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
public final class Ciclo extends GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Integer diasHabiles;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Integer diasReunionCiclo;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DateTime fechaInicial;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DateTime fechaReunionCiclo;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Key id;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String idUPES;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String nombre;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Integer plazoRegistrarPedido;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Integer plazoReportarVisita;

  /**

   * The value returned may be {@code null}.
   */
  public Integer getDiasHabiles() {
    return diasHabiles;
  }

  /**

   * The value set may be {@code null}.
   */
  public Ciclo setDiasHabiles(Integer diasHabiles) {
    this.diasHabiles = diasHabiles;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public Integer getDiasReunionCiclo() {
    return diasReunionCiclo;
  }

  /**

   * The value set may be {@code null}.
   */
  public Ciclo setDiasReunionCiclo(Integer diasReunionCiclo) {
    this.diasReunionCiclo = diasReunionCiclo;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public DateTime getFechaInicial() {
    return fechaInicial;
  }

  /**

   * The value set may be {@code null}.
   */
  public Ciclo setFechaInicial(DateTime fechaInicial) {
    this.fechaInicial = fechaInicial;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public DateTime getFechaReunionCiclo() {
    return fechaReunionCiclo;
  }

  /**

   * The value set may be {@code null}.
   */
  public Ciclo setFechaReunionCiclo(DateTime fechaReunionCiclo) {
    this.fechaReunionCiclo = fechaReunionCiclo;
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
  public Ciclo setId(Key id) {
    this.id = id;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public String getIdUPES() {
    return idUPES;
  }

  /**

   * The value set may be {@code null}.
   */
  public Ciclo setIdUPES(String idUPES) {
    this.idUPES = idUPES;
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
  public Ciclo setNombre(String nombre) {
    this.nombre = nombre;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public Integer getPlazoRegistrarPedido() {
    return plazoRegistrarPedido;
  }

  /**

   * The value set may be {@code null}.
   */
  public Ciclo setPlazoRegistrarPedido(Integer plazoRegistrarPedido) {
    this.plazoRegistrarPedido = plazoRegistrarPedido;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public Integer getPlazoReportarVisita() {
    return plazoReportarVisita;
  }

  /**

   * The value set may be {@code null}.
   */
  public Ciclo setPlazoReportarVisita(Integer plazoReportarVisita) {
    this.plazoReportarVisita = plazoReportarVisita;
    return this;
  }

}
