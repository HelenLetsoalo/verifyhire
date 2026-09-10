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
}