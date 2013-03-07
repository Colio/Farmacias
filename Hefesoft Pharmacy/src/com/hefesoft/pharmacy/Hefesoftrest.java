package com.hefesoft.pharmacy;

import java.util.Date;
import java.util.List;

import javax.annotation.Nullable;
import javax.inject.Named;

import com.fachada.actividadjustificada.Actividadjustificada;
import com.fachada.actividadjustificada.CrudActividadJustificada;
import com.fachada.ciclo.Ciclo;
import com.fachada.ciclo.CrudCiclo;
import com.fachada.farmacias.CrudFarmacias;
import com.fachada.farmacias.Farmacias;
import com.fachada.files.BlobResult;
import com.fachada.files.CrudFiles;
import com.fachada.files.FileHefesoftProperties;
import com.fachada.gerencias.CrudGerencias;
import com.fachada.gerencias.GerenteCluster;
import com.fachada.gerencias.GerenteDistrito;
import com.fachada.gerencias.GerenteDivision;
import com.fachada.gerencias.GerenteEmpresa;
import com.fachada.gerencias.GerenteLinea;
import com.fachada.gerencias.GerentePais;
import com.fachada.gerencias.GerenteRegional;
import com.fachada.linea.CrudLinea;
import com.fachada.linea.Linea;
import com.fachada.medicos.CrudMedicos;
import com.fachada.medicos.Medicos;
import com.fachada.pais.CrudPais;
import com.fachada.pais.Pais;
import com.fachada.panel.CrudPanel;
import com.fachada.panel.Panel;
import com.fachada.productos.CrudProductos;
import com.fachada.productos.Productos;
import com.fachada.tipounidad.CrudTipoUnidad;
import com.fachada.tipounidad.Tipounidad;
import com.fachada.unidadvisita.CrudUnidadVisita;
import com.fachada.unidadvisita.UnidadVisita;
import com.fachada.usuario.CrudUsuario;
import com.fachada.usuario.Usuario;
import com.fachada.visita.CrudVisita;
import com.fachada.visita.VisitaPlaneada;
import com.fachada.visita.VisitaRealizada;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiMethod.HttpMethod;
import com.google.api.server.spi.response.CollectionResponse;

@Api(name = "hefesoftpharmacy")
public class Hefesoftrest {	
	
	@ApiMethod(name = "usuarios.listarUsuarios")	
	public CollectionResponse<Usuario> listUsuario(
			@Nullable @Named("dependencias") Boolean dependencias,
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit			
			) {
		CrudUsuario usuario = new CrudUsuario();
		return usuario.listUsuario(cursorString, limit,dependencias);
	}
	
	@ApiMethod(name = "usuarios.obtenerUsuarioPorId")
	public Usuario getUsuario(
			@Nullable @Named("dependencias") Boolean dependencias,
			@Named("id") Long id) {	
		CrudUsuario usuario = new CrudUsuario();
		return usuario.getUsuario(id, dependencias);
	}
	
	@ApiMethod(name = "usuarios.obtenerUsuarioPorEmailContrasenia")
	public Usuario getUsuarioEmailPassword(@Named("Email") String id, @Named("Password") String password) {
		CrudUsuario usuario = new CrudUsuario();
		return usuario.getUsuarioEmailPassword(id, password);
	}

	@ApiMethod(name = "usuarios.nuevoUsuario")
	public Usuario insertUsuario(Usuario usuario) {
		CrudUsuario usuarioCrud = new CrudUsuario();
		return usuarioCrud.insertUsuario(usuario);
	}

	@ApiMethod(name = "usuarios.actualizarUsuario")
	public Usuario updateUsuario(Usuario usuario) {
		CrudUsuario usuarioCrud = new CrudUsuario();
		return usuarioCrud.updateUsuario(usuario);
	}

	@ApiMethod(name = "usuarios.eliminarUsuario")
	public Usuario removeUsuario(@Named("id") String id) {
		CrudUsuario usuarioCrud = new CrudUsuario();
		return usuarioCrud.removeUsuario(id);
	}	
	
