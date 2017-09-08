package com.pevsat.solid.sr.database;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by pevsat on 25.08.2017.
 */
public class DatabaseConnectionManager {

    private Connection connection;

    private static DatabaseConnectionManager connectionInstance = new DatabaseConnectionManager();

    private DatabaseConnectionManager(){

    }

    public static DatabaseConnectionManager getManagerInstance(){
        return connectionInstance;
    }

    public void connect() throws SQLException {

    }
}
