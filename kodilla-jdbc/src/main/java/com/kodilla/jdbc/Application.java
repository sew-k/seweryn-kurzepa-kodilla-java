package com.kodilla.jdbc;

public class Application {
    public static void main(String[] args) {
        DBInitializer dbInitializer = new DBInitializer();
        dbInitializer.initializeDatabase();
    }
}
