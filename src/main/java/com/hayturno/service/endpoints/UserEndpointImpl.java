package com.hayturno.service.endpoints;

import com.hayturno.data.service.UserService;
import com.hayturno.entities.User;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import java.util.List;

public class UserEndpointImpl implements UserEndpoint{

    private UserService userService;

    @Autowired
    public UserEndpointImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    public Response addUser(User user) {

            user = userService.addUser(user);

            return Response.status(Response.Status.CREATED).entity(user).build();
    }

    @Override
    public List<User> retrieveUsers() {
        return userService.findAll();
    }

    @Override
    public void deleteUser(@PathParam("Id") int Id) {

        userService.deleteUser(Id);

    }

}