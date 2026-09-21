package za.co.verifyhire.database;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.postgresql.util.PSQLException;

public class CandidateRepositoryTest {

    @AfterEach
    public void cleanUp() throws Exception {
        CandidateRepository repository = new CandidateRepository();

        repository.deleteCandidate("TEST003");
        repository.deleteUser("TEST003");

        repository.deleteUser("TEST001");
    }

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

    @Test
    public void shouldReturnNullWhenUserDoesNotExist() throws Exception {
        CandidateRepository repository = new CandidateRepository();

        String user = repository.findUser("DOES_NOT_EXIST");

        assertNull(user);
    }

    @Test
    public void shouldNotCreateCandidateForMissingUser() throws Exception {
        CandidateRepository repository = new CandidateRepository();

        PSQLException exception = assertThrows(PSQLException.class, () -> {
            repository.createCandidate("DOES_NOT_EXIST");
        });
    }
}