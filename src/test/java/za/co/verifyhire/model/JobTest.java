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



}