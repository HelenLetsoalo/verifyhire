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
    public void shouldReturnEmail() {
        User user = new User(
                "1",
                "Helen",
                "Letsoalo",
                "helen@123.com",
                "password",
                "Johannesburg"
        );

        assertEquals("helen@123.com", user.getEmail());
    }

    @Test
    public void shouldReturnPassword() {
        User user = new User(
                "1",
                "Helen",
                "Letsoalo",
                "helen@123.com",
                "password",
                "Johannesburg"
        );

        assertEquals("password", user.getPassword());
    }

    @Test
    public void shouldReturnLocation() {
        User user = new User(
                "1",
                "Helen",
                "Letsoalo",
                "helen@123.com",
                "password",
                "Johannesburg"
        );

        assertEquals("Johannesburg", user.getLocation());
    }
}