	@ApiMethod(name = "panel.listarPaneles")
	public CollectionResponse<Panel> listPanel(
			@Nullable @Named("dependencias") Boolean dependencias,
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit			
			) {
		CrudPanel crudpanel = new CrudPanel();
		return crudpanel.listPanel(cursorString, limit, dependencias);
	}
	
	@ApiMethod(name = "panel.mostrarPanel")
	public List<Panel> mostrarPanel(Panel panel) {
		CrudPanel crudpanel = new CrudPanel();
		return crudpanel.mostrarPanel(panel);
	}

	@ApiMethod(name = "panel.obtenerPanelPorId")
	public Panel getPanel(@Named("id") Long id) {
		CrudPanel crudpanel = new CrudPanel();
		return crudpanel.getPanel(id,true);
	}

	@ApiMethod(name = "panel.adicionarPanel")
	public Panel insertPanel(Panel panel) {
		CrudPanel crudpanel = new CrudPanel();
		return crudpanel.insertPanel(panel);
	}


	@ApiMethod(name = "panel.actualizarPanel")
	public Panel updatePanel(Panel panel) {
		CrudPanel crudpanel = new CrudPanel();
		return crudpanel.updatePanel(panel);
	}

	@ApiMethod(name = "panel.eliminarPanel")
	public Panel removePanel(@Named("id") Long id) {
		CrudPanel crudpanel = new CrudPanel();
		return crudpanel.removePanel(id);
	}
	
	@ApiMethod(name = "tipoUnidad.listarTiposUnidades")
	public List<Tipounidad> listTipounidad() {
		CrudTipoUnidad crudTipoUnidad = new CrudTipoUnidad();
		return crudTipoUnidad.listTipounidad();
	}

	@ApiMethod(name = "tipoUnidad.obtenerTipoUnidadPorId")
	public Tipounidad getTipounidad(@Named("id") Long id) {
		CrudTipoUnidad crudTipoUnidad = new CrudTipoUnidad();
		return crudTipoUnidad.getTipounidad(id);
	}

	@ApiMethod(name = "tipoUnidad.adicionarTipoUnidad")
	public Tipounidad insertTipounidad(Tipounidad tipounidad) {
		CrudTipoUnidad crudTipoUnidad = new CrudTipoUnidad();
		return crudTipoUnidad.insertTipounidad(tipounidad);
	}

	@ApiMethod(name = "tipoUnidad.actualizarTipoUnidad")
	public Tipounidad updateTipounidad(Tipounidad tipounidad) {
		CrudTipoUnidad crudTipoUnidad = new CrudTipoUnidad();
		return crudTipoUnidad.updateTipounidad(tipounidad);
	}

	@ApiMethod(name = "tipoUnidad.eliminarTipoUnidad")
	public Tipounidad removeTipounidad(@Named("id") Long id) {
		CrudTipoUnidad crudTipoUnidad = new CrudTipoUnidad();
		return crudTipoUnidad.removeTipounidad(id);
	}
	
	@ApiMethod(name = "ciclo.listarCiclos")
	public List<Ciclo> listCiclo() {
		CrudCiclo crudCiclo = new CrudCiclo();
		return crudCiclo.listCiclo();
	}


	@ApiMethod(name = "ciclo.obtenerCicloPorId")
	public Ciclo getCiclo(@Named("id") Long id) {
		CrudCiclo crudCiclo = new CrudCiclo();
		return crudCiclo.getCiclo(id);
	}

	@ApiMethod(name = "ciclo.adicionarCiclo")
	public Ciclo insertCiclo(Ciclo ciclo) {
		CrudCiclo crudCiclo = new CrudCiclo();
		return crudCiclo.insertCiclo(ciclo);
	}

	@ApiMethod(name = "ciclo.actualizarCiclo")
	public Ciclo updateCiclo(Ciclo ciclo) {
		CrudCiclo crudCiclo = new CrudCiclo();
		return crudCiclo.updateCiclo(ciclo);
	}

