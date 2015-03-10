package com.designpatterns.demo1.model;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by ada on 10.03.15.
 */
public interface PersonDAO {

    int addPerson(Person person) throws SQLException;

    Person getPerson(int id) throws SQLException;

    List<Person> getPeople() throws SQLException;

    int updatePerson(Person person) throws SQLException;

    int deletePerson(int id) throws SQLException;

    int deleteAll() throws SQLException;
}
