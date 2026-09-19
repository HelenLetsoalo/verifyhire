package za.co.verifyhire.database;

import org.junit.jupiter.api.Test;

import java.sql.Connection;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DatabaseConnectionTest {

    @Test
    public void shouldConnectToDatabase() throws Exception {
        Connection connection = DatabaseConnection.getConnection();

        assertNotNull(connection);

        connection.close();
    }
}