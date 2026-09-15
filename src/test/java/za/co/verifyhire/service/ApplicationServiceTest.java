package za.co.verifyhire.service;

import org.junit.jupiter.api.Test;
import java.util.List;
import java.time.LocalDate;

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

    @Test
    public void shouldFindApplicationsByCandidate() {
        ApplicationService service = new ApplicationService();

        Candidate candidate = new Candidate(
                "C1",
                "Helen",
                "Letsoalo",
                "helen@example.com",
                "password",
                "Johannesburg"
        );

        Job job1 = new Job(
                "J1",
                "Software Developer",
                "Develop software.",
                "Johannesburg",
                "Java"
        );

        Job job2 = new Job(
                "J2",
                "Python Developer",
                "Develop Python applications.",
                "Pretoria",
                "Python"
        );

        service.createApplication("A1", candidate, job1);
        service.createApplication("A2", candidate, job2);

        List<JobApplication> applications =
                service.findApplicationsByCandidate(candidate);

        assertEquals(2, applications.size());
    }

    @Test
    public void shouldReturnEmptyListWhenCandidateHasNoApplications() {
        ApplicationService service = new ApplicationService();

        Candidate candidate = new Candidate(
                "C1",
                "Helen",
                "Letsoalo",
                "helen@example.com",
                "password",
                "Johannesburg"
        );

        List<JobApplication> applications =
                service.findApplicationsByCandidate(candidate);

        assertEquals(0, applications.size());
    }


    @Test
    public void shouldUpdateApplicationStatus() {
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

        JobApplication application =
                service.createApplication("A1", candidate, job);

        service.updateApplicationStatus(
                application,
                JobApplication.ApplicationStatus.UNDER_REVIEW
        );

        assertEquals(
                JobApplication.ApplicationStatus.UNDER_REVIEW,
                application.getStatus()
        );
    }

    @Test
    public void shouldReturnNullWhenApplicationDoesNotExist() {
        ApplicationService service = new ApplicationService();

        JobApplication application =
                service.findApplicationById("A999");

        assertEquals(null, application);
    }

    @Test
    public void shouldFindApplicationsByJob() {
        ApplicationService service = new ApplicationService();

        Candidate candidate1 = new Candidate(
                "C1",
                "Helen",
                "Letsoalo",
                "helen@example.com",
                "password",
                "Johannesburg"
        );

        Candidate candidate2 = new Candidate(
                "C2",
                "John",
                "Doe",
                "john@example.com",
                "password",
                "Pretoria"
        );

        Job job = new Job(
                "J1",
                "Software Developer",
                "Develop software.",
                "Johannesburg",
                "Java"
        );

        service.createApplication("A1", candidate1, job);
        service.createApplication("A2", candidate2, job);

        List<JobApplication> applications =
                service.findApplicationsByJob(job);

        assertEquals(2, applications.size());
    }

    @Test
    public void shouldReturnEmptyListWhenJobHasNoApplications() {
        ApplicationService service = new ApplicationService();

        Job job = new Job(
                "J1",
                "Software Developer",
                "Develop software.",
                "Johannesburg",
                "Java"
        );

        List<JobApplication> applications =
                service.findApplicationsByJob(job);

        assertEquals(0, applications.size());
    }

    @Test
    public void shouldOnlyFindApplicationsForSpecifiedCandidate() {
        ApplicationService service = new ApplicationService();

        Candidate candidate1 = new Candidate(
                "C1",
                "Helen",
                "Letsoalo",
                "helen@example.com",
                "password",
                "Johannesburg"
        );

        Candidate candidate2 = new Candidate(
                "C2",
                "John",
                "Doe",
                "john@example.com",
                "password",
                "Pretoria"
        );

        Job job1 = new Job(
                "J1",
                "Software Developer",
                "Develop software.",
                "Johannesburg",
                "Java"
        );

        Job job2 = new Job(
                "J2",
                "Python Developer",
                "Develop Python applications.",
                "Pretoria",
                "Python"
        );

        service.createApplication("A1", candidate1, job1);
        service.createApplication("A2", candidate2, job2);

        List<JobApplication> applications =
                service.findApplicationsByCandidate(candidate1);

        assertEquals(1, applications.size());
        assertEquals("A1", applications.get(0).getApplicationId());
    }

    @Test
    public void shouldCreateApplicationWithPendingStatus() {
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

        JobApplication application =
                service.createApplication("A1", candidate, job);

        assertEquals(
                JobApplication.ApplicationStatus.PENDING,
                application.getStatus()
        );
    }

    @Test
    public void shouldSetApplicationDateWhenApplicationIsCreated() {
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

        JobApplication application =
                service.createApplication("A1", candidate, job);

        assertEquals(
                LocalDate.now(),
                application.getApplicationDate()
        );
    }
}