package za.co.verifyhire.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JobTest {
    @Test
    public void shouldReturnJobId() {
        Job job = new Job(
                "J1",
                "Software Developer",
                "Develop and maintain software applications",
                "Johannesburg",
                "Java, Git, Maven"
        );

        assertEquals("J1", job.getJobId());
    }

    @Test
    public void shouldReturnTitle() {
        Job job = new Job(
                "J1",
                "Software Developer",
                "Develop and maintain software applications",
                "Johannesburg",
                "Java, Git, Maven"
        );

        assertEquals("Software Developer", job.getTitle());
    }

    @Test
    public void shouldReturnDescription() {
        Job job = new Job(
                "J1",
                "Software Developer",
                "Develop and maintain software applications",
                "Johannesburg",
                "Java, Git, Maven"
        );

        assertEquals("Develop and maintain software applications", job.getDescription());
    }

    @Test
    public void shouldReturnLocation() {
        Job job = new Job(
                "J1",
                "Software Developer",
                "Develop and maintain software applications",
                "Johannesburg",
                "Java, Git, Maven"
        );

        assertEquals("Johannesburg", job.getLocation());
    }

    @Test
    public void shouldReturnRequirements() {
        Job job = new Job(
                "J1",
                "Software Developer",
                "Develop and maintain software applications",
                "Johannesburg",
                "Java, Git, Maven"
        );

        assertEquals("Java, Git, Maven", job.getRequirements());
    }

    @Test
    public void shouldBeOpenInitially() {
        Job job = new Job(
                "J1",
                "Software Developer",
                "Develop and maintain software applications",
                "Johannesburg",
                "Java, Git, Maven"
        );

        assertEquals(Job.JobStatus.OPEN, job.getStatus());
    }

}