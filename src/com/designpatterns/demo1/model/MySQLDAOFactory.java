package com.designpatterns.demo1.model;

/**
 * Created by ada on 10.03.15.
 */
public class MySQLDAOFactory extends DAOFactory {


    @Override
    public PersonDAO getPersonDAO(){

        return new MySQLPersonDAO();
    }

    @Override
    public LogDAO getLogDAO(){

        return  new MySQLLogDAO();
    }

}
