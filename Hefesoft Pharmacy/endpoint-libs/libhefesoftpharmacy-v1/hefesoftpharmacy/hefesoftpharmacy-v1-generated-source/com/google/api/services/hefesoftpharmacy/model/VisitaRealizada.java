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
 * Model definition for VisitaRealizada.
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
public final class VisitaRealizada extends GenericJson {

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
  private Long idPanel;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @JsonString
  private Long idVisitaPlaneada;

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
  public String getEmail() {
    return email;
  }

  /**

   * The value set may be {@code null}.
   */
  public VisitaRealizada setEmail(String email) {
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
  public VisitaRealizada setFechaYHora(DateTime fechaYHora) {
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
  public VisitaRealizada setId(Key id) {
    this.id = id;
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
  public VisitaRealizada setIdPanel(Long idPanel) {
    this.idPanel = idPanel;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public Long getIdVisitaPlaneada() {
    return idVisitaPlaneada;
  }

  /**

   * The value set may be {@code null}.
   */
  public VisitaRealizada setIdVisitaPlaneada(Long idVisitaPlaneada) {
    this.idVisitaPlaneada = idVisitaPlaneada;
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
  public VisitaRealizada setPanel(Key panel) {
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
  public VisitaRealizada setPanelEntity(Panel panelEntity) {
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
  public VisitaRealizada setRealizada(Boolean realizada) {
    this.realizada = realizada;
    return this;
  }

}
