/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.anothercapractice;

import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author conorprunty
 */
@Path("/user")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UserResource {

    UserService userService = new UserService();

    @GET
    public List<User> getUser() {
        return userService.getAllUsers();
    }
    
    @GET
    @Path("/{userName}")
    public User getCustomer(@PathParam("userName") String userName) {
        return userService.getUser(userName);
    }
    
    @POST
    public Response addUser(User user) {
        return userService.addUser(user);
    }
    
    @DELETE
    @Path("/{userName}")
    public void deleteCustomer(@PathParam("userName") String userName) {
        userService.removeUser(userName);
    }

}
