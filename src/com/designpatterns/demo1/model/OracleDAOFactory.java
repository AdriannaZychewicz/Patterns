package com.designpatterns.demo1.model;

/**
 * Created by ada on 10.03.15.
 */
public class OracleDAOFactory extends DAOFactory{
    @Override
    public PersonDAO getPersonDAO() {
        return new OraclePersonDAO();
    }

    @Override
    public LogDAO getLogDAO() {
        return new OracleLogDAO();
    }
}
