package Connectivity;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    Connection connection;

    public Connection getConnection(){
        String dbName = "usersdb";
        String dbUser = "root";
        String password = "Velonja0402tovo.";
        String url = "jdbc:mysql://localhost/" + dbName;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection( url, dbUser, password);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return connection;
    }
}
