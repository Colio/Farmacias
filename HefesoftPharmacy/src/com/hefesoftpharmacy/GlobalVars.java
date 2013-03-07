package com.hefesoftpharmacy;
import com.google.api.services.hefesoftpharmacy.Hefesoftpharmacy.Usuarios;
import com.hefesoftpharmacy.util.MyLocation;
import com.hefesoftpharmacy.util.MyLocation.LocationResult;

import android.app.Application;
import android.content.Context;
import android.location.Location;

public class GlobalVars extends Application {
	
	public static String Token = "";
	public static String UsuarioEmail = "";
	public static String Password = "";
	public static Usuarios Usuario;
	public static String urlServices = "https://pharmacyhefesoft.appspot.com/_ah/api/panelendpoint/v1/";
	public static String rutaFotos = "http://190.147.9.61:9090/ClientBin/fotos/";
	public static String cicloActual = "";
	public static Object objetoEntreVistas = null;
	public static Object LstEnMemoria = null;
	private static Context context;
	public static Location Location;
	public static int PosicionSeleccionada = -1;
	
    private static GlobalVars singleton;
    
    public static GlobalVars getInstance() {
        return singleton;
    }
    @Override
    
    public void onCreate() {
    	GlobalVars.context = getApplicationContext();
    	super.onCreate();
        singleton = this;  
        
        MyLocation myLocation = new MyLocation();
        myLocation.getLocation(this, locationResult);
    }
    
    LocationResult locationResult = new LocationResult(){
       

		@Override
        public void gotLocation(Location location){
           Location = location;
        }
    };
    
    public static Context getAppContext() {
        return GlobalVars.context;
    }
    
    private static ConnectionChange connection;
    
    
    
    public static ConnectionChange getConnection() {
		return connection;
	}
	
    public static void setConnection(ConnectionChange connection) {
		GlobalVars.connection = connection;
		
	}
    
    public static void pushConnection(Object obj, Object obj2) {
		
		connection.changeConnection(true,false);
	}

	public static abstract class ConnectionChange{
        public abstract void changeConnection(Object obj, Object obj2);
    }

}