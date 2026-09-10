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
}