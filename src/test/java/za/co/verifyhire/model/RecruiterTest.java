package za.co.verifyhire.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecruiterTest {

    @Test
    public void shouldReturnUserId() {
        Recruiter recruiter = new Recruiter(
                "1",
                "Helen",
                "Letsoalo",
                "helen@123.com",
                "password",
                "Johannesburg",
                "ABC Company"
        );

        assertEquals("1", recruiter.getUserId());
    }

    @Test
    public void shouldReturnFirstName() {
        Recruiter recruiter = new Recruiter(
                "1",
                "Helen",
                "Letsoalo",
                "helen@123.com",
                "password",
                "Johannesburg",
                "ABC Company"
        );

        assertEquals("Helen", recruiter.getFirstName());
    }

    @Test
    public void shouldReturnLastName() {
        Recruiter recruiter = new Recruiter(
                "1",
                "Helen",
                "Letsoalo",
                "helen@123.com",
                "password",
                "Johannesburg",
                "ABC Company"
        );

        assertEquals("Letsoalo", recruiter.getLastName());
    }


}


