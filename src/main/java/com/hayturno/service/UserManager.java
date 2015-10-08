package com.hayturno.service;

import com.hayturno.entities.UserRequest;
import com.hayturno.entities.UserResponse;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


@Consumes("application/json")
@Produces("application/json")
public interface UserManager
{
	@POST
	@Path("/fetchUserById/")
	UserResponse fetchUserById(UserRequest request);

	@POST
	@Path("/fetchAllUsers/")
	UserResponse fetchAllUsers(UserRequest request);

	@POST
	@Path("/insertUser/")
	UserResponse insertUser(UserRequest request);

	@POST
	@Path("/updateUser/")
	UserResponse updateUser(UserRequest request);

	@POST
	@Path("/deleteUser/")
	UserResponse deleteUser(UserRequest request);
}
