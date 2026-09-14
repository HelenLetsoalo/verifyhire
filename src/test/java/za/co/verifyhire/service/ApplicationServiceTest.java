package za.co.verifyhire.service;

import org.junit.jupiter.api.Test;

import za.co.verifyhire.model.Candidate;
import za.co.verifyhire.model.Job;
import za.co.verifyhire.model.JobApplication;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApplicationServiceTest {

    @Test
    public void shouldCreateApplication() {

        ApplicationService service = new ApplicationService();

        Candidate candidate = new Candidate(
                "C1",
                "Helen",
                "Letsoalo",
                "helen@example.com",
                "password",
                "Johannesburg"
        );

        Job job = new Job(
                "J1",
                "Software Developer",
                "Develop and maintain software.",
                "Johannesburg",
                "Java"
        );

        JobApplication application = service.createApplication(
                "A1",
                candidate,
                job
        );

        assertEquals("A1", application.getApplicationId());
        assertEquals(candidate, application.getCandidate());
        assertEquals(job, application.getJob());
    }

    @Test
    public void shouldFindApplicationById() {
        ApplicationService service = new ApplicationService();

        Candidate candidate = new Candidate(
                "C1",
                "Helen",
                "Letsoalo",
                "helen@example.com",
                "password",
                "Johannesburg"
        );

        Job job = new Job(
                "J1",
                "Software Developer",
                "Develop software.",
                "Johannesburg",
                "Java"
        );

        JobApplication application = service.createApplication(
                "A1",
                candidate,
                job
        );

        JobApplication foundApplication = service.findApplicationById("A1");

        assertEquals(application, foundApplication);
    }
}