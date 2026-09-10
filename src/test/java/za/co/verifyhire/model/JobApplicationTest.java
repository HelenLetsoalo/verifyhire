package za.co.verifyhire.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDate;

public class JobApplicationTest {
    @Test
    public void shouldReturnApplicationId() {
        Candidate candidate = new Candidate(
                "C1", "Helen", "Letsoalo",
                "helen@123.com", "password", "Johannesburg"
        );

        Job job = new Job(
                "J1",
                "Software Developer",
                "Develop software",
                "Johannesburg",
                "Java, Git, Maven"
        );

        JobApplication application = new JobApplication("A1", candidate, job);

        assertEquals("A1", application.getApplicationId());
    }

    @Test
    public void shouldReturnCandidate() {
        Candidate candidate = new Candidate(
                "C1", "Helen", "Letsoalo",
                "helen@123.com", "password", "Johannesburg"
        );

        Job job = new Job(
                "J1",
                "Software Developer",
                "Develop software",
                "Johannesburg",
                "Java, Git, Maven"
        );

        JobApplication application = new JobApplication("A1", candidate, job);

        assertEquals(candidate, application.getCandidate());
    }

    @Test
    public void shouldReturnJob() {
        Candidate candidate = new Candidate(
                "C1", "Helen", "Letsoalo",
                "helen@123.com", "password", "Johannesburg"
        );

        Job job = new Job(
                "J1",
                "Software Developer",
                "Develop software",
                "Johannesburg",
                "Java, Git, Maven"
        );

        JobApplication application = new JobApplication("A1", candidate, job);

        assertEquals(job, application.getJob());
    }


}