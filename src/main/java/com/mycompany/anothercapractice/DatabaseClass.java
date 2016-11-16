/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.anothercapractice;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author conorprunty
 */
public class DatabaseClass {

    public static Map<String,User> users = new HashMap<>();

    public static Map<String,User> getUsers() {
        return users;
    }

}
