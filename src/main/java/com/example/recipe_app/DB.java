package com.example.recipe_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
    private static final String URL = "jdbc:mysql://localhost:3306/Recipe";
    private static final String USER = "mark";
    private static final String PASSWORD = "mark";

    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    // Add methods for database operations (insert, update, delete, select)
}
