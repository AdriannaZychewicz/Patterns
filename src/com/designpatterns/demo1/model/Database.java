package com.designpatterns.demo1.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by ada on 08.03.15.
 */
public class Database {

    private static Database instance = new Database();

    private Connection con;

    private Database(){

        try {
            this.connect();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static Database getInstance(){

        return instance;

    }
//
//    private static Database instanceOld;
//    public static Database getIstanceOld(){
//
//
//        if(instanceOld == null){
//
//            instanceOld = new Database();
//
//        }
//
//        return instanceOld;
//
//    }


    public Connection getConnection(){

        return con;

    }
    public void connect() throws Exception {
        if (con != null)
            return;

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new Exception("Driver not found");
        }

        String url = String.format("jdbc:mysql://localhost:%d/mydb", 3306);

        con = DriverManager.getConnection(url, "root", "ada123");
    }

    public void disconnect() {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Can't close connection");
            }
        }

        con = null;
    }

}
