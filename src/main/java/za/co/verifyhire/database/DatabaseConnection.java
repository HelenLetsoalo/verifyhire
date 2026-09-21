package za.co.verifyhire.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String URL = "jdbc:postgresql://localhost:5432/verifyhire";
    private static final String USER = "postgres";
    private static final String PASSWORD =
            System.getenv("VERIFYHIRE_DB_PASSWORD");

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}