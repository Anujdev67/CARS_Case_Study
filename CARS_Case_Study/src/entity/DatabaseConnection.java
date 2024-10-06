package entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import java.io.InputStream;
import java.io.IOException;

public class DatabaseConnection {

    private static Connection connection;

    // Method to establish the connection
    public static Connection getConnection() {
        if (connection == null) {
            try {
                // Load properties file
                InputStream inputStream = DatabaseConnection.class.getClassLoader().getResourceAsStream("db.properties");
                if (inputStream == null) {
                    throw new IOException("Property file 'db.properties' not found in the classpath");
                }

                Properties properties = new Properties();
                properties.load(inputStream);

                // Load the driver class
                Class.forName(properties.getProperty("db.driver"));

                // Create the connection
                connection = DriverManager.getConnection(
                        properties.getProperty("db.url"),
                        properties.getProperty("db.username"),
                        properties.getProperty("db.password")
                );
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
}
