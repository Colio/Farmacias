package com.hefesoftpharmacy.interaction;

import org.json.JSONException;

public interface Interface_Interacion<T>
{
    /**
     * Invoked when the AsyncTask has completed its execution.
     * @param result The resulting object from the AsyncTask.
     * @throws JSONException 
     */
    public void onDragToListViewComplete(T result) throws JSONException;
}