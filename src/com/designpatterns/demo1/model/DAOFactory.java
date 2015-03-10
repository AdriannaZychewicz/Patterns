package com.designpatterns.demo1.model;

/**
 * Created by ada on 10.03.15.
 */
public abstract class DAOFactory {

    public static final int MYSQL = 0;
    public static final int ORACLE = 1;

    public abstract PersonDAO getPersonDAO();

    public abstract LogDAO getLogDAO();

    public static DAOFactory getFactory(int type) {
        switch(type) {
            case MYSQL:
                return new MySQLDAOFactory();
            case ORACLE:
                return new OracleDAOFactory();
            default:
                return null;
        }
    }

}