	@ApiMethod(name = "ciclo.eliminarCiclo")
	public Ciclo removeCiclo(@Named("id") Long id) {
		CrudCiclo crudCiclo = new CrudCiclo();
		return crudCiclo.removeCiclo(id);
	}	
	
	@ApiMethod(name = "farmacias.listarFarmacias")
	public List<Farmacias> listFarmacias() {
		CrudFarmacias crudFarmacias = new CrudFarmacias();
		return crudFarmacias.listFarmacias();
	}

	@ApiMethod(name = "farmacias.obtenerFarmaciaPorId")
	public Farmacias getFarmacias(@Named("id") Long id) {
		CrudFarmacias crudFarmacias = new CrudFarmacias();
		return crudFarmacias.getFarmacias(id);
	}

	@ApiMethod(name = "farmacias.adicionarFarmacia")
	public Farmacias insertFarmacias(Farmacias farmacias) {
		CrudFarmacias crudFarmacias = new CrudFarmacias();
		return crudFarmacias.insertFarmacias(farmacias);
	}


	@ApiMethod(name = "farmacias.actualizarFarmacia")
	public Farmacias updateFarmacias(Farmacias farmacias) {
		CrudFarmacias crudFarmacias = new CrudFarmacias();
		return crudFarmacias.updateFarmacias(farmacias);
	}

	@ApiMethod(name = "farmacias.eliminarFarmacia")
	public Farmacias removeFarmacias(@Named("id") Long id) {
		CrudFarmacias crudFarmacias = new CrudFarmacias();
		return crudFarmacias.removeFarmacias(id);
	}
		
	@ApiMethod(name = "medicos.listarMedicos")
	public List<Medicos> listMedicos() {
		CrudMedicos crudMedicos = new CrudMedicos();
		return crudMedicos.listMedicos();
	}

	
	@ApiMethod(name = "medicos.obtenerMedicoPorId")
	public Medicos getMedicos(@Named("id") Long id) {
		CrudMedicos crudMedicos = new CrudMedicos();
		return crudMedicos.getMedicos(id);
	}

	@ApiMethod(name = "medicos.adicionarMedico")
	public Medicos insertMedicos(Medicos medicos) {
		CrudMedicos crudMedicos = new CrudMedicos();
		return crudMedicos.insertMedicos(medicos);
	}

	@ApiMethod(name = "medicos.actualizarMedico")
	public Medicos updateMedicos(Medicos medicos) {
		CrudMedicos crudMedicos = new CrudMedicos();
		return crudMedicos.updateMedicos(medicos);
	}

	
	@ApiMethod(name = "medicos.eliminarMedico")
	public Medicos removeMedicos(@Named("id") Long id) {
		CrudMedicos crudMedicos = new CrudMedicos();
		return crudMedicos.removeMedicos(id);
	}
	
	@ApiMethod(name = "actividadJustificada.listarActividades")
	public List<Actividadjustificada> listActividadjustificada() {
		CrudActividadJustificada crudActividadJustificada = new CrudActividadJustificada();
		return crudActividadJustificada.listActividadjustificada();
	}


	@ApiMethod(name = "actividadJustificada.obtenerActividadPorId")
	public Actividadjustificada getActividadjustificada(@Named("id") Long id) {
		CrudActividadJustificada crudActividadJustificada = new CrudActividadJustificada();
		return crudActividadJustificada.getActividadjustificada(id);
	}

	
	@ApiMethod(name = "actividadJustificada.adicionarActividad")
	public Actividadjustificada insertActividadjustificada(
			Actividadjustificada actividadjustificada) {
		CrudActividadJustificada crudActividadJustificada = new CrudActividadJustificada();
		return crudActividadJustificada.insertActividadjustificada(actividadjustificada);
	}

	
	@ApiMethod(name = "actividadJustificada.actualizarActividad")
	public Actividadjustificada updateActividadjustificada(
			Actividadjustificada actividadjustificada) {
		
		CrudActividadJustificada crudActividadJustificada = new CrudActividadJustificada();
		return crudActividadJustificada.updateActividadjustificada(actividadjustificada);
	}
		
	
	@ApiMethod(name = "gerentes.cluster.listarGerentes")
	public CollectionResponse<GerenteCluster> listGerenteCluster(
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit) {
			CrudGerencias crud = new CrudGerencias();
			return crud.listGerenteCluster(cursorString, limit, false);
	}
	
	
	
