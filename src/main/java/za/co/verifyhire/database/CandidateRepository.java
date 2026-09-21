package za.co.verifyhire.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class CandidateRepository {

    public List<String> findAllCandidates() throws Exception {

        List<String> candidates = new ArrayList<>();

        String sql = """
                SELECT u.user_id, u.first_name, u.last_name, u.email
                FROM users u
                JOIN candidates c ON u.user_id = c.user_id
                """;

        Connection connection = DatabaseConnection.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()) {
            String candidate =
                    resultSet.getString("user_id") + " | "
                            + resultSet.getString("first_name") + " | "
                            + resultSet.getString("last_name") + " | "
                            + resultSet.getString("email");

            candidates.add(candidate);
        }

        resultSet.close();
        statement.close();
        connection.close();

        return candidates;
    }

    public void createUser(
            String userId,
            String firstName,
            String lastName,
            String email,
            String password,
            String location) throws Exception {

        String sql = """
            INSERT INTO users
            (user_id, first_name, last_name, email, password, location)
            VALUES (?, ?, ?, ?, ?, ?)
            """;

        Connection connection = DatabaseConnection.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setString(1, userId);
        statement.setString(2, firstName);
        statement.setString(3, lastName);
        statement.setString(4, email);
        statement.setString(5, password);
        statement.setString(6, location);

        statement.executeUpdate();

        statement.close();
        connection.close();
    }

    public void createCandidate(String userId) throws Exception {

        String sql = """
            INSERT INTO candidates (user_id)
            VALUES (?)
            """;

        Connection connection = DatabaseConnection.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setString(1, userId);

        statement.executeUpdate();

        statement.close();
        connection.close();
    }

    public String findUser(String userId) throws Exception {

        String sql = """
        SELECT user_id
        FROM users
        WHERE user_id = ?
        """;

        Connection connection = DatabaseConnection.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setString(1, userId);

        ResultSet resultSet = statement.executeQuery();

        String foundUser = null;

        if (resultSet.next()) {
            foundUser = resultSet.getString("user_id");
        }

        resultSet.close();
        statement.close();
        connection.close();

        return foundUser;
    }
}