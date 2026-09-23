package za.co.verifyhire.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String HOST =
            System.getenv().getOrDefault("VERIFYHIRE_DB_HOST", "localhost");

    private static final String PORT =
            System.getenv().getOrDefault("VERIFYHIRE_DB_PORT", "5432");

    private static final String DATABASE =
            System.getenv().getOrDefault("VERIFYHIRE_DB_NAME", "verifyhire");

    private static final String USER =
            System.getenv().getOrDefault("VERIFYHIRE_DB_USER", "postgres");

    private static final String PASSWORD =
            System.getenv("VERIFYHIRE_DB_PASSWORD");

    private static final String URL =
            "jdbc:postgresql://" + HOST + ":" + PORT + "/" + DATABASE;

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}