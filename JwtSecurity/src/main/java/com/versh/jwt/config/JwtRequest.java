package com.versh.jwt.config;

import java.io.Serializable;

public class JwtRequest implements Serializable {

	private static final long serialVersionUID = -1896399051026257822L;
	private String user;
	private String pass;

	//need default constructor for JSON Parsing
	public JwtRequest()
	{

	}

	public JwtRequest(String user, String pass) {
		super();
		this.user = user;
		this.pass = pass;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}


}