package com.designpatterns.demo1.controller;

/**
 * Created by ada on 08.03.15.
 */
public class Database {

    private static Database instance = new Database();

    private Database(){



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


    public void connect(){

        System.out.println("Connected to database;");

    }

    public void disconnect(){

        System.out.println("Disconnected");

    }

}
