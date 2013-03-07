package com.fachada.files;

import javax.jdo.annotations.PersistenceCapable;

@PersistenceCapable
public class FileHefesoftProperties {

	
	private String NameFile;

	public String getName() {
		return NameFile;
	}

	public void setName(String name) {
		NameFile = name;
	}
	
}
