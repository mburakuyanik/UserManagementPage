package com.user.management.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class UserModel {
	
	
	private String username;
	private String email;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
