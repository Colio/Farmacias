package com.hefesoftpharmacy.interaction;

import org.json.JSONException;

import android.content.ClipDescription;
import android.view.DragEvent;
import android.view.View;



public class MyDragEventListener implements View.OnDragListener {
	
	private Interface_Interacion<View> listener;
	
	public MyDragEventListener(Interface_Interacion<View> listener)
	{
		this.listener = listener;
	}
	
	
	
	public boolean onDrag(View v, DragEvent event) {
	   final int action = event.getAction();
	   
	   switch(action) {
	   case DragEvent.ACTION_DRAG_STARTED:    	    
	              if (event.getClipDescription()
	                .hasMimeType(ClipDescription.MIMETYPE_TEXT_PLAIN))
	              {
	              
	               return true; 
	              }else{
	              
	               return false; 
	              }
	   case DragEvent.ACTION_DRAG_ENTERED:
	    
	    return true;
	   case DragEvent.ACTION_DRAG_LOCATION:    	   
	    return true;
	   case DragEvent.ACTION_DRAG_EXITED:    	  
	    return true;
	   case DragEvent.ACTION_DROP:
		   try {
			listener.onDragToListViewComplete(v);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     return true;
	     
	   case DragEvent.ACTION_DRAG_ENDED:
	    if (event.getResult()){    	  
	    } else {    	   
	    };
	              return true;
	   default:     	   
	    return false;
	   }
   }
}