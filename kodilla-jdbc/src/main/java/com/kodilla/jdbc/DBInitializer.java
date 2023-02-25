package com.kodilla.jdbc;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class DBInitializer {

    public void initializeDatabase() {
        DbManager dbManager = DbManager.getInstance();
        String sqlQuery = """
            CREATE TABLE USERS
            (
                ID SERIAL PRIMARY KEY,
                FIRSTNAME VARCHAR(100),
                LASTNAME VARCHAR(100)
            );
            
            CREATE TABLE POSTS
            (
                ID SERIAL PRIMARY KEY,
                USER_ID BIGINT UNSIGNED NOT NULL,
                BODY VARCHAR(1024),
                FOREIGN KEY (USER_ID) REFERENCES USERS(ID)
            );
            
            INSERT INTO USERS (FIRSTNAME, LASTNAME)
            VALUES ("John", "Smith");
            INSERT INTO USERS (FIRSTNAME, LASTNAME)
            VALUES ("Zachary", "Lee");
            INSERT INTO USERS (FIRSTNAME, LASTNAME)
            VALUES ("Stephanie", "Kovalsky");
            INSERT INTO USERS (FIRSTNAME, LASTNAME)
            VALUES ("Thomas", "Landgren");
            INSERT INTO USERS (FIRSTNAME, LASTNAME)
            VALUES ("John", "Thomson");
            
            INSERT INTO POSTS (ID, USER_ID, BODY)
            VALUES (1, 1, "This is my firs post on this forum...");
            INSERT INTO POSTS (ID, USER_ID, BODY) VALUES (2, 2, "My post too");
            INSERT INTO POSTS (ID, USER_ID, BODY)
            VALUES (3, 2, "This is my first post too!");
            INSERT INTO POSTS (ID, USER_ID, BODY)
            VALUES (4, 2, "How are you?");
            INSERT INTO POSTS (ID, USER_ID, BODY)
            VALUES (5, 1, "Quite good, thanks bro!");
            INSERT INTO POSTS (ID, USER_ID, BODY)
            VALUES (6, 4, "Yo all! Here is Thomas!");
            
            COMMIT;     
        """;
        try {
            Statement statement = dbManager.getConnection().createStatement();
            ResultSet rs = statement.executeQuery(sqlQuery);
            rs.close();
            statement.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
