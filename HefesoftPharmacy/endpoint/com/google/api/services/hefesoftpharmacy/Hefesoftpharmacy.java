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
 * This file was generated.
 *  with google-apis-code-generator 1.2.0 (build: 2013-03-04 17:44:07 UTC)
 *  on 2013-03-04 at 22:47:50 UTC 
 */

package com.google.api.services.hefesoftpharmacy;

import com.google.api.client.googleapis.GoogleUtils;
import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import com.google.api.client.googleapis.services.GoogleClientRequestInitializer;
import com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonObjectParser;
import com.google.api.client.json.JsonString;
import com.google.common.base.Preconditions;

/**
 * Service definition for Hefesoftpharmacy (v1).
 *
 * <p>
 * This is an API
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link HefesoftpharmacyRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * <p>
 * Upgrade warning: this class now extends {@link AbstractGoogleJsonClient}, whereas in prior
 * version 1.8 it extended {@link com.google.api.client.googleapis.services.GoogleClient}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Hefesoftpharmacy extends AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    Preconditions.checkState(GoogleUtils.VERSION.equals("1.13.2-beta"),
        "You are currently running with version %s of google-api-client. " +
        "You need version 1.13.2-beta of google-api-client to run version " +
        "1.13.2-beta of the  library.", GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://pharmacyhefesoft.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "hefesoftpharmacy/v1/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   * @deprecated (scheduled to be removed in 1.13)
   */
  @Deprecated
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport
   * @param jsonFactory JSON factory
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public Hefesoftpharmacy(HttpTransport transport, JsonFactory jsonFactory,
      HttpRequestInitializer httpRequestInitializer) {
    super(transport,
        jsonFactory,
        DEFAULT_ROOT_URL,
        DEFAULT_SERVICE_PATH,
        httpRequestInitializer,
        false);
  }

  /**
   * @param transport HTTP transport
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @param rootUrl root URL of the service
   * @param servicePath service path
   * @param jsonObjectParser JSON object parser
   * @param googleClientRequestInitializer Google request initializer or {@code null} for none
   * @param applicationName application name to be sent in the User-Agent header of requests or
   *        {@code null} for none
   * @param suppressPatternChecks whether discovery pattern checks should be suppressed on required
   *        parameters
   */
  Hefesoftpharmacy(HttpTransport transport,
      HttpRequestInitializer httpRequestInitializer,
      String rootUrl,
      String servicePath,
      JsonObjectParser jsonObjectParser,
      GoogleClientRequestInitializer googleClientRequestInitializer,
      String applicationName,
      boolean suppressPatternChecks) {
    super(transport,
        httpRequestInitializer,
        rootUrl,
        servicePath,
        jsonObjectParser,
        googleClientRequestInitializer,
        applicationName,
        suppressPatternChecks);
  }

  @Override
  protected void initialize(AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * An accessor for creating requests from the ActividadJustificada collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code Hefesoftpharmacy hefesoftpharmacy = new Hefesoftpharmacy(...);}
   *   {@code Hefesoftpharmacy.ActividadJustificada.List request = hefesoftpharmacy.actividadJustificada().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public ActividadJustificada actividadJustificada() {
    return new ActividadJustificada();
  }

  /**
   * The "actividadJustificada" collection of methods.
   */
  public class ActividadJustificada {

    /**
     * Create a request for the method "actividadJustificada.actualizarActividad".
     *
     * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
     * optional parameters, call the {@link ActualizarActividad#execute()} method to invoke the remote
     * operation.
     *
     * @param content the {@link com.google.api.services.hefesoftpharmacy.model.Actividadjustificada}
     * @return the request
     */
    public ActualizarActividad actualizarActividad(com.google.api.services.hefesoftpharmacy.model.Actividadjustificada content) throws java.io.IOException {
      ActualizarActividad result = new ActualizarActividad(content);
      initialize(result);
      return result;
    }

    public class ActualizarActividad extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.Actividadjustificada> {

      private static final String REST_PATH = "actividadjustificada";

      /**
       * Create a request for the method "actividadJustificada.actualizarActividad".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link ActualizarActividad#execute()} method to invoke the remote
       * operation. <p> {@link ActualizarActividad#initialize(AbstractGoogleClientRequest)} must be
       * called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param content the {@link com.google.api.services.hefesoftpharmacy.model.Actividadjustificada}
       * @since 1.13
       */
      protected ActualizarActividad(com.google.api.services.hefesoftpharmacy.model.Actividadjustificada content) {
        super(Hefesoftpharmacy.this, "PUT", REST_PATH, content, com.google.api.services.hefesoftpharmacy.model.Actividadjustificada.class);
      }

      @Override
      public ActualizarActividad setAlt(String alt) {
        return (ActualizarActividad) super.setAlt(alt);
      }

      @Override
      public ActualizarActividad setFields(String fields) {
        return (ActualizarActividad) super.setFields(fields);
      }

      @Override
      public ActualizarActividad setKey(String key) {
        return (ActualizarActividad) super.setKey(key);
      }

      @Override
      public ActualizarActividad setOauthToken(String oauthToken) {
        return (ActualizarActividad) super.setOauthToken(oauthToken);
      }

      @Override
      public ActualizarActividad setPrettyPrint(Boolean prettyPrint) {
        return (ActualizarActividad) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public ActualizarActividad setQuotaUser(String quotaUser) {
        return (ActualizarActividad) super.setQuotaUser(quotaUser);
      }

      @Override
      public ActualizarActividad setUserIp(String userIp) {
        return (ActualizarActividad) super.setUserIp(userIp);
      }

    }
    /**
     * Create a request for the method "actividadJustificada.adicionarActividad".
     *
     * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
     * optional parameters, call the {@link AdicionarActividad#execute()} method to invoke the remote
     * operation.
     *
     * @param content the {@link com.google.api.services.hefesoftpharmacy.model.Actividadjustificada}
     * @return the request
     */
    public AdicionarActividad adicionarActividad(com.google.api.services.hefesoftpharmacy.model.Actividadjustificada content) throws java.io.IOException {
      AdicionarActividad result = new AdicionarActividad(content);
      initialize(result);
      return result;
    }

    public class AdicionarActividad extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.Actividadjustificada> {

      private static final String REST_PATH = "actividadjustificada";

      /**
       * Create a request for the method "actividadJustificada.adicionarActividad".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link AdicionarActividad#execute()} method to invoke the remote
       * operation. <p> {@link AdicionarActividad#initialize(AbstractGoogleClientRequest)} must be
       * called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param content the {@link com.google.api.services.hefesoftpharmacy.model.Actividadjustificada}
       * @since 1.13
       */
      protected AdicionarActividad(com.google.api.services.hefesoftpharmacy.model.Actividadjustificada content) {
        super(Hefesoftpharmacy.this, "POST", REST_PATH, content, com.google.api.services.hefesoftpharmacy.model.Actividadjustificada.class);
      }

      @Override
      public AdicionarActividad setAlt(String alt) {
        return (AdicionarActividad) super.setAlt(alt);
      }

      @Override
      public AdicionarActividad setFields(String fields) {
        return (AdicionarActividad) super.setFields(fields);
      }

      @Override
      public AdicionarActividad setKey(String key) {
        return (AdicionarActividad) super.setKey(key);
      }

      @Override
      public AdicionarActividad setOauthToken(String oauthToken) {
        return (AdicionarActividad) super.setOauthToken(oauthToken);
      }

      @Override
      public AdicionarActividad setPrettyPrint(Boolean prettyPrint) {
        return (AdicionarActividad) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public AdicionarActividad setQuotaUser(String quotaUser) {
        return (AdicionarActividad) super.setQuotaUser(quotaUser);
      }

      @Override
      public AdicionarActividad setUserIp(String userIp) {
        return (AdicionarActividad) super.setUserIp(userIp);
      }

    }
    /**
     * Create a request for the method "actividadJustificada.listarActividades".
     *
     * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
     * optional parameters, call the {@link ListarActividades#execute()} method to invoke the remote
     * operation.
     *
     * @return the request
     */
    public ListarActividades listarActividades() throws java.io.IOException {
      ListarActividades result = new ListarActividades();
      initialize(result);
      return result;
    }

    public class ListarActividades extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.ActividadjustificadaCollection> {

      private static final String REST_PATH = "actividadjustificada";

      /**
       * Create a request for the method "actividadJustificada.listarActividades".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link ListarActividades#execute()} method to invoke the remote
       * operation. <p> {@link ListarActividades#initialize(AbstractGoogleClientRequest)} must be called
       * to initialize this instance immediately after invoking the constructor. </p>
       *
       * @since 1.13
       */
      protected ListarActividades() {
        super(Hefesoftpharmacy.this, "GET", REST_PATH, null, com.google.api.services.hefesoftpharmacy.model.ActividadjustificadaCollection.class);
      }

      @Override
      public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
        return super.executeUsingHead();
      }

      @Override
      public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
        return super.buildHttpRequestUsingHead();
      }

      @Override
      public ListarActividades setAlt(String alt) {
        return (ListarActividades) super.setAlt(alt);
      }

      @Override
      public ListarActividades setFields(String fields) {
        return (ListarActividades) super.setFields(fields);
      }

      @Override
      public ListarActividades setKey(String key) {
        return (ListarActividades) super.setKey(key);
      }

      @Override
      public ListarActividades setOauthToken(String oauthToken) {
        return (ListarActividades) super.setOauthToken(oauthToken);
      }

      @Override
      public ListarActividades setPrettyPrint(Boolean prettyPrint) {
        return (ListarActividades) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public ListarActividades setQuotaUser(String quotaUser) {
        return (ListarActividades) super.setQuotaUser(quotaUser);
      }

      @Override
      public ListarActividades setUserIp(String userIp) {
        return (ListarActividades) super.setUserIp(userIp);
      }

    }
    /**
     * Create a request for the method "actividadJustificada.obtenerActividadPorId".
     *
     * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
     * optional parameters, call the {@link ObtenerActividadPorId#execute()} method to invoke the remote
     * operation.
     *
     * @param id
     * @return the request
     */
    public ObtenerActividadPorId obtenerActividadPorId(Long id) throws java.io.IOException {
      ObtenerActividadPorId result = new ObtenerActividadPorId(id);
      initialize(result);
      return result;
    }

    public class ObtenerActividadPorId extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.Actividadjustificada> {

      private static final String REST_PATH = "actividadjustificada/{id}";

      /**
       * Create a request for the method "actividadJustificada.obtenerActividadPorId".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link ObtenerActividadPorId#execute()} method to invoke the
       * remote operation. <p> {@link ObtenerActividadPorId#initialize(AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param id
       * @since 1.13
       */
      protected ObtenerActividadPorId(Long id) {
        super(Hefesoftpharmacy.this, "GET", REST_PATH, null, com.google.api.services.hefesoftpharmacy.model.Actividadjustificada.class);
        this.id = Preconditions.checkNotNull(id, "Required parameter id must be specified.");
      }

      @Override
      public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
        return super.executeUsingHead();
      }

      @Override
      public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
        return super.buildHttpRequestUsingHead();
      }

      @Override
      public ObtenerActividadPorId setAlt(String alt) {
        return (ObtenerActividadPorId) super.setAlt(alt);
      }

      @Override
      public ObtenerActividadPorId setFields(String fields) {
        return (ObtenerActividadPorId) super.setFields(fields);
      }

      @Override
      public ObtenerActividadPorId setKey(String key) {
        return (ObtenerActividadPorId) super.setKey(key);
      }

      @Override
      public ObtenerActividadPorId setOauthToken(String oauthToken) {
        return (ObtenerActividadPorId) super.setOauthToken(oauthToken);
      }

      @Override
      public ObtenerActividadPorId setPrettyPrint(Boolean prettyPrint) {
        return (ObtenerActividadPorId) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public ObtenerActividadPorId setQuotaUser(String quotaUser) {
        return (ObtenerActividadPorId) super.setQuotaUser(quotaUser);
      }

      @Override
      public ObtenerActividadPorId setUserIp(String userIp) {
        return (ObtenerActividadPorId) super.setUserIp(userIp);
      }

      @com.google.api.client.util.Key
      private Long id;

      /**

       */
      public Long getId() {
        return id;
      }

      public ObtenerActividadPorId setId(Long id) {
        this.id = id;
        return this;
      }

    }

  }

  /**
   * An accessor for creating requests from the Blob collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code Hefesoftpharmacy hefesoftpharmacy = new Hefesoftpharmacy(...);}
   *   {@code Hefesoftpharmacy.Blob.List request = hefesoftpharmacy.blob().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Blob blob() {
    return new Blob();
  }

  /**
   * The "blob" collection of methods.
   */
  public class Blob {

    /**
     * Create a request for the method "blob.obtenerRutaImagenAlojada".
     *
     * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
     * optional parameters, call the {@link ObtenerRutaImagenAlojada#execute()} method to invoke the
     * remote operation.
     *
     * @param filename
     * @return the request
     */
    public ObtenerRutaImagenAlojada obtenerRutaImagenAlojada(String filename) throws java.io.IOException {
      ObtenerRutaImagenAlojada result = new ObtenerRutaImagenAlojada(filename);
      initialize(result);
      return result;
    }

    public class ObtenerRutaImagenAlojada extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.FileHefesoftProperties> {

      private static final String REST_PATH = "FileHefesoftProperties/{Filename}";

      /**
       * Create a request for the method "blob.obtenerRutaImagenAlojada".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link ObtenerRutaImagenAlojada#execute()} method to invoke the
       * remote operation. <p> {@link ObtenerRutaImagenAlojada#initialize(AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param filename
       * @since 1.13
       */
      protected ObtenerRutaImagenAlojada(String filename) {
        super(Hefesoftpharmacy.this, "GET", REST_PATH, null, com.google.api.services.hefesoftpharmacy.model.FileHefesoftProperties.class);
        this.filename = Preconditions.checkNotNull(filename, "Required parameter filename must be specified.");
      }

      @Override
      public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
        return super.executeUsingHead();
      }

      @Override
      public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
        return super.buildHttpRequestUsingHead();
      }

      @Override
      public ObtenerRutaImagenAlojada setAlt(String alt) {
        return (ObtenerRutaImagenAlojada) super.setAlt(alt);
      }

      @Override
      public ObtenerRutaImagenAlojada setFields(String fields) {
        return (ObtenerRutaImagenAlojada) super.setFields(fields);
      }

      @Override
      public ObtenerRutaImagenAlojada setKey(String key) {
        return (ObtenerRutaImagenAlojada) super.setKey(key);
      }

      @Override
      public ObtenerRutaImagenAlojada setOauthToken(String oauthToken) {
        return (ObtenerRutaImagenAlojada) super.setOauthToken(oauthToken);
      }

      @Override
      public ObtenerRutaImagenAlojada setPrettyPrint(Boolean prettyPrint) {
        return (ObtenerRutaImagenAlojada) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public ObtenerRutaImagenAlojada setQuotaUser(String quotaUser) {
        return (ObtenerRutaImagenAlojada) super.setQuotaUser(quotaUser);
      }

      @Override
      public ObtenerRutaImagenAlojada setUserIp(String userIp) {
        return (ObtenerRutaImagenAlojada) super.setUserIp(userIp);
      }

      @com.google.api.client.util.Key("Filename")
      private String filename;

      /**

       */
      public String getFilename() {
        return filename;
      }

      public ObtenerRutaImagenAlojada setFilename(String filename) {
        this.filename = filename;
        return this;
      }

    }
    /**
     * Create a request for the method "blob.rutaSubidaBlob".
     *
     * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
     * optional parameters, call the {@link RutaSubidaBlob#execute()} method to invoke the remote
     * operation.
     *
     * @param ruta
     * @return the request
     */
    public RutaSubidaBlob rutaSubidaBlob(String ruta) throws java.io.IOException {
      RutaSubidaBlob result = new RutaSubidaBlob(ruta);
      initialize(result);
      return result;
    }

    public class RutaSubidaBlob extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.BlobResult> {

      private static final String REST_PATH = "blobresult/{Ruta}";

      /**
       * Create a request for the method "blob.rutaSubidaBlob".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link RutaSubidaBlob#execute()} method to invoke the remote
       * operation. <p> {@link RutaSubidaBlob#initialize(AbstractGoogleClientRequest)} must be called to
       * initialize this instance immediately after invoking the constructor. </p>
       *
       * @param ruta
       * @since 1.13
       */
      protected RutaSubidaBlob(String ruta) {
        super(Hefesoftpharmacy.this, "GET", REST_PATH, null, com.google.api.services.hefesoftpharmacy.model.BlobResult.class);
        this.ruta = Preconditions.checkNotNull(ruta, "Required parameter ruta must be specified.");
      }

      @Override
      public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
        return super.executeUsingHead();
      }

      @Override
      public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
        return super.buildHttpRequestUsingHead();
      }

      @Override
      public RutaSubidaBlob setAlt(String alt) {
        return (RutaSubidaBlob) super.setAlt(alt);
      }

      @Override
      public RutaSubidaBlob setFields(String fields) {
        return (RutaSubidaBlob) super.setFields(fields);
      }

      @Override
      public RutaSubidaBlob setKey(String key) {
        return (RutaSubidaBlob) super.setKey(key);
      }

      @Override
      public RutaSubidaBlob setOauthToken(String oauthToken) {
        return (RutaSubidaBlob) super.setOauthToken(oauthToken);
      }

      @Override
      public RutaSubidaBlob setPrettyPrint(Boolean prettyPrint) {
        return (RutaSubidaBlob) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public RutaSubidaBlob setQuotaUser(String quotaUser) {
        return (RutaSubidaBlob) super.setQuotaUser(quotaUser);
      }

      @Override
      public RutaSubidaBlob setUserIp(String userIp) {
        return (RutaSubidaBlob) super.setUserIp(userIp);
      }

      @com.google.api.client.util.Key("Ruta")
      private String ruta;

      /**

       */
      public String getRuta() {
        return ruta;
      }

      public RutaSubidaBlob setRuta(String ruta) {
        this.ruta = ruta;
        return this;
      }

    }

  }

  /**
   * An accessor for creating requests from the Ciclo collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code Hefesoftpharmacy hefesoftpharmacy = new Hefesoftpharmacy(...);}
   *   {@code Hefesoftpharmacy.Ciclo.List request = hefesoftpharmacy.ciclo().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Ciclo ciclo() {
    return new Ciclo();
  }

  /**
   * The "ciclo" collection of methods.
   */
  public class Ciclo {

    /**
     * Create a request for the method "ciclo.actualizarCiclo".
     *
     * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
     * optional parameters, call the {@link ActualizarCiclo#execute()} method to invoke the remote
     * operation.
     *
     * @param content the {@link com.google.api.services.hefesoftpharmacy.model.Ciclo}
     * @return the request
     */
    public ActualizarCiclo actualizarCiclo(com.google.api.services.hefesoftpharmacy.model.Ciclo content) throws java.io.IOException {
      ActualizarCiclo result = new ActualizarCiclo(content);
      initialize(result);
      return result;
    }

    public class ActualizarCiclo extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.Ciclo> {

      private static final String REST_PATH = "ciclo";

      /**
       * Create a request for the method "ciclo.actualizarCiclo".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link ActualizarCiclo#execute()} method to invoke the remote
       * operation. <p> {@link ActualizarCiclo#initialize(AbstractGoogleClientRequest)} must be called
       * to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param content the {@link com.google.api.services.hefesoftpharmacy.model.Ciclo}
       * @since 1.13
       */
      protected ActualizarCiclo(com.google.api.services.hefesoftpharmacy.model.Ciclo content) {
        super(Hefesoftpharmacy.this, "PUT", REST_PATH, content, com.google.api.services.hefesoftpharmacy.model.Ciclo.class);
      }

      @Override
      public ActualizarCiclo setAlt(String alt) {
        return (ActualizarCiclo) super.setAlt(alt);
      }

      @Override
      public ActualizarCiclo setFields(String fields) {
        return (ActualizarCiclo) super.setFields(fields);
      }

      @Override
      public ActualizarCiclo setKey(String key) {
        return (ActualizarCiclo) super.setKey(key);
      }

      @Override
      public ActualizarCiclo setOauthToken(String oauthToken) {
        return (ActualizarCiclo) super.setOauthToken(oauthToken);
      }

      @Override
      public ActualizarCiclo setPrettyPrint(Boolean prettyPrint) {
        return (ActualizarCiclo) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public ActualizarCiclo setQuotaUser(String quotaUser) {
        return (ActualizarCiclo) super.setQuotaUser(quotaUser);
      }

      @Override
      public ActualizarCiclo setUserIp(String userIp) {
        return (ActualizarCiclo) super.setUserIp(userIp);
      }

    }
    /**
     * Create a request for the method "ciclo.adicionarCiclo".
     *
     * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
     * optional parameters, call the {@link AdicionarCiclo#execute()} method to invoke the remote
     * operation.
     *
     * @param content the {@link com.google.api.services.hefesoftpharmacy.model.Ciclo}
     * @return the request
     */
    public AdicionarCiclo adicionarCiclo(com.google.api.services.hefesoftpharmacy.model.Ciclo content) throws java.io.IOException {
      AdicionarCiclo result = new AdicionarCiclo(content);
      initialize(result);
      return result;
    }

    public class AdicionarCiclo extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.Ciclo> {

      private static final String REST_PATH = "ciclo";

      /**
       * Create a request for the method "ciclo.adicionarCiclo".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link AdicionarCiclo#execute()} method to invoke the remote
       * operation. <p> {@link AdicionarCiclo#initialize(AbstractGoogleClientRequest)} must be called to
       * initialize this instance immediately after invoking the constructor. </p>
       *
       * @param content the {@link com.google.api.services.hefesoftpharmacy.model.Ciclo}
       * @since 1.13
       */
      protected AdicionarCiclo(com.google.api.services.hefesoftpharmacy.model.Ciclo content) {
        super(Hefesoftpharmacy.this, "POST", REST_PATH, content, com.google.api.services.hefesoftpharmacy.model.Ciclo.class);
      }

      @Override
      public AdicionarCiclo setAlt(String alt) {
        return (AdicionarCiclo) super.setAlt(alt);
      }

      @Override
      public AdicionarCiclo setFields(String fields) {
        return (AdicionarCiclo) super.setFields(fields);
      }

      @Override
      public AdicionarCiclo setKey(String key) {
        return (AdicionarCiclo) super.setKey(key);
      }

      @Override
      public AdicionarCiclo setOauthToken(String oauthToken) {
        return (AdicionarCiclo) super.setOauthToken(oauthToken);
      }

      @Override
      public AdicionarCiclo setPrettyPrint(Boolean prettyPrint) {
        return (AdicionarCiclo) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public AdicionarCiclo setQuotaUser(String quotaUser) {
        return (AdicionarCiclo) super.setQuotaUser(quotaUser);
      }

      @Override
      public AdicionarCiclo setUserIp(String userIp) {
        return (AdicionarCiclo) super.setUserIp(userIp);
      }

    }
    /**
     * Create a request for the method "ciclo.eliminarCiclo".
     *
     * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
     * optional parameters, call the {@link EliminarCiclo#execute()} method to invoke the remote
     * operation.
     *
     * @param id
     * @return the request
     */
    public EliminarCiclo eliminarCiclo(Long id) throws java.io.IOException {
      EliminarCiclo result = new EliminarCiclo(id);
      initialize(result);
      return result;
    }

    public class EliminarCiclo extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.Ciclo> {

      private static final String REST_PATH = "ciclo/{id}";

      /**
       * Create a request for the method "ciclo.eliminarCiclo".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link EliminarCiclo#execute()} method to invoke the remote
       * operation. <p> {@link EliminarCiclo#initialize(AbstractGoogleClientRequest)} must be called to
       * initialize this instance immediately after invoking the constructor. </p>
       *
       * @param id
       * @since 1.13
       */
      protected EliminarCiclo(Long id) {
        super(Hefesoftpharmacy.this, "DELETE", REST_PATH, null, com.google.api.services.hefesoftpharmacy.model.Ciclo.class);
        this.id = Preconditions.checkNotNull(id, "Required parameter id must be specified.");
      }

      @Override
      public EliminarCiclo setAlt(String alt) {
        return (EliminarCiclo) super.setAlt(alt);
      }

      @Override
      public EliminarCiclo setFields(String fields) {
        return (EliminarCiclo) super.setFields(fields);
      }

      @Override
      public EliminarCiclo setKey(String key) {
        return (EliminarCiclo) super.setKey(key);
      }

      @Override
      public EliminarCiclo setOauthToken(String oauthToken) {
        return (EliminarCiclo) super.setOauthToken(oauthToken);
      }

      @Override
      public EliminarCiclo setPrettyPrint(Boolean prettyPrint) {
        return (EliminarCiclo) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public EliminarCiclo setQuotaUser(String quotaUser) {
        return (EliminarCiclo) super.setQuotaUser(quotaUser);
      }

      @Override
      public EliminarCiclo setUserIp(String userIp) {
        return (EliminarCiclo) super.setUserIp(userIp);
      }

      @com.google.api.client.util.Key
      private Long id;

      /**

       */
      public Long getId() {
        return id;
      }

      public EliminarCiclo setId(Long id) {
        this.id = id;
        return this;
      }

    }
    /**
     * Create a request for the method "ciclo.listarCiclos".
     *
     * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
     * optional parameters, call the {@link ListarCiclos#execute()} method to invoke the remote
     * operation.
     *
     * @return the request
     */
    public ListarCiclos listarCiclos() throws java.io.IOException {
      ListarCiclos result = new ListarCiclos();
      initialize(result);
      return result;
    }

    public class ListarCiclos extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.CicloCollection> {

      private static final String REST_PATH = "ciclo";

      /**
       * Create a request for the method "ciclo.listarCiclos".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link ListarCiclos#execute()} method to invoke the remote
       * operation. <p> {@link ListarCiclos#initialize(AbstractGoogleClientRequest)} must be called to
       * initialize this instance immediately after invoking the constructor. </p>
       *
       * @since 1.13
       */
      protected ListarCiclos() {
        super(Hefesoftpharmacy.this, "GET", REST_PATH, null, com.google.api.services.hefesoftpharmacy.model.CicloCollection.class);
      }

      @Override
      public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
        return super.executeUsingHead();
      }

      @Override
      public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
        return super.buildHttpRequestUsingHead();
      }

      @Override
      public ListarCiclos setAlt(String alt) {
        return (ListarCiclos) super.setAlt(alt);
      }

      @Override
      public ListarCiclos setFields(String fields) {
        return (ListarCiclos) super.setFields(fields);
      }

      @Override
      public ListarCiclos setKey(String key) {
        return (ListarCiclos) super.setKey(key);
      }

      @Override
      public ListarCiclos setOauthToken(String oauthToken) {
        return (ListarCiclos) super.setOauthToken(oauthToken);
      }

      @Override
      public ListarCiclos setPrettyPrint(Boolean prettyPrint) {
        return (ListarCiclos) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public ListarCiclos setQuotaUser(String quotaUser) {
        return (ListarCiclos) super.setQuotaUser(quotaUser);
      }

      @Override
      public ListarCiclos setUserIp(String userIp) {
        return (ListarCiclos) super.setUserIp(userIp);
      }

    }
    /**
     * Create a request for the method "ciclo.obtenerCicloPorId".
     *
     * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
     * optional parameters, call the {@link ObtenerCicloPorId#execute()} method to invoke the remote
     * operation.
     *
     * @param id
     * @return the request
     */
    public ObtenerCicloPorId obtenerCicloPorId(Long id) throws java.io.IOException {
      ObtenerCicloPorId result = new ObtenerCicloPorId(id);
      initialize(result);
      return result;
    }

    public class ObtenerCicloPorId extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.Ciclo> {

      private static final String REST_PATH = "ciclo/{id}";

      /**
       * Create a request for the method "ciclo.obtenerCicloPorId".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link ObtenerCicloPorId#execute()} method to invoke the remote
       * operation. <p> {@link ObtenerCicloPorId#initialize(AbstractGoogleClientRequest)} must be called
       * to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param id
       * @since 1.13
       */
      protected ObtenerCicloPorId(Long id) {
        super(Hefesoftpharmacy.this, "GET", REST_PATH, null, com.google.api.services.hefesoftpharmacy.model.Ciclo.class);
        this.id = Preconditions.checkNotNull(id, "Required parameter id must be specified.");
      }

      @Override
      public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
        return super.executeUsingHead();
      }

      @Override
      public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
        return super.buildHttpRequestUsingHead();
      }

      @Override
      public ObtenerCicloPorId setAlt(String alt) {
        return (ObtenerCicloPorId) super.setAlt(alt);
      }

      @Override
      public ObtenerCicloPorId setFields(String fields) {
        return (ObtenerCicloPorId) super.setFields(fields);
      }

      @Override
      public ObtenerCicloPorId setKey(String key) {
        return (ObtenerCicloPorId) super.setKey(key);
      }

      @Override
      public ObtenerCicloPorId setOauthToken(String oauthToken) {
        return (ObtenerCicloPorId) super.setOauthToken(oauthToken);
      }

      @Override
      public ObtenerCicloPorId setPrettyPrint(Boolean prettyPrint) {
        return (ObtenerCicloPorId) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public ObtenerCicloPorId setQuotaUser(String quotaUser) {
        return (ObtenerCicloPorId) super.setQuotaUser(quotaUser);
      }

      @Override
      public ObtenerCicloPorId setUserIp(String userIp) {
        return (ObtenerCicloPorId) super.setUserIp(userIp);
      }

      @com.google.api.client.util.Key
      private Long id;

      /**

       */
      public Long getId() {
        return id;
      }

      public ObtenerCicloPorId setId(Long id) {
        this.id = id;
        return this;
      }

    }

  }

  /**
   * An accessor for creating requests from the Farmacias collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code Hefesoftpharmacy hefesoftpharmacy = new Hefesoftpharmacy(...);}
   *   {@code Hefesoftpharmacy.Farmacias.List request = hefesoftpharmacy.farmacias().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Farmacias farmacias() {
    return new Farmacias();
  }

  /**
   * The "farmacias" collection of methods.
   */
  public class Farmacias {

    /**
     * Create a request for the method "farmacias.actualizarFarmacia".
     *
     * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
     * optional parameters, call the {@link ActualizarFarmacia#execute()} method to invoke the remote
     * operation.
     *
     * @param content the {@link com.google.api.services.hefesoftpharmacy.model.Farmacias}
     * @return the request
     */
    public ActualizarFarmacia actualizarFarmacia(com.google.api.services.hefesoftpharmacy.model.Farmacias content) throws java.io.IOException {
      ActualizarFarmacia result = new ActualizarFarmacia(content);
      initialize(result);
      return result;
    }

    public class ActualizarFarmacia extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.Farmacias> {

      private static final String REST_PATH = "farmacias";

      /**
       * Create a request for the method "farmacias.actualizarFarmacia".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link ActualizarFarmacia#execute()} method to invoke the remote
       * operation. <p> {@link ActualizarFarmacia#initialize(AbstractGoogleClientRequest)} must be
       * called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param content the {@link com.google.api.services.hefesoftpharmacy.model.Farmacias}
       * @since 1.13
       */
      protected ActualizarFarmacia(com.google.api.services.hefesoftpharmacy.model.Farmacias content) {
        super(Hefesoftpharmacy.this, "PUT", REST_PATH, content, com.google.api.services.hefesoftpharmacy.model.Farmacias.class);
      }

      @Override
      public ActualizarFarmacia setAlt(String alt) {
        return (ActualizarFarmacia) super.setAlt(alt);
      }

      @Override
      public ActualizarFarmacia setFields(String fields) {
        return (ActualizarFarmacia) super.setFields(fields);
      }

      @Override
      public ActualizarFarmacia setKey(String key) {
        return (ActualizarFarmacia) super.setKey(key);
      }

      @Override
      public ActualizarFarmacia setOauthToken(String oauthToken) {
        return (ActualizarFarmacia) super.setOauthToken(oauthToken);
      }

      @Override
      public ActualizarFarmacia setPrettyPrint(Boolean prettyPrint) {
        return (ActualizarFarmacia) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public ActualizarFarmacia setQuotaUser(String quotaUser) {
        return (ActualizarFarmacia) super.setQuotaUser(quotaUser);
      }

      @Override
      public ActualizarFarmacia setUserIp(String userIp) {
        return (ActualizarFarmacia) super.setUserIp(userIp);
      }

    }
    /**
     * Create a request for the method "farmacias.adicionarFarmacia".
     *
     * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
     * optional parameters, call the {@link AdicionarFarmacia#execute()} method to invoke the remote
     * operation.
     *
     * @param content the {@link com.google.api.services.hefesoftpharmacy.model.Farmacias}
     * @return the request
     */
    public AdicionarFarmacia adicionarFarmacia(com.google.api.services.hefesoftpharmacy.model.Farmacias content) throws java.io.IOException {
      AdicionarFarmacia result = new AdicionarFarmacia(content);
      initialize(result);
      return result;
    }

    public class AdicionarFarmacia extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.Farmacias> {

      private static final String REST_PATH = "farmacias";

      /**
       * Create a request for the method "farmacias.adicionarFarmacia".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link AdicionarFarmacia#execute()} method to invoke the remote
       * operation. <p> {@link AdicionarFarmacia#initialize(AbstractGoogleClientRequest)} must be called
       * to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param content the {@link com.google.api.services.hefesoftpharmacy.model.Farmacias}
       * @since 1.13
       */
      protected AdicionarFarmacia(com.google.api.services.hefesoftpharmacy.model.Farmacias content) {
        super(Hefesoftpharmacy.this, "POST", REST_PATH, content, com.google.api.services.hefesoftpharmacy.model.Farmacias.class);
      }

      @Override
      public AdicionarFarmacia setAlt(String alt) {
        return (AdicionarFarmacia) super.setAlt(alt);
      }

      @Override
      public AdicionarFarmacia setFields(String fields) {
        return (AdicionarFarmacia) super.setFields(fields);
      }

      @Override
      public AdicionarFarmacia setKey(String key) {
        return (AdicionarFarmacia) super.setKey(key);
      }

      @Override
      public AdicionarFarmacia setOauthToken(String oauthToken) {
        return (AdicionarFarmacia) super.setOauthToken(oauthToken);
      }

      @Override
      public AdicionarFarmacia setPrettyPrint(Boolean prettyPrint) {
        return (AdicionarFarmacia) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public AdicionarFarmacia setQuotaUser(String quotaUser) {
        return (AdicionarFarmacia) super.setQuotaUser(quotaUser);
      }

      @Override
      public AdicionarFarmacia setUserIp(String userIp) {
        return (AdicionarFarmacia) super.setUserIp(userIp);
      }

    }
    /**
     * Create a request for the method "farmacias.eliminarFarmacia".
     *
     * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
     * optional parameters, call the {@link EliminarFarmacia#execute()} method to invoke the remote
     * operation.
     *
     * @param id
     * @return the request
     */
    public EliminarFarmacia eliminarFarmacia(Long id) throws java.io.IOException {
      EliminarFarmacia result = new EliminarFarmacia(id);
      initialize(result);
      return result;
    }

    public class EliminarFarmacia extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.Farmacias> {

      private static final String REST_PATH = "farmacias/{id}";

      /**
       * Create a request for the method "farmacias.eliminarFarmacia".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link EliminarFarmacia#execute()} method to invoke the remote
       * operation. <p> {@link EliminarFarmacia#initialize(AbstractGoogleClientRequest)} must be called
       * to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param id
       * @since 1.13
       */
      protected EliminarFarmacia(Long id) {
        super(Hefesoftpharmacy.this, "DELETE", REST_PATH, null, com.google.api.services.hefesoftpharmacy.model.Farmacias.class);
        this.id = Preconditions.checkNotNull(id, "Required parameter id must be specified.");
      }

      @Override
      public EliminarFarmacia setAlt(String alt) {
        return (EliminarFarmacia) super.setAlt(alt);
      }

      @Override
      public EliminarFarmacia setFields(String fields) {
        return (EliminarFarmacia) super.setFields(fields);
      }

      @Override
      public EliminarFarmacia setKey(String key) {
        return (EliminarFarmacia) super.setKey(key);
      }

      @Override
      public EliminarFarmacia setOauthToken(String oauthToken) {
        return (EliminarFarmacia) super.setOauthToken(oauthToken);
      }

      @Override
      public EliminarFarmacia setPrettyPrint(Boolean prettyPrint) {
        return (EliminarFarmacia) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public EliminarFarmacia setQuotaUser(String quotaUser) {
        return (EliminarFarmacia) super.setQuotaUser(quotaUser);
      }

      @Override
      public EliminarFarmacia setUserIp(String userIp) {
        return (EliminarFarmacia) super.setUserIp(userIp);
      }

      @com.google.api.client.util.Key
      private Long id;

      /**

       */
      public Long getId() {
        return id;
      }

      public EliminarFarmacia setId(Long id) {
        this.id = id;
        return this;
      }

    }
    /**
     * Create a request for the method "farmacias.listarFarmacias".
     *
     * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
     * optional parameters, call the {@link ListarFarmacias#execute()} method to invoke the remote
     * operation.
     *
     * @return the request
     */
    public ListarFarmacias listarFarmacias() throws java.io.IOException {
      ListarFarmacias result = new ListarFarmacias();
      initialize(result);
      return result;
    }

    public class ListarFarmacias extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.FarmaciasCollection> {

      private static final String REST_PATH = "farmacias";

      /**
       * Create a request for the method "farmacias.listarFarmacias".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link ListarFarmacias#execute()} method to invoke the remote
       * operation. <p> {@link ListarFarmacias#initialize(AbstractGoogleClientRequest)} must be called
       * to initialize this instance immediately after invoking the constructor. </p>
       *
       * @since 1.13
       */
      protected ListarFarmacias() {
        super(Hefesoftpharmacy.this, "GET", REST_PATH, null, com.google.api.services.hefesoftpharmacy.model.FarmaciasCollection.class);
      }

      @Override
      public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
        return super.executeUsingHead();
      }

      @Override
      public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
        return super.buildHttpRequestUsingHead();
      }

      @Override
      public ListarFarmacias setAlt(String alt) {
        return (ListarFarmacias) super.setAlt(alt);
      }

      @Override
      public ListarFarmacias setFields(String fields) {
        return (ListarFarmacias) super.setFields(fields);
      }

      @Override
      public ListarFarmacias setKey(String key) {
        return (ListarFarmacias) super.setKey(key);
      }

      @Override
      public ListarFarmacias setOauthToken(String oauthToken) {
        return (ListarFarmacias) super.setOauthToken(oauthToken);
      }

      @Override
      public ListarFarmacias setPrettyPrint(Boolean prettyPrint) {
        return (ListarFarmacias) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public ListarFarmacias setQuotaUser(String quotaUser) {
        return (ListarFarmacias) super.setQuotaUser(quotaUser);
      }

      @Override
      public ListarFarmacias setUserIp(String userIp) {
        return (ListarFarmacias) super.setUserIp(userIp);
      }

    }
    /**
     * Create a request for the method "farmacias.obtenerFarmaciaPorId".
     *
     * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
     * optional parameters, call the {@link ObtenerFarmaciaPorId#execute()} method to invoke the remote
     * operation.
     *
     * @param id
     * @return the request
     */
    public ObtenerFarmaciaPorId obtenerFarmaciaPorId(Long id) throws java.io.IOException {
      ObtenerFarmaciaPorId result = new ObtenerFarmaciaPorId(id);
      initialize(result);
      return result;
    }

    public class ObtenerFarmaciaPorId extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.Farmacias> {

      private static final String REST_PATH = "farmacias/{id}";

      /**
       * Create a request for the method "farmacias.obtenerFarmaciaPorId".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link ObtenerFarmaciaPorId#execute()} method to invoke the
       * remote operation. <p> {@link ObtenerFarmaciaPorId#initialize(AbstractGoogleClientRequest)} must
       * be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param id
       * @since 1.13
       */
      protected ObtenerFarmaciaPorId(Long id) {
        super(Hefesoftpharmacy.this, "GET", REST_PATH, null, com.google.api.services.hefesoftpharmacy.model.Farmacias.class);
        this.id = Preconditions.checkNotNull(id, "Required parameter id must be specified.");
      }

      @Override
      public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
        return super.executeUsingHead();
      }

      @Override
      public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
        return super.buildHttpRequestUsingHead();
      }

      @Override
      public ObtenerFarmaciaPorId setAlt(String alt) {
        return (ObtenerFarmaciaPorId) super.setAlt(alt);
      }

      @Override
      public ObtenerFarmaciaPorId setFields(String fields) {
        return (ObtenerFarmaciaPorId) super.setFields(fields);
      }

      @Override
      public ObtenerFarmaciaPorId setKey(String key) {
        return (ObtenerFarmaciaPorId) super.setKey(key);
      }

      @Override
      public ObtenerFarmaciaPorId setOauthToken(String oauthToken) {
        return (ObtenerFarmaciaPorId) super.setOauthToken(oauthToken);
      }

      @Override
      public ObtenerFarmaciaPorId setPrettyPrint(Boolean prettyPrint) {
        return (ObtenerFarmaciaPorId) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public ObtenerFarmaciaPorId setQuotaUser(String quotaUser) {
        return (ObtenerFarmaciaPorId) super.setQuotaUser(quotaUser);
      }

      @Override
      public ObtenerFarmaciaPorId setUserIp(String userIp) {
        return (ObtenerFarmaciaPorId) super.setUserIp(userIp);
      }

      @com.google.api.client.util.Key
      private Long id;

      /**

       */
      public Long getId() {
        return id;
      }

      public ObtenerFarmaciaPorId setId(Long id) {
        this.id = id;
        return this;
      }

    }

  }

  /**
   * An accessor for creating requests from the Gerentes collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code Hefesoftpharmacy hefesoftpharmacy = new Hefesoftpharmacy(...);}
   *   {@code Hefesoftpharmacy.Gerentes.List request = hefesoftpharmacy.gerentes().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Gerentes gerentes() {
    return new Gerentes();
  }

  /**
   * The "gerentes" collection of methods.
   */
  public class Gerentes {

    /**
     * An accessor for creating requests from the Cluster collection.
     *
     * <p>The typical use is:</p>
     * <pre>
     *   {@code Hefesoftpharmacy hefesoftpharmacy = new Hefesoftpharmacy(...);}
     *   {@code Hefesoftpharmacy.Cluster.List request = hefesoftpharmacy.cluster().list(parameters ...)}
     * </pre>
     *
     * @return the resource collection
     */
    public Cluster cluster() {
      return new Cluster();
    }

    /**
     * The "cluster" collection of methods.
     */
    public class Cluster {

      /**
       * Create a request for the method "cluster.actualizarGerente".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link ActualizarGerente#execute()} method to invoke the remote
       * operation.
       *
       * @param content the {@link com.google.api.services.hefesoftpharmacy.model.GerenteCluster}
       * @return the request
       */
      public ActualizarGerente actualizarGerente(com.google.api.services.hefesoftpharmacy.model.GerenteCluster content) throws java.io.IOException {
        ActualizarGerente result = new ActualizarGerente(content);
        initialize(result);
        return result;
      }

      public class ActualizarGerente extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.GerenteCluster> {

        private static final String REST_PATH = "gerentecluster";

        /**
         * Create a request for the method "cluster.actualizarGerente".
         *
         * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
         * optional parameters, call the {@link ActualizarGerente#execute()} method to invoke the remote
         * operation. <p> {@link ActualizarGerente#initialize(AbstractGoogleClientRequest)} must be called
         * to initialize this instance immediately after invoking the constructor. </p>
         *
         * @param content the {@link com.google.api.services.hefesoftpharmacy.model.GerenteCluster}
         * @since 1.13
         */
        protected ActualizarGerente(com.google.api.services.hefesoftpharmacy.model.GerenteCluster content) {
          super(Hefesoftpharmacy.this, "PUT", REST_PATH, content, com.google.api.services.hefesoftpharmacy.model.GerenteCluster.class);
        }

        @Override
        public ActualizarGerente setAlt(String alt) {
          return (ActualizarGerente) super.setAlt(alt);
        }

        @Override
        public ActualizarGerente setFields(String fields) {
          return (ActualizarGerente) super.setFields(fields);
        }

        @Override
        public ActualizarGerente setKey(String key) {
          return (ActualizarGerente) super.setKey(key);
        }

        @Override
        public ActualizarGerente setOauthToken(String oauthToken) {
          return (ActualizarGerente) super.setOauthToken(oauthToken);
        }

        @Override
        public ActualizarGerente setPrettyPrint(Boolean prettyPrint) {
          return (ActualizarGerente) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public ActualizarGerente setQuotaUser(String quotaUser) {
          return (ActualizarGerente) super.setQuotaUser(quotaUser);
        }

        @Override
        public ActualizarGerente setUserIp(String userIp) {
          return (ActualizarGerente) super.setUserIp(userIp);
        }

      }
      /**
       * Create a request for the method "cluster.adicionarGerente".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link AdicionarGerente#execute()} method to invoke the remote
       * operation.
       *
       * @param content the {@link com.google.api.services.hefesoftpharmacy.model.GerenteCluster}
       * @return the request
       */
      public AdicionarGerente adicionarGerente(com.google.api.services.hefesoftpharmacy.model.GerenteCluster content) throws java.io.IOException {
        AdicionarGerente result = new AdicionarGerente(content);
        initialize(result);
        return result;
      }

      public class AdicionarGerente extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.GerenteCluster> {

        private static final String REST_PATH = "gerentecluster";

        /**
         * Create a request for the method "cluster.adicionarGerente".
         *
         * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
         * optional parameters, call the {@link AdicionarGerente#execute()} method to invoke the remote
         * operation. <p> {@link AdicionarGerente#initialize(AbstractGoogleClientRequest)} must be called
         * to initialize this instance immediately after invoking the constructor. </p>
         *
         * @param content the {@link com.google.api.services.hefesoftpharmacy.model.GerenteCluster}
         * @since 1.13
         */
        protected AdicionarGerente(com.google.api.services.hefesoftpharmacy.model.GerenteCluster content) {
          super(Hefesoftpharmacy.this, "POST", REST_PATH, content, com.google.api.services.hefesoftpharmacy.model.GerenteCluster.class);
        }

        @Override
        public AdicionarGerente setAlt(String alt) {
          return (AdicionarGerente) super.setAlt(alt);
        }

        @Override
        public AdicionarGerente setFields(String fields) {
          return (AdicionarGerente) super.setFields(fields);
        }

        @Override
        public AdicionarGerente setKey(String key) {
          return (AdicionarGerente) super.setKey(key);
        }

        @Override
        public AdicionarGerente setOauthToken(String oauthToken) {
          return (AdicionarGerente) super.setOauthToken(oauthToken);
        }

        @Override
        public AdicionarGerente setPrettyPrint(Boolean prettyPrint) {
          return (AdicionarGerente) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public AdicionarGerente setQuotaUser(String quotaUser) {
          return (AdicionarGerente) super.setQuotaUser(quotaUser);
        }

        @Override
        public AdicionarGerente setUserIp(String userIp) {
          return (AdicionarGerente) super.setUserIp(userIp);
        }

      }
      /**
       * Create a request for the method "cluster.eliminarGerente".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link EliminarGerente#execute()} method to invoke the remote
       * operation.
       *
       * @param id
       * @return the request
       */
      public EliminarGerente eliminarGerente(Long id) throws java.io.IOException {
        EliminarGerente result = new EliminarGerente(id);
        initialize(result);
        return result;
      }

      public class EliminarGerente extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.GerenteCluster> {

        private static final String REST_PATH = "gerentecluster/{id}";

        /**
         * Create a request for the method "cluster.eliminarGerente".
         *
         * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
         * optional parameters, call the {@link EliminarGerente#execute()} method to invoke the remote
         * operation. <p> {@link EliminarGerente#initialize(AbstractGoogleClientRequest)} must be called
         * to initialize this instance immediately after invoking the constructor. </p>
         *
         * @param id
         * @since 1.13
         */
        protected EliminarGerente(Long id) {
          super(Hefesoftpharmacy.this, "DELETE", REST_PATH, null, com.google.api.services.hefesoftpharmacy.model.GerenteCluster.class);
          this.id = Preconditions.checkNotNull(id, "Required parameter id must be specified.");
        }

        @Override
        public EliminarGerente setAlt(String alt) {
          return (EliminarGerente) super.setAlt(alt);
        }

        @Override
        public EliminarGerente setFields(String fields) {
          return (EliminarGerente) super.setFields(fields);
        }

        @Override
        public EliminarGerente setKey(String key) {
          return (EliminarGerente) super.setKey(key);
        }

        @Override
        public EliminarGerente setOauthToken(String oauthToken) {
          return (EliminarGerente) super.setOauthToken(oauthToken);
        }

        @Override
        public EliminarGerente setPrettyPrint(Boolean prettyPrint) {
          return (EliminarGerente) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public EliminarGerente setQuotaUser(String quotaUser) {
          return (EliminarGerente) super.setQuotaUser(quotaUser);
        }

        @Override
        public EliminarGerente setUserIp(String userIp) {
          return (EliminarGerente) super.setUserIp(userIp);
        }

        @com.google.api.client.util.Key
        private Long id;

        /**

         */
        public Long getId() {
          return id;
        }

        public EliminarGerente setId(Long id) {
          this.id = id;
          return this;
        }

      }
      /**
       * Create a request for the method "cluster.listarGerentes".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link ListarGerentes#execute()} method to invoke the remote
       * operation.
       *
       * @return the request
       */
      public ListarGerentes listarGerentes() throws java.io.IOException {
        ListarGerentes result = new ListarGerentes();
        initialize(result);
        return result;
      }

      public class ListarGerentes extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.CollectionResponseGerenteCluster> {

        private static final String REST_PATH = "gerentecluster";

        /**
         * Create a request for the method "cluster.listarGerentes".
         *
         * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
         * optional parameters, call the {@link ListarGerentes#execute()} method to invoke the remote
         * operation. <p> {@link ListarGerentes#initialize(AbstractGoogleClientRequest)} must be called to
         * initialize this instance immediately after invoking the constructor. </p>
         *
         * @since 1.13
         */
        protected ListarGerentes() {
          super(Hefesoftpharmacy.this, "GET", REST_PATH, null, com.google.api.services.hefesoftpharmacy.model.CollectionResponseGerenteCluster.class);
        }

        @Override
        public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
          return super.executeUsingHead();
        }

        @Override
        public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
          return super.buildHttpRequestUsingHead();
        }

        @Override
        public ListarGerentes setAlt(String alt) {
          return (ListarGerentes) super.setAlt(alt);
        }

        @Override
        public ListarGerentes setFields(String fields) {
          return (ListarGerentes) super.setFields(fields);
        }

        @Override
        public ListarGerentes setKey(String key) {
          return (ListarGerentes) super.setKey(key);
        }

        @Override
        public ListarGerentes setOauthToken(String oauthToken) {
          return (ListarGerentes) super.setOauthToken(oauthToken);
        }

        @Override
        public ListarGerentes setPrettyPrint(Boolean prettyPrint) {
          return (ListarGerentes) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public ListarGerentes setQuotaUser(String quotaUser) {
          return (ListarGerentes) super.setQuotaUser(quotaUser);
        }

        @Override
        public ListarGerentes setUserIp(String userIp) {
          return (ListarGerentes) super.setUserIp(userIp);
        }

        @com.google.api.client.util.Key
        private String cursor;

        /**

         */
        public String getCursor() {
          return cursor;
        }

        public ListarGerentes setCursor(String cursor) {
          this.cursor = cursor;
          return this;
        }

        @com.google.api.client.util.Key
        private Integer limit;

        /**

         */
        public Integer getLimit() {
          return limit;
        }

        public ListarGerentes setLimit(Integer limit) {
          this.limit = limit;
          return this;
        }

      }
      /**
       * Create a request for the method "cluster.obtenerGerentePorId".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link ObtenerGerentePorId#execute()} method to invoke the remote
       * operation.
       *
       * @param id
       * @return the request
       */
      public ObtenerGerentePorId obtenerGerentePorId(Long id) throws java.io.IOException {
        ObtenerGerentePorId result = new ObtenerGerentePorId(id);
        initialize(result);
        return result;
      }

      public class ObtenerGerentePorId extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.GerenteCluster> {

        private static final String REST_PATH = "gerentecluster/{id}";

        /**
         * Create a request for the method "cluster.obtenerGerentePorId".
         *
         * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
         * optional parameters, call the {@link ObtenerGerentePorId#execute()} method to invoke the remote
         * operation. <p> {@link ObtenerGerentePorId#initialize(AbstractGoogleClientRequest)} must be
         * called to initialize this instance immediately after invoking the constructor. </p>
         *
         * @param id
         * @since 1.13
         */
        protected ObtenerGerentePorId(Long id) {
          super(Hefesoftpharmacy.this, "GET", REST_PATH, null, com.google.api.services.hefesoftpharmacy.model.GerenteCluster.class);
          this.id = Preconditions.checkNotNull(id, "Required parameter id must be specified.");
        }

        @Override
        public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
          return super.executeUsingHead();
        }

        @Override
        public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
          return super.buildHttpRequestUsingHead();
        }

        @Override
        public ObtenerGerentePorId setAlt(String alt) {
          return (ObtenerGerentePorId) super.setAlt(alt);
        }

        @Override
        public ObtenerGerentePorId setFields(String fields) {
          return (ObtenerGerentePorId) super.setFields(fields);
        }

        @Override
        public ObtenerGerentePorId setKey(String key) {
          return (ObtenerGerentePorId) super.setKey(key);
        }

        @Override
        public ObtenerGerentePorId setOauthToken(String oauthToken) {
          return (ObtenerGerentePorId) super.setOauthToken(oauthToken);
        }

        @Override
        public ObtenerGerentePorId setPrettyPrint(Boolean prettyPrint) {
          return (ObtenerGerentePorId) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public ObtenerGerentePorId setQuotaUser(String quotaUser) {
          return (ObtenerGerentePorId) super.setQuotaUser(quotaUser);
        }

        @Override
        public ObtenerGerentePorId setUserIp(String userIp) {
          return (ObtenerGerentePorId) super.setUserIp(userIp);
        }

        @com.google.api.client.util.Key
        private Long id;

        /**

         */
        public Long getId() {
          return id;
        }

        public ObtenerGerentePorId setId(Long id) {
          this.id = id;
          return this;
        }

      }

    }
    /**
     * An accessor for creating requests from the Distrito collection.
     *
     * <p>The typical use is:</p>
     * <pre>
     *   {@code Hefesoftpharmacy hefesoftpharmacy = new Hefesoftpharmacy(...);}
     *   {@code Hefesoftpharmacy.Distrito.List request = hefesoftpharmacy.distrito().list(parameters ...)}
     * </pre>
     *
     * @return the resource collection
     */
    public Distrito distrito() {
      return new Distrito();
    }

    /**
     * The "distrito" collection of methods.
     */
    public class Distrito {

      /**
       * Create a request for the method "distrito.actualizarGerente".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link ActualizarGerente#execute()} method to invoke the remote
       * operation.
       *
       * @param content the {@link com.google.api.services.hefesoftpharmacy.model.GerenteDistrito}
       * @return the request
       */
      public ActualizarGerente actualizarGerente(com.google.api.services.hefesoftpharmacy.model.GerenteDistrito content) throws java.io.IOException {
        ActualizarGerente result = new ActualizarGerente(content);
        initialize(result);
        return result;
      }

      public class ActualizarGerente extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.GerenteDistrito> {

        private static final String REST_PATH = "gerentedistrito";

        /**
         * Create a request for the method "distrito.actualizarGerente".
         *
         * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
         * optional parameters, call the {@link ActualizarGerente#execute()} method to invoke the remote
         * operation. <p> {@link ActualizarGerente#initialize(AbstractGoogleClientRequest)} must be called
         * to initialize this instance immediately after invoking the constructor. </p>
         *
         * @param content the {@link com.google.api.services.hefesoftpharmacy.model.GerenteDistrito}
         * @since 1.13
         */
        protected ActualizarGerente(com.google.api.services.hefesoftpharmacy.model.GerenteDistrito content) {
          super(Hefesoftpharmacy.this, "PUT", REST_PATH, content, com.google.api.services.hefesoftpharmacy.model.GerenteDistrito.class);
        }

        @Override
        public ActualizarGerente setAlt(String alt) {
          return (ActualizarGerente) super.setAlt(alt);
        }

        @Override
        public ActualizarGerente setFields(String fields) {
          return (ActualizarGerente) super.setFields(fields);
        }

        @Override
        public ActualizarGerente setKey(String key) {
          return (ActualizarGerente) super.setKey(key);
        }

        @Override
        public ActualizarGerente setOauthToken(String oauthToken) {
          return (ActualizarGerente) super.setOauthToken(oauthToken);
        }

        @Override
        public ActualizarGerente setPrettyPrint(Boolean prettyPrint) {
          return (ActualizarGerente) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public ActualizarGerente setQuotaUser(String quotaUser) {
          return (ActualizarGerente) super.setQuotaUser(quotaUser);
        }

        @Override
        public ActualizarGerente setUserIp(String userIp) {
          return (ActualizarGerente) super.setUserIp(userIp);
        }

      }
      /**
       * Create a request for the method "distrito.adicionarGerente".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link AdicionarGerente#execute()} method to invoke the remote
       * operation.
       *
       * @param content the {@link com.google.api.services.hefesoftpharmacy.model.GerenteDistrito}
       * @return the request
       */
      public AdicionarGerente adicionarGerente(com.google.api.services.hefesoftpharmacy.model.GerenteDistrito content) throws java.io.IOException {
        AdicionarGerente result = new AdicionarGerente(content);
        initialize(result);
        return result;
      }

      public class AdicionarGerente extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.GerenteDistrito> {

        private static final String REST_PATH = "gerentedistrito";

        /**
         * Create a request for the method "distrito.adicionarGerente".
         *
         * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
         * optional parameters, call the {@link AdicionarGerente#execute()} method to invoke the remote
         * operation. <p> {@link AdicionarGerente#initialize(AbstractGoogleClientRequest)} must be called
         * to initialize this instance immediately after invoking the constructor. </p>
         *
         * @param content the {@link com.google.api.services.hefesoftpharmacy.model.GerenteDistrito}
         * @since 1.13
         */
        protected AdicionarGerente(com.google.api.services.hefesoftpharmacy.model.GerenteDistrito content) {
          super(Hefesoftpharmacy.this, "POST", REST_PATH, content, com.google.api.services.hefesoftpharmacy.model.GerenteDistrito.class);
        }

        @Override
        public AdicionarGerente setAlt(String alt) {
          return (AdicionarGerente) super.setAlt(alt);
        }

        @Override
        public AdicionarGerente setFields(String fields) {
          return (AdicionarGerente) super.setFields(fields);
        }

        @Override
        public AdicionarGerente setKey(String key) {
          return (AdicionarGerente) super.setKey(key);
        }

        @Override
        public AdicionarGerente setOauthToken(String oauthToken) {
          return (AdicionarGerente) super.setOauthToken(oauthToken);
        }

        @Override
        public AdicionarGerente setPrettyPrint(Boolean prettyPrint) {
          return (AdicionarGerente) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public AdicionarGerente setQuotaUser(String quotaUser) {
          return (AdicionarGerente) super.setQuotaUser(quotaUser);
        }

        @Override
        public AdicionarGerente setUserIp(String userIp) {
          return (AdicionarGerente) super.setUserIp(userIp);
        }

      }
      /**
       * Create a request for the method "distrito.eliminarGerente".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link EliminarGerente#execute()} method to invoke the remote
       * operation.
       *
       * @param id
       * @return the request
       */
      public EliminarGerente eliminarGerente(Long id) throws java.io.IOException {
        EliminarGerente result = new EliminarGerente(id);
        initialize(result);
        return result;
      }

      public class EliminarGerente extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.GerenteDistrito> {

        private static final String REST_PATH = "gerentedistrito/{id}";

        /**
         * Create a request for the method "distrito.eliminarGerente".
         *
         * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
         * optional parameters, call the {@link EliminarGerente#execute()} method to invoke the remote
         * operation. <p> {@link EliminarGerente#initialize(AbstractGoogleClientRequest)} must be called
         * to initialize this instance immediately after invoking the constructor. </p>
         *
         * @param id
         * @since 1.13
         */
        protected EliminarGerente(Long id) {
          super(Hefesoftpharmacy.this, "DELETE", REST_PATH, null, com.google.api.services.hefesoftpharmacy.model.GerenteDistrito.class);
          this.id = Preconditions.checkNotNull(id, "Required parameter id must be specified.");
        }

        @Override
        public EliminarGerente setAlt(String alt) {
          return (EliminarGerente) super.setAlt(alt);
        }

        @Override
        public EliminarGerente setFields(String fields) {
          return (EliminarGerente) super.setFields(fields);
        }

        @Override
        public EliminarGerente setKey(String key) {
          return (EliminarGerente) super.setKey(key);
        }

        @Override
        public EliminarGerente setOauthToken(String oauthToken) {
          return (EliminarGerente) super.setOauthToken(oauthToken);
        }

        @Override
        public EliminarGerente setPrettyPrint(Boolean prettyPrint) {
          return (EliminarGerente) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public EliminarGerente setQuotaUser(String quotaUser) {
          return (EliminarGerente) super.setQuotaUser(quotaUser);
        }

        @Override
        public EliminarGerente setUserIp(String userIp) {
          return (EliminarGerente) super.setUserIp(userIp);
        }

        @com.google.api.client.util.Key
        private Long id;

        /**

         */
        public Long getId() {
          return id;
        }

        public EliminarGerente setId(Long id) {
          this.id = id;
          return this;
        }

      }
      /**
       * Create a request for the method "distrito.listarGerentes".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link ListarGerentes#execute()} method to invoke the remote
       * operation.
       *
       * @return the request
       */
      public ListarGerentes listarGerentes() throws java.io.IOException {
        ListarGerentes result = new ListarGerentes();
        initialize(result);
        return result;
      }

      public class ListarGerentes extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.CollectionResponseGerenteDistrito> {

        private static final String REST_PATH = "gerentedistrito";

        /**
         * Create a request for the method "distrito.listarGerentes".
         *
         * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
         * optional parameters, call the {@link ListarGerentes#execute()} method to invoke the remote
         * operation. <p> {@link ListarGerentes#initialize(AbstractGoogleClientRequest)} must be called to
         * initialize this instance immediately after invoking the constructor. </p>
         *
         * @since 1.13
         */
        protected ListarGerentes() {
          super(Hefesoftpharmacy.this, "GET", REST_PATH, null, com.google.api.services.hefesoftpharmacy.model.CollectionResponseGerenteDistrito.class);
        }

        @Override
        public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
          return super.executeUsingHead();
        }

        @Override
        public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
          return super.buildHttpRequestUsingHead();
        }

        @Override
        public ListarGerentes setAlt(String alt) {
          return (ListarGerentes) super.setAlt(alt);
        }

        @Override
        public ListarGerentes setFields(String fields) {
          return (ListarGerentes) super.setFields(fields);
        }

        @Override
        public ListarGerentes setKey(String key) {
          return (ListarGerentes) super.setKey(key);
        }

        @Override
        public ListarGerentes setOauthToken(String oauthToken) {
          return (ListarGerentes) super.setOauthToken(oauthToken);
        }

        @Override
        public ListarGerentes setPrettyPrint(Boolean prettyPrint) {
          return (ListarGerentes) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public ListarGerentes setQuotaUser(String quotaUser) {
          return (ListarGerentes) super.setQuotaUser(quotaUser);
        }

        @Override
        public ListarGerentes setUserIp(String userIp) {
          return (ListarGerentes) super.setUserIp(userIp);
        }

        @com.google.api.client.util.Key
        private String cursor;

        /**

         */
        public String getCursor() {
          return cursor;
        }

        public ListarGerentes setCursor(String cursor) {
          this.cursor = cursor;
          return this;
        }

        @com.google.api.client.util.Key
        private Integer limit;

        /**

         */
        public Integer getLimit() {
          return limit;
        }

        public ListarGerentes setLimit(Integer limit) {
          this.limit = limit;
          return this;
        }

        @com.google.api.client.util.Key
        private Boolean dependencias;

        /**

         */
        public Boolean getDependencias() {
          return dependencias;
        }

        public ListarGerentes setDependencias(Boolean dependencias) {
          this.dependencias = dependencias;
          return this;
        }

      }
      /**
       * Create a request for the method "distrito.obtenerGerentePorId".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link ObtenerGerentePorId#execute()} method to invoke the remote
       * operation.
       *
       * @param id
       * @return the request
       */
      public ObtenerGerentePorId obtenerGerentePorId(Long id) throws java.io.IOException {
        ObtenerGerentePorId result = new ObtenerGerentePorId(id);
        initialize(result);
        return result;
      }

      public class ObtenerGerentePorId extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.GerenteDistrito> {

        private static final String REST_PATH = "gerentedistrito/{id}";

        /**
         * Create a request for the method "distrito.obtenerGerentePorId".
         *
         * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
         * optional parameters, call the {@link ObtenerGerentePorId#execute()} method to invoke the remote
         * operation. <p> {@link ObtenerGerentePorId#initialize(AbstractGoogleClientRequest)} must be
         * called to initialize this instance immediately after invoking the constructor. </p>
         *
         * @param id
         * @since 1.13
         */
        protected ObtenerGerentePorId(Long id) {
          super(Hefesoftpharmacy.this, "GET", REST_PATH, null, com.google.api.services.hefesoftpharmacy.model.GerenteDistrito.class);
          this.id = Preconditions.checkNotNull(id, "Required parameter id must be specified.");
        }

        @Override
        public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
          return super.executeUsingHead();
        }

        @Override
        public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
          return super.buildHttpRequestUsingHead();
        }

        @Override
        public ObtenerGerentePorId setAlt(String alt) {
          return (ObtenerGerentePorId) super.setAlt(alt);
        }

        @Override
        public ObtenerGerentePorId setFields(String fields) {
          return (ObtenerGerentePorId) super.setFields(fields);
        }

        @Override
        public ObtenerGerentePorId setKey(String key) {
          return (ObtenerGerentePorId) super.setKey(key);
        }

        @Override
        public ObtenerGerentePorId setOauthToken(String oauthToken) {
          return (ObtenerGerentePorId) super.setOauthToken(oauthToken);
        }

        @Override
        public ObtenerGerentePorId setPrettyPrint(Boolean prettyPrint) {
          return (ObtenerGerentePorId) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public ObtenerGerentePorId setQuotaUser(String quotaUser) {
          return (ObtenerGerentePorId) super.setQuotaUser(quotaUser);
        }

        @Override
        public ObtenerGerentePorId setUserIp(String userIp) {
          return (ObtenerGerentePorId) super.setUserIp(userIp);
        }

        @com.google.api.client.util.Key
        private Long id;

        /**

         */
        public Long getId() {
          return id;
        }

        public ObtenerGerentePorId setId(Long id) {
          this.id = id;
          return this;
        }

        @com.google.api.client.util.Key
        private Boolean dependencias;

        /**

         */
        public Boolean getDependencias() {
          return dependencias;
        }

        public ObtenerGerentePorId setDependencias(Boolean dependencias) {
          this.dependencias = dependencias;
          return this;
        }

      }

    }
    /**
     * An accessor for creating requests from the Division collection.
     *
     * <p>The typical use is:</p>
     * <pre>
     *   {@code Hefesoftpharmacy hefesoftpharmacy = new Hefesoftpharmacy(...);}
     *   {@code Hefesoftpharmacy.Division.List request = hefesoftpharmacy.division().list(parameters ...)}
     * </pre>
     *
     * @return the resource collection
     */
    public Division division() {
      return new Division();
    }

    /**
     * The "division" collection of methods.
     */
    public class Division {

      /**
       * Create a request for the method "division.actualizarGerente".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link ActualizarGerente#execute()} method to invoke the remote
       * operation.
       *
       * @param content the {@link com.google.api.services.hefesoftpharmacy.model.GerenteDivision}
       * @return the request
       */
      public ActualizarGerente actualizarGerente(com.google.api.services.hefesoftpharmacy.model.GerenteDivision content) throws java.io.IOException {
        ActualizarGerente result = new ActualizarGerente(content);
        initialize(result);
        return result;
      }

      public class ActualizarGerente extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.GerenteDivision> {

        private static final String REST_PATH = "gerentedivision";

        /**
         * Create a request for the method "division.actualizarGerente".
         *
         * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
         * optional parameters, call the {@link ActualizarGerente#execute()} method to invoke the remote
         * operation. <p> {@link ActualizarGerente#initialize(AbstractGoogleClientRequest)} must be called
         * to initialize this instance immediately after invoking the constructor. </p>
         *
         * @param content the {@link com.google.api.services.hefesoftpharmacy.model.GerenteDivision}
         * @since 1.13
         */
        protected ActualizarGerente(com.google.api.services.hefesoftpharmacy.model.GerenteDivision content) {
          super(Hefesoftpharmacy.this, "PUT", REST_PATH, content, com.google.api.services.hefesoftpharmacy.model.GerenteDivision.class);
        }

        @Override
        public ActualizarGerente setAlt(String alt) {
          return (ActualizarGerente) super.setAlt(alt);
        }

        @Override
        public ActualizarGerente setFields(String fields) {
          return (ActualizarGerente) super.setFields(fields);
        }

        @Override
        public ActualizarGerente setKey(String key) {
          return (ActualizarGerente) super.setKey(key);
        }

        @Override
        public ActualizarGerente setOauthToken(String oauthToken) {
          return (ActualizarGerente) super.setOauthToken(oauthToken);
        }

        @Override
        public ActualizarGerente setPrettyPrint(Boolean prettyPrint) {
          return (ActualizarGerente) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public ActualizarGerente setQuotaUser(String quotaUser) {
          return (ActualizarGerente) super.setQuotaUser(quotaUser);
        }

        @Override
        public ActualizarGerente setUserIp(String userIp) {
          return (ActualizarGerente) super.setUserIp(userIp);
        }

      }
      /**
       * Create a request for the method "division.adicionarGerente".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link AdicionarGerente#execute()} method to invoke the remote
       * operation.
       *
       * @param content the {@link com.google.api.services.hefesoftpharmacy.model.GerenteDivision}
       * @return the request
       */
      public AdicionarGerente adicionarGerente(com.google.api.services.hefesoftpharmacy.model.GerenteDivision content) throws java.io.IOException {
        AdicionarGerente result = new AdicionarGerente(content);
        initialize(result);
        return result;
      }

      public class AdicionarGerente extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.GerenteDivision> {

        private static final String REST_PATH = "gerentedivision";

        /**
         * Create a request for the method "division.adicionarGerente".
         *
         * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
         * optional parameters, call the {@link AdicionarGerente#execute()} method to invoke the remote
         * operation. <p> {@link AdicionarGerente#initialize(AbstractGoogleClientRequest)} must be called
         * to initialize this instance immediately after invoking the constructor. </p>
         *
         * @param content the {@link com.google.api.services.hefesoftpharmacy.model.GerenteDivision}
         * @since 1.13
         */
        protected AdicionarGerente(com.google.api.services.hefesoftpharmacy.model.GerenteDivision content) {
          super(Hefesoftpharmacy.this, "POST", REST_PATH, content, com.google.api.services.hefesoftpharmacy.model.GerenteDivision.class);
        }

        @Override
        public AdicionarGerente setAlt(String alt) {
          return (AdicionarGerente) super.setAlt(alt);
        }

        @Override
        public AdicionarGerente setFields(String fields) {
          return (AdicionarGerente) super.setFields(fields);
        }

        @Override
        public AdicionarGerente setKey(String key) {
          return (AdicionarGerente) super.setKey(key);
        }

        @Override
        public AdicionarGerente setOauthToken(String oauthToken) {
          return (AdicionarGerente) super.setOauthToken(oauthToken);
        }

        @Override
        public AdicionarGerente setPrettyPrint(Boolean prettyPrint) {
          return (AdicionarGerente) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public AdicionarGerente setQuotaUser(String quotaUser) {
          return (AdicionarGerente) super.setQuotaUser(quotaUser);
        }

        @Override
        public AdicionarGerente setUserIp(String userIp) {
          return (AdicionarGerente) super.setUserIp(userIp);
        }

      }
      /**
       * Create a request for the method "division.eliminarGerente".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link EliminarGerente#execute()} method to invoke the remote
       * operation.
       *
       * @param id
       * @return the request
       */
      public EliminarGerente eliminarGerente(Long id) throws java.io.IOException {
        EliminarGerente result = new EliminarGerente(id);
        initialize(result);
        return result;
      }

      public class EliminarGerente extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.GerenteDivision> {

        private static final String REST_PATH = "gerentedivision/{id}";

        /**
         * Create a request for the method "division.eliminarGerente".
         *
         * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
         * optional parameters, call the {@link EliminarGerente#execute()} method to invoke the remote
         * operation. <p> {@link EliminarGerente#initialize(AbstractGoogleClientRequest)} must be called
         * to initialize this instance immediately after invoking the constructor. </p>
         *
         * @param id
         * @since 1.13
         */
        protected EliminarGerente(Long id) {
          super(Hefesoftpharmacy.this, "DELETE", REST_PATH, null, com.google.api.services.hefesoftpharmacy.model.GerenteDivision.class);
          this.id = Preconditions.checkNotNull(id, "Required parameter id must be specified.");
        }

        @Override
        public EliminarGerente setAlt(String alt) {
          return (EliminarGerente) super.setAlt(alt);
        }

        @Override
        public EliminarGerente setFields(String fields) {
          return (EliminarGerente) super.setFields(fields);
        }

        @Override
        public EliminarGerente setKey(String key) {
          return (EliminarGerente) super.setKey(key);
        }

        @Override
        public EliminarGerente setOauthToken(String oauthToken) {
          return (EliminarGerente) super.setOauthToken(oauthToken);
        }

        @Override
        public EliminarGerente setPrettyPrint(Boolean prettyPrint) {
          return (EliminarGerente) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public EliminarGerente setQuotaUser(String quotaUser) {
          return (EliminarGerente) super.setQuotaUser(quotaUser);
        }

        @Override
        public EliminarGerente setUserIp(String userIp) {
          return (EliminarGerente) super.setUserIp(userIp);
        }

        @com.google.api.client.util.Key
        private Long id;

        /**

         */
        public Long getId() {
          return id;
        }

        public EliminarGerente setId(Long id) {
          this.id = id;
          return this;
        }

      }
      /**
       * Create a request for the method "division.listarGerentes".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link ListarGerentes#execute()} method to invoke the remote
       * operation.
       *
       * @return the request
       */
      public ListarGerentes listarGerentes() throws java.io.IOException {
        ListarGerentes result = new ListarGerentes();
        initialize(result);
        return result;
      }

      public class ListarGerentes extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.CollectionResponseGerenteDivision> {

        private static final String REST_PATH = "gerentedivision";

        /**
         * Create a request for the method "division.listarGerentes".
         *
         * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
         * optional parameters, call the {@link ListarGerentes#execute()} method to invoke the remote
         * operation. <p> {@link ListarGerentes#initialize(AbstractGoogleClientRequest)} must be called to
         * initialize this instance immediately after invoking the constructor. </p>
         *
         * @since 1.13
         */
        protected ListarGerentes() {
          super(Hefesoftpharmacy.this, "GET", REST_PATH, null, com.google.api.services.hefesoftpharmacy.model.CollectionResponseGerenteDivision.class);
        }

        @Override
        public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
          return super.executeUsingHead();
        }

        @Override
        public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
          return super.buildHttpRequestUsingHead();
        }

        @Override
        public ListarGerentes setAlt(String alt) {
          return (ListarGerentes) super.setAlt(alt);
        }

        @Override
        public ListarGerentes setFields(String fields) {
          return (ListarGerentes) super.setFields(fields);
        }

        @Override
        public ListarGerentes setKey(String key) {
          return (ListarGerentes) super.setKey(key);
        }

        @Override
        public ListarGerentes setOauthToken(String oauthToken) {
          return (ListarGerentes) super.setOauthToken(oauthToken);
        }

        @Override
        public ListarGerentes setPrettyPrint(Boolean prettyPrint) {
          return (ListarGerentes) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public ListarGerentes setQuotaUser(String quotaUser) {
          return (ListarGerentes) super.setQuotaUser(quotaUser);
        }

        @Override
        public ListarGerentes setUserIp(String userIp) {
          return (ListarGerentes) super.setUserIp(userIp);
        }

        @com.google.api.client.util.Key
        private String cursor;

        /**

         */
        public String getCursor() {
          return cursor;
        }

        public ListarGerentes setCursor(String cursor) {
          this.cursor = cursor;
          return this;
        }

        @com.google.api.client.util.Key
        private Integer limit;

        /**

         */
        public Integer getLimit() {
          return limit;
        }

        public ListarGerentes setLimit(Integer limit) {
          this.limit = limit;
          return this;
        }

        @com.google.api.client.util.Key
        private Boolean dependencias;

        /**

         */
        public Boolean getDependencias() {
          return dependencias;
        }

        public ListarGerentes setDependencias(Boolean dependencias) {
          this.dependencias = dependencias;
          return this;
        }

      }
      /**
       * Create a request for the method "division.obtenerGerentePorId".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link ObtenerGerentePorId#execute()} method to invoke the remote
       * operation.
       *
       * @param id
       * @return the request
       */
      public ObtenerGerentePorId obtenerGerentePorId(Long id) throws java.io.IOException {
        ObtenerGerentePorId result = new ObtenerGerentePorId(id);
        initialize(result);
        return result;
      }

      public class ObtenerGerentePorId extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.GerenteDivision> {

        private static final String REST_PATH = "gerentedivision/{id}";

        /**
         * Create a request for the method "division.obtenerGerentePorId".
         *
         * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
         * optional parameters, call the {@link ObtenerGerentePorId#execute()} method to invoke the remote
         * operation. <p> {@link ObtenerGerentePorId#initialize(AbstractGoogleClientRequest)} must be
         * called to initialize this instance immediately after invoking the constructor. </p>
         *
         * @param id
         * @since 1.13
         */
        protected ObtenerGerentePorId(Long id) {
          super(Hefesoftpharmacy.this, "GET", REST_PATH, null, com.google.api.services.hefesoftpharmacy.model.GerenteDivision.class);
          this.id = Preconditions.checkNotNull(id, "Required parameter id must be specified.");
        }

        @Override
        public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
          return super.executeUsingHead();
        }

        @Override
        public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
          return super.buildHttpRequestUsingHead();
        }

        @Override
        public ObtenerGerentePorId setAlt(String alt) {
          return (ObtenerGerentePorId) super.setAlt(alt);
        }

        @Override
        public ObtenerGerentePorId setFields(String fields) {
          return (ObtenerGerentePorId) super.setFields(fields);
        }

        @Override
        public ObtenerGerentePorId setKey(String key) {
          return (ObtenerGerentePorId) super.setKey(key);
        }

        @Override
        public ObtenerGerentePorId setOauthToken(String oauthToken) {
          return (ObtenerGerentePorId) super.setOauthToken(oauthToken);
        }

        @Override
        public ObtenerGerentePorId setPrettyPrint(Boolean prettyPrint) {
          return (ObtenerGerentePorId) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public ObtenerGerentePorId setQuotaUser(String quotaUser) {
          return (ObtenerGerentePorId) super.setQuotaUser(quotaUser);
        }

        @Override
        public ObtenerGerentePorId setUserIp(String userIp) {
          return (ObtenerGerentePorId) super.setUserIp(userIp);
        }

        @com.google.api.client.util.Key
        private Long id;

        /**

         */
        public Long getId() {
          return id;
        }

        public ObtenerGerentePorId setId(Long id) {
          this.id = id;
          return this;
        }

        @com.google.api.client.util.Key
        private Boolean dependencias;

        /**

         */
        public Boolean getDependencias() {
          return dependencias;
        }

        public ObtenerGerentePorId setDependencias(Boolean dependencias) {
          this.dependencias = dependencias;
          return this;
        }

      }

    }
    /**
     * An accessor for creating requests from the Empresa collection.
     *
     * <p>The typical use is:</p>
     * <pre>
     *   {@code Hefesoftpharmacy hefesoftpharmacy = new Hefesoftpharmacy(...);}
     *   {@code Hefesoftpharmacy.Empresa.List request = hefesoftpharmacy.empresa().list(parameters ...)}
     * </pre>
     *
     * @return the resource collection
     */
    public Empresa empresa() {
      return new Empresa();
    }

    /**
     * The "empresa" collection of methods.
     */
    public class Empresa {

      /**
       * Create a request for the method "empresa.actualizarGerente".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link ActualizarGerente#execute()} method to invoke the remote
       * operation.
       *
       * @param content the {@link com.google.api.services.hefesoftpharmacy.model.GerenteEmpresa}
       * @return the request
       */
      public ActualizarGerente actualizarGerente(com.google.api.services.hefesoftpharmacy.model.GerenteEmpresa content) throws java.io.IOException {
        ActualizarGerente result = new ActualizarGerente(content);
        initialize(result);
        return result;
      }

      public class ActualizarGerente extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.GerenteEmpresa> {

        private static final String REST_PATH = "gerenteempresa";

        /**
         * Create a request for the method "empresa.actualizarGerente".
         *
         * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
         * optional parameters, call the {@link ActualizarGerente#execute()} method to invoke the remote
         * operation. <p> {@link ActualizarGerente#initialize(AbstractGoogleClientRequest)} must be called
         * to initialize this instance immediately after invoking the constructor. </p>
         *
         * @param content the {@link com.google.api.services.hefesoftpharmacy.model.GerenteEmpresa}
         * @since 1.13
         */
        protected ActualizarGerente(com.google.api.services.hefesoftpharmacy.model.GerenteEmpresa content) {
          super(Hefesoftpharmacy.this, "PUT", REST_PATH, content, com.google.api.services.hefesoftpharmacy.model.GerenteEmpresa.class);
        }

        @Override
        public ActualizarGerente setAlt(String alt) {
          return (ActualizarGerente) super.setAlt(alt);
        }

        @Override
        public ActualizarGerente setFields(String fields) {
          return (ActualizarGerente) super.setFields(fields);
        }

        @Override
        public ActualizarGerente setKey(String key) {
          return (ActualizarGerente) super.setKey(key);
        }

        @Override
        public ActualizarGerente setOauthToken(String oauthToken) {
          return (ActualizarGerente) super.setOauthToken(oauthToken);
        }

        @Override
        public ActualizarGerente setPrettyPrint(Boolean prettyPrint) {
          return (ActualizarGerente) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public ActualizarGerente setQuotaUser(String quotaUser) {
          return (ActualizarGerente) super.setQuotaUser(quotaUser);
        }

        @Override
        public ActualizarGerente setUserIp(String userIp) {
          return (ActualizarGerente) super.setUserIp(userIp);
        }

      }
      /**
       * Create a request for the method "empresa.adicionarGerente".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link AdicionarGerente#execute()} method to invoke the remote
       * operation.
       *
       * @param content the {@link com.google.api.services.hefesoftpharmacy.model.GerenteEmpresa}
       * @return the request
       */
      public AdicionarGerente adicionarGerente(com.google.api.services.hefesoftpharmacy.model.GerenteEmpresa content) throws java.io.IOException {
        AdicionarGerente result = new AdicionarGerente(content);
        initialize(result);
        return result;
      }

      public class AdicionarGerente extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.GerenteEmpresa> {

        private static final String REST_PATH = "gerenteempresa";

        /**
         * Create a request for the method "empresa.adicionarGerente".
         *
         * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
         * optional parameters, call the {@link AdicionarGerente#execute()} method to invoke the remote
         * operation. <p> {@link AdicionarGerente#initialize(AbstractGoogleClientRequest)} must be called
         * to initialize this instance immediately after invoking the constructor. </p>
         *
         * @param content the {@link com.google.api.services.hefesoftpharmacy.model.GerenteEmpresa}
         * @since 1.13
         */
        protected AdicionarGerente(com.google.api.services.hefesoftpharmacy.model.GerenteEmpresa content) {
          super(Hefesoftpharmacy.this, "POST", REST_PATH, content, com.google.api.services.hefesoftpharmacy.model.GerenteEmpresa.class);
        }

        @Override
        public AdicionarGerente setAlt(String alt) {
          return (AdicionarGerente) super.setAlt(alt);
        }

        @Override
        public AdicionarGerente setFields(String fields) {
          return (AdicionarGerente) super.setFields(fields);
        }

        @Override
        public AdicionarGerente setKey(String key) {
          return (AdicionarGerente) super.setKey(key);
        }

        @Override
        public AdicionarGerente setOauthToken(String oauthToken) {
          return (AdicionarGerente) super.setOauthToken(oauthToken);
        }

        @Override
        public AdicionarGerente setPrettyPrint(Boolean prettyPrint) {
          return (AdicionarGerente) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public AdicionarGerente setQuotaUser(String quotaUser) {
          return (AdicionarGerente) super.setQuotaUser(quotaUser);
        }

        @Override
        public AdicionarGerente setUserIp(String userIp) {
          return (AdicionarGerente) super.setUserIp(userIp);
        }

      }
      /**
       * Create a request for the method "empresa.eliminarGerente".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link EliminarGerente#execute()} method to invoke the remote
       * operation.
       *
       * @param id
       * @return the request
       */
      public EliminarGerente eliminarGerente(Long id) throws java.io.IOException {
        EliminarGerente result = new EliminarGerente(id);
        initialize(result);
        return result;
      }

      public class EliminarGerente extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.GerenteEmpresa> {

        private static final String REST_PATH = "gerenteempresa/{id}";

        /**
         * Create a request for the method "empresa.eliminarGerente".
         *
         * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
         * optional parameters, call the {@link EliminarGerente#execute()} method to invoke the remote
         * operation. <p> {@link EliminarGerente#initialize(AbstractGoogleClientRequest)} must be called
         * to initialize this instance immediately after invoking the constructor. </p>
         *
         * @param id
         * @since 1.13
         */
        protected EliminarGerente(Long id) {
          super(Hefesoftpharmacy.this, "DELETE", REST_PATH, null, com.google.api.services.hefesoftpharmacy.model.GerenteEmpresa.class);
          this.id = Preconditions.checkNotNull(id, "Required parameter id must be specified.");
        }

        @Override
        public EliminarGerente setAlt(String alt) {
          return (EliminarGerente) super.setAlt(alt);
        }

        @Override
        public EliminarGerente setFields(String fields) {
          return (EliminarGerente) super.setFields(fields);
        }

        @Override
        public EliminarGerente setKey(String key) {
          return (EliminarGerente) super.setKey(key);
        }

        @Override
        public EliminarGerente setOauthToken(String oauthToken) {
          return (EliminarGerente) super.setOauthToken(oauthToken);
        }

        @Override
        public EliminarGerente setPrettyPrint(Boolean prettyPrint) {
          return (EliminarGerente) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public EliminarGerente setQuotaUser(String quotaUser) {
          return (EliminarGerente) super.setQuotaUser(quotaUser);
        }

        @Override
        public EliminarGerente setUserIp(String userIp) {
          return (EliminarGerente) super.setUserIp(userIp);
        }

        @com.google.api.client.util.Key
        private Long id;

        /**

         */
        public Long getId() {
          return id;
        }

        public EliminarGerente setId(Long id) {
          this.id = id;
          return this;
        }

      }
      /**
       * Create a request for the method "empresa.listarGerentes".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link ListarGerentes#execute()} method to invoke the remote
       * operation.
       *
       * @return the request
       */
      public ListarGerentes listarGerentes() throws java.io.IOException {
        ListarGerentes result = new ListarGerentes();
        initialize(result);
        return result;
      }

      public class ListarGerentes extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.CollectionResponseGerenteEmpresa> {

        private static final String REST_PATH = "gerenteempresa";

        /**
         * Create a request for the method "empresa.listarGerentes".
         *
         * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
         * optional parameters, call the {@link ListarGerentes#execute()} method to invoke the remote
         * operation. <p> {@link ListarGerentes#initialize(AbstractGoogleClientRequest)} must be called to
         * initialize this instance immediately after invoking the constructor. </p>
         *
         * @since 1.13
         */
        protected ListarGerentes() {
          super(Hefesoftpharmacy.this, "GET", REST_PATH, null, com.google.api.services.hefesoftpharmacy.model.CollectionResponseGerenteEmpresa.class);
        }

        @Override
        public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
          return super.executeUsingHead();
        }

        @Override
        public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
          return super.buildHttpRequestUsingHead();
        }

        @Override
        public ListarGerentes setAlt(String alt) {
          return (ListarGerentes) super.setAlt(alt);
        }

        @Override
        public ListarGerentes setFields(String fields) {
          return (ListarGerentes) super.setFields(fields);
        }

        @Override
        public ListarGerentes setKey(String key) {
          return (ListarGerentes) super.setKey(key);
        }

        @Override
        public ListarGerentes setOauthToken(String oauthToken) {
          return (ListarGerentes) super.setOauthToken(oauthToken);
        }

        @Override
        public ListarGerentes setPrettyPrint(Boolean prettyPrint) {
          return (ListarGerentes) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public ListarGerentes setQuotaUser(String quotaUser) {
          return (ListarGerentes) super.setQuotaUser(quotaUser);
        }

        @Override
        public ListarGerentes setUserIp(String userIp) {
          return (ListarGerentes) super.setUserIp(userIp);
        }

        @com.google.api.client.util.Key
        private String cursor;

        /**

         */
        public String getCursor() {
          return cursor;
        }

        public ListarGerentes setCursor(String cursor) {
          this.cursor = cursor;
          return this;
        }

        @com.google.api.client.util.Key
        private Integer limit;

        /**

         */
        public Integer getLimit() {
          return limit;
        }

        public ListarGerentes setLimit(Integer limit) {
          this.limit = limit;
          return this;
        }

        @com.google.api.client.util.Key
        private Boolean dependencias;

        /**

         */
        public Boolean getDependencias() {
          return dependencias;
        }

        public ListarGerentes setDependencias(Boolean dependencias) {
          this.dependencias = dependencias;
          return this;
        }

      }
      /**
       * Create a request for the method "empresa.obtenerGerentePorId".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link ObtenerGerentePorId#execute()} method to invoke the remote
       * operation.
       *
       * @param id
       * @return the request
       */
      public ObtenerGerentePorId obtenerGerentePorId(Long id) throws java.io.IOException {
        ObtenerGerentePorId result = new ObtenerGerentePorId(id);
        initialize(result);
        return result;
      }

      public class ObtenerGerentePorId extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.GerenteEmpresa> {

        private static final String REST_PATH = "gerenteempresa/{id}";

        /**
         * Create a request for the method "empresa.obtenerGerentePorId".
         *
         * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
         * optional parameters, call the {@link ObtenerGerentePorId#execute()} method to invoke the remote
         * operation. <p> {@link ObtenerGerentePorId#initialize(AbstractGoogleClientRequest)} must be
         * called to initialize this instance immediately after invoking the constructor. </p>
         *
         * @param id
         * @since 1.13
         */
        protected ObtenerGerentePorId(Long id) {
          super(Hefesoftpharmacy.this, "GET", REST_PATH, null, com.google.api.services.hefesoftpharmacy.model.GerenteEmpresa.class);
          this.id = Preconditions.checkNotNull(id, "Required parameter id must be specified.");
        }

        @Override
        public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
          return super.executeUsingHead();
        }

        @Override
        public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
          return super.buildHttpRequestUsingHead();
        }

        @Override
        public ObtenerGerentePorId setAlt(String alt) {
          return (ObtenerGerentePorId) super.setAlt(alt);
        }

        @Override
        public ObtenerGerentePorId setFields(String fields) {
          return (ObtenerGerentePorId) super.setFields(fields);
        }

        @Override
        public ObtenerGerentePorId setKey(String key) {
          return (ObtenerGerentePorId) super.setKey(key);
        }

        @Override
        public ObtenerGerentePorId setOauthToken(String oauthToken) {
          return (ObtenerGerentePorId) super.setOauthToken(oauthToken);
        }

        @Override
        public ObtenerGerentePorId setPrettyPrint(Boolean prettyPrint) {
          return (ObtenerGerentePorId) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public ObtenerGerentePorId setQuotaUser(String quotaUser) {
          return (ObtenerGerentePorId) super.setQuotaUser(quotaUser);
        }

        @Override
        public ObtenerGerentePorId setUserIp(String userIp) {
          return (ObtenerGerentePorId) super.setUserIp(userIp);
        }

        @com.google.api.client.util.Key
        private Long id;

        /**

         */
        public Long getId() {
          return id;
        }

        public ObtenerGerentePorId setId(Long id) {
          this.id = id;
          return this;
        }

        @com.google.api.client.util.Key
        private Boolean dependencias;

        /**

         */
        public Boolean getDependencias() {
          return dependencias;
        }

        public ObtenerGerentePorId setDependencias(Boolean dependencias) {
          this.dependencias = dependencias;
          return this;
        }

      }

    }
    /**
     * An accessor for creating requests from the Linea collection.
     *
     * <p>The typical use is:</p>
     * <pre>
     *   {@code Hefesoftpharmacy hefesoftpharmacy = new Hefesoftpharmacy(...);}
     *   {@code Hefesoftpharmacy.Linea.List request = hefesoftpharmacy.linea().list(parameters ...)}
     * </pre>
     *
     * @return the resource collection
     */
    public Linea linea() {
      return new Linea();
    }

    /**
     * The "linea" collection of methods.
     */
    public class Linea {

      /**
       * Create a request for the method "linea.actualizarGerente".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link ActualizarGerente#execute()} method to invoke the remote
       * operation.
       *
       * @param content the {@link com.google.api.services.hefesoftpharmacy.model.GerenteLinea}
       * @return the request
       */
      public ActualizarGerente actualizarGerente(com.google.api.services.hefesoftpharmacy.model.GerenteLinea content) throws java.io.IOException {
        ActualizarGerente result = new ActualizarGerente(content);
        initialize(result);
        return result;
      }

      public class ActualizarGerente extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.GerenteLinea> {

        private static final String REST_PATH = "gerentelinea";

        /**
         * Create a request for the method "linea.actualizarGerente".
         *
         * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
         * optional parameters, call the {@link ActualizarGerente#execute()} method to invoke the remote
         * operation. <p> {@link ActualizarGerente#initialize(AbstractGoogleClientRequest)} must be called
         * to initialize this instance immediately after invoking the constructor. </p>
         *
         * @param content the {@link com.google.api.services.hefesoftpharmacy.model.GerenteLinea}
         * @since 1.13
         */
        protected ActualizarGerente(com.google.api.services.hefesoftpharmacy.model.GerenteLinea content) {
          super(Hefesoftpharmacy.this, "PUT", REST_PATH, content, com.google.api.services.hefesoftpharmacy.model.GerenteLinea.class);
        }

        @Override
        public ActualizarGerente setAlt(String alt) {
          return (ActualizarGerente) super.setAlt(alt);
        }

        @Override
        public ActualizarGerente setFields(String fields) {
          return (ActualizarGerente) super.setFields(fields);
        }

        @Override
        public ActualizarGerente setKey(String key) {
          return (ActualizarGerente) super.setKey(key);
        }

        @Override
        public ActualizarGerente setOauthToken(String oauthToken) {
          return (ActualizarGerente) super.setOauthToken(oauthToken);
        }

        @Override
        public ActualizarGerente setPrettyPrint(Boolean prettyPrint) {
          return (ActualizarGerente) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public ActualizarGerente setQuotaUser(String quotaUser) {
          return (ActualizarGerente) super.setQuotaUser(quotaUser);
        }

        @Override
        public ActualizarGerente setUserIp(String userIp) {
          return (ActualizarGerente) super.setUserIp(userIp);
        }

      }
      /**
       * Create a request for the method "linea.adicionarGerente".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link AdicionarGerente#execute()} method to invoke the remote
       * operation.
       *
       * @param content the {@link com.google.api.services.hefesoftpharmacy.model.GerenteLinea}
       * @return the request
       */
      public AdicionarGerente adicionarGerente(com.google.api.services.hefesoftpharmacy.model.GerenteLinea content) throws java.io.IOException {
        AdicionarGerente result = new AdicionarGerente(content);
        initialize(result);
        return result;
      }

      public class AdicionarGerente extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.GerenteLinea> {

        private static final String REST_PATH = "gerentelinea";

        /**
         * Create a request for the method "linea.adicionarGerente".
         *
         * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
         * optional parameters, call the {@link AdicionarGerente#execute()} method to invoke the remote
         * operation. <p> {@link AdicionarGerente#initialize(AbstractGoogleClientRequest)} must be called
         * to initialize this instance immediately after invoking the constructor. </p>
         *
         * @param content the {@link com.google.api.services.hefesoftpharmacy.model.GerenteLinea}
         * @since 1.13
         */
        protected AdicionarGerente(com.google.api.services.hefesoftpharmacy.model.GerenteLinea content) {
          super(Hefesoftpharmacy.this, "POST", REST_PATH, content, com.google.api.services.hefesoftpharmacy.model.GerenteLinea.class);
        }

        @Override
        public AdicionarGerente setAlt(String alt) {
          return (AdicionarGerente) super.setAlt(alt);
        }

        @Override
        public AdicionarGerente setFields(String fields) {
          return (AdicionarGerente) super.setFields(fields);
        }

        @Override
        public AdicionarGerente setKey(String key) {
          return (AdicionarGerente) super.setKey(key);
        }

        @Override
        public AdicionarGerente setOauthToken(String oauthToken) {
          return (AdicionarGerente) super.setOauthToken(oauthToken);
        }

        @Override
        public AdicionarGerente setPrettyPrint(Boolean prettyPrint) {
          return (AdicionarGerente) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public AdicionarGerente setQuotaUser(String quotaUser) {
          return (AdicionarGerente) super.setQuotaUser(quotaUser);
        }

        @Override
        public AdicionarGerente setUserIp(String userIp) {
          return (AdicionarGerente) super.setUserIp(userIp);
        }

      }
      /**
       * Create a request for the method "linea.eliminarGerente".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link EliminarGerente#execute()} method to invoke the remote
       * operation.
       *
       * @param id
       * @return the request
       */
      public EliminarGerente eliminarGerente(Long id) throws java.io.IOException {
        EliminarGerente result = new EliminarGerente(id);
        initialize(result);
        return result;
      }

      public class EliminarGerente extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.GerenteLinea> {

        private static final String REST_PATH = "gerentelinea/{id}";

        /**
         * Create a request for the method "linea.eliminarGerente".
         *
         * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
         * optional parameters, call the {@link EliminarGerente#execute()} method to invoke the remote
         * operation. <p> {@link EliminarGerente#initialize(AbstractGoogleClientRequest)} must be called
         * to initialize this instance immediately after invoking the constructor. </p>
         *
         * @param id
         * @since 1.13
         */
        protected EliminarGerente(Long id) {
          super(Hefesoftpharmacy.this, "DELETE", REST_PATH, null, com.google.api.services.hefesoftpharmacy.model.GerenteLinea.class);
          this.id = Preconditions.checkNotNull(id, "Required parameter id must be specified.");
        }

        @Override
        public EliminarGerente setAlt(String alt) {
          return (EliminarGerente) super.setAlt(alt);
        }

        @Override
        public EliminarGerente setFields(String fields) {
          return (EliminarGerente) super.setFields(fields);
        }

        @Override
        public EliminarGerente setKey(String key) {
          return (EliminarGerente) super.setKey(key);
        }

        @Override
        public EliminarGerente setOauthToken(String oauthToken) {
          return (EliminarGerente) super.setOauthToken(oauthToken);
        }

        @Override
        public EliminarGerente setPrettyPrint(Boolean prettyPrint) {
          return (EliminarGerente) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public EliminarGerente setQuotaUser(String quotaUser) {
          return (EliminarGerente) super.setQuotaUser(quotaUser);
        }

        @Override
        public EliminarGerente setUserIp(String userIp) {
          return (EliminarGerente) super.setUserIp(userIp);
        }

        @com.google.api.client.util.Key
        private Long id;

        /**

         */
        public Long getId() {
          return id;
        }

        public EliminarGerente setId(Long id) {
          this.id = id;
          return this;
        }

      }
      /**
       * Create a request for the method "linea.listarGerentes".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link ListarGerentes#execute()} method to invoke the remote
       * operation.
       *
       * @return the request
       */
      public ListarGerentes listarGerentes() throws java.io.IOException {
        ListarGerentes result = new ListarGerentes();
        initialize(result);
        return result;
      }

      public class ListarGerentes extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.CollectionResponseGerenteLinea> {

        private static final String REST_PATH = "gerentelinea";

        /**
         * Create a request for the method "linea.listarGerentes".
         *
         * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
         * optional parameters, call the {@link ListarGerentes#execute()} method to invoke the remote
         * operation. <p> {@link ListarGerentes#initialize(AbstractGoogleClientRequest)} must be called to
         * initialize this instance immediately after invoking the constructor. </p>
         *
         * @since 1.13
         */
        protected ListarGerentes() {
          super(Hefesoftpharmacy.this, "GET", REST_PATH, null, com.google.api.services.hefesoftpharmacy.model.CollectionResponseGerenteLinea.class);
        }

        @Override
        public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
          return super.executeUsingHead();
        }

        @Override
        public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
          return super.buildHttpRequestUsingHead();
        }

        @Override
        public ListarGerentes setAlt(String alt) {
          return (ListarGerentes) super.setAlt(alt);
        }

        @Override
        public ListarGerentes setFields(String fields) {
          return (ListarGerentes) super.setFields(fields);
        }

        @Override
        public ListarGerentes setKey(String key) {
          return (ListarGerentes) super.setKey(key);
        }

        @Override
        public ListarGerentes setOauthToken(String oauthToken) {
          return (ListarGerentes) super.setOauthToken(oauthToken);
        }

        @Override
        public ListarGerentes setPrettyPrint(Boolean prettyPrint) {
          return (ListarGerentes) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public ListarGerentes setQuotaUser(String quotaUser) {
          return (ListarGerentes) super.setQuotaUser(quotaUser);
        }

        @Override
        public ListarGerentes setUserIp(String userIp) {
          return (ListarGerentes) super.setUserIp(userIp);
        }

        @com.google.api.client.util.Key
        private String cursor;

        /**

         */
        public String getCursor() {
          return cursor;
        }

        public ListarGerentes setCursor(String cursor) {
          this.cursor = cursor;
          return this;
        }

        @com.google.api.client.util.Key
        private Integer limit;

        /**

         */
        public Integer getLimit() {
          return limit;
        }

        public ListarGerentes setLimit(Integer limit) {
          this.limit = limit;
          return this;
        }

        @com.google.api.client.util.Key
        private Boolean dependencias;

        /**

         */
        public Boolean getDependencias() {
          return dependencias;
        }

        public ListarGerentes setDependencias(Boolean dependencias) {
          this.dependencias = dependencias;
          return this;
        }

      }
      /**
       * Create a request for the method "linea.obtenerGerentePorId".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link ObtenerGerentePorId#execute()} method to invoke the remote
       * operation.
       *
       * @param id
       * @return the request
       */
      public ObtenerGerentePorId obtenerGerentePorId(Long id) throws java.io.IOException {
        ObtenerGerentePorId result = new ObtenerGerentePorId(id);
        initialize(result);
        return result;
      }

      public class ObtenerGerentePorId extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.GerenteLinea> {

        private static final String REST_PATH = "gerentelinea/{id}";

        /**
         * Create a request for the method "linea.obtenerGerentePorId".
         *
         * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
         * optional parameters, call the {@link ObtenerGerentePorId#execute()} method to invoke the remote
         * operation. <p> {@link ObtenerGerentePorId#initialize(AbstractGoogleClientRequest)} must be
         * called to initialize this instance immediately after invoking the constructor. </p>
         *
         * @param id
         * @since 1.13
         */
        protected ObtenerGerentePorId(Long id) {
          super(Hefesoftpharmacy.this, "GET", REST_PATH, null, com.google.api.services.hefesoftpharmacy.model.GerenteLinea.class);
          this.id = Preconditions.checkNotNull(id, "Required parameter id must be specified.");
        }

        @Override
        public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
          return super.executeUsingHead();
        }

        @Override
        public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
          return super.buildHttpRequestUsingHead();
        }

        @Override
        public ObtenerGerentePorId setAlt(String alt) {
          return (ObtenerGerentePorId) super.setAlt(alt);
        }

        @Override
        public ObtenerGerentePorId setFields(String fields) {
          return (ObtenerGerentePorId) super.setFields(fields);
        }

        @Override
        public ObtenerGerentePorId setKey(String key) {
          return (ObtenerGerentePorId) super.setKey(key);
        }

        @Override
        public ObtenerGerentePorId setOauthToken(String oauthToken) {
          return (ObtenerGerentePorId) super.setOauthToken(oauthToken);
        }

        @Override
        public ObtenerGerentePorId setPrettyPrint(Boolean prettyPrint) {
          return (ObtenerGerentePorId) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public ObtenerGerentePorId setQuotaUser(String quotaUser) {
          return (ObtenerGerentePorId) super.setQuotaUser(quotaUser);
        }

        @Override
        public ObtenerGerentePorId setUserIp(String userIp) {
          return (ObtenerGerentePorId) super.setUserIp(userIp);
        }

        @com.google.api.client.util.Key
        private Long id;

        /**

         */
        public Long getId() {
          return id;
        }

        public ObtenerGerentePorId setId(Long id) {
          this.id = id;
          return this;
        }

      }

    }
    /**
     * An accessor for creating requests from the Pais collection.
     *
     * <p>The typical use is:</p>
     * <pre>
     *   {@code Hefesoftpharmacy hefesoftpharmacy = new Hefesoftpharmacy(...);}
     *   {@code Hefesoftpharmacy.Pais.List request = hefesoftpharmacy.pais().list(parameters ...)}
     * </pre>
     *
     * @return the resource collection
     */
    public Pais pais() {
      return new Pais();
    }

    /**
     * The "pais" collection of methods.
     */
    public class Pais {

      /**
       * Create a request for the method "pais.actualizarGerente".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link ActualizarGerente#execute()} method to invoke the remote
       * operation.
       *
       * @param content the {@link com.google.api.services.hefesoftpharmacy.model.GerentePais}
       * @return the request
       */
      public ActualizarGerente actualizarGerente(com.google.api.services.hefesoftpharmacy.model.GerentePais content) throws java.io.IOException {
        ActualizarGerente result = new ActualizarGerente(content);
        initialize(result);
        return result;
      }

      public class ActualizarGerente extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.GerentePais> {

        private static final String REST_PATH = "gerentepais";

        /**
         * Create a request for the method "pais.actualizarGerente".
         *
         * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
         * optional parameters, call the {@link ActualizarGerente#execute()} method to invoke the remote
         * operation. <p> {@link ActualizarGerente#initialize(AbstractGoogleClientRequest)} must be called
         * to initialize this instance immediately after invoking the constructor. </p>
         *
         * @param content the {@link com.google.api.services.hefesoftpharmacy.model.GerentePais}
         * @since 1.13
         */
        protected ActualizarGerente(com.google.api.services.hefesoftpharmacy.model.GerentePais content) {
          super(Hefesoftpharmacy.this, "PUT", REST_PATH, content, com.google.api.services.hefesoftpharmacy.model.GerentePais.class);
        }

        @Override
        public ActualizarGerente setAlt(String alt) {
          return (ActualizarGerente) super.setAlt(alt);
        }

        @Override
        public ActualizarGerente setFields(String fields) {
          return (ActualizarGerente) super.setFields(fields);
        }

        @Override
        public ActualizarGerente setKey(String key) {
          return (ActualizarGerente) super.setKey(key);
        }

        @Override
        public ActualizarGerente setOauthToken(String oauthToken) {
          return (ActualizarGerente) super.setOauthToken(oauthToken);
        }

        @Override
        public ActualizarGerente setPrettyPrint(Boolean prettyPrint) {
          return (ActualizarGerente) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public ActualizarGerente setQuotaUser(String quotaUser) {
          return (ActualizarGerente) super.setQuotaUser(quotaUser);
        }

        @Override
        public ActualizarGerente setUserIp(String userIp) {
          return (ActualizarGerente) super.setUserIp(userIp);
        }

      }
      /**
       * Create a request for the method "pais.adicionarGerente".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link AdicionarGerente#execute()} method to invoke the remote
       * operation.
       *
       * @param content the {@link com.google.api.services.hefesoftpharmacy.model.GerentePais}
       * @return the request
       */
      public AdicionarGerente adicionarGerente(com.google.api.services.hefesoftpharmacy.model.GerentePais content) throws java.io.IOException {
        AdicionarGerente result = new AdicionarGerente(content);
        initialize(result);
        return result;
      }

      public class AdicionarGerente extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.GerentePais> {

        private static final String REST_PATH = "gerentepais";

        /**
         * Create a request for the method "pais.adicionarGerente".
         *
         * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
         * optional parameters, call the {@link AdicionarGerente#execute()} method to invoke the remote
         * operation. <p> {@link AdicionarGerente#initialize(AbstractGoogleClientRequest)} must be called
         * to initialize this instance immediately after invoking the constructor. </p>
         *
         * @param content the {@link com.google.api.services.hefesoftpharmacy.model.GerentePais}
         * @since 1.13
         */
        protected AdicionarGerente(com.google.api.services.hefesoftpharmacy.model.GerentePais content) {
          super(Hefesoftpharmacy.this, "POST", REST_PATH, content, com.google.api.services.hefesoftpharmacy.model.GerentePais.class);
        }

        @Override
        public AdicionarGerente setAlt(String alt) {
          return (AdicionarGerente) super.setAlt(alt);
        }

        @Override
        public AdicionarGerente setFields(String fields) {
          return (AdicionarGerente) super.setFields(fields);
        }

        @Override
        public AdicionarGerente setKey(String key) {
          return (AdicionarGerente) super.setKey(key);
        }

        @Override
        public AdicionarGerente setOauthToken(String oauthToken) {
          return (AdicionarGerente) super.setOauthToken(oauthToken);
        }

        @Override
        public AdicionarGerente setPrettyPrint(Boolean prettyPrint) {
          return (AdicionarGerente) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public AdicionarGerente setQuotaUser(String quotaUser) {
          return (AdicionarGerente) super.setQuotaUser(quotaUser);
        }

        @Override
        public AdicionarGerente setUserIp(String userIp) {
          return (AdicionarGerente) super.setUserIp(userIp);
        }

      }
      /**
       * Create a request for the method "pais.eliminarGerente".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link EliminarGerente#execute()} method to invoke the remote
       * operation.
       *
       * @param id
       * @return the request
       */
      public EliminarGerente eliminarGerente(Long id) throws java.io.IOException {
        EliminarGerente result = new EliminarGerente(id);
        initialize(result);
        return result;
      }

      public class EliminarGerente extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.GerentePais> {

        private static final String REST_PATH = "gerentepais/{id}";

        /**
         * Create a request for the method "pais.eliminarGerente".
         *
         * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
         * optional parameters, call the {@link EliminarGerente#execute()} method to invoke the remote
         * operation. <p> {@link EliminarGerente#initialize(AbstractGoogleClientRequest)} must be called
         * to initialize this instance immediately after invoking the constructor. </p>
         *
         * @param id
         * @since 1.13
         */
        protected EliminarGerente(Long id) {
          super(Hefesoftpharmacy.this, "DELETE", REST_PATH, null, com.google.api.services.hefesoftpharmacy.model.GerentePais.class);
          this.id = Preconditions.checkNotNull(id, "Required parameter id must be specified.");
        }

        @Override
        public EliminarGerente setAlt(String alt) {
          return (EliminarGerente) super.setAlt(alt);
        }

        @Override
        public EliminarGerente setFields(String fields) {
          return (EliminarGerente) super.setFields(fields);
        }

        @Override
        public EliminarGerente setKey(String key) {
          return (EliminarGerente) super.setKey(key);
        }

        @Override
        public EliminarGerente setOauthToken(String oauthToken) {
          return (EliminarGerente) super.setOauthToken(oauthToken);
        }

        @Override
        public EliminarGerente setPrettyPrint(Boolean prettyPrint) {
          return (EliminarGerente) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public EliminarGerente setQuotaUser(String quotaUser) {
          return (EliminarGerente) super.setQuotaUser(quotaUser);
        }

        @Override
        public EliminarGerente setUserIp(String userIp) {
          return (EliminarGerente) super.setUserIp(userIp);
        }

        @com.google.api.client.util.Key
        private Long id;

        /**

         */
        public Long getId() {
          return id;
        }

        public EliminarGerente setId(Long id) {
          this.id = id;
          return this;
        }

      }
      /**
       * Create a request for the method "pais.listarGerentes".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link ListarGerentes#execute()} method to invoke the remote
       * operation.
       *
       * @return the request
       */
      public ListarGerentes listarGerentes() throws java.io.IOException {
        ListarGerentes result = new ListarGerentes();
        initialize(result);
        return result;
      }

      public class ListarGerentes extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.CollectionResponseGerentePais> {

        private static final String REST_PATH = "gerentepais";

        /**
         * Create a request for the method "pais.listarGerentes".
         *
         * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
         * optional parameters, call the {@link ListarGerentes#execute()} method to invoke the remote
         * operation. <p> {@link ListarGerentes#initialize(AbstractGoogleClientRequest)} must be called to
         * initialize this instance immediately after invoking the constructor. </p>
         *
         * @since 1.13
         */
        protected ListarGerentes() {
          super(Hefesoftpharmacy.this, "GET", REST_PATH, null, com.google.api.services.hefesoftpharmacy.model.CollectionResponseGerentePais.class);
        }

        @Override
        public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
          return super.executeUsingHead();
        }

        @Override
        public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
          return super.buildHttpRequestUsingHead();
        }

        @Override
        public ListarGerentes setAlt(String alt) {
          return (ListarGerentes) super.setAlt(alt);
        }

        @Override
        public ListarGerentes setFields(String fields) {
          return (ListarGerentes) super.setFields(fields);
        }

        @Override
        public ListarGerentes setKey(String key) {
          return (ListarGerentes) super.setKey(key);
        }

        @Override
        public ListarGerentes setOauthToken(String oauthToken) {
          return (ListarGerentes) super.setOauthToken(oauthToken);
        }

        @Override
        public ListarGerentes setPrettyPrint(Boolean prettyPrint) {
          return (ListarGerentes) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public ListarGerentes setQuotaUser(String quotaUser) {
          return (ListarGerentes) super.setQuotaUser(quotaUser);
        }

        @Override
        public ListarGerentes setUserIp(String userIp) {
          return (ListarGerentes) super.setUserIp(userIp);
        }

        @com.google.api.client.util.Key
        private String cursor;

        /**

         */
        public String getCursor() {
          return cursor;
        }

        public ListarGerentes setCursor(String cursor) {
          this.cursor = cursor;
          return this;
        }

        @com.google.api.client.util.Key
        private Integer limit;

        /**

         */
        public Integer getLimit() {
          return limit;
        }

        public ListarGerentes setLimit(Integer limit) {
          this.limit = limit;
          return this;
        }

        @com.google.api.client.util.Key
        private Boolean dependencias;

        /**

         */
        public Boolean getDependencias() {
          return dependencias;
        }

        public ListarGerentes setDependencias(Boolean dependencias) {
          this.dependencias = dependencias;
          return this;
        }

      }
      /**
       * Create a request for the method "pais.obtenerGerentePorId".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link ObtenerGerentePorId#execute()} method to invoke the remote
       * operation.
       *
       * @param id
       * @return the request
       */
      public ObtenerGerentePorId obtenerGerentePorId(Long id) throws java.io.IOException {
        ObtenerGerentePorId result = new ObtenerGerentePorId(id);
        initialize(result);
        return result;
      }

      public class ObtenerGerentePorId extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.GerentePais> {

        private static final String REST_PATH = "gerentepais/{id}";

        /**
         * Create a request for the method "pais.obtenerGerentePorId".
         *
         * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
         * optional parameters, call the {@link ObtenerGerentePorId#execute()} method to invoke the remote
         * operation. <p> {@link ObtenerGerentePorId#initialize(AbstractGoogleClientRequest)} must be
         * called to initialize this instance immediately after invoking the constructor. </p>
         *
         * @param id
         * @since 1.13
         */
        protected ObtenerGerentePorId(Long id) {
          super(Hefesoftpharmacy.this, "GET", REST_PATH, null, com.google.api.services.hefesoftpharmacy.model.GerentePais.class);
          this.id = Preconditions.checkNotNull(id, "Required parameter id must be specified.");
        }

        @Override
        public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
          return super.executeUsingHead();
        }

        @Override
        public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
          return super.buildHttpRequestUsingHead();
        }

        @Override
        public ObtenerGerentePorId setAlt(String alt) {
          return (ObtenerGerentePorId) super.setAlt(alt);
        }

        @Override
        public ObtenerGerentePorId setFields(String fields) {
          return (ObtenerGerentePorId) super.setFields(fields);
        }

        @Override
        public ObtenerGerentePorId setKey(String key) {
          return (ObtenerGerentePorId) super.setKey(key);
        }

        @Override
        public ObtenerGerentePorId setOauthToken(String oauthToken) {
          return (ObtenerGerentePorId) super.setOauthToken(oauthToken);
        }

        @Override
        public ObtenerGerentePorId setPrettyPrint(Boolean prettyPrint) {
          return (ObtenerGerentePorId) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public ObtenerGerentePorId setQuotaUser(String quotaUser) {
          return (ObtenerGerentePorId) super.setQuotaUser(quotaUser);
        }

        @Override
        public ObtenerGerentePorId setUserIp(String userIp) {
          return (ObtenerGerentePorId) super.setUserIp(userIp);
        }

        @com.google.api.client.util.Key
        private Long id;

        /**

         */
        public Long getId() {
          return id;
        }

        public ObtenerGerentePorId setId(Long id) {
          this.id = id;
          return this;
        }

        @com.google.api.client.util.Key
        private Boolean dependencias;

        /**

         */
        public Boolean getDependencias() {
          return dependencias;
        }

        public ObtenerGerentePorId setDependencias(Boolean dependencias) {
          this.dependencias = dependencias;
          return this;
        }

      }

    }
    /**
     * An accessor for creating requests from the Regional collection.
     *
     * <p>The typical use is:</p>
     * <pre>
     *   {@code Hefesoftpharmacy hefesoftpharmacy = new Hefesoftpharmacy(...);}
     *   {@code Hefesoftpharmacy.Regional.List request = hefesoftpharmacy.regional().list(parameters ...)}
     * </pre>
     *
     * @return the resource collection
     */
    public Regional regional() {
      return new Regional();
    }

    /**
     * The "regional" collection of methods.
     */
    public class Regional {

      /**
       * Create a request for the method "regional.actualizarGerente".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link ActualizarGerente#execute()} method to invoke the remote
       * operation.
       *
       * @param content the {@link com.google.api.services.hefesoftpharmacy.model.GerenteRegional}
       * @return the request
       */
      public ActualizarGerente actualizarGerente(com.google.api.services.hefesoftpharmacy.model.GerenteRegional content) throws java.io.IOException {
        ActualizarGerente result = new ActualizarGerente(content);
        initialize(result);
        return result;
      }

      public class ActualizarGerente extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.GerenteRegional> {

        private static final String REST_PATH = "gerenteregional";

        /**
         * Create a request for the method "regional.actualizarGerente".
         *
         * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
         * optional parameters, call the {@link ActualizarGerente#execute()} method to invoke the remote
         * operation. <p> {@link ActualizarGerente#initialize(AbstractGoogleClientRequest)} must be called
         * to initialize this instance immediately after invoking the constructor. </p>
         *
         * @param content the {@link com.google.api.services.hefesoftpharmacy.model.GerenteRegional}
         * @since 1.13
         */
        protected ActualizarGerente(com.google.api.services.hefesoftpharmacy.model.GerenteRegional content) {
          super(Hefesoftpharmacy.this, "PUT", REST_PATH, content, com.google.api.services.hefesoftpharmacy.model.GerenteRegional.class);
        }

        @Override
        public ActualizarGerente setAlt(String alt) {
          return (ActualizarGerente) super.setAlt(alt);
        }

        @Override
        public ActualizarGerente setFields(String fields) {
          return (ActualizarGerente) super.setFields(fields);
        }

        @Override
        public ActualizarGerente setKey(String key) {
          return (ActualizarGerente) super.setKey(key);
        }

        @Override
        public ActualizarGerente setOauthToken(String oauthToken) {
          return (ActualizarGerente) super.setOauthToken(oauthToken);
        }

        @Override
        public ActualizarGerente setPrettyPrint(Boolean prettyPrint) {
          return (ActualizarGerente) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public ActualizarGerente setQuotaUser(String quotaUser) {
          return (ActualizarGerente) super.setQuotaUser(quotaUser);
        }

        @Override
        public ActualizarGerente setUserIp(String userIp) {
          return (ActualizarGerente) super.setUserIp(userIp);
        }

      }
      /**
       * Create a request for the method "regional.adicionarGerente".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link AdicionarGerente#execute()} method to invoke the remote
       * operation.
       *
       * @param content the {@link com.google.api.services.hefesoftpharmacy.model.GerenteRegional}
       * @return the request
       */
      public AdicionarGerente adicionarGerente(com.google.api.services.hefesoftpharmacy.model.GerenteRegional content) throws java.io.IOException {
        AdicionarGerente result = new AdicionarGerente(content);
        initialize(result);
        return result;
      }

      public class AdicionarGerente extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.GerenteRegional> {

        private static final String REST_PATH = "gerenteregional";

        /**
         * Create a request for the method "regional.adicionarGerente".
         *
         * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
         * optional parameters, call the {@link AdicionarGerente#execute()} method to invoke the remote
         * operation. <p> {@link AdicionarGerente#initialize(AbstractGoogleClientRequest)} must be called
         * to initialize this instance immediately after invoking the constructor. </p>
         *
         * @param content the {@link com.google.api.services.hefesoftpharmacy.model.GerenteRegional}
         * @since 1.13
         */
        protected AdicionarGerente(com.google.api.services.hefesoftpharmacy.model.GerenteRegional content) {
          super(Hefesoftpharmacy.this, "POST", REST_PATH, content, com.google.api.services.hefesoftpharmacy.model.GerenteRegional.class);
        }

        @Override
        public AdicionarGerente setAlt(String alt) {
          return (AdicionarGerente) super.setAlt(alt);
        }

        @Override
        public AdicionarGerente setFields(String fields) {
          return (AdicionarGerente) super.setFields(fields);
        }

        @Override
        public AdicionarGerente setKey(String key) {
          return (AdicionarGerente) super.setKey(key);
        }

        @Override
        public AdicionarGerente setOauthToken(String oauthToken) {
          return (AdicionarGerente) super.setOauthToken(oauthToken);
        }

        @Override
        public AdicionarGerente setPrettyPrint(Boolean prettyPrint) {
          return (AdicionarGerente) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public AdicionarGerente setQuotaUser(String quotaUser) {
          return (AdicionarGerente) super.setQuotaUser(quotaUser);
        }

        @Override
        public AdicionarGerente setUserIp(String userIp) {
          return (AdicionarGerente) super.setUserIp(userIp);
        }

      }
      /**
       * Create a request for the method "regional.eliminarGerente".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link EliminarGerente#execute()} method to invoke the remote
       * operation.
       *
       * @param id
       * @return the request
       */
      public EliminarGerente eliminarGerente(Long id) throws java.io.IOException {
        EliminarGerente result = new EliminarGerente(id);
        initialize(result);
        return result;
      }

      public class EliminarGerente extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.GerenteRegional> {

        private static final String REST_PATH = "gerenteregional/{id}";

        /**
         * Create a request for the method "regional.eliminarGerente".
         *
         * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
         * optional parameters, call the {@link EliminarGerente#execute()} method to invoke the remote
         * operation. <p> {@link EliminarGerente#initialize(AbstractGoogleClientRequest)} must be called
         * to initialize this instance immediately after invoking the constructor. </p>
         *
         * @param id
         * @since 1.13
         */
        protected EliminarGerente(Long id) {
          super(Hefesoftpharmacy.this, "DELETE", REST_PATH, null, com.google.api.services.hefesoftpharmacy.model.GerenteRegional.class);
          this.id = Preconditions.checkNotNull(id, "Required parameter id must be specified.");
        }

        @Override
        public EliminarGerente setAlt(String alt) {
          return (EliminarGerente) super.setAlt(alt);
        }

        @Override
        public EliminarGerente setFields(String fields) {
          return (EliminarGerente) super.setFields(fields);
        }

        @Override
        public EliminarGerente setKey(String key) {
          return (EliminarGerente) super.setKey(key);
        }

        @Override
        public EliminarGerente setOauthToken(String oauthToken) {
          return (EliminarGerente) super.setOauthToken(oauthToken);
        }

        @Override
        public EliminarGerente setPrettyPrint(Boolean prettyPrint) {
          return (EliminarGerente) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public EliminarGerente setQuotaUser(String quotaUser) {
          return (EliminarGerente) super.setQuotaUser(quotaUser);
        }

        @Override
        public EliminarGerente setUserIp(String userIp) {
          return (EliminarGerente) super.setUserIp(userIp);
        }

        @com.google.api.client.util.Key
        private Long id;

        /**

         */
        public Long getId() {
          return id;
        }

        public EliminarGerente setId(Long id) {
          this.id = id;
          return this;
        }

      }
      /**
       * Create a request for the method "regional.listarGerentes".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link ListarGerentes#execute()} method to invoke the remote
       * operation.
       *
       * @return the request
       */
      public ListarGerentes listarGerentes() throws java.io.IOException {
        ListarGerentes result = new ListarGerentes();
        initialize(result);
        return result;
      }

      public class ListarGerentes extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.CollectionResponseGerenteRegional> {

        private static final String REST_PATH = "gerenteregional";

        /**
         * Create a request for the method "regional.listarGerentes".
         *
         * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
         * optional parameters, call the {@link ListarGerentes#execute()} method to invoke the remote
         * operation. <p> {@link ListarGerentes#initialize(AbstractGoogleClientRequest)} must be called to
         * initialize this instance immediately after invoking the constructor. </p>
         *
         * @since 1.13
         */
        protected ListarGerentes() {
          super(Hefesoftpharmacy.this, "GET", REST_PATH, null, com.google.api.services.hefesoftpharmacy.model.CollectionResponseGerenteRegional.class);
        }

        @Override
        public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
          return super.executeUsingHead();
        }

        @Override
        public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
          return super.buildHttpRequestUsingHead();
        }

        @Override
        public ListarGerentes setAlt(String alt) {
          return (ListarGerentes) super.setAlt(alt);
        }

        @Override
        public ListarGerentes setFields(String fields) {
          return (ListarGerentes) super.setFields(fields);
        }

        @Override
        public ListarGerentes setKey(String key) {
          return (ListarGerentes) super.setKey(key);
        }

        @Override
        public ListarGerentes setOauthToken(String oauthToken) {
          return (ListarGerentes) super.setOauthToken(oauthToken);
        }

        @Override
        public ListarGerentes setPrettyPrint(Boolean prettyPrint) {
          return (ListarGerentes) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public ListarGerentes setQuotaUser(String quotaUser) {
          return (ListarGerentes) super.setQuotaUser(quotaUser);
        }

        @Override
        public ListarGerentes setUserIp(String userIp) {
          return (ListarGerentes) super.setUserIp(userIp);
        }

        @com.google.api.client.util.Key
        private String cursor;

        /**

         */
        public String getCursor() {
          return cursor;
        }

        public ListarGerentes setCursor(String cursor) {
          this.cursor = cursor;
          return this;
        }

        @com.google.api.client.util.Key
        private Integer limit;

        /**

         */
        public Integer getLimit() {
          return limit;
        }

        public ListarGerentes setLimit(Integer limit) {
          this.limit = limit;
          return this;
        }

        @com.google.api.client.util.Key
        private Boolean dependencias;

        /**

         */
        public Boolean getDependencias() {
          return dependencias;
        }

        public ListarGerentes setDependencias(Boolean dependencias) {
          this.dependencias = dependencias;
          return this;
        }

      }
      /**
       * Create a request for the method "regional.obtenerGerentePorId".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link ObtenerGerentePorId#execute()} method to invoke the remote
       * operation.
       *
       * @param id
       * @return the request
       */
      public ObtenerGerentePorId obtenerGerentePorId(Long id) throws java.io.IOException {
        ObtenerGerentePorId result = new ObtenerGerentePorId(id);
        initialize(result);
        return result;
      }

      public class ObtenerGerentePorId extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.GerenteRegional> {

        private static final String REST_PATH = "gerenteregional/{id}";

        /**
         * Create a request for the method "regional.obtenerGerentePorId".
         *
         * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
         * optional parameters, call the {@link ObtenerGerentePorId#execute()} method to invoke the remote
         * operation. <p> {@link ObtenerGerentePorId#initialize(AbstractGoogleClientRequest)} must be
         * called to initialize this instance immediately after invoking the constructor. </p>
         *
         * @param id
         * @since 1.13
         */
        protected ObtenerGerentePorId(Long id) {
          super(Hefesoftpharmacy.this, "GET", REST_PATH, null, com.google.api.services.hefesoftpharmacy.model.GerenteRegional.class);
          this.id = Preconditions.checkNotNull(id, "Required parameter id must be specified.");
        }

        @Override
        public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
          return super.executeUsingHead();
        }

        @Override
        public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
          return super.buildHttpRequestUsingHead();
        }

        @Override
        public ObtenerGerentePorId setAlt(String alt) {
          return (ObtenerGerentePorId) super.setAlt(alt);
        }

        @Override
        public ObtenerGerentePorId setFields(String fields) {
          return (ObtenerGerentePorId) super.setFields(fields);
        }

        @Override
        public ObtenerGerentePorId setKey(String key) {
          return (ObtenerGerentePorId) super.setKey(key);
        }

        @Override
        public ObtenerGerentePorId setOauthToken(String oauthToken) {
          return (ObtenerGerentePorId) super.setOauthToken(oauthToken);
        }

        @Override
        public ObtenerGerentePorId setPrettyPrint(Boolean prettyPrint) {
          return (ObtenerGerentePorId) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public ObtenerGerentePorId setQuotaUser(String quotaUser) {
          return (ObtenerGerentePorId) super.setQuotaUser(quotaUser);
        }

        @Override
        public ObtenerGerentePorId setUserIp(String userIp) {
          return (ObtenerGerentePorId) super.setUserIp(userIp);
        }

        @com.google.api.client.util.Key
        private Long id;

        /**

         */
        public Long getId() {
          return id;
        }

        public ObtenerGerentePorId setId(Long id) {
          this.id = id;
          return this;
        }

        @com.google.api.client.util.Key
        private Boolean dependencias;

        /**

         */
        public Boolean getDependencias() {
          return dependencias;
        }

        public ObtenerGerentePorId setDependencias(Boolean dependencias) {
          this.dependencias = dependencias;
          return this;
        }

      }

    }
  }

  /**
   * An accessor for creating requests from the Linea collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code Hefesoftpharmacy hefesoftpharmacy = new Hefesoftpharmacy(...);}
   *   {@code Hefesoftpharmacy.Linea.List request = hefesoftpharmacy.linea().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Linea linea() {
    return new Linea();
  }

  /**
   * The "linea" collection of methods.
   */
  public class Linea {

    /**
     * Create a request for the method "linea.actualizarLinea".
     *
     * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
     * optional parameters, call the {@link ActualizarLinea#execute()} method to invoke the remote
     * operation.
     *
     * @param content the {@link com.google.api.services.hefesoftpharmacy.model.Linea}
     * @return the request
     */
    public ActualizarLinea actualizarLinea(com.google.api.services.hefesoftpharmacy.model.Linea content) throws java.io.IOException {
      ActualizarLinea result = new ActualizarLinea(content);
      initialize(result);
      return result;
    }

    public class ActualizarLinea extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.Linea> {

      private static final String REST_PATH = "linea";

      /**
       * Create a request for the method "linea.actualizarLinea".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link ActualizarLinea#execute()} method to invoke the remote
       * operation. <p> {@link ActualizarLinea#initialize(AbstractGoogleClientRequest)} must be called
       * to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param content the {@link com.google.api.services.hefesoftpharmacy.model.Linea}
       * @since 1.13
       */
      protected ActualizarLinea(com.google.api.services.hefesoftpharmacy.model.Linea content) {
        super(Hefesoftpharmacy.this, "PUT", REST_PATH, content, com.google.api.services.hefesoftpharmacy.model.Linea.class);
      }

      @Override
      public ActualizarLinea setAlt(String alt) {
        return (ActualizarLinea) super.setAlt(alt);
      }

      @Override
      public ActualizarLinea setFields(String fields) {
        return (ActualizarLinea) super.setFields(fields);
      }

      @Override
      public ActualizarLinea setKey(String key) {
        return (ActualizarLinea) super.setKey(key);
      }

      @Override
      public ActualizarLinea setOauthToken(String oauthToken) {
        return (ActualizarLinea) super.setOauthToken(oauthToken);
      }

      @Override
      public ActualizarLinea setPrettyPrint(Boolean prettyPrint) {
        return (ActualizarLinea) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public ActualizarLinea setQuotaUser(String quotaUser) {
        return (ActualizarLinea) super.setQuotaUser(quotaUser);
      }

      @Override
      public ActualizarLinea setUserIp(String userIp) {
        return (ActualizarLinea) super.setUserIp(userIp);
      }

    }
    /**
     * Create a request for the method "linea.adicionarLinea".
     *
     * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
     * optional parameters, call the {@link AdicionarLinea#execute()} method to invoke the remote
     * operation.
     *
     * @param content the {@link com.google.api.services.hefesoftpharmacy.model.Linea}
     * @return the request
     */
    public AdicionarLinea adicionarLinea(com.google.api.services.hefesoftpharmacy.model.Linea content) throws java.io.IOException {
      AdicionarLinea result = new AdicionarLinea(content);
      initialize(result);
      return result;
    }

    public class AdicionarLinea extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.Linea> {

      private static final String REST_PATH = "linea";

      /**
       * Create a request for the method "linea.adicionarLinea".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link AdicionarLinea#execute()} method to invoke the remote
       * operation. <p> {@link AdicionarLinea#initialize(AbstractGoogleClientRequest)} must be called to
       * initialize this instance immediately after invoking the constructor. </p>
       *
       * @param content the {@link com.google.api.services.hefesoftpharmacy.model.Linea}
       * @since 1.13
       */
      protected AdicionarLinea(com.google.api.services.hefesoftpharmacy.model.Linea content) {
        super(Hefesoftpharmacy.this, "POST", REST_PATH, content, com.google.api.services.hefesoftpharmacy.model.Linea.class);
      }

      @Override
      public AdicionarLinea setAlt(String alt) {
        return (AdicionarLinea) super.setAlt(alt);
      }

      @Override
      public AdicionarLinea setFields(String fields) {
        return (AdicionarLinea) super.setFields(fields);
      }

      @Override
      public AdicionarLinea setKey(String key) {
        return (AdicionarLinea) super.setKey(key);
      }

      @Override
      public AdicionarLinea setOauthToken(String oauthToken) {
        return (AdicionarLinea) super.setOauthToken(oauthToken);
      }

      @Override
      public AdicionarLinea setPrettyPrint(Boolean prettyPrint) {
        return (AdicionarLinea) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public AdicionarLinea setQuotaUser(String quotaUser) {
        return (AdicionarLinea) super.setQuotaUser(quotaUser);
      }

      @Override
      public AdicionarLinea setUserIp(String userIp) {
        return (AdicionarLinea) super.setUserIp(userIp);
      }

    }
    /**
     * Create a request for the method "linea.eliminarLinea".
     *
     * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
     * optional parameters, call the {@link EliminarLinea#execute()} method to invoke the remote
     * operation.
     *
     * @param id
     * @return the request
     */
    public EliminarLinea eliminarLinea(Long id) throws java.io.IOException {
      EliminarLinea result = new EliminarLinea(id);
      initialize(result);
      return result;
    }

    public class EliminarLinea extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.Linea> {

      private static final String REST_PATH = "linea/{id}";

      /**
       * Create a request for the method "linea.eliminarLinea".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link EliminarLinea#execute()} method to invoke the remote
       * operation. <p> {@link EliminarLinea#initialize(AbstractGoogleClientRequest)} must be called to
       * initialize this instance immediately after invoking the constructor. </p>
       *
       * @param id
       * @since 1.13
       */
      protected EliminarLinea(Long id) {
        super(Hefesoftpharmacy.this, "DELETE", REST_PATH, null, com.google.api.services.hefesoftpharmacy.model.Linea.class);
        this.id = Preconditions.checkNotNull(id, "Required parameter id must be specified.");
      }

      @Override
      public EliminarLinea setAlt(String alt) {
        return (EliminarLinea) super.setAlt(alt);
      }

      @Override
      public EliminarLinea setFields(String fields) {
        return (EliminarLinea) super.setFields(fields);
      }

      @Override
      public EliminarLinea setKey(String key) {
        return (EliminarLinea) super.setKey(key);
      }

      @Override
      public EliminarLinea setOauthToken(String oauthToken) {
        return (EliminarLinea) super.setOauthToken(oauthToken);
      }

      @Override
      public EliminarLinea setPrettyPrint(Boolean prettyPrint) {
        return (EliminarLinea) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public EliminarLinea setQuotaUser(String quotaUser) {
        return (EliminarLinea) super.setQuotaUser(quotaUser);
      }

      @Override
      public EliminarLinea setUserIp(String userIp) {
        return (EliminarLinea) super.setUserIp(userIp);
      }

      @com.google.api.client.util.Key
      private Long id;

      /**

       */
      public Long getId() {
        return id;
      }

      public EliminarLinea setId(Long id) {
        this.id = id;
        return this;
      }

    }
    /**
     * Create a request for the method "linea.listarLineas".
     *
     * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
     * optional parameters, call the {@link ListarLineas#execute()} method to invoke the remote
     * operation.
     *
     * @return the request
     */
    public ListarLineas listarLineas() throws java.io.IOException {
      ListarLineas result = new ListarLineas();
      initialize(result);
      return result;
    }

    public class ListarLineas extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.CollectionResponseLinea> {

      private static final String REST_PATH = "linea";

      /**
       * Create a request for the method "linea.listarLineas".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link ListarLineas#execute()} method to invoke the remote
       * operation. <p> {@link ListarLineas#initialize(AbstractGoogleClientRequest)} must be called to
       * initialize this instance immediately after invoking the constructor. </p>
       *
       * @since 1.13
       */
      protected ListarLineas() {
        super(Hefesoftpharmacy.this, "GET", REST_PATH, null, com.google.api.services.hefesoftpharmacy.model.CollectionResponseLinea.class);
      }

      @Override
      public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
        return super.executeUsingHead();
      }

      @Override
      public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
        return super.buildHttpRequestUsingHead();
      }

      @Override
      public ListarLineas setAlt(String alt) {
        return (ListarLineas) super.setAlt(alt);
      }

      @Override
      public ListarLineas setFields(String fields) {
        return (ListarLineas) super.setFields(fields);
      }

      @Override
      public ListarLineas setKey(String key) {
        return (ListarLineas) super.setKey(key);
      }

      @Override
      public ListarLineas setOauthToken(String oauthToken) {
        return (ListarLineas) super.setOauthToken(oauthToken);
      }

      @Override
      public ListarLineas setPrettyPrint(Boolean prettyPrint) {
        return (ListarLineas) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public ListarLineas setQuotaUser(String quotaUser) {
        return (ListarLineas) super.setQuotaUser(quotaUser);
      }

      @Override
      public ListarLineas setUserIp(String userIp) {
        return (ListarLineas) super.setUserIp(userIp);
      }

      @com.google.api.client.util.Key
      private String cursor;

      /**

       */
      public String getCursor() {
        return cursor;
      }

      public ListarLineas setCursor(String cursor) {
        this.cursor = cursor;
        return this;
      }

      @com.google.api.client.util.Key
      private Integer limit;

      /**

       */
      public Integer getLimit() {
        return limit;
      }

      public ListarLineas setLimit(Integer limit) {
        this.limit = limit;
        return this;
      }

    }
    /**
     * Create a request for the method "linea.obtenerLineaId".
     *
     * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
     * optional parameters, call the {@link ObtenerLineaId#execute()} method to invoke the remote
     * operation.
     *
     * @param id
     * @return the request
     */
    public ObtenerLineaId obtenerLineaId(Long id) throws java.io.IOException {
      ObtenerLineaId result = new ObtenerLineaId(id);
      initialize(result);
      return result;
    }

    public class ObtenerLineaId extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.Linea> {

      private static final String REST_PATH = "linea/{id}";

      /**
       * Create a request for the method "linea.obtenerLineaId".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link ObtenerLineaId#execute()} method to invoke the remote
       * operation. <p> {@link ObtenerLineaId#initialize(AbstractGoogleClientRequest)} must be called to
       * initialize this instance immediately after invoking the constructor. </p>
       *
       * @param id
       * @since 1.13
       */
      protected ObtenerLineaId(Long id) {
        super(Hefesoftpharmacy.this, "GET", REST_PATH, null, com.google.api.services.hefesoftpharmacy.model.Linea.class);
        this.id = Preconditions.checkNotNull(id, "Required parameter id must be specified.");
      }

      @Override
      public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
        return super.executeUsingHead();
      }

      @Override
      public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
        return super.buildHttpRequestUsingHead();
      }

      @Override
      public ObtenerLineaId setAlt(String alt) {
        return (ObtenerLineaId) super.setAlt(alt);
      }

      @Override
      public ObtenerLineaId setFields(String fields) {
        return (ObtenerLineaId) super.setFields(fields);
      }

      @Override
      public ObtenerLineaId setKey(String key) {
        return (ObtenerLineaId) super.setKey(key);
      }

      @Override
      public ObtenerLineaId setOauthToken(String oauthToken) {
        return (ObtenerLineaId) super.setOauthToken(oauthToken);
      }

      @Override
      public ObtenerLineaId setPrettyPrint(Boolean prettyPrint) {
        return (ObtenerLineaId) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public ObtenerLineaId setQuotaUser(String quotaUser) {
        return (ObtenerLineaId) super.setQuotaUser(quotaUser);
      }

      @Override
      public ObtenerLineaId setUserIp(String userIp) {
        return (ObtenerLineaId) super.setUserIp(userIp);
      }

      @com.google.api.client.util.Key
      private Long id;

      /**

       */
      public Long getId() {
        return id;
      }

      public ObtenerLineaId setId(Long id) {
        this.id = id;
        return this;
      }

    }

  }

  /**
   * An accessor for creating requests from the Medicos collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code Hefesoftpharmacy hefesoftpharmacy = new Hefesoftpharmacy(...);}
   *   {@code Hefesoftpharmacy.Medicos.List request = hefesoftpharmacy.medicos().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Medicos medicos() {
    return new Medicos();
  }

  /**
   * The "medicos" collection of methods.
   */
  public class Medicos {

    /**
     * Create a request for the method "medicos.actualizarMedico".
     *
     * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
     * optional parameters, call the {@link ActualizarMedico#execute()} method to invoke the remote
     * operation.
     *
     * @param content the {@link com.google.api.services.hefesoftpharmacy.model.Medicos}
     * @return the request
     */
    public ActualizarMedico actualizarMedico(com.google.api.services.hefesoftpharmacy.model.Medicos content) throws java.io.IOException {
      ActualizarMedico result = new ActualizarMedico(content);
      initialize(result);
      return result;
    }

    public class ActualizarMedico extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.Medicos> {

      private static final String REST_PATH = "medicos";

      /**
       * Create a request for the method "medicos.actualizarMedico".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link ActualizarMedico#execute()} method to invoke the remote
       * operation. <p> {@link ActualizarMedico#initialize(AbstractGoogleClientRequest)} must be called
       * to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param content the {@link com.google.api.services.hefesoftpharmacy.model.Medicos}
       * @since 1.13
       */
      protected ActualizarMedico(com.google.api.services.hefesoftpharmacy.model.Medicos content) {
        super(Hefesoftpharmacy.this, "PUT", REST_PATH, content, com.google.api.services.hefesoftpharmacy.model.Medicos.class);
      }

      @Override
      public ActualizarMedico setAlt(String alt) {
        return (ActualizarMedico) super.setAlt(alt);
      }

      @Override
      public ActualizarMedico setFields(String fields) {
        return (ActualizarMedico) super.setFields(fields);
      }

      @Override
      public ActualizarMedico setKey(String key) {
        return (ActualizarMedico) super.setKey(key);
      }

      @Override
      public ActualizarMedico setOauthToken(String oauthToken) {
        return (ActualizarMedico) super.setOauthToken(oauthToken);
      }

      @Override
      public ActualizarMedico setPrettyPrint(Boolean prettyPrint) {
        return (ActualizarMedico) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public ActualizarMedico setQuotaUser(String quotaUser) {
        return (ActualizarMedico) super.setQuotaUser(quotaUser);
      }

      @Override
      public ActualizarMedico setUserIp(String userIp) {
        return (ActualizarMedico) super.setUserIp(userIp);
      }

    }
    /**
     * Create a request for the method "medicos.adicionarMedico".
     *
     * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
     * optional parameters, call the {@link AdicionarMedico#execute()} method to invoke the remote
     * operation.
     *
     * @param content the {@link com.google.api.services.hefesoftpharmacy.model.Medicos}
     * @return the request
     */
    public AdicionarMedico adicionarMedico(com.google.api.services.hefesoftpharmacy.model.Medicos content) throws java.io.IOException {
      AdicionarMedico result = new AdicionarMedico(content);
      initialize(result);
      return result;
    }

    public class AdicionarMedico extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.Medicos> {

      private static final String REST_PATH = "medicos";

      /**
       * Create a request for the method "medicos.adicionarMedico".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link AdicionarMedico#execute()} method to invoke the remote
       * operation. <p> {@link AdicionarMedico#initialize(AbstractGoogleClientRequest)} must be called
       * to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param content the {@link com.google.api.services.hefesoftpharmacy.model.Medicos}
       * @since 1.13
       */
      protected AdicionarMedico(com.google.api.services.hefesoftpharmacy.model.Medicos content) {
        super(Hefesoftpharmacy.this, "POST", REST_PATH, content, com.google.api.services.hefesoftpharmacy.model.Medicos.class);
      }

      @Override
      public AdicionarMedico setAlt(String alt) {
        return (AdicionarMedico) super.setAlt(alt);
      }

      @Override
      public AdicionarMedico setFields(String fields) {
        return (AdicionarMedico) super.setFields(fields);
      }

      @Override
      public AdicionarMedico setKey(String key) {
        return (AdicionarMedico) super.setKey(key);
      }

      @Override
      public AdicionarMedico setOauthToken(String oauthToken) {
        return (AdicionarMedico) super.setOauthToken(oauthToken);
      }

      @Override
      public AdicionarMedico setPrettyPrint(Boolean prettyPrint) {
        return (AdicionarMedico) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public AdicionarMedico setQuotaUser(String quotaUser) {
        return (AdicionarMedico) super.setQuotaUser(quotaUser);
      }

      @Override
      public AdicionarMedico setUserIp(String userIp) {
        return (AdicionarMedico) super.setUserIp(userIp);
      }

    }
    /**
     * Create a request for the method "medicos.eliminarMedico".
     *
     * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
     * optional parameters, call the {@link EliminarMedico#execute()} method to invoke the remote
     * operation.
     *
     * @param id
     * @return the request
     */
    public EliminarMedico eliminarMedico(Long id) throws java.io.IOException {
      EliminarMedico result = new EliminarMedico(id);
      initialize(result);
      return result;
    }

    public class EliminarMedico extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.Medicos> {

      private static final String REST_PATH = "medicos/{id}";

      /**
       * Create a request for the method "medicos.eliminarMedico".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link EliminarMedico#execute()} method to invoke the remote
       * operation. <p> {@link EliminarMedico#initialize(AbstractGoogleClientRequest)} must be called to
       * initialize this instance immediately after invoking the constructor. </p>
       *
       * @param id
       * @since 1.13
       */
      protected EliminarMedico(Long id) {
        super(Hefesoftpharmacy.this, "DELETE", REST_PATH, null, com.google.api.services.hefesoftpharmacy.model.Medicos.class);
        this.id = Preconditions.checkNotNull(id, "Required parameter id must be specified.");
      }

      @Override
      public EliminarMedico setAlt(String alt) {
        return (EliminarMedico) super.setAlt(alt);
      }

      @Override
      public EliminarMedico setFields(String fields) {
        return (EliminarMedico) super.setFields(fields);
      }

      @Override
      public EliminarMedico setKey(String key) {
        return (EliminarMedico) super.setKey(key);
      }

      @Override
      public EliminarMedico setOauthToken(String oauthToken) {
        return (EliminarMedico) super.setOauthToken(oauthToken);
      }

      @Override
      public EliminarMedico setPrettyPrint(Boolean prettyPrint) {
        return (EliminarMedico) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public EliminarMedico setQuotaUser(String quotaUser) {
        return (EliminarMedico) super.setQuotaUser(quotaUser);
      }

      @Override
      public EliminarMedico setUserIp(String userIp) {
        return (EliminarMedico) super.setUserIp(userIp);
      }

      @com.google.api.client.util.Key
      private Long id;

      /**

       */
      public Long getId() {
        return id;
      }

      public EliminarMedico setId(Long id) {
        this.id = id;
        return this;
      }

    }
    /**
     * Create a request for the method "medicos.listarMedicos".
     *
     * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
     * optional parameters, call the {@link ListarMedicos#execute()} method to invoke the remote
     * operation.
     *
     * @return the request
     */
    public ListarMedicos listarMedicos() throws java.io.IOException {
      ListarMedicos result = new ListarMedicos();
      initialize(result);
      return result;
    }

    public class ListarMedicos extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.MedicosCollection> {

      private static final String REST_PATH = "medicos";

      /**
       * Create a request for the method "medicos.listarMedicos".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link ListarMedicos#execute()} method to invoke the remote
       * operation. <p> {@link ListarMedicos#initialize(AbstractGoogleClientRequest)} must be called to
       * initialize this instance immediately after invoking the constructor. </p>
       *
       * @since 1.13
       */
      protected ListarMedicos() {
        super(Hefesoftpharmacy.this, "GET", REST_PATH, null, com.google.api.services.hefesoftpharmacy.model.MedicosCollection.class);
      }

      @Override
      public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
        return super.executeUsingHead();
      }

      @Override
      public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
        return super.buildHttpRequestUsingHead();
      }

      @Override
      public ListarMedicos setAlt(String alt) {
        return (ListarMedicos) super.setAlt(alt);
      }

      @Override
      public ListarMedicos setFields(String fields) {
        return (ListarMedicos) super.setFields(fields);
      }

      @Override
      public ListarMedicos setKey(String key) {
        return (ListarMedicos) super.setKey(key);
      }

      @Override
      public ListarMedicos setOauthToken(String oauthToken) {
        return (ListarMedicos) super.setOauthToken(oauthToken);
      }

      @Override
      public ListarMedicos setPrettyPrint(Boolean prettyPrint) {
        return (ListarMedicos) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public ListarMedicos setQuotaUser(String quotaUser) {
        return (ListarMedicos) super.setQuotaUser(quotaUser);
      }

      @Override
      public ListarMedicos setUserIp(String userIp) {
        return (ListarMedicos) super.setUserIp(userIp);
      }

    }
    /**
     * Create a request for the method "medicos.obtenerMedicoPorId".
     *
     * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
     * optional parameters, call the {@link ObtenerMedicoPorId#execute()} method to invoke the remote
     * operation.
     *
     * @param id
     * @return the request
     */
    public ObtenerMedicoPorId obtenerMedicoPorId(Long id) throws java.io.IOException {
      ObtenerMedicoPorId result = new ObtenerMedicoPorId(id);
      initialize(result);
      return result;
    }

    public class ObtenerMedicoPorId extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.Medicos> {

      private static final String REST_PATH = "medicos/{id}";

      /**
       * Create a request for the method "medicos.obtenerMedicoPorId".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link ObtenerMedicoPorId#execute()} method to invoke the remote
       * operation. <p> {@link ObtenerMedicoPorId#initialize(AbstractGoogleClientRequest)} must be
       * called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param id
       * @since 1.13
       */
      protected ObtenerMedicoPorId(Long id) {
        super(Hefesoftpharmacy.this, "GET", REST_PATH, null, com.google.api.services.hefesoftpharmacy.model.Medicos.class);
        this.id = Preconditions.checkNotNull(id, "Required parameter id must be specified.");
      }

      @Override
      public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
        return super.executeUsingHead();
      }

      @Override
      public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
        return super.buildHttpRequestUsingHead();
      }

      @Override
      public ObtenerMedicoPorId setAlt(String alt) {
        return (ObtenerMedicoPorId) super.setAlt(alt);
      }

      @Override
      public ObtenerMedicoPorId setFields(String fields) {
        return (ObtenerMedicoPorId) super.setFields(fields);
      }

      @Override
      public ObtenerMedicoPorId setKey(String key) {
        return (ObtenerMedicoPorId) super.setKey(key);
      }

      @Override
      public ObtenerMedicoPorId setOauthToken(String oauthToken) {
        return (ObtenerMedicoPorId) super.setOauthToken(oauthToken);
      }

      @Override
      public ObtenerMedicoPorId setPrettyPrint(Boolean prettyPrint) {
        return (ObtenerMedicoPorId) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public ObtenerMedicoPorId setQuotaUser(String quotaUser) {
        return (ObtenerMedicoPorId) super.setQuotaUser(quotaUser);
      }

      @Override
      public ObtenerMedicoPorId setUserIp(String userIp) {
        return (ObtenerMedicoPorId) super.setUserIp(userIp);
      }

      @com.google.api.client.util.Key
      private Long id;

      /**

       */
      public Long getId() {
        return id;
      }

      public ObtenerMedicoPorId setId(Long id) {
        this.id = id;
        return this;
      }

    }

  }

  /**
   * An accessor for creating requests from the Pais collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code Hefesoftpharmacy hefesoftpharmacy = new Hefesoftpharmacy(...);}
   *   {@code Hefesoftpharmacy.Pais.List request = hefesoftpharmacy.pais().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Pais pais() {
    return new Pais();
  }

  /**
   * The "pais" collection of methods.
   */
  public class Pais {

    /**
     * Create a request for the method "pais.actualizarPais".
     *
     * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
     * optional parameters, call the {@link ActualizarPais#execute()} method to invoke the remote
     * operation.
     *
     * @param content the {@link com.google.api.services.hefesoftpharmacy.model.Pais}
     * @return the request
     */
    public ActualizarPais actualizarPais(com.google.api.services.hefesoftpharmacy.model.Pais content) throws java.io.IOException {
      ActualizarPais result = new ActualizarPais(content);
      initialize(result);
      return result;
    }

    public class ActualizarPais extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.Pais> {

      private static final String REST_PATH = "pais";

      /**
       * Create a request for the method "pais.actualizarPais".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link ActualizarPais#execute()} method to invoke the remote
       * operation. <p> {@link ActualizarPais#initialize(AbstractGoogleClientRequest)} must be called to
       * initialize this instance immediately after invoking the constructor. </p>
       *
       * @param content the {@link com.google.api.services.hefesoftpharmacy.model.Pais}
       * @since 1.13
       */
      protected ActualizarPais(com.google.api.services.hefesoftpharmacy.model.Pais content) {
        super(Hefesoftpharmacy.this, "PUT", REST_PATH, content, com.google.api.services.hefesoftpharmacy.model.Pais.class);
      }

      @Override
      public ActualizarPais setAlt(String alt) {
        return (ActualizarPais) super.setAlt(alt);
      }

      @Override
      public ActualizarPais setFields(String fields) {
        return (ActualizarPais) super.setFields(fields);
      }

      @Override
      public ActualizarPais setKey(String key) {
        return (ActualizarPais) super.setKey(key);
      }

      @Override
      public ActualizarPais setOauthToken(String oauthToken) {
        return (ActualizarPais) super.setOauthToken(oauthToken);
      }

      @Override
      public ActualizarPais setPrettyPrint(Boolean prettyPrint) {
        return (ActualizarPais) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public ActualizarPais setQuotaUser(String quotaUser) {
        return (ActualizarPais) super.setQuotaUser(quotaUser);
      }

      @Override
      public ActualizarPais setUserIp(String userIp) {
        return (ActualizarPais) super.setUserIp(userIp);
      }

    }
    /**
     * Create a request for the method "pais.adicionarPais".
     *
     * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
     * optional parameters, call the {@link AdicionarPais#execute()} method to invoke the remote
     * operation.
     *
     * @param content the {@link com.google.api.services.hefesoftpharmacy.model.Pais}
     * @return the request
     */
    public AdicionarPais adicionarPais(com.google.api.services.hefesoftpharmacy.model.Pais content) throws java.io.IOException {
      AdicionarPais result = new AdicionarPais(content);
      initialize(result);
      return result;
    }

    public class AdicionarPais extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.Pais> {

      private static final String REST_PATH = "pais";

      /**
       * Create a request for the method "pais.adicionarPais".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link AdicionarPais#execute()} method to invoke the remote
       * operation. <p> {@link AdicionarPais#initialize(AbstractGoogleClientRequest)} must be called to
       * initialize this instance immediately after invoking the constructor. </p>
       *
       * @param content the {@link com.google.api.services.hefesoftpharmacy.model.Pais}
       * @since 1.13
       */
      protected AdicionarPais(com.google.api.services.hefesoftpharmacy.model.Pais content) {
        super(Hefesoftpharmacy.this, "POST", REST_PATH, content, com.google.api.services.hefesoftpharmacy.model.Pais.class);
      }

      @Override
      public AdicionarPais setAlt(String alt) {
        return (AdicionarPais) super.setAlt(alt);
      }

      @Override
      public AdicionarPais setFields(String fields) {
        return (AdicionarPais) super.setFields(fields);
      }

      @Override
      public AdicionarPais setKey(String key) {
        return (AdicionarPais) super.setKey(key);
      }

      @Override
      public AdicionarPais setOauthToken(String oauthToken) {
        return (AdicionarPais) super.setOauthToken(oauthToken);
      }

      @Override
      public AdicionarPais setPrettyPrint(Boolean prettyPrint) {
        return (AdicionarPais) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public AdicionarPais setQuotaUser(String quotaUser) {
        return (AdicionarPais) super.setQuotaUser(quotaUser);
      }

      @Override
      public AdicionarPais setUserIp(String userIp) {
        return (AdicionarPais) super.setUserIp(userIp);
      }

    }
    /**
     * Create a request for the method "pais.eliminarPais".
     *
     * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
     * optional parameters, call the {@link EliminarPais#execute()} method to invoke the remote
     * operation.
     *
     * @param id
     * @return the request
     */
    public EliminarPais eliminarPais(Long id) throws java.io.IOException {
      EliminarPais result = new EliminarPais(id);
      initialize(result);
      return result;
    }

    public class EliminarPais extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.Pais> {

      private static final String REST_PATH = "pais/{id}";

      /**
       * Create a request for the method "pais.eliminarPais".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link EliminarPais#execute()} method to invoke the remote
       * operation. <p> {@link EliminarPais#initialize(AbstractGoogleClientRequest)} must be called to
       * initialize this instance immediately after invoking the constructor. </p>
       *
       * @param id
       * @since 1.13
       */
      protected EliminarPais(Long id) {
        super(Hefesoftpharmacy.this, "DELETE", REST_PATH, null, com.google.api.services.hefesoftpharmacy.model.Pais.class);
        this.id = Preconditions.checkNotNull(id, "Required parameter id must be specified.");
      }

      @Override
      public EliminarPais setAlt(String alt) {
        return (EliminarPais) super.setAlt(alt);
      }

      @Override
      public EliminarPais setFields(String fields) {
        return (EliminarPais) super.setFields(fields);
      }

      @Override
      public EliminarPais setKey(String key) {
        return (EliminarPais) super.setKey(key);
      }

      @Override
      public EliminarPais setOauthToken(String oauthToken) {
        return (EliminarPais) super.setOauthToken(oauthToken);
      }

      @Override
      public EliminarPais setPrettyPrint(Boolean prettyPrint) {
        return (EliminarPais) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public EliminarPais setQuotaUser(String quotaUser) {
        return (EliminarPais) super.setQuotaUser(quotaUser);
      }

      @Override
      public EliminarPais setUserIp(String userIp) {
        return (EliminarPais) super.setUserIp(userIp);
      }

      @com.google.api.client.util.Key
      private Long id;

      /**

       */
      public Long getId() {
        return id;
      }

      public EliminarPais setId(Long id) {
        this.id = id;
        return this;
      }

    }
    /**
     * Create a request for the method "pais.listarPais".
     *
     * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
     * optional parameters, call the {@link ListarPais#execute()} method to invoke the remote operation.
     *
     * @return the request
     */
    public ListarPais listarPais() throws java.io.IOException {
      ListarPais result = new ListarPais();
      initialize(result);
      return result;
    }

    public class ListarPais extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.CollectionResponsePais> {

      private static final String REST_PATH = "pais";

      /**
       * Create a request for the method "pais.listarPais".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link ListarPais#execute()} method to invoke the remote
       * operation. <p> {@link ListarPais#initialize(AbstractGoogleClientRequest)} must be called to
       * initialize this instance immediately after invoking the constructor. </p>
       *
       * @since 1.13
       */
      protected ListarPais() {
        super(Hefesoftpharmacy.this, "GET", REST_PATH, null, com.google.api.services.hefesoftpharmacy.model.CollectionResponsePais.class);
      }

      @Override
      public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
        return super.executeUsingHead();
      }

      @Override
      public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
        return super.buildHttpRequestUsingHead();
      }

      @Override
      public ListarPais setAlt(String alt) {
        return (ListarPais) super.setAlt(alt);
      }

      @Override
      public ListarPais setFields(String fields) {
        return (ListarPais) super.setFields(fields);
      }

      @Override
      public ListarPais setKey(String key) {
        return (ListarPais) super.setKey(key);
      }

      @Override
      public ListarPais setOauthToken(String oauthToken) {
        return (ListarPais) super.setOauthToken(oauthToken);
      }

      @Override
      public ListarPais setPrettyPrint(Boolean prettyPrint) {
        return (ListarPais) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public ListarPais setQuotaUser(String quotaUser) {
        return (ListarPais) super.setQuotaUser(quotaUser);
      }

      @Override
      public ListarPais setUserIp(String userIp) {
        return (ListarPais) super.setUserIp(userIp);
      }

      @com.google.api.client.util.Key
      private String cursor;

      /**

       */
      public String getCursor() {
        return cursor;
      }

      public ListarPais setCursor(String cursor) {
        this.cursor = cursor;
        return this;
      }

      @com.google.api.client.util.Key
      private Integer limit;

      /**

       */
      public Integer getLimit() {
        return limit;
      }

      public ListarPais setLimit(Integer limit) {
        this.limit = limit;
        return this;
      }

    }
    /**
     * Create a request for the method "pais.obtenerPaisId".
     *
     * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
     * optional parameters, call the {@link ObtenerPaisId#execute()} method to invoke the remote
     * operation.
     *
     * @param id
     * @return the request
     */
    public ObtenerPaisId obtenerPaisId(Long id) throws java.io.IOException {
      ObtenerPaisId result = new ObtenerPaisId(id);
      initialize(result);
      return result;
    }

    public class ObtenerPaisId extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.Pais> {

      private static final String REST_PATH = "pais/{id}";

      /**
       * Create a request for the method "pais.obtenerPaisId".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link ObtenerPaisId#execute()} method to invoke the remote
       * operation. <p> {@link ObtenerPaisId#initialize(AbstractGoogleClientRequest)} must be called to
       * initialize this instance immediately after invoking the constructor. </p>
       *
       * @param id
       * @since 1.13
       */
      protected ObtenerPaisId(Long id) {
        super(Hefesoftpharmacy.this, "GET", REST_PATH, null, com.google.api.services.hefesoftpharmacy.model.Pais.class);
        this.id = Preconditions.checkNotNull(id, "Required parameter id must be specified.");
      }

      @Override
      public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
        return super.executeUsingHead();
      }

      @Override
      public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
        return super.buildHttpRequestUsingHead();
      }

      @Override
      public ObtenerPaisId setAlt(String alt) {
        return (ObtenerPaisId) super.setAlt(alt);
      }

      @Override
      public ObtenerPaisId setFields(String fields) {
        return (ObtenerPaisId) super.setFields(fields);
      }

      @Override
      public ObtenerPaisId setKey(String key) {
        return (ObtenerPaisId) super.setKey(key);
      }

      @Override
      public ObtenerPaisId setOauthToken(String oauthToken) {
        return (ObtenerPaisId) super.setOauthToken(oauthToken);
      }

      @Override
      public ObtenerPaisId setPrettyPrint(Boolean prettyPrint) {
        return (ObtenerPaisId) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public ObtenerPaisId setQuotaUser(String quotaUser) {
        return (ObtenerPaisId) super.setQuotaUser(quotaUser);
      }

      @Override
      public ObtenerPaisId setUserIp(String userIp) {
        return (ObtenerPaisId) super.setUserIp(userIp);
      }

      @com.google.api.client.util.Key
      private Long id;

      /**

       */
      public Long getId() {
        return id;
      }

      public ObtenerPaisId setId(Long id) {
        this.id = id;
        return this;
      }

    }

  }

  /**
   * An accessor for creating requests from the Panel collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code Hefesoftpharmacy hefesoftpharmacy = new Hefesoftpharmacy(...);}
   *   {@code Hefesoftpharmacy.Panel.List request = hefesoftpharmacy.panel().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Panel panel() {
    return new Panel();
  }

  /**
   * The "panel" collection of methods.
   */
  public class Panel {

    /**
     * Create a request for the method "panel.actualizarPanel".
     *
     * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
     * optional parameters, call the {@link ActualizarPanel#execute()} method to invoke the remote
     * operation.
     *
     * @param content the {@link com.google.api.services.hefesoftpharmacy.model.Panel}
     * @return the request
     */
    public ActualizarPanel actualizarPanel(com.google.api.services.hefesoftpharmacy.model.Panel content) throws java.io.IOException {
      ActualizarPanel result = new ActualizarPanel(content);
      initialize(result);
      return result;
    }

    public class ActualizarPanel extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.Panel> {

      private static final String REST_PATH = "panel";

      /**
       * Create a request for the method "panel.actualizarPanel".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link ActualizarPanel#execute()} method to invoke the remote
       * operation. <p> {@link ActualizarPanel#initialize(AbstractGoogleClientRequest)} must be called
       * to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param content the {@link com.google.api.services.hefesoftpharmacy.model.Panel}
       * @since 1.13
       */
      protected ActualizarPanel(com.google.api.services.hefesoftpharmacy.model.Panel content) {
        super(Hefesoftpharmacy.this, "PUT", REST_PATH, content, com.google.api.services.hefesoftpharmacy.model.Panel.class);
      }

      @Override
      public ActualizarPanel setAlt(String alt) {
        return (ActualizarPanel) super.setAlt(alt);
      }

      @Override
      public ActualizarPanel setFields(String fields) {
        return (ActualizarPanel) super.setFields(fields);
      }

      @Override
      public ActualizarPanel setKey(String key) {
        return (ActualizarPanel) super.setKey(key);
      }

      @Override
      public ActualizarPanel setOauthToken(String oauthToken) {
        return (ActualizarPanel) super.setOauthToken(oauthToken);
      }

      @Override
      public ActualizarPanel setPrettyPrint(Boolean prettyPrint) {
        return (ActualizarPanel) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public ActualizarPanel setQuotaUser(String quotaUser) {
        return (ActualizarPanel) super.setQuotaUser(quotaUser);
      }

      @Override
      public ActualizarPanel setUserIp(String userIp) {
        return (ActualizarPanel) super.setUserIp(userIp);
      }

    }
    /**
     * Create a request for the method "panel.adicionarPanel".
     *
     * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
     * optional parameters, call the {@link AdicionarPanel#execute()} method to invoke the remote
     * operation.
     *
     * @param content the {@link com.google.api.services.hefesoftpharmacy.model.Panel}
     * @return the request
     */
    public AdicionarPanel adicionarPanel(com.google.api.services.hefesoftpharmacy.model.Panel content) throws java.io.IOException {
      AdicionarPanel result = new AdicionarPanel(content);
      initialize(result);
      return result;
    }

    public class AdicionarPanel extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.Panel> {

      private static final String REST_PATH = "panel";

      /**
       * Create a request for the method "panel.adicionarPanel".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link AdicionarPanel#execute()} method to invoke the remote
       * operation. <p> {@link AdicionarPanel#initialize(AbstractGoogleClientRequest)} must be called to
       * initialize this instance immediately after invoking the constructor. </p>
       *
       * @param content the {@link com.google.api.services.hefesoftpharmacy.model.Panel}
       * @since 1.13
       */
      protected AdicionarPanel(com.google.api.services.hefesoftpharmacy.model.Panel content) {
        super(Hefesoftpharmacy.this, "POST", REST_PATH, content, com.google.api.services.hefesoftpharmacy.model.Panel.class);
      }

      @Override
      public AdicionarPanel setAlt(String alt) {
        return (AdicionarPanel) super.setAlt(alt);
      }

      @Override
      public AdicionarPanel setFields(String fields) {
        return (AdicionarPanel) super.setFields(fields);
      }

      @Override
      public AdicionarPanel setKey(String key) {
        return (AdicionarPanel) super.setKey(key);
      }

      @Override
      public AdicionarPanel setOauthToken(String oauthToken) {
        return (AdicionarPanel) super.setOauthToken(oauthToken);
      }

      @Override
      public AdicionarPanel setPrettyPrint(Boolean prettyPrint) {
        return (AdicionarPanel) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public AdicionarPanel setQuotaUser(String quotaUser) {
        return (AdicionarPanel) super.setQuotaUser(quotaUser);
      }

      @Override
      public AdicionarPanel setUserIp(String userIp) {
        return (AdicionarPanel) super.setUserIp(userIp);
      }

    }
    /**
     * Create a request for the method "panel.eliminarPanel".
     *
     * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
     * optional parameters, call the {@link EliminarPanel#execute()} method to invoke the remote
     * operation.
     *
     * @param id
     * @return the request
     */
    public EliminarPanel eliminarPanel(Long id) throws java.io.IOException {
      EliminarPanel result = new EliminarPanel(id);
      initialize(result);
      return result;
    }

    public class EliminarPanel extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.Panel> {

      private static final String REST_PATH = "panel/{id}";

      /**
       * Create a request for the method "panel.eliminarPanel".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link EliminarPanel#execute()} method to invoke the remote
       * operation. <p> {@link EliminarPanel#initialize(AbstractGoogleClientRequest)} must be called to
       * initialize this instance immediately after invoking the constructor. </p>
       *
       * @param id
       * @since 1.13
       */
      protected EliminarPanel(Long id) {
        super(Hefesoftpharmacy.this, "DELETE", REST_PATH, null, com.google.api.services.hefesoftpharmacy.model.Panel.class);
        this.id = Preconditions.checkNotNull(id, "Required parameter id must be specified.");
      }

      @Override
      public EliminarPanel setAlt(String alt) {
        return (EliminarPanel) super.setAlt(alt);
      }

      @Override
      public EliminarPanel setFields(String fields) {
        return (EliminarPanel) super.setFields(fields);
      }

      @Override
      public EliminarPanel setKey(String key) {
        return (EliminarPanel) super.setKey(key);
      }

      @Override
      public EliminarPanel setOauthToken(String oauthToken) {
        return (EliminarPanel) super.setOauthToken(oauthToken);
      }

      @Override
      public EliminarPanel setPrettyPrint(Boolean prettyPrint) {
        return (EliminarPanel) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public EliminarPanel setQuotaUser(String quotaUser) {
        return (EliminarPanel) super.setQuotaUser(quotaUser);
      }

      @Override
      public EliminarPanel setUserIp(String userIp) {
        return (EliminarPanel) super.setUserIp(userIp);
      }

      @com.google.api.client.util.Key
      private Long id;

      /**

       */
      public Long getId() {
        return id;
      }

      public EliminarPanel setId(Long id) {
        this.id = id;
        return this;
      }

    }
    /**
     * Create a request for the method "panel.listarPaneles".
     *
     * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
     * optional parameters, call the {@link ListarPaneles#execute()} method to invoke the remote
     * operation.
     *
     * @return the request
     */
    public ListarPaneles listarPaneles() throws java.io.IOException {
      ListarPaneles result = new ListarPaneles();
      initialize(result);
      return result;
    }

    public class ListarPaneles extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.CollectionResponsePanel> {

      private static final String REST_PATH = "panel";

      /**
       * Create a request for the method "panel.listarPaneles".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link ListarPaneles#execute()} method to invoke the remote
       * operation. <p> {@link ListarPaneles#initialize(AbstractGoogleClientRequest)} must be called to
       * initialize this instance immediately after invoking the constructor. </p>
       *
       * @since 1.13
       */
      protected ListarPaneles() {
        super(Hefesoftpharmacy.this, "GET", REST_PATH, null, com.google.api.services.hefesoftpharmacy.model.CollectionResponsePanel.class);
      }

      @Override
      public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
        return super.executeUsingHead();
      }

      @Override
      public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
        return super.buildHttpRequestUsingHead();
      }

      @Override
      public ListarPaneles setAlt(String alt) {
        return (ListarPaneles) super.setAlt(alt);
      }

      @Override
      public ListarPaneles setFields(String fields) {
        return (ListarPaneles) super.setFields(fields);
      }

      @Override
      public ListarPaneles setKey(String key) {
        return (ListarPaneles) super.setKey(key);
      }

      @Override
      public ListarPaneles setOauthToken(String oauthToken) {
        return (ListarPaneles) super.setOauthToken(oauthToken);
      }

      @Override
      public ListarPaneles setPrettyPrint(Boolean prettyPrint) {
        return (ListarPaneles) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public ListarPaneles setQuotaUser(String quotaUser) {
        return (ListarPaneles) super.setQuotaUser(quotaUser);
      }

      @Override
      public ListarPaneles setUserIp(String userIp) {
        return (ListarPaneles) super.setUserIp(userIp);
      }

      @com.google.api.client.util.Key
      private String cursor;

      /**

       */
      public String getCursor() {
        return cursor;
      }

      public ListarPaneles setCursor(String cursor) {
        this.cursor = cursor;
        return this;
      }

      @com.google.api.client.util.Key
      private Integer limit;

      /**

       */
      public Integer getLimit() {
        return limit;
      }

      public ListarPaneles setLimit(Integer limit) {
        this.limit = limit;
        return this;
      }

      @com.google.api.client.util.Key
      private Boolean dependencias;

      /**

       */
      public Boolean getDependencias() {
        return dependencias;
      }

      public ListarPaneles setDependencias(Boolean dependencias) {
        this.dependencias = dependencias;
        return this;
      }

    }
    /**
     * Create a request for the method "panel.mostrarPanel".
     *
     * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
     * optional parameters, call the {@link MostrarPanel#execute()} method to invoke the remote
     * operation.
     *
     * @param content the {@link com.google.api.services.hefesoftpharmacy.model.Panel}
     * @return the request
     */
    public MostrarPanel mostrarPanel(com.google.api.services.hefesoftpharmacy.model.Panel content) throws java.io.IOException {
      MostrarPanel result = new MostrarPanel(content);
      initialize(result);
      return result;
    }

    public class MostrarPanel extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.PanelCollection> {

      private static final String REST_PATH = "mostrarPanel";

      /**
       * Create a request for the method "panel.mostrarPanel".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link MostrarPanel#execute()} method to invoke the remote
       * operation. <p> {@link MostrarPanel#initialize(AbstractGoogleClientRequest)} must be called to
       * initialize this instance immediately after invoking the constructor. </p>
       *
       * @param content the {@link com.google.api.services.hefesoftpharmacy.model.Panel}
       * @since 1.13
       */
      protected MostrarPanel(com.google.api.services.hefesoftpharmacy.model.Panel content) {
        super(Hefesoftpharmacy.this, "POST", REST_PATH, content, com.google.api.services.hefesoftpharmacy.model.PanelCollection.class);
      }

      @Override
      public MostrarPanel setAlt(String alt) {
        return (MostrarPanel) super.setAlt(alt);
      }

      @Override
      public MostrarPanel setFields(String fields) {
        return (MostrarPanel) super.setFields(fields);
      }

      @Override
      public MostrarPanel setKey(String key) {
        return (MostrarPanel) super.setKey(key);
      }

      @Override
      public MostrarPanel setOauthToken(String oauthToken) {
        return (MostrarPanel) super.setOauthToken(oauthToken);
      }

      @Override
      public MostrarPanel setPrettyPrint(Boolean prettyPrint) {
        return (MostrarPanel) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public MostrarPanel setQuotaUser(String quotaUser) {
        return (MostrarPanel) super.setQuotaUser(quotaUser);
      }

      @Override
      public MostrarPanel setUserIp(String userIp) {
        return (MostrarPanel) super.setUserIp(userIp);
      }

    }
    /**
     * Create a request for the method "panel.obtenerPanelPorId".
     *
     * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
     * optional parameters, call the {@link ObtenerPanelPorId#execute()} method to invoke the remote
     * operation.
     *
     * @param id
     * @return the request
     */
    public ObtenerPanelPorId obtenerPanelPorId(Long id) throws java.io.IOException {
      ObtenerPanelPorId result = new ObtenerPanelPorId(id);
      initialize(result);
      return result;
    }

    public class ObtenerPanelPorId extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.Panel> {

      private static final String REST_PATH = "panel/{id}";

      /**
       * Create a request for the method "panel.obtenerPanelPorId".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link ObtenerPanelPorId#execute()} method to invoke the remote
       * operation. <p> {@link ObtenerPanelPorId#initialize(AbstractGoogleClientRequest)} must be called
       * to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param id
       * @since 1.13
       */
      protected ObtenerPanelPorId(Long id) {
        super(Hefesoftpharmacy.this, "GET", REST_PATH, null, com.google.api.services.hefesoftpharmacy.model.Panel.class);
        this.id = Preconditions.checkNotNull(id, "Required parameter id must be specified.");
      }

      @Override
      public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
        return super.executeUsingHead();
      }

      @Override
      public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
        return super.buildHttpRequestUsingHead();
      }

      @Override
      public ObtenerPanelPorId setAlt(String alt) {
        return (ObtenerPanelPorId) super.setAlt(alt);
      }

      @Override
      public ObtenerPanelPorId setFields(String fields) {
        return (ObtenerPanelPorId) super.setFields(fields);
      }

      @Override
      public ObtenerPanelPorId setKey(String key) {
        return (ObtenerPanelPorId) super.setKey(key);
      }

      @Override
      public ObtenerPanelPorId setOauthToken(String oauthToken) {
        return (ObtenerPanelPorId) super.setOauthToken(oauthToken);
      }

      @Override
      public ObtenerPanelPorId setPrettyPrint(Boolean prettyPrint) {
        return (ObtenerPanelPorId) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public ObtenerPanelPorId setQuotaUser(String quotaUser) {
        return (ObtenerPanelPorId) super.setQuotaUser(quotaUser);
      }

      @Override
      public ObtenerPanelPorId setUserIp(String userIp) {
        return (ObtenerPanelPorId) super.setUserIp(userIp);
      }

      @com.google.api.client.util.Key
      private Long id;

      /**

       */
      public Long getId() {
        return id;
      }

      public ObtenerPanelPorId setId(Long id) {
        this.id = id;
        return this;
      }

    }

  }

  /**
   * An accessor for creating requests from the Productos collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code Hefesoftpharmacy hefesoftpharmacy = new Hefesoftpharmacy(...);}
   *   {@code Hefesoftpharmacy.Productos.List request = hefesoftpharmacy.productos().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Productos productos() {
    return new Productos();
  }

  /**
   * The "productos" collection of methods.
   */
  public class Productos {

    /**
     * Create a request for the method "productos.actualizar".
     *
     * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
     * optional parameters, call the {@link Actualizar#execute()} method to invoke the remote operation.
     *
     * @param content the {@link com.google.api.services.hefesoftpharmacy.model.Productos}
     * @return the request
     */
    public Actualizar actualizar(com.google.api.services.hefesoftpharmacy.model.Productos content) throws java.io.IOException {
      Actualizar result = new Actualizar(content);
      initialize(result);
      return result;
    }

    public class Actualizar extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.Productos> {

      private static final String REST_PATH = "productos";

      /**
       * Create a request for the method "productos.actualizar".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link Actualizar#execute()} method to invoke the remote
       * operation. <p> {@link Actualizar#initialize(AbstractGoogleClientRequest)} must be called to
       * initialize this instance immediately after invoking the constructor. </p>
       *
       * @param content the {@link com.google.api.services.hefesoftpharmacy.model.Productos}
       * @since 1.13
       */
      protected Actualizar(com.google.api.services.hefesoftpharmacy.model.Productos content) {
        super(Hefesoftpharmacy.this, "PUT", REST_PATH, content, com.google.api.services.hefesoftpharmacy.model.Productos.class);
      }

      @Override
      public Actualizar setAlt(String alt) {
        return (Actualizar) super.setAlt(alt);
      }

      @Override
      public Actualizar setFields(String fields) {
        return (Actualizar) super.setFields(fields);
      }

      @Override
      public Actualizar setKey(String key) {
        return (Actualizar) super.setKey(key);
      }

      @Override
      public Actualizar setOauthToken(String oauthToken) {
        return (Actualizar) super.setOauthToken(oauthToken);
      }

      @Override
      public Actualizar setPrettyPrint(Boolean prettyPrint) {
        return (Actualizar) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Actualizar setQuotaUser(String quotaUser) {
        return (Actualizar) super.setQuotaUser(quotaUser);
      }

      @Override
      public Actualizar setUserIp(String userIp) {
        return (Actualizar) super.setUserIp(userIp);
      }

    }
    /**
     * Create a request for the method "productos.eliminar".
     *
     * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
     * optional parameters, call the {@link Eliminar#execute()} method to invoke the remote operation.
     *
     * @param id
     * @return the request
     */
    public Eliminar eliminar(Long id) throws java.io.IOException {
      Eliminar result = new Eliminar(id);
      initialize(result);
      return result;
    }

    public class Eliminar extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.Productos> {

      private static final String REST_PATH = "productos/{id}";

      /**
       * Create a request for the method "productos.eliminar".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link Eliminar#execute()} method to invoke the remote operation.
       * <p> {@link Eliminar#initialize(AbstractGoogleClientRequest)} must be called to initialize this
       * instance immediately after invoking the constructor. </p>
       *
       * @param id
       * @since 1.13
       */
      protected Eliminar(Long id) {
        super(Hefesoftpharmacy.this, "DELETE", REST_PATH, null, com.google.api.services.hefesoftpharmacy.model.Productos.class);
        this.id = Preconditions.checkNotNull(id, "Required parameter id must be specified.");
      }

      @Override
      public Eliminar setAlt(String alt) {
        return (Eliminar) super.setAlt(alt);
      }

      @Override
      public Eliminar setFields(String fields) {
        return (Eliminar) super.setFields(fields);
      }

      @Override
      public Eliminar setKey(String key) {
        return (Eliminar) super.setKey(key);
      }

      @Override
      public Eliminar setOauthToken(String oauthToken) {
        return (Eliminar) super.setOauthToken(oauthToken);
      }

      @Override
      public Eliminar setPrettyPrint(Boolean prettyPrint) {
        return (Eliminar) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Eliminar setQuotaUser(String quotaUser) {
        return (Eliminar) super.setQuotaUser(quotaUser);
      }

      @Override
      public Eliminar setUserIp(String userIp) {
        return (Eliminar) super.setUserIp(userIp);
      }

      @com.google.api.client.util.Key
      private Long id;

      /**

       */
      public Long getId() {
        return id;
      }

      public Eliminar setId(Long id) {
        this.id = id;
        return this;
      }

    }
    /**
     * Create a request for the method "productos.insertar".
     *
     * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
     * optional parameters, call the {@link Insertar#execute()} method to invoke the remote operation.
     *
     * @param content the {@link com.google.api.services.hefesoftpharmacy.model.Productos}
     * @return the request
     */
    public Insertar insertar(com.google.api.services.hefesoftpharmacy.model.Productos content) throws java.io.IOException {
      Insertar result = new Insertar(content);
      initialize(result);
      return result;
    }

    public class Insertar extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.Productos> {

      private static final String REST_PATH = "productos";

      /**
       * Create a request for the method "productos.insertar".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link Insertar#execute()} method to invoke the remote operation.
       * <p> {@link Insertar#initialize(AbstractGoogleClientRequest)} must be called to initialize this
       * instance immediately after invoking the constructor. </p>
       *
       * @param content the {@link com.google.api.services.hefesoftpharmacy.model.Productos}
       * @since 1.13
       */
      protected Insertar(com.google.api.services.hefesoftpharmacy.model.Productos content) {
        super(Hefesoftpharmacy.this, "POST", REST_PATH, content, com.google.api.services.hefesoftpharmacy.model.Productos.class);
      }

      @Override
      public Insertar setAlt(String alt) {
        return (Insertar) super.setAlt(alt);
      }

      @Override
      public Insertar setFields(String fields) {
        return (Insertar) super.setFields(fields);
      }

      @Override
      public Insertar setKey(String key) {
        return (Insertar) super.setKey(key);
      }

      @Override
      public Insertar setOauthToken(String oauthToken) {
        return (Insertar) super.setOauthToken(oauthToken);
      }

      @Override
      public Insertar setPrettyPrint(Boolean prettyPrint) {
        return (Insertar) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Insertar setQuotaUser(String quotaUser) {
        return (Insertar) super.setQuotaUser(quotaUser);
      }

      @Override
      public Insertar setUserIp(String userIp) {
        return (Insertar) super.setUserIp(userIp);
      }

    }
    /**
     * Create a request for the method "productos.listar".
     *
     * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
     * optional parameters, call the {@link Listar#execute()} method to invoke the remote operation.
     *
     * @return the request
     */
    public Listar listar() throws java.io.IOException {
      Listar result = new Listar();
      initialize(result);
      return result;
    }

    public class Listar extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.CollectionResponseProductos> {

      private static final String REST_PATH = "productos";

      /**
       * Create a request for the method "productos.listar".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link Listar#execute()} method to invoke the remote operation.
       * <p> {@link Listar#initialize(AbstractGoogleClientRequest)} must be called to initialize this
       * instance immediately after invoking the constructor. </p>
       *
       * @since 1.13
       */
      protected Listar() {
        super(Hefesoftpharmacy.this, "GET", REST_PATH, null, com.google.api.services.hefesoftpharmacy.model.CollectionResponseProductos.class);
      }

      @Override
      public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
        return super.executeUsingHead();
      }

      @Override
      public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
        return super.buildHttpRequestUsingHead();
      }

      @Override
      public Listar setAlt(String alt) {
        return (Listar) super.setAlt(alt);
      }

      @Override
      public Listar setFields(String fields) {
        return (Listar) super.setFields(fields);
      }

      @Override
      public Listar setKey(String key) {
        return (Listar) super.setKey(key);
      }

      @Override
      public Listar setOauthToken(String oauthToken) {
        return (Listar) super.setOauthToken(oauthToken);
      }

      @Override
      public Listar setPrettyPrint(Boolean prettyPrint) {
        return (Listar) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Listar setQuotaUser(String quotaUser) {
        return (Listar) super.setQuotaUser(quotaUser);
      }

      @Override
      public Listar setUserIp(String userIp) {
        return (Listar) super.setUserIp(userIp);
      }

      @com.google.api.client.util.Key
      private String cursor;

      /**

       */
      public String getCursor() {
        return cursor;
      }

      public Listar setCursor(String cursor) {
        this.cursor = cursor;
        return this;
      }

      @com.google.api.client.util.Key
      private Integer limit;

      /**

       */
      public Integer getLimit() {
        return limit;
      }

      public Listar setLimit(Integer limit) {
        this.limit = limit;
        return this;
      }

    }
    /**
     * Create a request for the method "productos.obtenerPorId".
     *
     * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
     * optional parameters, call the {@link ObtenerPorId#execute()} method to invoke the remote
     * operation.
     *
     * @param id
     * @return the request
     */
    public ObtenerPorId obtenerPorId(Long id) throws java.io.IOException {
      ObtenerPorId result = new ObtenerPorId(id);
      initialize(result);
      return result;
    }

    public class ObtenerPorId extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.Productos> {

      private static final String REST_PATH = "productos/{id}";

      /**
       * Create a request for the method "productos.obtenerPorId".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link ObtenerPorId#execute()} method to invoke the remote
       * operation. <p> {@link ObtenerPorId#initialize(AbstractGoogleClientRequest)} must be called to
       * initialize this instance immediately after invoking the constructor. </p>
       *
       * @param id
       * @since 1.13
       */
      protected ObtenerPorId(Long id) {
        super(Hefesoftpharmacy.this, "GET", REST_PATH, null, com.google.api.services.hefesoftpharmacy.model.Productos.class);
        this.id = Preconditions.checkNotNull(id, "Required parameter id must be specified.");
      }

      @Override
      public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
        return super.executeUsingHead();
      }

      @Override
      public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
        return super.buildHttpRequestUsingHead();
      }

      @Override
      public ObtenerPorId setAlt(String alt) {
        return (ObtenerPorId) super.setAlt(alt);
      }

      @Override
      public ObtenerPorId setFields(String fields) {
        return (ObtenerPorId) super.setFields(fields);
      }

      @Override
      public ObtenerPorId setKey(String key) {
        return (ObtenerPorId) super.setKey(key);
      }

      @Override
      public ObtenerPorId setOauthToken(String oauthToken) {
        return (ObtenerPorId) super.setOauthToken(oauthToken);
      }

      @Override
      public ObtenerPorId setPrettyPrint(Boolean prettyPrint) {
        return (ObtenerPorId) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public ObtenerPorId setQuotaUser(String quotaUser) {
        return (ObtenerPorId) super.setQuotaUser(quotaUser);
      }

      @Override
      public ObtenerPorId setUserIp(String userIp) {
        return (ObtenerPorId) super.setUserIp(userIp);
      }

      @com.google.api.client.util.Key
      private Long id;

      /**

       */
      public Long getId() {
        return id;
      }

      public ObtenerPorId setId(Long id) {
        this.id = id;
        return this;
      }

    }

  }

  /**
   * An accessor for creating requests from the TipoUnidad collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code Hefesoftpharmacy hefesoftpharmacy = new Hefesoftpharmacy(...);}
   *   {@code Hefesoftpharmacy.TipoUnidad.List request = hefesoftpharmacy.tipoUnidad().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public TipoUnidad tipoUnidad() {
    return new TipoUnidad();
  }

  /**
   * The "tipoUnidad" collection of methods.
   */
  public class TipoUnidad {

    /**
     * Create a request for the method "tipoUnidad.actualizarTipoUnidad".
     *
     * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
     * optional parameters, call the {@link ActualizarTipoUnidad#execute()} method to invoke the remote
     * operation.
     *
     * @param content the {@link com.google.api.services.hefesoftpharmacy.model.Tipounidad}
     * @return the request
     */
    public ActualizarTipoUnidad actualizarTipoUnidad(com.google.api.services.hefesoftpharmacy.model.Tipounidad content) throws java.io.IOException {
      ActualizarTipoUnidad result = new ActualizarTipoUnidad(content);
      initialize(result);
      return result;
    }

    public class ActualizarTipoUnidad extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.Tipounidad> {

      private static final String REST_PATH = "tipounidad";

      /**
       * Create a request for the method "tipoUnidad.actualizarTipoUnidad".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link ActualizarTipoUnidad#execute()} method to invoke the
       * remote operation. <p> {@link ActualizarTipoUnidad#initialize(AbstractGoogleClientRequest)} must
       * be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param content the {@link com.google.api.services.hefesoftpharmacy.model.Tipounidad}
       * @since 1.13
       */
      protected ActualizarTipoUnidad(com.google.api.services.hefesoftpharmacy.model.Tipounidad content) {
        super(Hefesoftpharmacy.this, "PUT", REST_PATH, content, com.google.api.services.hefesoftpharmacy.model.Tipounidad.class);
      }

      @Override
      public ActualizarTipoUnidad setAlt(String alt) {
        return (ActualizarTipoUnidad) super.setAlt(alt);
      }

      @Override
      public ActualizarTipoUnidad setFields(String fields) {
        return (ActualizarTipoUnidad) super.setFields(fields);
      }

      @Override
      public ActualizarTipoUnidad setKey(String key) {
        return (ActualizarTipoUnidad) super.setKey(key);
      }

      @Override
      public ActualizarTipoUnidad setOauthToken(String oauthToken) {
        return (ActualizarTipoUnidad) super.setOauthToken(oauthToken);
      }

      @Override
      public ActualizarTipoUnidad setPrettyPrint(Boolean prettyPrint) {
        return (ActualizarTipoUnidad) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public ActualizarTipoUnidad setQuotaUser(String quotaUser) {
        return (ActualizarTipoUnidad) super.setQuotaUser(quotaUser);
      }

      @Override
      public ActualizarTipoUnidad setUserIp(String userIp) {
        return (ActualizarTipoUnidad) super.setUserIp(userIp);
      }

    }
    /**
     * Create a request for the method "tipoUnidad.adicionarTipoUnidad".
     *
     * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
     * optional parameters, call the {@link AdicionarTipoUnidad#execute()} method to invoke the remote
     * operation.
     *
     * @param content the {@link com.google.api.services.hefesoftpharmacy.model.Tipounidad}
     * @return the request
     */
    public AdicionarTipoUnidad adicionarTipoUnidad(com.google.api.services.hefesoftpharmacy.model.Tipounidad content) throws java.io.IOException {
      AdicionarTipoUnidad result = new AdicionarTipoUnidad(content);
      initialize(result);
      return result;
    }

    public class AdicionarTipoUnidad extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.Tipounidad> {

      private static final String REST_PATH = "tipounidad";

      /**
       * Create a request for the method "tipoUnidad.adicionarTipoUnidad".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link AdicionarTipoUnidad#execute()} method to invoke the remote
       * operation. <p> {@link AdicionarTipoUnidad#initialize(AbstractGoogleClientRequest)} must be
       * called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param content the {@link com.google.api.services.hefesoftpharmacy.model.Tipounidad}
       * @since 1.13
       */
      protected AdicionarTipoUnidad(com.google.api.services.hefesoftpharmacy.model.Tipounidad content) {
        super(Hefesoftpharmacy.this, "POST", REST_PATH, content, com.google.api.services.hefesoftpharmacy.model.Tipounidad.class);
      }

      @Override
      public AdicionarTipoUnidad setAlt(String alt) {
        return (AdicionarTipoUnidad) super.setAlt(alt);
      }

      @Override
      public AdicionarTipoUnidad setFields(String fields) {
        return (AdicionarTipoUnidad) super.setFields(fields);
      }

      @Override
      public AdicionarTipoUnidad setKey(String key) {
        return (AdicionarTipoUnidad) super.setKey(key);
      }

      @Override
      public AdicionarTipoUnidad setOauthToken(String oauthToken) {
        return (AdicionarTipoUnidad) super.setOauthToken(oauthToken);
      }

      @Override
      public AdicionarTipoUnidad setPrettyPrint(Boolean prettyPrint) {
        return (AdicionarTipoUnidad) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public AdicionarTipoUnidad setQuotaUser(String quotaUser) {
        return (AdicionarTipoUnidad) super.setQuotaUser(quotaUser);
      }

      @Override
      public AdicionarTipoUnidad setUserIp(String userIp) {
        return (AdicionarTipoUnidad) super.setUserIp(userIp);
      }

    }
    /**
     * Create a request for the method "tipoUnidad.eliminarTipoUnidad".
     *
     * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
     * optional parameters, call the {@link EliminarTipoUnidad#execute()} method to invoke the remote
     * operation.
     *
     * @param id
     * @return the request
     */
    public EliminarTipoUnidad eliminarTipoUnidad(Long id) throws java.io.IOException {
      EliminarTipoUnidad result = new EliminarTipoUnidad(id);
      initialize(result);
      return result;
    }

    public class EliminarTipoUnidad extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.Tipounidad> {

      private static final String REST_PATH = "tipounidad/{id}";

      /**
       * Create a request for the method "tipoUnidad.eliminarTipoUnidad".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link EliminarTipoUnidad#execute()} method to invoke the remote
       * operation. <p> {@link EliminarTipoUnidad#initialize(AbstractGoogleClientRequest)} must be
       * called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param id
       * @since 1.13
       */
      protected EliminarTipoUnidad(Long id) {
        super(Hefesoftpharmacy.this, "DELETE", REST_PATH, null, com.google.api.services.hefesoftpharmacy.model.Tipounidad.class);
        this.id = Preconditions.checkNotNull(id, "Required parameter id must be specified.");
      }

      @Override
      public EliminarTipoUnidad setAlt(String alt) {
        return (EliminarTipoUnidad) super.setAlt(alt);
      }

      @Override
      public EliminarTipoUnidad setFields(String fields) {
        return (EliminarTipoUnidad) super.setFields(fields);
      }

      @Override
      public EliminarTipoUnidad setKey(String key) {
        return (EliminarTipoUnidad) super.setKey(key);
      }

      @Override
      public EliminarTipoUnidad setOauthToken(String oauthToken) {
        return (EliminarTipoUnidad) super.setOauthToken(oauthToken);
      }

      @Override
      public EliminarTipoUnidad setPrettyPrint(Boolean prettyPrint) {
        return (EliminarTipoUnidad) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public EliminarTipoUnidad setQuotaUser(String quotaUser) {
        return (EliminarTipoUnidad) super.setQuotaUser(quotaUser);
      }

      @Override
      public EliminarTipoUnidad setUserIp(String userIp) {
        return (EliminarTipoUnidad) super.setUserIp(userIp);
      }

      @com.google.api.client.util.Key
      private Long id;

      /**

       */
      public Long getId() {
        return id;
      }

      public EliminarTipoUnidad setId(Long id) {
        this.id = id;
        return this;
      }

    }
    /**
     * Create a request for the method "tipoUnidad.listarTiposUnidades".
     *
     * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
     * optional parameters, call the {@link ListarTiposUnidades#execute()} method to invoke the remote
     * operation.
     *
     * @return the request
     */
    public ListarTiposUnidades listarTiposUnidades() throws java.io.IOException {
      ListarTiposUnidades result = new ListarTiposUnidades();
      initialize(result);
      return result;
    }

    public class ListarTiposUnidades extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.TipounidadCollection> {

      private static final String REST_PATH = "tipounidad";

      /**
       * Create a request for the method "tipoUnidad.listarTiposUnidades".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link ListarTiposUnidades#execute()} method to invoke the remote
       * operation. <p> {@link ListarTiposUnidades#initialize(AbstractGoogleClientRequest)} must be
       * called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @since 1.13
       */
      protected ListarTiposUnidades() {
        super(Hefesoftpharmacy.this, "GET", REST_PATH, null, com.google.api.services.hefesoftpharmacy.model.TipounidadCollection.class);
      }

      @Override
      public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
        return super.executeUsingHead();
      }

      @Override
      public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
        return super.buildHttpRequestUsingHead();
      }

      @Override
      public ListarTiposUnidades setAlt(String alt) {
        return (ListarTiposUnidades) super.setAlt(alt);
      }

      @Override
      public ListarTiposUnidades setFields(String fields) {
        return (ListarTiposUnidades) super.setFields(fields);
      }

      @Override
      public ListarTiposUnidades setKey(String key) {
        return (ListarTiposUnidades) super.setKey(key);
      }

      @Override
      public ListarTiposUnidades setOauthToken(String oauthToken) {
        return (ListarTiposUnidades) super.setOauthToken(oauthToken);
      }

      @Override
      public ListarTiposUnidades setPrettyPrint(Boolean prettyPrint) {
        return (ListarTiposUnidades) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public ListarTiposUnidades setQuotaUser(String quotaUser) {
        return (ListarTiposUnidades) super.setQuotaUser(quotaUser);
      }

      @Override
      public ListarTiposUnidades setUserIp(String userIp) {
        return (ListarTiposUnidades) super.setUserIp(userIp);
      }

    }
    /**
     * Create a request for the method "tipoUnidad.obtenerTipoUnidadPorId".
     *
     * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
     * optional parameters, call the {@link ObtenerTipoUnidadPorId#execute()} method to invoke the
     * remote operation.
     *
     * @param id
     * @return the request
     */
    public ObtenerTipoUnidadPorId obtenerTipoUnidadPorId(Long id) throws java.io.IOException {
      ObtenerTipoUnidadPorId result = new ObtenerTipoUnidadPorId(id);
      initialize(result);
      return result;
    }

    public class ObtenerTipoUnidadPorId extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.Tipounidad> {

      private static final String REST_PATH = "tipounidad/{id}";

      /**
       * Create a request for the method "tipoUnidad.obtenerTipoUnidadPorId".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link ObtenerTipoUnidadPorId#execute()} method to invoke the
       * remote operation. <p> {@link ObtenerTipoUnidadPorId#initialize(AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param id
       * @since 1.13
       */
      protected ObtenerTipoUnidadPorId(Long id) {
        super(Hefesoftpharmacy.this, "GET", REST_PATH, null, com.google.api.services.hefesoftpharmacy.model.Tipounidad.class);
        this.id = Preconditions.checkNotNull(id, "Required parameter id must be specified.");
      }

      @Override
      public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
        return super.executeUsingHead();
      }

      @Override
      public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
        return super.buildHttpRequestUsingHead();
      }

      @Override
      public ObtenerTipoUnidadPorId setAlt(String alt) {
        return (ObtenerTipoUnidadPorId) super.setAlt(alt);
      }

      @Override
      public ObtenerTipoUnidadPorId setFields(String fields) {
        return (ObtenerTipoUnidadPorId) super.setFields(fields);
      }

      @Override
      public ObtenerTipoUnidadPorId setKey(String key) {
        return (ObtenerTipoUnidadPorId) super.setKey(key);
      }

      @Override
      public ObtenerTipoUnidadPorId setOauthToken(String oauthToken) {
        return (ObtenerTipoUnidadPorId) super.setOauthToken(oauthToken);
      }

      @Override
      public ObtenerTipoUnidadPorId setPrettyPrint(Boolean prettyPrint) {
        return (ObtenerTipoUnidadPorId) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public ObtenerTipoUnidadPorId setQuotaUser(String quotaUser) {
        return (ObtenerTipoUnidadPorId) super.setQuotaUser(quotaUser);
      }

      @Override
      public ObtenerTipoUnidadPorId setUserIp(String userIp) {
        return (ObtenerTipoUnidadPorId) super.setUserIp(userIp);
      }

      @com.google.api.client.util.Key
      private Long id;

      /**

       */
      public Long getId() {
        return id;
      }

      public ObtenerTipoUnidadPorId setId(Long id) {
        this.id = id;
        return this;
      }

    }

  }

  /**
   * An accessor for creating requests from the UnidadVisita collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code Hefesoftpharmacy hefesoftpharmacy = new Hefesoftpharmacy(...);}
   *   {@code Hefesoftpharmacy.UnidadVisita.List request = hefesoftpharmacy.unidadVisita().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public UnidadVisita unidadVisita() {
    return new UnidadVisita();
  }

  /**
   * The "unidadVisita" collection of methods.
   */
  public class UnidadVisita {

    /**
     * Create a request for the method "unidadVisita.actualizarUnidadVisita".
     *
     * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
     * optional parameters, call the {@link ActualizarUnidadVisita#execute()} method to invoke the
     * remote operation.
     *
     * @param content the {@link com.google.api.services.hefesoftpharmacy.model.UnidadVisita}
     * @return the request
     */
    public ActualizarUnidadVisita actualizarUnidadVisita(com.google.api.services.hefesoftpharmacy.model.UnidadVisita content) throws java.io.IOException {
      ActualizarUnidadVisita result = new ActualizarUnidadVisita(content);
      initialize(result);
      return result;
    }

    public class ActualizarUnidadVisita extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.UnidadVisita> {

      private static final String REST_PATH = "unidadvisita";

      /**
       * Create a request for the method "unidadVisita.actualizarUnidadVisita".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link ActualizarUnidadVisita#execute()} method to invoke the
       * remote operation. <p> {@link ActualizarUnidadVisita#initialize(AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param content the {@link com.google.api.services.hefesoftpharmacy.model.UnidadVisita}
       * @since 1.13
       */
      protected ActualizarUnidadVisita(com.google.api.services.hefesoftpharmacy.model.UnidadVisita content) {
        super(Hefesoftpharmacy.this, "PUT", REST_PATH, content, com.google.api.services.hefesoftpharmacy.model.UnidadVisita.class);
      }

      @Override
      public ActualizarUnidadVisita setAlt(String alt) {
        return (ActualizarUnidadVisita) super.setAlt(alt);
      }

      @Override
      public ActualizarUnidadVisita setFields(String fields) {
        return (ActualizarUnidadVisita) super.setFields(fields);
      }

      @Override
      public ActualizarUnidadVisita setKey(String key) {
        return (ActualizarUnidadVisita) super.setKey(key);
      }

      @Override
      public ActualizarUnidadVisita setOauthToken(String oauthToken) {
        return (ActualizarUnidadVisita) super.setOauthToken(oauthToken);
      }

      @Override
      public ActualizarUnidadVisita setPrettyPrint(Boolean prettyPrint) {
        return (ActualizarUnidadVisita) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public ActualizarUnidadVisita setQuotaUser(String quotaUser) {
        return (ActualizarUnidadVisita) super.setQuotaUser(quotaUser);
      }

      @Override
      public ActualizarUnidadVisita setUserIp(String userIp) {
        return (ActualizarUnidadVisita) super.setUserIp(userIp);
      }

    }
    /**
     * Create a request for the method "unidadVisita.adicionarUnidadVisita".
     *
     * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
     * optional parameters, call the {@link AdicionarUnidadVisita#execute()} method to invoke the remote
     * operation.
     *
     * @param content the {@link com.google.api.services.hefesoftpharmacy.model.UnidadVisita}
     * @return the request
     */
    public AdicionarUnidadVisita adicionarUnidadVisita(com.google.api.services.hefesoftpharmacy.model.UnidadVisita content) throws java.io.IOException {
      AdicionarUnidadVisita result = new AdicionarUnidadVisita(content);
      initialize(result);
      return result;
    }

    public class AdicionarUnidadVisita extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.UnidadVisita> {

      private static final String REST_PATH = "unidadvisita";

      /**
       * Create a request for the method "unidadVisita.adicionarUnidadVisita".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link AdicionarUnidadVisita#execute()} method to invoke the
       * remote operation. <p> {@link AdicionarUnidadVisita#initialize(AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param content the {@link com.google.api.services.hefesoftpharmacy.model.UnidadVisita}
       * @since 1.13
       */
      protected AdicionarUnidadVisita(com.google.api.services.hefesoftpharmacy.model.UnidadVisita content) {
        super(Hefesoftpharmacy.this, "POST", REST_PATH, content, com.google.api.services.hefesoftpharmacy.model.UnidadVisita.class);
      }

      @Override
      public AdicionarUnidadVisita setAlt(String alt) {
        return (AdicionarUnidadVisita) super.setAlt(alt);
      }

      @Override
      public AdicionarUnidadVisita setFields(String fields) {
        return (AdicionarUnidadVisita) super.setFields(fields);
      }

      @Override
      public AdicionarUnidadVisita setKey(String key) {
        return (AdicionarUnidadVisita) super.setKey(key);
      }

      @Override
      public AdicionarUnidadVisita setOauthToken(String oauthToken) {
        return (AdicionarUnidadVisita) super.setOauthToken(oauthToken);
      }

      @Override
      public AdicionarUnidadVisita setPrettyPrint(Boolean prettyPrint) {
        return (AdicionarUnidadVisita) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public AdicionarUnidadVisita setQuotaUser(String quotaUser) {
        return (AdicionarUnidadVisita) super.setQuotaUser(quotaUser);
      }

      @Override
      public AdicionarUnidadVisita setUserIp(String userIp) {
        return (AdicionarUnidadVisita) super.setUserIp(userIp);
      }

    }
    /**
     * Create a request for the method "unidadVisita.eliminarUnidadVisita".
     *
     * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
     * optional parameters, call the {@link EliminarUnidadVisita#execute()} method to invoke the remote
     * operation.
     *
     * @param id
     * @return the request
     */
    public EliminarUnidadVisita eliminarUnidadVisita(Long id) throws java.io.IOException {
      EliminarUnidadVisita result = new EliminarUnidadVisita(id);
      initialize(result);
      return result;
    }

    public class EliminarUnidadVisita extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.UnidadVisita> {

      private static final String REST_PATH = "unidadvisita/{id}";

      /**
       * Create a request for the method "unidadVisita.eliminarUnidadVisita".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link EliminarUnidadVisita#execute()} method to invoke the
       * remote operation. <p> {@link EliminarUnidadVisita#initialize(AbstractGoogleClientRequest)} must
       * be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param id
       * @since 1.13
       */
      protected EliminarUnidadVisita(Long id) {
        super(Hefesoftpharmacy.this, "DELETE", REST_PATH, null, com.google.api.services.hefesoftpharmacy.model.UnidadVisita.class);
        this.id = Preconditions.checkNotNull(id, "Required parameter id must be specified.");
      }

      @Override
      public EliminarUnidadVisita setAlt(String alt) {
        return (EliminarUnidadVisita) super.setAlt(alt);
      }

      @Override
      public EliminarUnidadVisita setFields(String fields) {
        return (EliminarUnidadVisita) super.setFields(fields);
      }

      @Override
      public EliminarUnidadVisita setKey(String key) {
        return (EliminarUnidadVisita) super.setKey(key);
      }

      @Override
      public EliminarUnidadVisita setOauthToken(String oauthToken) {
        return (EliminarUnidadVisita) super.setOauthToken(oauthToken);
      }

      @Override
      public EliminarUnidadVisita setPrettyPrint(Boolean prettyPrint) {
        return (EliminarUnidadVisita) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public EliminarUnidadVisita setQuotaUser(String quotaUser) {
        return (EliminarUnidadVisita) super.setQuotaUser(quotaUser);
      }

      @Override
      public EliminarUnidadVisita setUserIp(String userIp) {
        return (EliminarUnidadVisita) super.setUserIp(userIp);
      }

      @com.google.api.client.util.Key
      private Long id;

      /**

       */
      public Long getId() {
        return id;
      }

      public EliminarUnidadVisita setId(Long id) {
        this.id = id;
        return this;
      }

    }
    /**
     * Create a request for the method "unidadVisita.listar".
     *
     * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
     * optional parameters, call the {@link Listar#execute()} method to invoke the remote operation.
     *
     * @return the request
     */
    public Listar listar() throws java.io.IOException {
      Listar result = new Listar();
      initialize(result);
      return result;
    }

    public class Listar extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.CollectionResponseUnidadVisita> {

      private static final String REST_PATH = "unidadvisita";

      /**
       * Create a request for the method "unidadVisita.listar".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link Listar#execute()} method to invoke the remote operation.
       * <p> {@link Listar#initialize(AbstractGoogleClientRequest)} must be called to initialize this
       * instance immediately after invoking the constructor. </p>
       *
       * @since 1.13
       */
      protected Listar() {
        super(Hefesoftpharmacy.this, "GET", REST_PATH, null, com.google.api.services.hefesoftpharmacy.model.CollectionResponseUnidadVisita.class);
      }

      @Override
      public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
        return super.executeUsingHead();
      }

      @Override
      public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
        return super.buildHttpRequestUsingHead();
      }

      @Override
      public Listar setAlt(String alt) {
        return (Listar) super.setAlt(alt);
      }

      @Override
      public Listar setFields(String fields) {
        return (Listar) super.setFields(fields);
      }

      @Override
      public Listar setKey(String key) {
        return (Listar) super.setKey(key);
      }

      @Override
      public Listar setOauthToken(String oauthToken) {
        return (Listar) super.setOauthToken(oauthToken);
      }

      @Override
      public Listar setPrettyPrint(Boolean prettyPrint) {
        return (Listar) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Listar setQuotaUser(String quotaUser) {
        return (Listar) super.setQuotaUser(quotaUser);
      }

      @Override
      public Listar setUserIp(String userIp) {
        return (Listar) super.setUserIp(userIp);
      }

      @com.google.api.client.util.Key
      private String cursor;

      /**

       */
      public String getCursor() {
        return cursor;
      }

      public Listar setCursor(String cursor) {
        this.cursor = cursor;
        return this;
      }

      @com.google.api.client.util.Key
      private Integer limit;

      /**

       */
      public Integer getLimit() {
        return limit;
      }

      public Listar setLimit(Integer limit) {
        this.limit = limit;
        return this;
      }

      @com.google.api.client.util.Key
      private Boolean dependencias;

      /**

       */
      public Boolean getDependencias() {
        return dependencias;
      }

      public Listar setDependencias(Boolean dependencias) {
        this.dependencias = dependencias;
        return this;
      }

    }
    /**
     * Create a request for the method "unidadVisita.obtenerPorId".
     *
     * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
     * optional parameters, call the {@link ObtenerPorId#execute()} method to invoke the remote
     * operation.
     *
     * @param id
     * @return the request
     */
    public ObtenerPorId obtenerPorId(Long id) throws java.io.IOException {
      ObtenerPorId result = new ObtenerPorId(id);
      initialize(result);
      return result;
    }

    public class ObtenerPorId extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.UnidadVisita> {

      private static final String REST_PATH = "unidadvisita/{id}";

      /**
       * Create a request for the method "unidadVisita.obtenerPorId".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link ObtenerPorId#execute()} method to invoke the remote
       * operation. <p> {@link ObtenerPorId#initialize(AbstractGoogleClientRequest)} must be called to
       * initialize this instance immediately after invoking the constructor. </p>
       *
       * @param id
       * @since 1.13
       */
      protected ObtenerPorId(Long id) {
        super(Hefesoftpharmacy.this, "GET", REST_PATH, null, com.google.api.services.hefesoftpharmacy.model.UnidadVisita.class);
        this.id = Preconditions.checkNotNull(id, "Required parameter id must be specified.");
      }

      @Override
      public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
        return super.executeUsingHead();
      }

      @Override
      public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
        return super.buildHttpRequestUsingHead();
      }

      @Override
      public ObtenerPorId setAlt(String alt) {
        return (ObtenerPorId) super.setAlt(alt);
      }

      @Override
      public ObtenerPorId setFields(String fields) {
        return (ObtenerPorId) super.setFields(fields);
      }

      @Override
      public ObtenerPorId setKey(String key) {
        return (ObtenerPorId) super.setKey(key);
      }

      @Override
      public ObtenerPorId setOauthToken(String oauthToken) {
        return (ObtenerPorId) super.setOauthToken(oauthToken);
      }

      @Override
      public ObtenerPorId setPrettyPrint(Boolean prettyPrint) {
        return (ObtenerPorId) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public ObtenerPorId setQuotaUser(String quotaUser) {
        return (ObtenerPorId) super.setQuotaUser(quotaUser);
      }

      @Override
      public ObtenerPorId setUserIp(String userIp) {
        return (ObtenerPorId) super.setUserIp(userIp);
      }

      @com.google.api.client.util.Key
      private Long id;

      /**

       */
      public Long getId() {
        return id;
      }

      public ObtenerPorId setId(Long id) {
        this.id = id;
        return this;
      }

      @com.google.api.client.util.Key
      private Boolean dependencias;

      /**

       */
      public Boolean getDependencias() {
        return dependencias;
      }

      public ObtenerPorId setDependencias(Boolean dependencias) {
        this.dependencias = dependencias;
        return this;
      }

    }

  }

  /**
   * An accessor for creating requests from the Usuarios collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code Hefesoftpharmacy hefesoftpharmacy = new Hefesoftpharmacy(...);}
   *   {@code Hefesoftpharmacy.Usuarios.List request = hefesoftpharmacy.usuarios().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Usuarios usuarios() {
    return new Usuarios();
  }

  /**
   * The "usuarios" collection of methods.
   */
  public class Usuarios {

    /**
     * Create a request for the method "usuarios.actualizarUsuario".
     *
     * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
     * optional parameters, call the {@link ActualizarUsuario#execute()} method to invoke the remote
     * operation.
     *
     * @param content the {@link com.google.api.services.hefesoftpharmacy.model.Usuario}
     * @return the request
     */
    public ActualizarUsuario actualizarUsuario(com.google.api.services.hefesoftpharmacy.model.Usuario content) throws java.io.IOException {
      ActualizarUsuario result = new ActualizarUsuario(content);
      initialize(result);
      return result;
    }

    public class ActualizarUsuario extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.Usuario> {

      private static final String REST_PATH = "usuario";

      /**
       * Create a request for the method "usuarios.actualizarUsuario".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link ActualizarUsuario#execute()} method to invoke the remote
       * operation. <p> {@link ActualizarUsuario#initialize(AbstractGoogleClientRequest)} must be called
       * to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param content the {@link com.google.api.services.hefesoftpharmacy.model.Usuario}
       * @since 1.13
       */
      protected ActualizarUsuario(com.google.api.services.hefesoftpharmacy.model.Usuario content) {
        super(Hefesoftpharmacy.this, "PUT", REST_PATH, content, com.google.api.services.hefesoftpharmacy.model.Usuario.class);
      }

      @Override
      public ActualizarUsuario setAlt(String alt) {
        return (ActualizarUsuario) super.setAlt(alt);
      }

      @Override
      public ActualizarUsuario setFields(String fields) {
        return (ActualizarUsuario) super.setFields(fields);
      }

      @Override
      public ActualizarUsuario setKey(String key) {
        return (ActualizarUsuario) super.setKey(key);
      }

      @Override
      public ActualizarUsuario setOauthToken(String oauthToken) {
        return (ActualizarUsuario) super.setOauthToken(oauthToken);
      }

      @Override
      public ActualizarUsuario setPrettyPrint(Boolean prettyPrint) {
        return (ActualizarUsuario) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public ActualizarUsuario setQuotaUser(String quotaUser) {
        return (ActualizarUsuario) super.setQuotaUser(quotaUser);
      }

      @Override
      public ActualizarUsuario setUserIp(String userIp) {
        return (ActualizarUsuario) super.setUserIp(userIp);
      }

    }
    /**
     * Create a request for the method "usuarios.eliminarUsuario".
     *
     * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
     * optional parameters, call the {@link EliminarUsuario#execute()} method to invoke the remote
     * operation.
     *
     * @param id
     * @return the request
     */
    public EliminarUsuario eliminarUsuario(String id) throws java.io.IOException {
      EliminarUsuario result = new EliminarUsuario(id);
      initialize(result);
      return result;
    }

    public class EliminarUsuario extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.Usuario> {

      private static final String REST_PATH = "usuario/{id}";

      /**
       * Create a request for the method "usuarios.eliminarUsuario".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link EliminarUsuario#execute()} method to invoke the remote
       * operation. <p> {@link EliminarUsuario#initialize(AbstractGoogleClientRequest)} must be called
       * to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param id
       * @since 1.13
       */
      protected EliminarUsuario(String id) {
        super(Hefesoftpharmacy.this, "DELETE", REST_PATH, null, com.google.api.services.hefesoftpharmacy.model.Usuario.class);
        this.id = Preconditions.checkNotNull(id, "Required parameter id must be specified.");
      }

      @Override
      public EliminarUsuario setAlt(String alt) {
        return (EliminarUsuario) super.setAlt(alt);
      }

      @Override
      public EliminarUsuario setFields(String fields) {
        return (EliminarUsuario) super.setFields(fields);
      }

      @Override
      public EliminarUsuario setKey(String key) {
        return (EliminarUsuario) super.setKey(key);
      }

      @Override
      public EliminarUsuario setOauthToken(String oauthToken) {
        return (EliminarUsuario) super.setOauthToken(oauthToken);
      }

      @Override
      public EliminarUsuario setPrettyPrint(Boolean prettyPrint) {
        return (EliminarUsuario) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public EliminarUsuario setQuotaUser(String quotaUser) {
        return (EliminarUsuario) super.setQuotaUser(quotaUser);
      }

      @Override
      public EliminarUsuario setUserIp(String userIp) {
        return (EliminarUsuario) super.setUserIp(userIp);
      }

      @com.google.api.client.util.Key
      private String id;

      /**

       */
      public String getId() {
        return id;
      }

      public EliminarUsuario setId(String id) {
        this.id = id;
        return this;
      }

    }
    /**
     * Create a request for the method "usuarios.listarUsuarios".
     *
     * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
     * optional parameters, call the {@link ListarUsuarios#execute()} method to invoke the remote
     * operation.
     *
     * @return the request
     */
    public ListarUsuarios listarUsuarios() throws java.io.IOException {
      ListarUsuarios result = new ListarUsuarios();
      initialize(result);
      return result;
    }

    public class ListarUsuarios extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.CollectionResponseUsuario> {

      private static final String REST_PATH = "usuario";

      /**
       * Create a request for the method "usuarios.listarUsuarios".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link ListarUsuarios#execute()} method to invoke the remote
       * operation. <p> {@link ListarUsuarios#initialize(AbstractGoogleClientRequest)} must be called to
       * initialize this instance immediately after invoking the constructor. </p>
       *
       * @since 1.13
       */
      protected ListarUsuarios() {
        super(Hefesoftpharmacy.this, "GET", REST_PATH, null, com.google.api.services.hefesoftpharmacy.model.CollectionResponseUsuario.class);
      }

      @Override
      public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
        return super.executeUsingHead();
      }

      @Override
      public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
        return super.buildHttpRequestUsingHead();
      }

      @Override
      public ListarUsuarios setAlt(String alt) {
        return (ListarUsuarios) super.setAlt(alt);
      }

      @Override
      public ListarUsuarios setFields(String fields) {
        return (ListarUsuarios) super.setFields(fields);
      }

      @Override
      public ListarUsuarios setKey(String key) {
        return (ListarUsuarios) super.setKey(key);
      }

      @Override
      public ListarUsuarios setOauthToken(String oauthToken) {
        return (ListarUsuarios) super.setOauthToken(oauthToken);
      }

      @Override
      public ListarUsuarios setPrettyPrint(Boolean prettyPrint) {
        return (ListarUsuarios) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public ListarUsuarios setQuotaUser(String quotaUser) {
        return (ListarUsuarios) super.setQuotaUser(quotaUser);
      }

      @Override
      public ListarUsuarios setUserIp(String userIp) {
        return (ListarUsuarios) super.setUserIp(userIp);
      }

      @com.google.api.client.util.Key
      private String cursor;

      /**

       */
      public String getCursor() {
        return cursor;
      }

      public ListarUsuarios setCursor(String cursor) {
        this.cursor = cursor;
        return this;
      }

      @com.google.api.client.util.Key
      private Integer limit;

      /**

       */
      public Integer getLimit() {
        return limit;
      }

      public ListarUsuarios setLimit(Integer limit) {
        this.limit = limit;
        return this;
      }

      @com.google.api.client.util.Key
      private Boolean dependencias;

      /**

       */
      public Boolean getDependencias() {
        return dependencias;
      }

      public ListarUsuarios setDependencias(Boolean dependencias) {
        this.dependencias = dependencias;
        return this;
      }

    }
    /**
     * Create a request for the method "usuarios.nuevoUsuario".
     *
     * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
     * optional parameters, call the {@link NuevoUsuario#execute()} method to invoke the remote
     * operation.
     *
     * @param content the {@link com.google.api.services.hefesoftpharmacy.model.Usuario}
     * @return the request
     */
    public NuevoUsuario nuevoUsuario(com.google.api.services.hefesoftpharmacy.model.Usuario content) throws java.io.IOException {
      NuevoUsuario result = new NuevoUsuario(content);
      initialize(result);
      return result;
    }

    public class NuevoUsuario extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.Usuario> {

      private static final String REST_PATH = "usuario";

      /**
       * Create a request for the method "usuarios.nuevoUsuario".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link NuevoUsuario#execute()} method to invoke the remote
       * operation. <p> {@link NuevoUsuario#initialize(AbstractGoogleClientRequest)} must be called to
       * initialize this instance immediately after invoking the constructor. </p>
       *
       * @param content the {@link com.google.api.services.hefesoftpharmacy.model.Usuario}
       * @since 1.13
       */
      protected NuevoUsuario(com.google.api.services.hefesoftpharmacy.model.Usuario content) {
        super(Hefesoftpharmacy.this, "POST", REST_PATH, content, com.google.api.services.hefesoftpharmacy.model.Usuario.class);
      }

      @Override
      public NuevoUsuario setAlt(String alt) {
        return (NuevoUsuario) super.setAlt(alt);
      }

      @Override
      public NuevoUsuario setFields(String fields) {
        return (NuevoUsuario) super.setFields(fields);
      }

      @Override
      public NuevoUsuario setKey(String key) {
        return (NuevoUsuario) super.setKey(key);
      }

      @Override
      public NuevoUsuario setOauthToken(String oauthToken) {
        return (NuevoUsuario) super.setOauthToken(oauthToken);
      }

      @Override
      public NuevoUsuario setPrettyPrint(Boolean prettyPrint) {
        return (NuevoUsuario) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public NuevoUsuario setQuotaUser(String quotaUser) {
        return (NuevoUsuario) super.setQuotaUser(quotaUser);
      }

      @Override
      public NuevoUsuario setUserIp(String userIp) {
        return (NuevoUsuario) super.setUserIp(userIp);
      }

    }
    /**
     * Create a request for the method "usuarios.obtenerUsuarioPorEmailContrasenia".
     *
     * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
     * optional parameters, call the {@link ObtenerUsuarioPorEmailContrasenia#execute()} method to
     * invoke the remote operation.
     *
     * @param email
     * @param password
     * @return the request
     */
    public ObtenerUsuarioPorEmailContrasenia obtenerUsuarioPorEmailContrasenia(String email, String password) throws java.io.IOException {
      ObtenerUsuarioPorEmailContrasenia result = new ObtenerUsuarioPorEmailContrasenia(email, password);
      initialize(result);
      return result;
    }

    public class ObtenerUsuarioPorEmailContrasenia extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.Usuario> {

      private static final String REST_PATH = "usuario/{Email}/{Password}";

      /**
       * Create a request for the method "usuarios.obtenerUsuarioPorEmailContrasenia".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link ObtenerUsuarioPorEmailContrasenia#execute()} method to
       * invoke the remote operation. <p> {@link
       * ObtenerUsuarioPorEmailContrasenia#initialize(AbstractGoogleClientRequest)} must be called to
       * initialize this instance immediately after invoking the constructor. </p>
       *
       * @param email
       * @param password
       * @since 1.13
       */
      protected ObtenerUsuarioPorEmailContrasenia(String email, String password) {
        super(Hefesoftpharmacy.this, "GET", REST_PATH, null, com.google.api.services.hefesoftpharmacy.model.Usuario.class);
        this.email = Preconditions.checkNotNull(email, "Required parameter email must be specified.");
        this.password = Preconditions.checkNotNull(password, "Required parameter password must be specified.");
      }

      @Override
      public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
        return super.executeUsingHead();
      }

      @Override
      public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
        return super.buildHttpRequestUsingHead();
      }

      @Override
      public ObtenerUsuarioPorEmailContrasenia setAlt(String alt) {
        return (ObtenerUsuarioPorEmailContrasenia) super.setAlt(alt);
      }

      @Override
      public ObtenerUsuarioPorEmailContrasenia setFields(String fields) {
        return (ObtenerUsuarioPorEmailContrasenia) super.setFields(fields);
      }

      @Override
      public ObtenerUsuarioPorEmailContrasenia setKey(String key) {
        return (ObtenerUsuarioPorEmailContrasenia) super.setKey(key);
      }

      @Override
      public ObtenerUsuarioPorEmailContrasenia setOauthToken(String oauthToken) {
        return (ObtenerUsuarioPorEmailContrasenia) super.setOauthToken(oauthToken);
      }

      @Override
      public ObtenerUsuarioPorEmailContrasenia setPrettyPrint(Boolean prettyPrint) {
        return (ObtenerUsuarioPorEmailContrasenia) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public ObtenerUsuarioPorEmailContrasenia setQuotaUser(String quotaUser) {
        return (ObtenerUsuarioPorEmailContrasenia) super.setQuotaUser(quotaUser);
      }

      @Override
      public ObtenerUsuarioPorEmailContrasenia setUserIp(String userIp) {
        return (ObtenerUsuarioPorEmailContrasenia) super.setUserIp(userIp);
      }

      @com.google.api.client.util.Key("Email")
      private String email;

      /**

       */
      public String getEmail() {
        return email;
      }

      public ObtenerUsuarioPorEmailContrasenia setEmail(String email) {
        this.email = email;
        return this;
      }

      @com.google.api.client.util.Key("Password")
      private String password;

      /**

       */
      public String getPassword() {
        return password;
      }

      public ObtenerUsuarioPorEmailContrasenia setPassword(String password) {
        this.password = password;
        return this;
      }

    }
    /**
     * Create a request for the method "usuarios.obtenerUsuarioPorId".
     *
     * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
     * optional parameters, call the {@link ObtenerUsuarioPorId#execute()} method to invoke the remote
     * operation.
     *
     * @param id
     * @return the request
     */
    public ObtenerUsuarioPorId obtenerUsuarioPorId(Long id) throws java.io.IOException {
      ObtenerUsuarioPorId result = new ObtenerUsuarioPorId(id);
      initialize(result);
      return result;
    }

    public class ObtenerUsuarioPorId extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.Usuario> {

      private static final String REST_PATH = "usuario/{id}";

      /**
       * Create a request for the method "usuarios.obtenerUsuarioPorId".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link ObtenerUsuarioPorId#execute()} method to invoke the remote
       * operation. <p> {@link ObtenerUsuarioPorId#initialize(AbstractGoogleClientRequest)} must be
       * called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param id
       * @since 1.13
       */
      protected ObtenerUsuarioPorId(Long id) {
        super(Hefesoftpharmacy.this, "GET", REST_PATH, null, com.google.api.services.hefesoftpharmacy.model.Usuario.class);
        this.id = Preconditions.checkNotNull(id, "Required parameter id must be specified.");
      }

      @Override
      public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
        return super.executeUsingHead();
      }

      @Override
      public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
        return super.buildHttpRequestUsingHead();
      }

      @Override
      public ObtenerUsuarioPorId setAlt(String alt) {
        return (ObtenerUsuarioPorId) super.setAlt(alt);
      }

      @Override
      public ObtenerUsuarioPorId setFields(String fields) {
        return (ObtenerUsuarioPorId) super.setFields(fields);
      }

      @Override
      public ObtenerUsuarioPorId setKey(String key) {
        return (ObtenerUsuarioPorId) super.setKey(key);
      }

      @Override
      public ObtenerUsuarioPorId setOauthToken(String oauthToken) {
        return (ObtenerUsuarioPorId) super.setOauthToken(oauthToken);
      }

      @Override
      public ObtenerUsuarioPorId setPrettyPrint(Boolean prettyPrint) {
        return (ObtenerUsuarioPorId) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public ObtenerUsuarioPorId setQuotaUser(String quotaUser) {
        return (ObtenerUsuarioPorId) super.setQuotaUser(quotaUser);
      }

      @Override
      public ObtenerUsuarioPorId setUserIp(String userIp) {
        return (ObtenerUsuarioPorId) super.setUserIp(userIp);
      }

      @com.google.api.client.util.Key
      private Long id;

      /**

       */
      public Long getId() {
        return id;
      }

      public ObtenerUsuarioPorId setId(Long id) {
        this.id = id;
        return this;
      }

      @com.google.api.client.util.Key
      private Boolean dependencias;

      /**

       */
      public Boolean getDependencias() {
        return dependencias;
      }

      public ObtenerUsuarioPorId setDependencias(Boolean dependencias) {
        this.dependencias = dependencias;
        return this;
      }

    }

  }

  /**
   * An accessor for creating requests from the Visitas collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code Hefesoftpharmacy hefesoftpharmacy = new Hefesoftpharmacy(...);}
   *   {@code Hefesoftpharmacy.Visitas.List request = hefesoftpharmacy.visitas().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Visitas visitas() {
    return new Visitas();
  }

  /**
   * The "visitas" collection of methods.
   */
  public class Visitas {

    /**
     * An accessor for creating requests from the Planeacion collection.
     *
     * <p>The typical use is:</p>
     * <pre>
     *   {@code Hefesoftpharmacy hefesoftpharmacy = new Hefesoftpharmacy(...);}
     *   {@code Hefesoftpharmacy.Planeacion.List request = hefesoftpharmacy.planeacion().list(parameters ...)}
     * </pre>
     *
     * @return the resource collection
     */
    public Planeacion planeacion() {
      return new Planeacion();
    }

    /**
     * The "planeacion" collection of methods.
     */
    public class Planeacion {

      /**
       * Create a request for the method "planeacion.actualizar".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link Actualizar#execute()} method to invoke the remote operation.
       *
       * @param content the {@link com.google.api.services.hefesoftpharmacy.model.VisitaPlaneada}
       * @return the request
       */
      public Actualizar actualizar(com.google.api.services.hefesoftpharmacy.model.VisitaPlaneada content) throws java.io.IOException {
        Actualizar result = new Actualizar(content);
        initialize(result);
        return result;
      }

      public class Actualizar extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.VisitaPlaneada> {

        private static final String REST_PATH = "visitaplaneada";

        /**
         * Create a request for the method "planeacion.actualizar".
         *
         * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
         * optional parameters, call the {@link Actualizar#execute()} method to invoke the remote
         * operation. <p> {@link Actualizar#initialize(AbstractGoogleClientRequest)} must be called to
         * initialize this instance immediately after invoking the constructor. </p>
         *
         * @param content the {@link com.google.api.services.hefesoftpharmacy.model.VisitaPlaneada}
         * @since 1.13
         */
        protected Actualizar(com.google.api.services.hefesoftpharmacy.model.VisitaPlaneada content) {
          super(Hefesoftpharmacy.this, "PUT", REST_PATH, content, com.google.api.services.hefesoftpharmacy.model.VisitaPlaneada.class);
        }

        @Override
        public Actualizar setAlt(String alt) {
          return (Actualizar) super.setAlt(alt);
        }

        @Override
        public Actualizar setFields(String fields) {
          return (Actualizar) super.setFields(fields);
        }

        @Override
        public Actualizar setKey(String key) {
          return (Actualizar) super.setKey(key);
        }

        @Override
        public Actualizar setOauthToken(String oauthToken) {
          return (Actualizar) super.setOauthToken(oauthToken);
        }

        @Override
        public Actualizar setPrettyPrint(Boolean prettyPrint) {
          return (Actualizar) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public Actualizar setQuotaUser(String quotaUser) {
          return (Actualizar) super.setQuotaUser(quotaUser);
        }

        @Override
        public Actualizar setUserIp(String userIp) {
          return (Actualizar) super.setUserIp(userIp);
        }

      }
      /**
       * Create a request for the method "planeacion.adicionar".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link Adicionar#execute()} method to invoke the remote operation.
       *
       * @param content the {@link com.google.api.services.hefesoftpharmacy.model.VisitaPlaneada}
       * @return the request
       */
      public Adicionar adicionar(com.google.api.services.hefesoftpharmacy.model.VisitaPlaneada content) throws java.io.IOException {
        Adicionar result = new Adicionar(content);
        initialize(result);
        return result;
      }

      public class Adicionar extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.VisitaPlaneada> {

        private static final String REST_PATH = "visitaplaneada";

        /**
         * Create a request for the method "planeacion.adicionar".
         *
         * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
         * optional parameters, call the {@link Adicionar#execute()} method to invoke the remote
         * operation. <p> {@link Adicionar#initialize(AbstractGoogleClientRequest)} must be called to
         * initialize this instance immediately after invoking the constructor. </p>
         *
         * @param content the {@link com.google.api.services.hefesoftpharmacy.model.VisitaPlaneada}
         * @since 1.13
         */
        protected Adicionar(com.google.api.services.hefesoftpharmacy.model.VisitaPlaneada content) {
          super(Hefesoftpharmacy.this, "POST", REST_PATH, content, com.google.api.services.hefesoftpharmacy.model.VisitaPlaneada.class);
        }

        @Override
        public Adicionar setAlt(String alt) {
          return (Adicionar) super.setAlt(alt);
        }

        @Override
        public Adicionar setFields(String fields) {
          return (Adicionar) super.setFields(fields);
        }

        @Override
        public Adicionar setKey(String key) {
          return (Adicionar) super.setKey(key);
        }

        @Override
        public Adicionar setOauthToken(String oauthToken) {
          return (Adicionar) super.setOauthToken(oauthToken);
        }

        @Override
        public Adicionar setPrettyPrint(Boolean prettyPrint) {
          return (Adicionar) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public Adicionar setQuotaUser(String quotaUser) {
          return (Adicionar) super.setQuotaUser(quotaUser);
        }

        @Override
        public Adicionar setUserIp(String userIp) {
          return (Adicionar) super.setUserIp(userIp);
        }

      }
      /**
       * Create a request for the method "planeacion.eliminar".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link Eliminar#execute()} method to invoke the remote operation.
       *
       * @param id
       * @return the request
       */
      public Eliminar eliminar(Long id) throws java.io.IOException {
        Eliminar result = new Eliminar(id);
        initialize(result);
        return result;
      }

      public class Eliminar extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.VisitaPlaneada> {

        private static final String REST_PATH = "visitaplaneada/{id}";

        /**
         * Create a request for the method "planeacion.eliminar".
         *
         * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
         * optional parameters, call the {@link Eliminar#execute()} method to invoke the remote operation.
         * <p> {@link Eliminar#initialize(AbstractGoogleClientRequest)} must be called to initialize this
         * instance immediately after invoking the constructor. </p>
         *
         * @param id
         * @since 1.13
         */
        protected Eliminar(Long id) {
          super(Hefesoftpharmacy.this, "DELETE", REST_PATH, null, com.google.api.services.hefesoftpharmacy.model.VisitaPlaneada.class);
          this.id = Preconditions.checkNotNull(id, "Required parameter id must be specified.");
        }

        @Override
        public Eliminar setAlt(String alt) {
          return (Eliminar) super.setAlt(alt);
        }

        @Override
        public Eliminar setFields(String fields) {
          return (Eliminar) super.setFields(fields);
        }

        @Override
        public Eliminar setKey(String key) {
          return (Eliminar) super.setKey(key);
        }

        @Override
        public Eliminar setOauthToken(String oauthToken) {
          return (Eliminar) super.setOauthToken(oauthToken);
        }

        @Override
        public Eliminar setPrettyPrint(Boolean prettyPrint) {
          return (Eliminar) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public Eliminar setQuotaUser(String quotaUser) {
          return (Eliminar) super.setQuotaUser(quotaUser);
        }

        @Override
        public Eliminar setUserIp(String userIp) {
          return (Eliminar) super.setUserIp(userIp);
        }

        @com.google.api.client.util.Key
        private Long id;

        /**

         */
        public Long getId() {
          return id;
        }

        public Eliminar setId(Long id) {
          this.id = id;
          return this;
        }

      }
      /**
       * Create a request for the method "planeacion.listar".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link Listar#execute()} method to invoke the remote operation.
       *
       * @return the request
       */
      public Listar listar() throws java.io.IOException {
        Listar result = new Listar();
        initialize(result);
        return result;
      }

      public class Listar extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.CollectionResponseVisitaPlaneada> {

        private static final String REST_PATH = "visitaplaneada";

        /**
         * Create a request for the method "planeacion.listar".
         *
         * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
         * optional parameters, call the {@link Listar#execute()} method to invoke the remote operation.
         * <p> {@link Listar#initialize(AbstractGoogleClientRequest)} must be called to initialize this
         * instance immediately after invoking the constructor. </p>
         *
         * @since 1.13
         */
        protected Listar() {
          super(Hefesoftpharmacy.this, "GET", REST_PATH, null, com.google.api.services.hefesoftpharmacy.model.CollectionResponseVisitaPlaneada.class);
        }

        @Override
        public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
          return super.executeUsingHead();
        }

        @Override
        public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
          return super.buildHttpRequestUsingHead();
        }

        @Override
        public Listar setAlt(String alt) {
          return (Listar) super.setAlt(alt);
        }

        @Override
        public Listar setFields(String fields) {
          return (Listar) super.setFields(fields);
        }

        @Override
        public Listar setKey(String key) {
          return (Listar) super.setKey(key);
        }

        @Override
        public Listar setOauthToken(String oauthToken) {
          return (Listar) super.setOauthToken(oauthToken);
        }

        @Override
        public Listar setPrettyPrint(Boolean prettyPrint) {
          return (Listar) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public Listar setQuotaUser(String quotaUser) {
          return (Listar) super.setQuotaUser(quotaUser);
        }

        @Override
        public Listar setUserIp(String userIp) {
          return (Listar) super.setUserIp(userIp);
        }

        @com.google.api.client.util.Key
        private String cursor;

        /**

         */
        public String getCursor() {
          return cursor;
        }

        public Listar setCursor(String cursor) {
          this.cursor = cursor;
          return this;
        }

        @com.google.api.client.util.Key
        private Integer limit;

        /**

         */
        public Integer getLimit() {
          return limit;
        }

        public Listar setLimit(Integer limit) {
          this.limit = limit;
          return this;
        }

      }
      /**
       * Create a request for the method "planeacion.obtenerPorId".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link ObtenerPorId#execute()} method to invoke the remote
       * operation.
       *
       * @param id
       * @return the request
       */
      public ObtenerPorId obtenerPorId(Long id) throws java.io.IOException {
        ObtenerPorId result = new ObtenerPorId(id);
        initialize(result);
        return result;
      }

      public class ObtenerPorId extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.VisitaPlaneada> {

        private static final String REST_PATH = "visitaplaneada/{id}";

        /**
         * Create a request for the method "planeacion.obtenerPorId".
         *
         * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
         * optional parameters, call the {@link ObtenerPorId#execute()} method to invoke the remote
         * operation. <p> {@link ObtenerPorId#initialize(AbstractGoogleClientRequest)} must be called to
         * initialize this instance immediately after invoking the constructor. </p>
         *
         * @param id
         * @since 1.13
         */
        protected ObtenerPorId(Long id) {
          super(Hefesoftpharmacy.this, "GET", REST_PATH, null, com.google.api.services.hefesoftpharmacy.model.VisitaPlaneada.class);
          this.id = Preconditions.checkNotNull(id, "Required parameter id must be specified.");
        }

        @Override
        public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
          return super.executeUsingHead();
        }

        @Override
        public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
          return super.buildHttpRequestUsingHead();
        }

        @Override
        public ObtenerPorId setAlt(String alt) {
          return (ObtenerPorId) super.setAlt(alt);
        }

        @Override
        public ObtenerPorId setFields(String fields) {
          return (ObtenerPorId) super.setFields(fields);
        }

        @Override
        public ObtenerPorId setKey(String key) {
          return (ObtenerPorId) super.setKey(key);
        }

        @Override
        public ObtenerPorId setOauthToken(String oauthToken) {
          return (ObtenerPorId) super.setOauthToken(oauthToken);
        }

        @Override
        public ObtenerPorId setPrettyPrint(Boolean prettyPrint) {
          return (ObtenerPorId) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public ObtenerPorId setQuotaUser(String quotaUser) {
          return (ObtenerPorId) super.setQuotaUser(quotaUser);
        }

        @Override
        public ObtenerPorId setUserIp(String userIp) {
          return (ObtenerPorId) super.setUserIp(userIp);
        }

        @com.google.api.client.util.Key
        private Long id;

        /**

         */
        public Long getId() {
          return id;
        }

        public ObtenerPorId setId(Long id) {
          this.id = id;
          return this;
        }

      }

    }
    /**
     * An accessor for creating requests from the Realizada collection.
     *
     * <p>The typical use is:</p>
     * <pre>
     *   {@code Hefesoftpharmacy hefesoftpharmacy = new Hefesoftpharmacy(...);}
     *   {@code Hefesoftpharmacy.Realizada.List request = hefesoftpharmacy.realizada().list(parameters ...)}
     * </pre>
     *
     * @return the resource collection
     */
    public Realizada realizada() {
      return new Realizada();
    }

    /**
     * The "realizada" collection of methods.
     */
    public class Realizada {

      /**
       * Create a request for the method "realizada.actualizar".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link Actualizar#execute()} method to invoke the remote operation.
       *
       * @param content the {@link com.google.api.services.hefesoftpharmacy.model.VisitaRealizada}
       * @return the request
       */
      public Actualizar actualizar(com.google.api.services.hefesoftpharmacy.model.VisitaRealizada content) throws java.io.IOException {
        Actualizar result = new Actualizar(content);
        initialize(result);
        return result;
      }

      public class Actualizar extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.VisitaRealizada> {

        private static final String REST_PATH = "visitarealizada";

        /**
         * Create a request for the method "realizada.actualizar".
         *
         * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
         * optional parameters, call the {@link Actualizar#execute()} method to invoke the remote
         * operation. <p> {@link Actualizar#initialize(AbstractGoogleClientRequest)} must be called to
         * initialize this instance immediately after invoking the constructor. </p>
         *
         * @param content the {@link com.google.api.services.hefesoftpharmacy.model.VisitaRealizada}
         * @since 1.13
         */
        protected Actualizar(com.google.api.services.hefesoftpharmacy.model.VisitaRealizada content) {
          super(Hefesoftpharmacy.this, "PUT", REST_PATH, content, com.google.api.services.hefesoftpharmacy.model.VisitaRealizada.class);
        }

        @Override
        public Actualizar setAlt(String alt) {
          return (Actualizar) super.setAlt(alt);
        }

        @Override
        public Actualizar setFields(String fields) {
          return (Actualizar) super.setFields(fields);
        }

        @Override
        public Actualizar setKey(String key) {
          return (Actualizar) super.setKey(key);
        }

        @Override
        public Actualizar setOauthToken(String oauthToken) {
          return (Actualizar) super.setOauthToken(oauthToken);
        }

        @Override
        public Actualizar setPrettyPrint(Boolean prettyPrint) {
          return (Actualizar) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public Actualizar setQuotaUser(String quotaUser) {
          return (Actualizar) super.setQuotaUser(quotaUser);
        }

        @Override
        public Actualizar setUserIp(String userIp) {
          return (Actualizar) super.setUserIp(userIp);
        }

      }
      /**
       * Create a request for the method "realizada.adicionar".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link Adicionar#execute()} method to invoke the remote operation.
       *
       * @param content the {@link com.google.api.services.hefesoftpharmacy.model.VisitaRealizada}
       * @return the request
       */
      public Adicionar adicionar(com.google.api.services.hefesoftpharmacy.model.VisitaRealizada content) throws java.io.IOException {
        Adicionar result = new Adicionar(content);
        initialize(result);
        return result;
      }

      public class Adicionar extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.VisitaRealizada> {

        private static final String REST_PATH = "visitarealizada";

        /**
         * Create a request for the method "realizada.adicionar".
         *
         * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
         * optional parameters, call the {@link Adicionar#execute()} method to invoke the remote
         * operation. <p> {@link Adicionar#initialize(AbstractGoogleClientRequest)} must be called to
         * initialize this instance immediately after invoking the constructor. </p>
         *
         * @param content the {@link com.google.api.services.hefesoftpharmacy.model.VisitaRealizada}
         * @since 1.13
         */
        protected Adicionar(com.google.api.services.hefesoftpharmacy.model.VisitaRealizada content) {
          super(Hefesoftpharmacy.this, "POST", REST_PATH, content, com.google.api.services.hefesoftpharmacy.model.VisitaRealizada.class);
        }

        @Override
        public Adicionar setAlt(String alt) {
          return (Adicionar) super.setAlt(alt);
        }

        @Override
        public Adicionar setFields(String fields) {
          return (Adicionar) super.setFields(fields);
        }

        @Override
        public Adicionar setKey(String key) {
          return (Adicionar) super.setKey(key);
        }

        @Override
        public Adicionar setOauthToken(String oauthToken) {
          return (Adicionar) super.setOauthToken(oauthToken);
        }

        @Override
        public Adicionar setPrettyPrint(Boolean prettyPrint) {
          return (Adicionar) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public Adicionar setQuotaUser(String quotaUser) {
          return (Adicionar) super.setQuotaUser(quotaUser);
        }

        @Override
        public Adicionar setUserIp(String userIp) {
          return (Adicionar) super.setUserIp(userIp);
        }

      }
      /**
       * Create a request for the method "realizada.eliminar".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link Eliminar#execute()} method to invoke the remote operation.
       *
       * @param id
       * @return the request
       */
      public Eliminar eliminar(Long id) throws java.io.IOException {
        Eliminar result = new Eliminar(id);
        initialize(result);
        return result;
      }

      public class Eliminar extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.VisitaRealizada> {

        private static final String REST_PATH = "visitarealizada/{id}";

        /**
         * Create a request for the method "realizada.eliminar".
         *
         * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
         * optional parameters, call the {@link Eliminar#execute()} method to invoke the remote operation.
         * <p> {@link Eliminar#initialize(AbstractGoogleClientRequest)} must be called to initialize this
         * instance immediately after invoking the constructor. </p>
         *
         * @param id
         * @since 1.13
         */
        protected Eliminar(Long id) {
          super(Hefesoftpharmacy.this, "DELETE", REST_PATH, null, com.google.api.services.hefesoftpharmacy.model.VisitaRealizada.class);
          this.id = Preconditions.checkNotNull(id, "Required parameter id must be specified.");
        }

        @Override
        public Eliminar setAlt(String alt) {
          return (Eliminar) super.setAlt(alt);
        }

        @Override
        public Eliminar setFields(String fields) {
          return (Eliminar) super.setFields(fields);
        }

        @Override
        public Eliminar setKey(String key) {
          return (Eliminar) super.setKey(key);
        }

        @Override
        public Eliminar setOauthToken(String oauthToken) {
          return (Eliminar) super.setOauthToken(oauthToken);
        }

        @Override
        public Eliminar setPrettyPrint(Boolean prettyPrint) {
          return (Eliminar) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public Eliminar setQuotaUser(String quotaUser) {
          return (Eliminar) super.setQuotaUser(quotaUser);
        }

        @Override
        public Eliminar setUserIp(String userIp) {
          return (Eliminar) super.setUserIp(userIp);
        }

        @com.google.api.client.util.Key
        private Long id;

        /**

         */
        public Long getId() {
          return id;
        }

        public Eliminar setId(Long id) {
          this.id = id;
          return this;
        }

      }
      /**
       * Create a request for the method "realizada.listar".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link Listar#execute()} method to invoke the remote operation.
       *
       * @return the request
       */
      public Listar listar() throws java.io.IOException {
        Listar result = new Listar();
        initialize(result);
        return result;
      }

      public class Listar extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.CollectionResponseVisitaRealizada> {

        private static final String REST_PATH = "visitarealizada";

        /**
         * Create a request for the method "realizada.listar".
         *
         * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
         * optional parameters, call the {@link Listar#execute()} method to invoke the remote operation.
         * <p> {@link Listar#initialize(AbstractGoogleClientRequest)} must be called to initialize this
         * instance immediately after invoking the constructor. </p>
         *
         * @since 1.13
         */
        protected Listar() {
          super(Hefesoftpharmacy.this, "GET", REST_PATH, null, com.google.api.services.hefesoftpharmacy.model.CollectionResponseVisitaRealizada.class);
        }

        @Override
        public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
          return super.executeUsingHead();
        }

        @Override
        public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
          return super.buildHttpRequestUsingHead();
        }

        @Override
        public Listar setAlt(String alt) {
          return (Listar) super.setAlt(alt);
        }

        @Override
        public Listar setFields(String fields) {
          return (Listar) super.setFields(fields);
        }

        @Override
        public Listar setKey(String key) {
          return (Listar) super.setKey(key);
        }

        @Override
        public Listar setOauthToken(String oauthToken) {
          return (Listar) super.setOauthToken(oauthToken);
        }

        @Override
        public Listar setPrettyPrint(Boolean prettyPrint) {
          return (Listar) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public Listar setQuotaUser(String quotaUser) {
          return (Listar) super.setQuotaUser(quotaUser);
        }

        @Override
        public Listar setUserIp(String userIp) {
          return (Listar) super.setUserIp(userIp);
        }

        @com.google.api.client.util.Key
        private String cursor;

        /**

         */
        public String getCursor() {
          return cursor;
        }

        public Listar setCursor(String cursor) {
          this.cursor = cursor;
          return this;
        }

        @com.google.api.client.util.Key
        private Integer limit;

        /**

         */
        public Integer getLimit() {
          return limit;
        }

        public Listar setLimit(Integer limit) {
          this.limit = limit;
          return this;
        }

      }
      /**
       * Create a request for the method "realizada.obtenerPorId".
       *
       * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
       * optional parameters, call the {@link ObtenerPorId#execute()} method to invoke the remote
       * operation.
       *
       * @param id
       * @return the request
       */
      public ObtenerPorId obtenerPorId(Long id) throws java.io.IOException {
        ObtenerPorId result = new ObtenerPorId(id);
        initialize(result);
        return result;
      }

      public class ObtenerPorId extends HefesoftpharmacyRequest<com.google.api.services.hefesoftpharmacy.model.VisitaRealizada> {

        private static final String REST_PATH = "visitarealizada/{id}";

        /**
         * Create a request for the method "realizada.obtenerPorId".
         *
         * This request holds the parameters needed by the the hefesoftpharmacy server.  After setting any
         * optional parameters, call the {@link ObtenerPorId#execute()} method to invoke the remote
         * operation. <p> {@link ObtenerPorId#initialize(AbstractGoogleClientRequest)} must be called to
         * initialize this instance immediately after invoking the constructor. </p>
         *
         * @param id
         * @since 1.13
         */
        protected ObtenerPorId(Long id) {
          super(Hefesoftpharmacy.this, "GET", REST_PATH, null, com.google.api.services.hefesoftpharmacy.model.VisitaRealizada.class);
          this.id = Preconditions.checkNotNull(id, "Required parameter id must be specified.");
        }

        @Override
        public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
          return super.executeUsingHead();
        }

        @Override
        public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
          return super.buildHttpRequestUsingHead();
        }

        @Override
        public ObtenerPorId setAlt(String alt) {
          return (ObtenerPorId) super.setAlt(alt);
        }

        @Override
        public ObtenerPorId setFields(String fields) {
          return (ObtenerPorId) super.setFields(fields);
        }

        @Override
        public ObtenerPorId setKey(String key) {
          return (ObtenerPorId) super.setKey(key);
        }

        @Override
        public ObtenerPorId setOauthToken(String oauthToken) {
          return (ObtenerPorId) super.setOauthToken(oauthToken);
        }

        @Override
        public ObtenerPorId setPrettyPrint(Boolean prettyPrint) {
          return (ObtenerPorId) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public ObtenerPorId setQuotaUser(String quotaUser) {
          return (ObtenerPorId) super.setQuotaUser(quotaUser);
        }

        @Override
        public ObtenerPorId setUserIp(String userIp) {
          return (ObtenerPorId) super.setUserIp(userIp);
        }

        @com.google.api.client.util.Key
        private Long id;

        /**

         */
        public Long getId() {
          return id;
        }

        public ObtenerPorId setId(Long id) {
          this.id = id;
          return this;
        }

      }

    }
  }

  /**
   * Builder for {@link Hefesoftpharmacy}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport
     * @param jsonFactory JSON factory
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(HttpTransport transport, JsonFactory jsonFactory,
        HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
    }

    /** Builds a new instance of {@link Hefesoftpharmacy}. */
    @Override
    public Hefesoftpharmacy build() {
      return new Hefesoftpharmacy(getTransport(),
          getHttpRequestInitializer(),
          getRootUrl(),
          getServicePath(),
          getObjectParser(),
          getGoogleClientRequestInitializer(),
          getApplicationName(),
          getSuppressPatternChecks());
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setHttpRequestInitializer(HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    /**
     * Set the {@link HefesoftpharmacyRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setHefesoftpharmacyRequestInitializer(
        HefesoftpharmacyRequestInitializer hefesoftpharmacyRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(hefesoftpharmacyRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
