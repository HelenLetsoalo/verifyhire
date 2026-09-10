package za.co.verifyhire.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QualificationTest {

    @Test
    public void shouldReturnQualificationId() {
        Qualification qualification = new Qualification(
                "Q1",
                "Software Development",
                "WeThinkCode_",
                2026
        );

        assertEquals("Q1", qualification.getQualificationId());
    }

    @Test
    public void shouldReturnName() {
        Qualification qualification = new Qualification(
                "Q1",
                "Software Development",
                "WeThinkCode_",
                2026
        );

        assertEquals("Software Development", qualification.getName());
    }

    @Test
    public void shouldReturnInstitutionName() {
        Qualification qualification = new Qualification(
                "Q1",
                "Software Development",
                "WeThinkCode_",
                2026
        );

        assertEquals("WeThinkCode_", qualification.getInstitutionName());
    }

    @Test
    public void shouldReturnYearObtained() {
        Qualification qualification = new Qualification(
                "Q1",
                "Software Development",
                "WeThinkCode_",
                2026
        );

        assertEquals(2026,qualification.getYearObtained());
    }


}