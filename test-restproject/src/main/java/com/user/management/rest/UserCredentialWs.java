package com.user.management.rest;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.user.management.business.UserManagementBusiness;
import com.user.management.model.input.UserCredentialInput;

@Path("/credential")

public class UserCredentialWs {

	@Inject
	UserManagementBusiness userManagementBusiness;

	@Path("/login")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response login(UserCredentialInput input) {

		// ilgili kontroller eklenecek
		UserCredentialOutput userCredentialOutput = userManagementBusiness.login(input);
		if (userCredentialOutput.getCredentialResultCode() == 200)
			return Response.status(Status.OK).entity(userCredentialOutput).build();
		else
			return Response.status(Status.NOT_FOUND).entity(userCredentialOutput).build();

	}

}