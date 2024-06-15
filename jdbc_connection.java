package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbc_connection {
    static Connection connection;
    private static final String URL = "jdbc:mysql://localhost:3306/b_tech";
    private static final String USER = "root";
    private static final String PASS = "9336119497";

    public static void main(String[] args) {
        try {
            // Load the JDBC driver explicitly (optional)
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Connection established successfully.");

            frameing bankFrame = new frameing();
            bankFrame.bankinfo();

        } catch (ClassNotFoundException e) {
            System.err.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Connection failed.");
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                    System.out.println("Connection closed.");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