	@ApiMethod(name = "gerentes.cluster.obtenerGerentePorId")
	public GerenteCluster getGerenteCluster(@Named("id") Long id) {
		CrudGerencias crud = new CrudGerencias();
		return crud.getGerenteCluster(id,false);
	}
	
	

	@ApiMethod(name = "gerentes.cluster.adicionarGerente")
	public GerenteCluster insertGerenteCluster(GerenteCluster gerentecluster) {
		CrudGerencias crud = new CrudGerencias();
		return crud.insertGerenteCluster(gerentecluster);
	}

	@ApiMethod(name = "gerentes.cluster.actualizarGerente")
	public GerenteCluster updateGerenteCluster(GerenteCluster gerentecluster) {
		CrudGerencias crud = new CrudGerencias();
		return crud.updateGerenteCluster(gerentecluster);
	}

	@ApiMethod(name = "gerentes.cluster.eliminarGerente")
	public GerenteCluster removeGerenteCluster(@Named("id") Long id) {
		CrudGerencias crud = new CrudGerencias();
		return crud.removeGerenteCluster(id);
	}
	
	@ApiMethod(name = "gerentes.distrito.listarGerentes")
	public CollectionResponse<GerenteDistrito> listGerenteDistrito(
			@Nullable @Named("dependencias") Boolean dependencias,
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit			
			) {
				CrudGerencias crud = new CrudGerencias();
				return crud.listGerenteDistrito(cursorString, limit, dependencias);		
			}
	
	@ApiMethod(name = "gerentes.distrito.obtenerGerentePorId")
	public GerenteDistrito getGerenteDistrito(@Nullable @Named("dependencias") Boolean dependencias,@Named("id") Long id			
			) {
		CrudGerencias crud = new CrudGerencias();
		return crud.getGerenteDistrito(id,dependencias);
	}
	
	@ApiMethod(name = "gerentes.distrito.adicionarGerente")
	public GerenteDistrito insertGerenteDistrito(GerenteDistrito gerentedistrito) {
		CrudGerencias crud = new CrudGerencias();
		return crud.insertGerenteDistrito(gerentedistrito);
	}
	
	@ApiMethod(name = "gerentes.distrito.actualizarGerente")
	public GerenteDistrito updateGerenteDistrito(GerenteDistrito gerentedistrito) {
		CrudGerencias crud = new CrudGerencias();
		return crud.updateGerenteDistrito(gerentedistrito);	
	}

	@ApiMethod(name = "gerentes.distrito.eliminarGerente")
	public GerenteDistrito removeGerenteDistrito(@Named("id") Long id) {
		CrudGerencias crud = new CrudGerencias();
		return crud.removeGerenteDistrito(id);
	}
	
	@ApiMethod(name = "gerentes.division.listarGerentes")
	public CollectionResponse<GerenteDivision> listGerenteDivision(
			@Nullable @Named("dependencias") Boolean dependencias,
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit			
			) {

			CrudGerencias crud = new CrudGerencias();
			return crud.listGerenteDivision(cursorString, limit, dependencias);	
		
			}	
	
	@ApiMethod(name = "gerentes.division.obtenerGerentePorId")
	public GerenteDivision getGerenteDivision(@Nullable @Named("dependencias") Boolean dependencias,@Named("id") Long id			
			) {
		CrudGerencias crud = new CrudGerencias();
		return crud.getGerenteDivision(id, dependencias);
	}

