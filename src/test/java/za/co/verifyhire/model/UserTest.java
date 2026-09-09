package za.co.verifyhire.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {

    @Test
    public void shouldReturnFirstName() {
        User user= new User(
                "1",
                "Helen",
                "Letsoalo",
                "helen@123.com",
                "password",
                "Johannesburg"
        );

        assertEquals("Helen", user.getFirstName());

    }

    @Test
    public void shouldReturnUserId() {
        User user = new User(
                "1",
                "Helen",
                "Letsoalo",
                "helen@123.com",
                "password",
                "Johannesburg"
        );

        assertEquals("1", user.getUserId());
    }

    @Test
    public void shouldReturnLastName() {
        User user = new User(
                "1",
                "Helen",
                "Letsoalo",
                "helen@123.com",
                "password",
                "Johannesburg"
        );

        assertEquals("Letsoalo", user.getLastName());
    }

