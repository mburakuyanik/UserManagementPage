package com.user.management.business.impl;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.user.management.business.UserManagementBusiness;
import com.user.management.dao.UserDao;
import com.user.management.entity.User;
import com.user.management.model.UserModel;
import com.user.management.model.input.UserCredentialInput;
import com.user.management.model.input.UserRegistrationInput;
import com.user.management.model.output.UserModelOutput;
import com.user.management.rest.UserCredentialOutput;
import com.user.management.rest.UserRegistrationOutput;
import com.user.management.dao.impl.HibernateDaoImpl;

public class UserManagementBusinessImpl implements UserManagementBusiness {

	@Inject
	UserDao userDao;

	@Override
	public UserModelOutput getAllUsers() {

		return buildUserModelOutput(getUserListFromDb());
	}

	public List<UserModel> testGetAllUsers() {
		List<UserModel> userModelList = new ArrayList();
		userModelList = userDao.findAllUsers();
		return userModelList;

	}

	private UserModelOutput buildUserModelOutput(List<UserModel> userModelList) {

		UserModelOutput userModelOutput = new UserModelOutput();
		if (userModelList != null && userModelList.size() >= 1) {
			userModelOutput.setUserModellist(userModelList);
			for (UserModel userModel : userModelList) {
				userModel.setEmail(null);
			}
		}

		return userModelOutput;

	}

	private UserModelOutput testBuildUserModelOutput() {
		return null;
	}

	private List<UserModel> getUserListFromDb() {
//		UserModel userModel1 = new UserModel();
//		userModel1.setEmail("test1@test.com");
//		userModel1.setUsername("user1");
//		
//		UserModel userModel2 = new UserModel();
//		userModel2.setEmail("test2@test.com");
//		userModel2.setUsername("user2");
//		
		List<UserModel> userModelList = new ArrayList();
//		userModelList.add(userModel1);
//		userModelList.add(userModel2);

		userModelList = userDao.findAllUsers();
		return userModelList;
	}

	private User buildTestUserA(UserRegistrationInput userModelInput) {
		User TestUserA = new User();
//		TestUserA.setEmail(userModelInput.getEmail());
//		TestUserA.setPassword(userModelInput.getPassword());
//		TestUserA.setStatus(0);
//		TestUserA.setUsername(userModelInput.getUsername());
		return TestUserA;
	}

	public UserRegistrationOutput addUser(UserRegistrationInput userModelInput) {
		// null kontrolu vs eklenmeli
		User TestUserA = buildTestUserA(userModelInput);
		userDao.addUser(TestUserA);

		UserRegistrationOutput userRegistrationOutput = new UserRegistrationOutput();

		// bunlari propertyden okumak lazim.

		userRegistrationOutput.setRegistrationResultCode(200);
		userRegistrationOutput.setRegistrationResultDescription("Basarili");

		return userRegistrationOutput;
	}

	private User buildTestUserA(UserCredentialInput input) {
		User TestUserA = new User();
//		TestUserA.setPassword(input.getPassword());
//		TestUserA.setUsername(input.getUsername());
		return TestUserA;
	}

	public UserCredentialOutput login(UserCredentialInput input) {

		// null kontrolu vs eklenmeli
		User TestUserA = buildTestUserA(input);
		// List<User> a = userDao.login(TestUserA);
		boolean properlyLogin = userDao.login(TestUserA);
		UserCredentialOutput userCredentialOutput = new UserCredentialOutput();
		if (properlyLogin) {

			// bunlari propertyden okumak lazim.
			userCredentialOutput.setCredentialResultCode(200);
			userCredentialOutput.setCredentialResultDescription("Basarili");

		} else {
			userCredentialOutput.setCredentialResultCode(404);
			userCredentialOutput.setCredentialResultDescription("HATA!");

		}
		return userCredentialOutput;
	}
}
