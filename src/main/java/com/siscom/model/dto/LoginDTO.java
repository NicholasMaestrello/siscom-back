package com.siscom.model.dto;

import java.io.Serializable;

public class LoginDTO implements Serializable{

	private static final long serialVersionUID = -2172924568311193835L;

	private String id;
	
	private String password;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
