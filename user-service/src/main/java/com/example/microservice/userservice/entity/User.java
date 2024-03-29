package com.example.microservice.userservice.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;

//@Entity
@Document(collection = "User")
public class User {

    @Id
    private String id;
    private String userName;

    public User(String id, String userName) {
        this.id = id;
        this.userName = userName;
    }

    public User(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}
