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
import com.google.api.client.util.DateTime;

/**
 * Model definition for VisitaPlaneada.
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
public final class VisitaPlaneada extends GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String cordenadas;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String email;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DateTime fechaYHora;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Key id;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @JsonString
  private Long idGeneradoCalendario;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @JsonString
  private Long idPanel;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Key panel;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Panel panelEntity;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Boolean realizada;

  /**

   * The value returned may be {@code null}.
   */
  public String getCordenadas() {
    return cordenadas;
  }

  /**

   * The value set may be {@code null}.
   */
  public VisitaPlaneada setCordenadas(String cordenadas) {
    this.cordenadas = cordenadas;
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
  public VisitaPlaneada setEmail(String email) {
    this.email = email;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public DateTime getFechaYHora() {
    return fechaYHora;
  }

  /**

   * The value set may be {@code null}.
   */
  public VisitaPlaneada setFechaYHora(DateTime fechaYHora) {
    this.fechaYHora = fechaYHora;
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
  public VisitaPlaneada setId(Key id) {
    this.id = id;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public Long getIdGeneradoCalendario() {
    return idGeneradoCalendario;
  }

  /**

   * The value set may be {@code null}.
   */
  public VisitaPlaneada setIdGeneradoCalendario(Long idGeneradoCalendario) {
    this.idGeneradoCalendario = idGeneradoCalendario;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public Long getIdPanel() {
    return idPanel;
  }

  /**

   * The value set may be {@code null}.
   */
  public VisitaPlaneada setIdPanel(Long idPanel) {
    this.idPanel = idPanel;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public Key getPanel() {
    return panel;
  }

  /**

   * The value set may be {@code null}.
   */
  public VisitaPlaneada setPanel(Key panel) {
    this.panel = panel;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public Panel getPanelEntity() {
    return panelEntity;
  }

  /**

   * The value set may be {@code null}.
   */
  public VisitaPlaneada setPanelEntity(Panel panelEntity) {
    this.panelEntity = panelEntity;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public Boolean getRealizada() {
    return realizada;
  }

  /**

   * The value set may be {@code null}.
   */
  public VisitaPlaneada setRealizada(Boolean realizada) {
    this.realizada = realizada;
    return this;
  }

}
