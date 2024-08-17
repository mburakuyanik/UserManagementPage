package com.user.management.model.output;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.user.management.model.UserModel;

@XmlRootElement
public class UserModelOutput implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private List<UserModel> userModellist;

	public List<UserModel> getUserModellist() {
		return userModellist;
	}

	public void setUserModellist(List<UserModel> userModellist) {
		this.userModellist = userModellist;
	}
	
	
}
