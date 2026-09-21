package za.co.verifyhire.database;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CandidateRepositoryTest {

    @Test
    public void shouldFindCandidates() throws Exception {
        CandidateRepository repository = new CandidateRepository();

        List<String> candidates = repository.findAllCandidates();

        assertFalse(candidates.isEmpty());
    }

    @Test
    public void shouldCreateUser() throws Exception {
        CandidateRepository repository = new CandidateRepository();

        repository.createUser(
                "TEST001",
                "Test",
                "Candidate Two",
                "test5@example.com",
                "password",
                "Johannesburg"
        );

        String user = repository.findUser("TEST001");

        assertEquals("TEST001", user);
    }

    @Test
    public void shouldCreateCandidate() throws Exception {
        CandidateRepository repository = new CandidateRepository();

        repository.createUser(
                "TEST003",
                "Test",
                "Candidate Three",
                "test6@example.com",
                "password",
                "Johannesburg"
        );

        repository.createCandidate("TEST003");

        List<String> candidates = repository.findAllCandidates();

        assertTrue(candidates.stream().anyMatch(candidate -> candidate.startsWith("TEST003")));
    }
}