package com.user.management.rest;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class UserCredentialOutput {

	private int credentialResultCode;
	private String credentialResultDescription;

	public int getCredentialResultCode() {
		return credentialResultCode;
	}

	public void setCredentialResultCode(int credentialResultCode) {
		this.credentialResultCode = credentialResultCode;
	}

	public String getCredentialResultDescription() {
		return credentialResultDescription;
	}

	public void setCredentialResultDescription(String credentialResultDescription) {
		this.credentialResultDescription = credentialResultDescription;
	}

}
