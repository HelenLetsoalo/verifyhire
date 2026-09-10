package za.co.verifyhire.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import za.co.verifyhire.model.User;

public class AuthenticationServiceTest {

    @Test
    public void shouldRegisterUser() {
        AuthenticationService service = new AuthenticationService();

        User user = new User(
                "U1",
                "Helen",
                "Letsoalo",
                "helen@example.com",
                "password",
                "Johannesburg"
        );

        service.registerUser(user);

        assertEquals(user, service.findByEmail("helen@example.com"));
    }

    @Test
    public void shouldFindUserByEmail() {
        AuthenticationService service = new AuthenticationService();

        User user = new User(
                "U1",
                "Helen",
                "Letsoalo",
                "helen@example.com",
                "password",
                "Johannesburg"
        );

        service.registerUser(user);

        User foundUser = service.findByEmail("helen@example.com");

        assertEquals(user, foundUser);
    }

    @Test
    public void shouldAuthenticateUserWithCorrectCredentials() {
        AuthenticationService service = new AuthenticationService();

        User user = new User(
                "U1",
                "Helen",
                "Letsoalo",
                "helen@example.com",
                "password",
                "Johannesburg"
        );

        service.registerUser(user);

        User authenticatedUser =
                service.authenticate("helen@example.com", "password");

        assertEquals(user, authenticatedUser);
    }
}