	@ApiMethod(name = "gerentes.division.adicionarGerente")
	public GerenteDivision insertGerenteDivision(GerenteDivision gerentedivision) {
		CrudGerencias crud = new CrudGerencias();
		return crud.insertGerenteDivision(gerentedivision);
	}

	@ApiMethod(name = "gerentes.division.actualizarGerente")
	public GerenteDivision updateGerenteDivision(GerenteDivision gerentedivision) {
		CrudGerencias crud = new CrudGerencias();
		return crud.updateGerenteDivision(gerentedivision);
	}

	@ApiMethod(name = "gerentes.division.eliminarGerente")
	public GerenteDivision removeGerenteDivision(@Named("id") Long id) {
		CrudGerencias crud = new CrudGerencias();
		return crud.removeGerenteDivision(id);
	}
	
	@ApiMethod(name = "gerentes.empresa.listarGerentes")
	public CollectionResponse<GerenteEmpresa> listGerenteEmpresa(
			@Nullable @Named("dependencias") Boolean dependencias,
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit			
			) {

		CrudGerencias crud = new CrudGerencias();
		return crud.listGerenteEmpresa(cursorString, limit, dependencias);
	}

	@ApiMethod(name = "gerentes.empresa.obtenerGerentePorId")
	public GerenteEmpresa getGerenteEmpresa(@Nullable @Named("dependencias") Boolean dependencias,@Named("id") Long id			
			) {
		CrudGerencias crud = new CrudGerencias();
		return crud.getGerenteEmpresa(id, dependencias);
	}

	@ApiMethod(name = "gerentes.empresa.adicionarGerente")
	public GerenteEmpresa insertGerenteEmpresa(GerenteEmpresa gerenteempresa) {
		CrudGerencias crud = new CrudGerencias();
		return crud.insertGerenteEmpresa(gerenteempresa);
	}

	@ApiMethod(name = "gerentes.empresa.actualizarGerente")
	public GerenteEmpresa updateGerenteEmpresa(GerenteEmpresa gerenteempresa) {
		CrudGerencias crud = new CrudGerencias();
		return crud.updateGerenteEmpresa(gerenteempresa);
	}

	@ApiMethod(name = "gerentes.empresa.eliminarGerente")
	public GerenteEmpresa removeGerenteEmpresa(@Named("id") Long id) {
		CrudGerencias crud = new CrudGerencias();
		return crud.removeGerenteEmpresa(id);
	}
	
	@ApiMethod(name = "gerentes.pais.listarGerentes")
	public CollectionResponse<GerentePais> listGerentePais(
			@Nullable @Named("dependencias") Boolean dependencias,
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit			
			) {

		CrudGerencias crud = new CrudGerencias();
		return crud.listGerentePais(cursorString, limit, dependencias);
		
	}

	@ApiMethod(name = "gerentes.pais.obtenerGerentePorId")
	public GerentePais getGerentePais(@Nullable @Named("dependencias") Boolean dependencias,@Named("id") Long id			
			) {
		CrudGerencias crud = new CrudGerencias();
		return crud.getGerentePais(id, dependencias);
	}

	@ApiMethod(name = "gerentes.pais.adicionarGerente")
	public GerentePais insertGerentePais(GerentePais gerentepais) {
		CrudGerencias crud = new CrudGerencias();
		return crud.insertGerentePais(gerentepais);
	}

	@ApiMethod(name = "gerentes.pais.actualizarGerente")
	public GerentePais updateGerentePais(GerentePais gerentepais) {
		CrudGerencias crud = new CrudGerencias();
		return crud.updateGerentePais(gerentepais);
	}

	@ApiMethod(name = "gerentes.pais.eliminarGerente")
	public GerentePais removeGerentePais(@Named("id") Long id) {
		CrudGerencias crud = new CrudGerencias();
		return crud.removeGerentePais(id);
	}
	
