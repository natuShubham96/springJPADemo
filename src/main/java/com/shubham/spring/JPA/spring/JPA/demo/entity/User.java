package com.shubham.spring.JPA.spring.JPA.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity   //To indicate that this class object will be mapped to a table named user in database
public class User {

    @Id   //To indicate that it's a primary key
    @GeneratedValue   //To indicate that this value will not be initialized, it will be auto generated
    private long id;

    private String name;

    private String role;

    protected User() {   //Since JPA needs a default constructor, as we have overriden the one provided by Java

    }

    public User(String name, String role) {
        this.name = name;
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }
}
