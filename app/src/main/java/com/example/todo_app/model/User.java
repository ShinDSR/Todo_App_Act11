package com.example.todo_app.model;

public class User {
    public String id, name, email;

    public User(){

    }

    public User(String name, String email){
        this.name = name;
        this.email = email;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void SetName(String name){
        this.name = name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }
}