	@ApiMethod(name = "gerentes.regional.listarGerentes")
	public CollectionResponse<GerenteRegional> listGerenteRegional(
			@Nullable @Named("dependencias") Boolean dependencias,
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit			
			) {
		CrudGerencias crud = new CrudGerencias();
		return crud.listGerenteRegional(cursorString, limit, dependencias);
	}

	@ApiMethod(name = "gerentes.regional.obtenerGerentePorId")
	public GerenteRegional getGerenteRegional(@Nullable @Named("dependencias") Boolean dependencias,@Named("id") Long id			
			) {
		CrudGerencias crud = new CrudGerencias();
		return crud.getGerenteRegional(id, dependencias);
	}

	@ApiMethod(name = "gerentes.regional.adicionarGerente")
	public GerenteRegional insertGerenteRegional(GerenteRegional gerenteregional) {
		CrudGerencias crud = new CrudGerencias();
		return crud.insertGerenteRegional(gerenteregional);
	}

	@ApiMethod(name = "gerentes.regional.actualizarGerente")
	public GerenteRegional updateGerenteRegional(GerenteRegional gerenteregional) {
		CrudGerencias crud = new CrudGerencias();
		return crud.updateGerenteRegional(gerenteregional);
	}

	@ApiMethod(name = "gerentes.regional.eliminarGerente")
	public GerenteRegional removeGerenteRegional(@Named("id") Long id) {
		CrudGerencias crud = new CrudGerencias();
		return crud.removeGerenteRegional(id);
	}
	
	@ApiMethod(name = "gerentes.linea.listarGerentes")
	public CollectionResponse<GerenteLinea> listGerenteLinea(
			@Nullable @Named("dependencias") Boolean dependencias,
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit			
			) {
		CrudGerencias crud = new CrudGerencias();
		return crud.listGerenteLinea(cursorString, limit, dependencias);	
	}

	@ApiMethod(name = "gerentes.linea.obtenerGerentePorId")
	public GerenteLinea getGerenteLinea(@Named("id") Long id) {
		CrudGerencias crud = new CrudGerencias();
		return crud.getGerenteLinea(id);
	}

	@ApiMethod(name = "gerentes.linea.adicionarGerente")
	public GerenteLinea insertGerenteLinea(GerenteLinea gerentelinea) {
		CrudGerencias crud = new CrudGerencias();
		return crud.insertGerenteLinea(gerentelinea);
	}

	@ApiMethod(name = "gerentes.linea.actualizarGerente")
	public GerenteLinea updateGerenteLinea(GerenteLinea gerentelinea) {
		CrudGerencias crud = new CrudGerencias();
		return crud.updateGerenteLinea(gerentelinea);
	}

	@ApiMethod(name = "gerentes.linea.eliminarGerente")
	public GerenteLinea removeGerenteLinea(@Named("id") Long id) {
		CrudGerencias crud = new CrudGerencias();
		return crud.removeGerenteLinea(id);
	}
	
	
	@ApiMethod(name = "linea.listarLineas")
	public CollectionResponse<Linea> listLinea(
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit) {

		CrudLinea crud = new CrudLinea();
		return crud.listLinea(cursorString, limit);
		
	}

	@ApiMethod(name = "linea.obtenerLineaId")
	public Linea getLinea(@Named("id") Long id) {
		CrudLinea crud = new CrudLinea();
		return crud.getLinea(id);
	}

	@ApiMethod(name = "linea.adicionarLinea")
	public Linea insertLinea(Linea linea) {
		CrudLinea crud = new CrudLinea();
		return crud.insertLinea(linea);
	}

	@ApiMethod(name = "linea.actualizarLinea")
	public Linea updateLinea(Linea linea) {
		CrudLinea crud = new CrudLinea();
		return crud.updateLinea(linea);
	}

	@ApiMethod(name = "linea.eliminarLinea")
	public Linea removeLinea(@Named("id") Long id) {
		CrudLinea crud = new CrudLinea();
		return crud.removeLinea(id);
	}
	
