package com.designpatterns.demo1.view;

/**
 * Created by ada on 10.03.15.
 */
public class CreateUserEvent {
    private String name;
    private String password;

    public CreateUserEvent(String name, String password) {
        this.name = name;
        this.password = password;
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