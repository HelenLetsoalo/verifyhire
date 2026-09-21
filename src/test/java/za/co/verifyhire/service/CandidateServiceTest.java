package za.co.verifyhire.service;

import org.junit.jupiter.api.Test;
import za.co.verifyhire.database.CandidateRepository;
import za.co.verifyhire.model.Candidate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CandidateServiceTest {

    @Test
    public void shouldAddCandidate() throws Exception {
        CandidateRepository repository = new CandidateRepository();
        CandidateService service = new CandidateService(repository);

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
    public void shouldReturnNullWhenCandidateDoesNotExist() throws Exception {
        CandidateRepository repository = new CandidateRepository();
        CandidateService service = new CandidateService(repository);

        Candidate foundCandidate = service.findCandidateById("C999");

        assertEquals(null, foundCandidate);
    }

    @Test
    public void shouldFindCorrectCandidateById() throws Exception {
        CandidateRepository repository = new CandidateRepository();
        CandidateService service = new CandidateService(repository);

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