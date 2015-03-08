package com.designpatterns.demo1.model;

/**
 * Created by ada on 08.03.15.
 */
public class Person {
    private int id;
    private String name;
    private String password;


    public Person(){

    }

    public Person(String name, String password){

        this.name = name;
        this.password = password;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}