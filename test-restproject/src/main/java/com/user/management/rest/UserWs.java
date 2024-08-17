package com.user.management.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.user.management.business.UserManagementBusiness;
import com.user.management.model.UserModel;
import com.user.management.model.input.UserRegistrationInput;
import com.user.management.model.output.UserModelOutput;

@Path("/users")
public class UserWs {

	@Inject
	UserManagementBusiness userManagementBusiness;

	@PostConstruct
	public void init() {
		System.out.println("test");
	}

	@Path("/all")
	@GET
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public Response Testget() {

		UserModelOutput testUserModelOutput = null;
		List<UserModel> userModelList = new ArrayList();
		userModelList = userManagementBusiness.testGetAllUsers();
		return Response.status(Status.OK).entity(userModelList).build(); // ?

	}

	@Path("/add")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addUser(UserRegistrationInput userRegistrationInput) {

		// ilgili kontroller eklenecek
		UserRegistrationOutput userRegistrationOutput = userManagementBusiness.addUser(userRegistrationInput);

		return Response.status(Status.OK).entity(userRegistrationOutput).build();

	}

}
