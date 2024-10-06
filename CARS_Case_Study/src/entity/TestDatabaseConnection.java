package entity;

import java.sql.Connection;

public class TestDatabaseConnection {

    public static void main(String[] args) {
        // Get the connection and test if it's successful
        Connection connection = DatabaseConnection.getConnection();

        if (connection != null) {
            System.out.println("Database connection is successful.");
        } else {
            System.out.println("Failed to establish database connection.");
        }
    }
}
