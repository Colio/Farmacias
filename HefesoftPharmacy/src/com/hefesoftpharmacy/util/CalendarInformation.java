package com.hefesoftpharmacy.util;

public class CalendarInformation {

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	private long id;
	private String username;
	public CalendarInformation(long id, String username) {
		super();
		this.id = id;
		this.username = username;
	}
	
	
	
}
