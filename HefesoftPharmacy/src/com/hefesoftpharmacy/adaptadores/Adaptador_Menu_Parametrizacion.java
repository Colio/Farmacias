package com.hefesoftpharmacy.adaptadores;

import java.util.List;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.hefesoftpharmacy.R;

@SuppressWarnings("rawtypes")
public class Adaptador_Menu_Parametrizacion extends ArrayAdapter {
	 
    Activity context;
    List<com.hefesoftpharmacy.menu.Menu> datos;
   
    
        @SuppressWarnings("unchecked")
		public
        Adaptador_Menu_Parametrizacion(Activity context, List<com.hefesoftpharmacy.menu.Menu> datos ) {
            super(context, R.layout.activity_fragment_template, datos);
            this.context = context;
            this.datos = datos;
            
        }
 
        public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View  item = inflater.inflate(R.layout.template_menu, null);
 


        if(((com.hefesoftpharmacy.menu.Menu) datos.toArray()[position]).getId() == 1)
        {
	        TextView lblTitulo = (TextView)item.findViewById(R.id.template_menu_nombre);
	    	lblTitulo.setText(((com.hefesoftpharmacy.menu.Menu) datos.toArray()[position]).getNombre());    	
	       	
	    	ImageView imagen = (ImageView)item.findViewById(R.id.image_Menu);
	    	imagen.setImageResource(R.drawable.image_medic);
        }
        
        else if(((com.hefesoftpharmacy.menu.Menu) datos.toArray()[position]).getId() == 2)
        {
	        TextView lblTitulo = (TextView)item.findViewById(R.id.template_menu_nombre);
	    	lblTitulo.setText(((com.hefesoftpharmacy.menu.Menu) datos.toArray()[position]).getNombre());    	
	       	
	    	ImageView imagen = (ImageView)item.findViewById(R.id.image_Menu);
	    	imagen.setImageResource(R.drawable.ic_launcher);
        }
        
        else if(((com.hefesoftpharmacy.menu.Menu) datos.toArray()[position]).getId() == 3)
        {
	        TextView lblTitulo = (TextView)item.findViewById(R.id.template_menu_nombre);
	    	lblTitulo.setText(((com.hefesoftpharmacy.menu.Menu) datos.toArray()[position]).getNombre());    	
	       	
	    	ImageView imagen = (ImageView)item.findViewById(R.id.image_Menu);
	    	imagen.setImageResource(R.drawable.ic_launcher);
        }
        
        else if(((com.hefesoftpharmacy.menu.Menu) datos.toArray()[position]).getId() == 4)
        {
	        TextView lblTitulo = (TextView)item.findViewById(R.id.template_menu_nombre);
	    	lblTitulo.setText(((com.hefesoftpharmacy.menu.Menu) datos.toArray()[position]).getNombre());    	
	       	
	    	ImageView imagen = (ImageView)item.findViewById(R.id.image_Menu);
	    	imagen.setPadding(8, 0, 0, 0);
	    	imagen.setImageResource(R.drawable.ic_launcher);
        }
        
        return(item);
    }
}

