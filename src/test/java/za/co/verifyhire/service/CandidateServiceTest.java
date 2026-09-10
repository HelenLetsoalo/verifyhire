package za.co.verifyhire.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import za.co.verifyhire.model.Candidate;

public class CandidateServiceTest {
    @Test
    public void shouldAddCandidate() {
        CandidateService service = new CandidateService();

        Candidate candidate = new Candidate(
                "C1",
                "Helen",
                "Letsoalo",
                "helen@example.com",
                "password",
                "Johannesburg"
        );

        service.addCandidate(candidate);

        assertEquals(candidate, service.findCandidateById("C1"));
    }

    @Test
    public void shouldReturnNullWhenCandidateDoesNotExist() {
        CandidateService service = new CandidateService();

        Candidate foundCandidate = service.findCandidateById("C999");

        assertEquals(null, foundCandidate);
    }

    @Test
    public void shouldFindCorrectCandidateById() {
        CandidateService service = new CandidateService();

        Candidate firstCandidate = new Candidate(
                "C1",
                "Helen",
                "Letsoalo",
                "helen@example.com",
                "password",
                "Johannesburg"
        );

        Candidate secondCandidate = new Candidate(
                "C2",
                "John",
                "Doe",
                "john@example.com",
                "password",
                "Pretoria"
        );

        service.addCandidate(firstCandidate);
        service.addCandidate(secondCandidate);

        Candidate foundCandidate = service.findCandidateById("C2");

        assertEquals(secondCandidate, foundCandidate);
    }
}