	@ApiMethod(name = "pais.listarPais")
	public CollectionResponse<Pais> listPais(
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit) {
			CrudPais crud = new CrudPais();
			return crud.listPais(cursorString, limit);		
	}

	
	@ApiMethod(name = "pais.obtenerPaisId")
	public Pais getPais(@Named("id") Long id) {
		CrudPais crud = new CrudPais();
		return crud.getPais(id);
	}

	@ApiMethod(name = "pais.adicionarPais")
	public Pais insertPais(Pais pais) {
		CrudPais crud = new CrudPais();
		return crud.insertPais(pais);
	}

	@ApiMethod(name = "pais.actualizarPais")
	public Pais updatePais(Pais pais) {
		CrudPais crud = new CrudPais();
		return crud.updatePais(pais);
	}

	@ApiMethod(name = "pais.eliminarPais")
	public Pais removePais(@Named("id") Long id) {
		CrudPais crud = new CrudPais();
		return crud.removePais(id);
	}
	
	@ApiMethod(name = "unidadVisita.listar")
	public CollectionResponse<UnidadVisita> listUnidadVisita(
			@Nullable @Named("dependencias") Boolean dependencias,
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit			
			) {
			CrudUnidadVisita crud = new CrudUnidadVisita();
			return crud.listUnidadVisita(cursorString, limit, dependencias);
		}

	
	@ApiMethod(name = "unidadVisita.obtenerPorId")
	public UnidadVisita getUnidadVisita(@Nullable @Named("dependencias") Boolean dependencias,@Named("id") Long id			
			) {
		CrudUnidadVisita crud = new CrudUnidadVisita();
		return crud.getUnidadVisita(id, dependencias);
	}

	@ApiMethod(name = "unidadVisita.adicionarUnidadVisita")
	public UnidadVisita insertUnidadVisita(UnidadVisita unidadvisita) {
		CrudUnidadVisita crud = new CrudUnidadVisita();
		return crud.insertUnidadVisita(unidadvisita);
	}

	
	@ApiMethod(name = "unidadVisita.actualizarUnidadVisita")
	public UnidadVisita updateUnidadVisita(UnidadVisita unidadvisita) {
		CrudUnidadVisita crud = new CrudUnidadVisita();
		return crud.updateUnidadVisita(unidadvisita);
	}

	@ApiMethod(name = "unidadVisita.eliminarUnidadVisita")
	public UnidadVisita removeUnidadVisita(@Named("id") Long id) {
		CrudUnidadVisita crud = new CrudUnidadVisita();
		return crud.removeUnidadVisita(id);
	}
	
	
	@ApiMethod(name = "visitas.planeacion.listar")
	public CollectionResponse<VisitaPlaneada> listVisitaPlaneada(
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit
			
			) {

				com.fachada.visita.CrudVisita crud = new CrudVisita();
				return crud.listVisitaPlaneada(cursorString, limit);
		
			}
	
	@SuppressWarnings("deprecation")
	@ApiMethod(name = "visitas.planeacion.listarByDate")
	public CollectionResponse<VisitaPlaneada> obtenerVisitaPlaneadaByDate(
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit,
			@Nullable @Named("dependencias") Boolean dependencias,
			@Nullable @Named("Year") int year,
			@Nullable @Named("Month") int month,
			@Nullable @Named("Day") int day
			) {

				com.fachada.visita.CrudVisita crud = new CrudVisita();
				return crud.listVisitaPlaneadaByDate(cursorString, limit, dependencias, new Date(year-1900,month,day,05,00));
		
			}
	
