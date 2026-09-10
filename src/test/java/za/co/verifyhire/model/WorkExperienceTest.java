package za.co.verifyhire.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class WorkExperienceTest {
    @Test
    public void shouldReturnExperienceId() {
        WorkExperience experience = new WorkExperience(
                "W1",
                "ABC Company",
                "Software Developer",
                LocalDate.of(2025, 1, 1),
                LocalDate.of(2025, 6, 30)
        );

        assertEquals("W1", experience.getExperienceId());
    }

    @Test
    public void shouldReturnCompanyName() {
        WorkExperience experience = new WorkExperience(
                "W1",
                "ABC Company",
                "Software Developer",
                LocalDate.of(2025, 1, 1),
                LocalDate.of(2025, 6, 30)
        );

        assertEquals("ABC Company", experience.getCompanyName());
    }

    @Test
    public void shouldReturnJobTitle() {
        WorkExperience experience = new WorkExperience(
                "W1",
                "ABC Company",
                "Software Developer",
                LocalDate.of(2025, 1, 1),
                LocalDate.of(2025, 6, 30)
        );

        assertEquals("Software Developer", experience.getJobTitle());
    }

    @Test
    public void shouldReturnStartDate() {
        WorkExperience experience = new WorkExperience(
                "W1",
                "ABC Company",
                "Software Developer",
                LocalDate.of(2025, 1, 1),
                LocalDate.of(2025, 6, 30)
        );

        assertEquals(LocalDate.of(2025, 1, 1), experience.getStartDate());
    }
}
