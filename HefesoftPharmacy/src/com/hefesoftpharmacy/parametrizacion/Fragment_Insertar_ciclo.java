package com.hefesoftpharmacy.parametrizacion;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.gson.GsonFactory;
import com.google.api.services.hefesoftpharmacy.Hefesoftpharmacy;
import com.google.api.services.hefesoftpharmacy.model.BlobResult;
import com.google.api.services.hefesoftpharmacy.model.FileHefesoftProperties;
import com.hefesoftpharmacy.GlobalVars;
import com.hefesoftpharmacy.R;
import com.hefesoftpharmacy.AsyncTask.AsyncTaskCompleteListener;
import com.hefesoftpharmacy.AsyncTask.Blob_Url_By_Filename_Async;
import com.hefesoftpharmacy.AsyncTask.Guardar_Medico_Async;
import com.hefesoftpharmacy.AsyncTask.Obtener_Ruta_Blob_Async;
import com.hefesoftpharmacy.AsyncTask.Post_Big_String_Async;
import com.hefesoftpharmacy.AsyncTask.Put_Medicos_Async;
import com.hefesoftpharmacy.util.ImageLoader;

public class Fragment_Insertar_ciclo extends Fragment {


	//Servicio Generado por el app engine
	Hefesoftpharmacy service;	
	final HttpTransport transport = AndroidHttp.newCompatibleTransport();
	final JsonFactory jsonFactory = new GsonFactory();
	Activity activity;	
	View view;
	
	//Controles en la vista
	private EditText Apellidos;
	private EditText Nombres;
	private EditText Email;
	private EditText Direccion;
	private ImageButton Insertar;
	private EditText Telefono;
	private EditText TelefonoCelular;
	private ImageButton Imagen_Button;
	private ImageView ImagenMedico;	
	private View mLoginFormView;
	private View mLoginStatusView;
	private EditText Cedula;
	public String modo;
	
	//Variables
	BlobResult ruta;
	com.google.api.services.hefesoftpharmacy.model.Medicos Medicos;
	

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		view = inflater.inflate(com.hefesoftpharmacy.R.layout.medico_insertar, container, false);
		
		Apellidos = (EditText)view.findViewById(com.hefesoftpharmacy.R.id.Medico_Apellidos);
		Nombres = (EditText)view.findViewById(com.hefesoftpharmacy.R.id.Medico_Nombres);
		Cedula = (EditText)view.findViewById(com.hefesoftpharmacy.R.id.Medico_Numero_Documento);
		Email = (EditText)view.findViewById(com.hefesoftpharmacy.R.id.Medico_Email);
		Direccion = (EditText)view.findViewById(com.hefesoftpharmacy.R.id.Medico_Direccion);
		Telefono = (EditText)view.findViewById(com.hefesoftpharmacy.R.id.Medico_Telefono);
		TelefonoCelular = (EditText)view.findViewById(com.hefesoftpharmacy.R.id.Medico_Telefono_Celular);
		ImagenMedico = (ImageView)view.findViewById(com.hefesoftpharmacy.R.id.Medico_Imagen);
		Insertar = (ImageButton)view.findViewById(com.hefesoftpharmacy.R.id.Medico_Save);
		Imagen_Button = (ImageButton)view.findViewById(com.hefesoftpharmacy.R.id.Medico_Imagen_Button);
		Insertar.setOnClickListener(insertarEvent);
		Imagen_Button.setEnabled(false);
		Imagen_Button.setOnClickListener(cargarImagen);
		activity = getActivity();
		service = new Hefesoftpharmacy(transport, jsonFactory, null);
		mLoginFormView = view.findViewById(R.id.Medico_Form);
		mLoginStatusView = view.findViewById(R.id.progressanimator_container);
		
		modo = "Guardar";
		
