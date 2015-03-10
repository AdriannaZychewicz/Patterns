package com.designpatterns.demo1.model;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by ada on 10.03.15.
 */
public class OraclePersonDAO implements PersonDAO {
    @Override
    public int addPerson(Person person) throws SQLException {
        return 0;
    }

    @Override
    public Person getPerson(int id) throws SQLException {
        return null;
    }

    @Override
    public List<Person> getPeople() throws SQLException {
        return null;
    }

    @Override
    public int updatePerson(Person person) throws SQLException {
        return 0;
    }

    @Override
    public int deletePerson(int id) throws SQLException {
        return 0;
    }

    @Override
    public int deleteAll() throws SQLException {
        return 0;
    }
}
