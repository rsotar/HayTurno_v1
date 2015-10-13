package com.hayturno.service.endpoints;

import com.hayturno.entities.User;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface UserEndpoint {

    @POST
    @Path("/addUser")
    Response addUser(User user);

    @GET
    @Path("/findAll")
    List<User> retrieveUsers();

    @DELETE
    @Path("/deleteUser/{id}")
    void deleteUser(@PathParam("id") int id);
}

