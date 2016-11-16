/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.anothercapractice;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.Response;

/**
 *
 * @author conorprunty
 */
public class UserService {

    private Map<String, User> users = DatabaseClass.getUsers();
    Timestamp timestamp = new Timestamp(System.currentTimeMillis());

    public UserService() {
        
        users.put("conor", new User(1, "conor", "footballer", timestamp));
        users.put("joe", new User(2, "joe", "fireman", timestamp));
        users.put("jane", new User(3, "jane", "teacher", timestamp));
    }

    public List<User> getAllUsers() {
        return new ArrayList<User>(users.values());
    }

    public User getUser(String userName) {
        return users.get(userName);
    }

    public Response addUser(User user) {
        user.setId(users.size() + 1);
        user.setBirthday(timestamp);
        users.put(user.getName(), user);
        return Response.status(200).entity("User_created. URI= /api/user/"+user.getName()).build();
        // "user_created. URI= /api/users/getuserID/"+user
    }
    
    public Response removeUser(String userName) {
         return Response.status(200).entity("Either the name or the password is blank").build();
    }

}
