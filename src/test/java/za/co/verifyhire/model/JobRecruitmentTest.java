package za.co.verifyhire.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JobRecruitmentTest {

    @Test
    public void shouldReturnRecruitmentId() {
        JobRecruitment recruitment = new JobRecruitment(
                "JR1",
                null,
                null
        );

        assertEquals("JR1", recruitment.getRecruitmentId());
    }

    @Test
    public void shouldReturnJob() {
        JobRecruitment recruitment = new JobRecruitment(
                "JR1",
                null,
                null
        );

        assertEquals(null, recruitment.getJob());
    }

    @Test
    public void shouldReturnOrganisation() {
        JobRecruitment recruitment = new JobRecruitment(
                "JR1",
                null,
                null
        );

        assertEquals(null, recruitment.getOrganisation());
    }


}