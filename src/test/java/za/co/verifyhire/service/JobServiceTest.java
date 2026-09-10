package za.co.verifyhire.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import za.co.verifyhire.model.Job;

public class JobServiceTest {

    @Test
    public void shouldAddJob(){
        JobService service = new JobService();

        Job job = new Job(
                "J1",
                "Software Developer",
                "Develop and maintain software.",
                "Johannesburg",
                "Java, Python"

        );

        service.addJob(job);

        assertEquals(job, service.findJobById("J1"));
    }

    @Test
    public void shouldReturnNullWhenJobDoesNotExist() {
        JobService service = new JobService();

        Job foundJob = service.findJobById("J999");

        assertEquals(null, foundJob);
    }

    @Test
    public void shouldFindCorrectJobById() {
        JobService service = new JobService();

        Job firstJob = new Job(
                "J1",
                "Software Developer",
                "Develop software.",
                "Johannesburg",
                "Java"
        );

        Job secondJob = new Job(
                "J2",
                "Data Analyst",
                "Analyse company data.",
                "Pretoria",
                "Python, SQL"
        );

        service.addJob(firstJob);
        service.addJob(secondJob);

        Job foundJob = service.findJobById("J2");

        assertEquals(secondJob, foundJob);
    }

    @Test
    public void shouldFindOpenJobs() {
        JobService service = new JobService();

        Job firstJob = new Job(
                "J1",
                "Software Developer",
                "Develop software.",
                "Johannesburg",
                "Java"
        );

        Job secondJob = new Job(
                "J2",
                "Data Analyst",
                "Analyse company data.",
                "Pretoria",
                "Python, SQL"
        );

        service.addJob(firstJob);
        service.addJob(secondJob);

        assertEquals(2, service.findOpenJobs().size());
    }


}