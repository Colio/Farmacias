package com.hefesoftpharmacy.util;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.TimeZone;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.provider.CalendarContract;
import android.provider.CalendarContract.Calendars;
import android.provider.CalendarContract.Events;
import android.provider.CalendarContract.Reminders;

import com.hefesoftpharmacy.GlobalVars;

public class CalendarsHandler {

	
	public static List<CalendarInformation> getCalendars()
	{	
		
		List<CalendarInformation> lstCalendar = new ArrayList<CalendarInformation>();
		
		String[] projection = 
			      new String[]{
			            Calendars._ID, 
			            Calendars.NAME, 
			            Calendars.ACCOUNT_NAME, 
			            Calendars.ACCOUNT_TYPE};
			Cursor calCursor = 
					GlobalVars.getAppContext().getContentResolver().
			            query(Calendars.CONTENT_URI, 
			                  projection, 
			                  Calendars.VISIBLE + " = 1", 
			                  null, 
			                  Calendars._ID + " ASC");
			if (calCursor.moveToFirst()) {
			   do {
				   
				   lstCalendar.add(new CalendarInformation(calCursor.getLong(0), calCursor.getString(1)));
			      
			      // ...
			   } while (calCursor.moveToNext());
			}
			
			return lstCalendar;
	}
	
	
	@SuppressLint("UseValueOf")
	public static long createCalendar()
	{
		ContentValues values = new ContentValues();
		values.put(
		      Calendars.ACCOUNT_NAME, 
		      "futbolito152@gmail.com");
		values.put(
		      Calendars.ACCOUNT_TYPE, 
		      CalendarContract.ACCOUNT_TYPE_LOCAL);
		values.put(
		      Calendars.NAME, 
		      "GrokkingAndroid Calendar");
		values.put(
		      Calendars.CALENDAR_DISPLAY_NAME, 
		      "GrokkingAndroid Calendar");
		values.put(
		      Calendars.CALENDAR_COLOR,
		      0xffff0000);
		values.put(
		      Calendars.CALENDAR_ACCESS_LEVEL, 
		      Calendars.CAL_ACCESS_OWNER);
		values.put(
		      Calendars.OWNER_ACCOUNT, 
		      "some.account@googlemail.com");
		values.put(
		      Calendars.CALENDAR_TIME_ZONE, 
		      TimeZone.getDefault().getID());
		Uri.Builder builder = 
		      CalendarContract.Calendars.CONTENT_URI.buildUpon(); 
		builder.appendQueryParameter(
		      Calendars.ACCOUNT_NAME, 
		      "com.grokkingandroid");
		builder.appendQueryParameter(
		      Calendars.ACCOUNT_TYPE, 
		      CalendarContract.ACCOUNT_TYPE_LOCAL);
		builder.appendQueryParameter(
		      CalendarContract.CALLER_IS_SYNCADAPTER, 
		      "true");
		Uri uri = 
				GlobalVars.getAppContext().getContentResolver().insert(builder.build(), values);
		return new Long(uri.getLastPathSegment());
	
	}
	
	@SuppressLint("UseValueOf")
	public static long addEvent(int year, int month, int day, int hour,
			String Titulo, String Descripcion,
			String Creador, String Ubicacion,
			int color
			)
	{
		month = month -1;
		Long idEvent = (long)-1;
		List<CalendarInformation> lst = getCalendars();

		Calendar cal = new GregorianCalendar(year, month, day);
		cal.setTimeZone(TimeZone.getTimeZone("UTC"));
		cal.set(Calendar.HOUR, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		
		long start = cal.getTimeInMillis();
		
		ContentValues values = new ContentValues();
		values.put(Events.DTSTART, start);
		values.put(Events.DTEND, start);
		values.put(Events.TITLE, Titulo);
		values.put(Events.EVENT_COLOR, color);
		values.put(Events.EVENT_LOCATION, Ubicacion);
		values.put(Events.CALENDAR_ID, lst.get(0).getId());
		values.put(Events.EVENT_TIMEZONE, TimeZone.getDefault().getID());
		values.put(Events.DESCRIPTION, Descripcion);
		values.put(Events.ACCESS_LEVEL, Events.ACCESS_PRIVATE);
		values.put(Events.SELF_ATTENDEE_STATUS,	Events.STATUS_CONFIRMED);
		values.put(Events.ALL_DAY, 1);
		values.put(Events.ORGANIZER, Creador);
		values.put(Events.GUESTS_CAN_INVITE_OTHERS, 1);
		values.put(Events.GUESTS_CAN_MODIFY, 0);
		values.put(Events.AVAILABILITY, Events.AVAILABILITY_BUSY);
		try {
			Uri uri = GlobalVars.getAppContext().getContentResolver().insert(Events.CONTENT_URI, values);
			idEvent = new Long(uri.getLastPathSegment());
			
			values.clear();
			values.put(Reminders.EVENT_ID, idEvent);
			values.put(Reminders.METHOD, Reminders.METHOD_ALERT);
			values.put(Reminders.MINUTES, 30);
			GlobalVars.getAppContext().getContentResolver().insert(Reminders.CONTENT_URI, values); 
			
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return idEvent;
	}
	
	public static void removeEvent(long id)
	{
	
		String[] selArgs = 
			      new String[]{Long.toString(id)};
			@SuppressWarnings("unused")
			int deleted = 
					GlobalVars.getAppContext().getContentResolver().
			            delete(
			               Events.CONTENT_URI, 
			               Events._ID + " =? ", 
			               selArgs);
		
	}
	
	public static void showCalendar(long id)
	{
		Intent intent = new Intent(Intent.ACTION_VIEW);
		//Android 2.2+
		intent.setData(Uri.parse("content://com.android.calendar/events/" + String.valueOf(id)));  
		//Android 2.1 and below.
		//intent.setData(Uri.parse("content://calendar/events/" + String.valueOf(calendarEventID)));    
		intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		GlobalVars.getAppContext().startActivity(intent);
	}
}
