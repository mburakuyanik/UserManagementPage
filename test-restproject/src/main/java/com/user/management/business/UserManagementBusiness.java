package com.user.management.business;

import java.util.List;

import com.user.management.model.UserModel;
import com.user.management.model.input.UserCredentialInput;
import com.user.management.model.input.UserRegistrationInput;
import com.user.management.model.output.UserModelOutput;
import com.user.management.rest.UserCredentialOutput;
import com.user.management.rest.UserRegistrationOutput;

public interface UserManagementBusiness {

	public UserModelOutput getAllUsers();
	public List<UserModel> testGetAllUsers();
	public UserRegistrationOutput addUser(UserRegistrationInput userModelInput);
	public UserCredentialOutput login(UserCredentialInput input);
	
}
