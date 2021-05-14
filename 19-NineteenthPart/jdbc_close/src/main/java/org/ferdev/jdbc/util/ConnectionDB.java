package org.ferdev.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {

    private static String url = "jdbc:mysql://localhost:3306/java_learn?serverTimezone=UTC";
    private static String username = "root";
    private static String password = "root";

    public static Connection getInstance() throws SQLException {
        return DriverManager.getConnection( url, username, password );
    }
}