	@ApiMethod(name = "visitas.planeacion.obtenerPorId")
	public VisitaPlaneada getVisitaPlaneada(@Named("id") Long id) {
		com.fachada.visita.CrudVisita crud = new CrudVisita();
		return crud.getVisitaPlaneada(id);
	}

	
	@ApiMethod(name = "visitas.planeacion.adicionar")
	public VisitaPlaneada insertVisitaPlaneada(VisitaPlaneada visitaplaneada) {
		com.fachada.visita.CrudVisita crud = new CrudVisita();
		return crud.insertVisitaPlaneada(visitaplaneada);
	}

	
	@ApiMethod(name = "visitas.planeacion.actualizar")
	public VisitaPlaneada updateVisitaPlaneada(VisitaPlaneada visitaplaneada) {
		com.fachada.visita.CrudVisita crud = new CrudVisita();
		return crud.updateVisitaPlaneada(visitaplaneada);
	}

	
	@ApiMethod(name = "visitas.planeacion.eliminar")
	public VisitaPlaneada removeVisitaPlaneada(@Named("id") Long id) {
		com.fachada.visita.CrudVisita crud = new CrudVisita();
		return crud.removeVisitaPlaneada(id);
	}

	@ApiMethod(name = "visitas.realizada.listar")
	public CollectionResponse<VisitaRealizada> listVisitaRealizada(
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit) {

		com.fachada.visita.CrudVisita crud = new CrudVisita();
		return crud.listVisitaRealizada(cursorString, limit);
	}

	
	@ApiMethod(name = "visitas.realizada.obtenerPorId")
	public VisitaRealizada getVisitaRealizada(@Named("id") Long id) {
		com.fachada.visita.CrudVisita crud = new CrudVisita();
		return crud.getVisitaRealizada(id);
	}

	@ApiMethod(name = "visitas.realizada.adicionar")
	public VisitaRealizada insertVisitaRealizada(VisitaRealizada visitarealizada) {
		com.fachada.visita.CrudVisita crud = new CrudVisita();
		return crud.insertVisitaRealizada(visitarealizada);
	}

	
	@ApiMethod(name = "visitas.realizada.actualizar")
	public VisitaRealizada updateVisitaRealizada(VisitaRealizada visitarealizada) {
		com.fachada.visita.CrudVisita crud = new CrudVisita();
		return crud.updateVisitaRealizada(visitarealizada);
	}

	
	@ApiMethod(name = "visitas.realizada.eliminar")
	public VisitaRealizada removeVisitaRealizada(@Named("id") Long id) {
		com.fachada.visita.CrudVisita crud = new CrudVisita();
		return crud.removeVisitaRealizada(id);
	}
	
	@ApiMethod(name = "productos.listar")
	public CollectionResponse<Productos> listProductos(
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit) {
		CrudProductos crud = new CrudProductos();
		return crud.listProductos(cursorString, limit);
		
	}

	@ApiMethod(name = "productos.obtenerPorId")
	public Productos getProductos(@Named("id") Long id) {
		CrudProductos crud = new CrudProductos();
		return crud.getProductos(id);
	}

	@ApiMethod(name = "productos.insertar")
	public Productos insertProductos(Productos productos) {
		CrudProductos crud = new CrudProductos();
		return crud.insertProductos(productos);
	}

	@ApiMethod(name = "productos.actualizar")
	public Productos updateProductos(Productos productos) {
		CrudProductos crud = new CrudProductos();
		return crud.updateProductos(productos);
	}

	@ApiMethod(name = "productos.eliminar")
	public Productos removeProductos(@Named("id") Long id) {
		CrudProductos crud = new CrudProductos();
		return crud.removeProductos(id);
	}
	
	@ApiMethod(name = "blob.rutaSubidaBlob")
	public BlobResult getUrlBlob(@Named("Ruta") String url) {
		CrudFiles crud = new CrudFiles();
		return crud.getUrlBlob(url);
	}
	
	@ApiMethod(
		  name = "blob.obtenerRutaImagenAlojada",		     
	      httpMethod = HttpMethod.GET		      
	  )
	public FileHefesoftProperties FileHefesoftProperties(@Named("Filename") String filenameofImage)
	{
		CrudFiles crud = new CrudFiles();
		return crud.FileHefesoftProperties(filenameofImage);
	}	
}
