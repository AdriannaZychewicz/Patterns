package com.designpatterns.demo1.model;

/**
 * Created by ada on 10.03.15.
 */
public class DAOFactory {


    public static PersonDAO getPersonDAO(){

        return new PersonDAO();
    }

    public static LogDAO getLogDAO(){

        return  new LogDAO();
    }

}
