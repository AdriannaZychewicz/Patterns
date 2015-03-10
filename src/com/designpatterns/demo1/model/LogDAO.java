package com.designpatterns.demo1.model;

import java.util.List;

/**
 * Created by ada on 10.03.15.
 */
public interface LogDAO {
    void addEntry(String message);

    List<Log> getEntries(int number);
}
