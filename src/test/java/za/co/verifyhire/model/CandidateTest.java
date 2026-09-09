package za.co.verifyhire.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CandidateTest {

    @Test
    public void shouldReturnFirstName() {
        Candidate candidate = new Candidate(
                "1",
                "Helen",
                "Letsoalo",
                "helen@123.com",
                "password",
                "Johannesburg"
        );

        assertEquals("Helen", candidate.getFirstName());
    }
}