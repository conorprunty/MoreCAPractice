/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.anothercapractice;

import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author conorprunty
 */
@XmlRootElement
public class User {

    private int id;
    private String name;
    private String occupation;
    private Date birthday;
    
    public User(){
        
    }

    public User(int id, String name, String occupation, Date birthday) {
        this.id = id;
        this.name = name;
        this.occupation = occupation;
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }


}
