package com.hayturno.swagger;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Service;

import javax.ws.rs.Path;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

@Service//spring anotation to maping with the spring context
@Path("/calc")//Jax-rs invoque this interface
@Api(value = "/calc", description = "Calculator ApiREST Sample")
public interface CalcService {

    @GET
    @Path("/add/{addNum1}-{addNum2}")
    @ApiOperation(value = "Operation Add ", notes = "Add from two numbers", response = Integer.class)
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    int addOperation (@PathParam("addNum1")int addNum1, @PathParam("addNum2") int addNum2);

    @GET
    @Path("/sub/{subNum1}-{subNum2}")
    @ApiOperation(value = "Operation Sub", notes = "Substraction",response = Integer.class)
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    int subOperation (@PathParam("subNum1")int subNum1, @PathParam("subNum2") int subNum2);

}