		return view;
	}

	public void inicializarGuardarActualizar(com.google.api.services.hefesoftpharmacy.model.Medicos medico) {
		
		limpiarCajarTexto();
		
		if(medico != null)
		{
			Medicos =  medico;
			Cedula.setText(Medicos.getCedula());
			Apellidos.setText(Medicos.getApellidos());
			Nombres.setText(Medicos.getNombres());
			Email.setText(Medicos.getEmail());
			Direccion.setText(Medicos.getDireccion());
			Telefono.setText(Medicos.getTelefono());
			TelefonoCelular.setText(Medicos.getTelefonoCelular());
			
			
			int loader = R.drawable.ic_launcher;
	        ImageLoader imgLoader = new ImageLoader(activity.getApplicationContext());
	        imgLoader.DisplayImage(Medicos.getImagenUrl(), loader, ImagenMedico);
	        
	        Imagen_Button.setEnabled(true);
	        Imagen_Button.setEnabled(true);
			
	        modo = "Actualizar";
		}
		else
		{
			modo = "Guardar";
		}
	}
	
	
	// Guarda el medico en el app engine
	private OnClickListener insertarEvent = new OnClickListener() {		
		
		@Override
		public void onClick(View v) {
			
			Boolean valido = true;
			CharSequence error = "El campo es requerido";
			valido = validarControles(valido, error);
			
			if(modo == "Guardar")
			{
				if(valido)
				{
					Medicos = new com.google.api.services.hefesoftpharmacy.model.Medicos();
					Medicos.setNombres(Nombres.getText().toString());
					Medicos.setCedula(Cedula.getText().toString());
					Medicos.setApellidos(Apellidos.getText().toString());
					Medicos.setEmail(Email.getText().toString());
					Medicos.setDireccion(Direccion.getText().toString());
					Medicos.setTelefono(Telefono.getText().toString());
					Medicos.setTelefonoCelular(TelefonoCelular.getText().toString());
					Medicos.setCordenadas(GlobalVars.Location.getLatitude() + "," + GlobalVars.Location.getLongitude());
					
					Guardar_Medico_Async guardarMedico = new Guardar_Medico_Async(activity, resultadoGuardarMedico);
					guardarMedico.medico = Medicos;
					guardarMedico.execute(this);
					
					Obtener_Ruta_Blob_Async rutaBlob = new Obtener_Ruta_Blob_Async(activity, resultadoRutaBlob);
					rutaBlob.execute(this);
					showProgress(true, "Guardando...");
					
				}
			}
			else
			{	
				Medicos.setNombres(Nombres.getText().toString());
				Medicos.setCedula(Cedula.getText().toString());
				Medicos.setApellidos(Apellidos.getText().toString());
				Medicos.setEmail(Email.getText().toString());
				Medicos.setDireccion(Direccion.getText().toString());
				Medicos.setTelefono(Telefono.getText().toString());
				Medicos.setTelefonoCelular(TelefonoCelular.getText().toString());
				Medicos.setCordenadas(GlobalVars.Location.getLatitude() + "," + GlobalVars.Location.getLongitude());
				
				Put_Medicos_Async actualizarMedico = new Put_Medicos_Async(activity);
				actualizarMedico.medico = Medicos;
				actualizarMedico.execute(this);
				
				((com.hefesoftpharmacy.parametrizacion.Medicos)activity).actualizarElementoCreado(Medicos);
			}
		}
	};
	
	//Dispara el evento de la llamada a la camara
	private OnClickListener cargarImagen = new OnClickListener() {
		
		@Override
		public void onClick(View v) {			
			dispatchTakePictureIntent(1);
			
			if(modo == "Guardar")
			{
				
			}
			else
			{
				Obtener_Ruta_Blob_Async rutaBlob = new Obtener_Ruta_Blob_Async(activity, resultadoRutaBlob);
				rutaBlob.execute(this);
				showProgress(true, "generando ruta subida imagen");
			}
			
		}
	};	
	
	//Muestra la camara
	private void dispatchTakePictureIntent(int actionCode) {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(takePictureIntent, actionCode);
    }

	//Recibe el resultado de lo que se capturo en la camara
	@Override
	public void onActivityResult(int requestCode, int resultCode, Intent data) {
		
		Boolean finalizado = false;
		if(resultCode != 0)
		{
		  Bundle extras = data.getExtras();
	      Bitmap mImageBitmap = (Bitmap) extras.get("data");
	      ImagenMedico.setImageBitmap(mImageBitmap);		
	      
	      Post_Big_String_Async imagen = new Post_Big_String_Async(getActivity(), cargaImagenCompletada);
		  imagen.Url = ruta.getPath();
		  imagen.Imagen = mImageBitmap;
		  imagen.idImagen = Medicos.getId().getId().toString() + ".jpg";
		  imagen.execute(this);
		  showProgress(true, "Subiendo imagen");
		  finalizado = false;
		}
		else
		{
			finalizado = true;
			showProgress(false, "Cargando...");
			limpiarCajarTexto();
		}
	      
		if(modo != "Guardar")
		{
			showProgress(true, "Subiendo imagen");
		}
		
		if(finalizado && modo == "Guardar")
		{
			((com.hefesoftpharmacy.parametrizacion.Medicos)activity).adicionarElementoCreado(Medicos);
		}
		
		super.onActivityResult(requestCode, resultCode, data);
	}
	




	//Se dispara cuando el medico se guardo
	AsyncTaskCompleteListener<com.google.api.services.hefesoftpharmacy.model.Medicos> resultadoGuardarMedico = new AsyncTaskCompleteListener<com.google.api.services.hefesoftpharmacy.model.Medicos>() {
		
		@Override
		public void onTaskComplete(com.google.api.services.hefesoftpharmacy.model.Medicos result) {
			 
			Medicos = result;
			showProgress(false, "Cargando");
			dispatchTakePictureIntent(1);
		}
	};
	
	//Trae la ruta del blob en el app engine donde se guardara la imagen
	AsyncTaskCompleteListener<BlobResult> resultadoRutaBlob = new AsyncTaskCompleteListener<BlobResult>() {
		
		@Override
		public void onTaskComplete(BlobResult result) {
			ruta = result;		
			
			if(modo == "Guardar")
			{
				
			}
			else
			{
				showProgress(false, "Cargando");
			}
			
		}
	};
	
	//Ruta donde quedo guardada la imagen
	public AsyncTaskCompleteListener<FileHefesoftProperties> rutaUrlCargada = new AsyncTaskCompleteListener<FileHefesoftProperties>() {
		
		@Override
		public void onTaskComplete(FileHefesoftProperties result) {
			
			Medicos.setImagenUrl(result.getName());
			Put_Medicos_Async actualizarMedico = new Put_Medicos_Async(activity);
			actualizarMedico.medico = Medicos;
			actualizarMedico.execute(this);
			
			showProgress(false, "Cargando...");
			
			if(modo == "Guardar")
			{
				((com.hefesoftpharmacy.parametrizacion.Medicos)activity).adicionarElementoCreado(Medicos);
			}
			else
			{
				((com.hefesoftpharmacy.parametrizacion.Medicos)activity).actualizarElementoCreado(Medicos);
			}
			
			limpiarCajarTexto();
		}
	};
	
	////Se dispara cuando se subio la imagen al blob
	private AsyncTaskCompleteListener<Boolean> cargaImagenCompletada = new AsyncTaskCompleteListener<Boolean>() {		
		@Override
		public void onTaskComplete(Boolean result) {
			Blob_Url_By_Filename_Async url = new Blob_Url_By_Filename_Async(activity, rutaUrlCargada);
			url.filename = Medicos.getId().getId().toString() + ".jpg";
			url.execute(this);
		}
	};
	
	// Metodo que muestra la animacion del cargador
	@TargetApi(Build.VERSION_CODES.HONEYCOMB_MR2)
	public void showProgress(final boolean show, String mensaje) {
		
		TextView tx = (TextView)view.findViewById(R.id.progressanimator_text);
		tx.setText(mensaje);
		
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB_MR2) {
			int shortAnimTime = getResources().getInteger(
					android.R.integer.config_shortAnimTime);
	
						
			mLoginStatusView.setVisibility(View.VISIBLE);
			mLoginStatusView.animate().setDuration(shortAnimTime)
					.alpha(show ? 1 : 0)
					.setListener(new AnimatorListenerAdapter() {
						@Override
						public void onAnimationEnd(Animator animation) {
							mLoginStatusView.setVisibility(show ? View.VISIBLE
									: View.GONE);
						}
					});
	
			mLoginFormView.setVisibility(View.VISIBLE);
			mLoginFormView.animate().setDuration(shortAnimTime)
					.alpha(show ? 0 : 1)
					.setListener(new AnimatorListenerAdapter() {
						@Override
						public void onAnimationEnd(Animator animation) {
							mLoginFormView.setVisibility(show ? View.GONE
									: View.VISIBLE);
						}
					});
		} else {
			
			mLoginStatusView.setVisibility(show ? View.VISIBLE : View.GONE);
			mLoginFormView.setVisibility(show ? View.GONE : View.VISIBLE);
		}
	}

	public Boolean validarControles(Boolean valido, CharSequence error) {
		if(!(Apellidos.getText().toString().trim().length() > 0))
		{
			valido = false;
			Apellidos.setError(error);
		}
		else
		{
			Apellidos.setError(null);
		}
	
		if(!(Nombres.getText().toString().trim().length() > 0))
		{
			valido = false;
			Nombres.setError(error);
		}
		else
		{
			Nombres.setError(null);
		}
		
		
		if(!(Cedula.getText().toString().trim().length() > 0))
		{
			valido = false;
			Nombres.setError(error);
		}
		else
		{
			Nombres.setError(null);
		}
		
		return valido;
	}
	
	// Limpia las cajas de texto
	public void limpiarCajarTexto() {
		try {
			Apellidos.setText("");
			Nombres.setText("");
			Email.setText("");
			Direccion.setText("");
			Telefono.setText("");
			TelefonoCelular.setText("");			
			Cedula.setText("");
			ImagenMedico.setImageResource(R.drawable.image_medic);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
	
