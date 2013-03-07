package com.hefesoftpharmacy.adaptadores;

import java.util.List;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.api.services.hefesoftpharmacy.Hefesoftpharmacy.Medicos;
import com.google.api.services.hefesoftpharmacy.model.Panel;
import com.hefesoftpharmacy.R;
import com.hefesoftpharmacy.util.ImageLoader;

public class AdaptadorPanel extends ArrayAdapter<Object> 
{
    Activity context;
    List<Panel> datos;
	
	public
    AdaptadorPanel(Activity context, List<Panel> datos ) 
    {	
		super(context, R.layout.activity_lista_seleccion,datos.toArray());
    	this.context = context;
    	this.datos = datos;
    }

    public View getView(int position, View convertView, ViewGroup parent) 
    {
    	LayoutInflater inflater = context.getLayoutInflater();
        View  item = inflater.inflate(R.layout.template_panel, null);
 
        TextView Nombres = (TextView)item.findViewById(R.id.template_panel_nombres);
        TextView Telefonos = (TextView)item.findViewById(R.id.template_panel_telefonos);
        TextView Email = (TextView)item.findViewById(R.id.template_panel_email);
        TextView Direccion = (TextView)item.findViewById(R.id.template_panel_direccion);
        ImageView Imagen = (ImageView)item.findViewById(R.id.template_panel_imagen);
        
        Panel panel = (Panel)datos.toArray()[position];
        
        if(panel.getUnidadVisitaEntity().getMedicosEntity() != null )
        {
        	com.google.api.services.hefesoftpharmacy.model.Medicos medico = panel.getUnidadVisitaEntity().getMedicosEntity();
        	
        	Nombres.setText(medico.getNombres() + " " + medico.getApellidos());
        	Telefonos.setText(medico.getTelefono());
        	Email.setText(medico.getEmail());
        	Direccion.setText(medico.getDireccion());
        	
        	int loader = R.drawable.ic_launcher;
            ImageLoader imgLoader = new ImageLoader(context.getApplicationContext());
            imgLoader.DisplayImage(medico.getImagenUrl(), loader, Imagen);
        }
        
        else if(panel.getUnidadVisitaEntity().getFarmaciasEntity() != null )
        {
        	com.google.api.services.hefesoftpharmacy.model.Farmacias farmacias = panel.getUnidadVisitaEntity().getFarmaciasEntity();
        	
        	Nombres.setText(farmacias.getNombre());        	
        	Email.setText(farmacias.getEmail());
        	Direccion.setText(farmacias.getDireccion());
        	
        	int loader = R.drawable.ic_launcher;
            ImageLoader imgLoader = new ImageLoader(context.getApplicationContext());
            imgLoader.DisplayImage(farmacias.getImagen(), loader, Imagen);
        }
                	
        
        
        
        return(item);
    }

	
}
