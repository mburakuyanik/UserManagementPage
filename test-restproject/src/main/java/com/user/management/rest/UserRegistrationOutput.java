package com.user.management.rest;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class UserRegistrationOutput {

	private int registrationResultCode;
	private String registrationResultDescription;
	
	public int getRegistrationResultCode() {
		return registrationResultCode;
	}
	public void setRegistrationResultCode(int registrationResultCode) {
		this.registrationResultCode = registrationResultCode;
	}
	public String getRegistrationResultDescription() {
		return registrationResultDescription;
	}
	public void setRegistrationResultDescription(String registrationResultDescription) {
		this.registrationResultDescription = registrationResultDescription;
	}


}
