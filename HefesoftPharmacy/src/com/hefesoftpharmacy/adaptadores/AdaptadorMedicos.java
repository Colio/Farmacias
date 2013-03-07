package com.hefesoftpharmacy.adaptadores;

import java.util.List;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.api.services.hefesoftpharmacy.model.Medicos;
import com.hefesoftpharmacy.R;
import com.hefesoftpharmacy.util.ImageLoader;

public class AdaptadorMedicos extends ArrayAdapter<Object> 
{
    Activity context;
    List<Medicos> datos;
	
	public
    AdaptadorMedicos(Activity context, List<Medicos> datos ) 
    {	
		super(context, R.layout.activity_lista_seleccion,datos.toArray());
    	this.context = context;
    	this.datos = datos;
    }

    public View getView(int position, View convertView, ViewGroup parent) 
    {
    	LayoutInflater inflater = context.getLayoutInflater();
        View  item = inflater.inflate(R.layout.template_medicos, null);
 
        TextView Nombres = (TextView)item.findViewById(R.id.template_medico_nombres);
        TextView Telefonos = (TextView)item.findViewById(R.id.template_medico_telefonos);
        TextView Email = (TextView)item.findViewById(R.id.template_medico_email);
        TextView Direccion = (TextView)item.findViewById(R.id.template_medico_direccion);
        ImageView Imagen = (ImageView)item.findViewById(R.id.template_medico_imagen);
        
        Medicos medico = (Medicos)datos.toArray()[position];
        
                	
        Nombres.setText(medico.getNombres() 
        		+ " " +
        		medico.getApellidos()
        		);
        Telefonos.setText(medico.getTelefono() + " - " + medico.getTelefonoCelular());
        
        Email.setText(medico.getEmail());
        
        Direccion.setText(medico.getDireccion());
        
        int loader = R.drawable.ic_launcher;
        ImageLoader imgLoader = new ImageLoader(context.getApplicationContext());
        imgLoader.DisplayImage(medico.getImagenUrl(), loader, Imagen);
        
        return(item);
    }

	
}
