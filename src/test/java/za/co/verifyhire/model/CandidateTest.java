package za.co.verifyhire.model;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CandidateTest {

    @Test
    public void shouldReturnFirstName() {
        Candidate candidate = new Candidate(
                "1",
                "Helen",
                "Letsoalo",
                "helen@123.com",
                "password",
                "Johannesburg"
        );

        assertEquals("Helen", candidate.getFirstName());
    }

    @Test
    public void shouldReturnUserId() {
        Candidate candidate = new Candidate(
                "1",
                "Helen",
                "Letsoalo",
                "helen@123.com",
                "password",
                "Johannesburg"
        );

        assertEquals("1", candidate.getUserId());
    }

    @Test
    public void shouldReturnLastName() {
        Candidate candidate = new Candidate(
                "1",
                "Helen",
                "Letsoalo",
                "helen@123.com",
                "password",
                "Johannesburg"
        );

        assertEquals("Letsoalo", candidate.getLastName());
    }

    @Test
    public void shouldReturnEmail() {
        Candidate candidate = new Candidate(
                "1",
                "Helen",
                "Letsoalo",
                "helen@123.com",
                "password",
                "Johannesburg"
        );

        assertEquals("helen@123.com", candidate.getEmail());
    }

    @Test
    public void shouldReturnPassword() {
        Candidate candidate = new Candidate(
                "1",
                "Helen",
                "Letsoalo",
                "helen@123.com",
                "password",
                "Johannesburg"
        );

        assertEquals("password", candidate.getPassword());
    }

    @Test
    public void shouldReturnLocation() {
        Candidate candidate = new Candidate(
                "1",
                "Helen",
                "Letsoalo",
                "helen@123.com",
                "password",
                "Johannesburg"
        );

        assertEquals("Johannesburg", candidate.getLocation());
    }

    @Test
    public void shouldHaveNoQualificationsInitially() {
        Candidate candidate = new Candidate(
                "1",
                "Helen",
                "Letsoalo",
                "helen@123.com",
                "password",
                "Johannesburg"
        );

        assertEquals(0, candidate.getQualifications().size());
    }

    @Test
    public void shouldAddQualification() {
        Candidate candidate = new Candidate(
                "1",
                "Helen",
                "Letsoalo",
                "helen@123.com",
                "password",
                "Johannesburg"
        );

        Qualification qualification = new Qualification(
                "Q1",
                "Software Engineering",
                "WeThinkCode_",
                2026
        );

        candidate.addQualification(qualification);

        assertEquals(1, candidate.getQualifications().size());
        assertEquals(qualification, candidate.getQualifications().get(0));
    }

    @Test
    public void shouldHaveNoWorkExperienceInitially() {
        Candidate candidate = new Candidate(
                "1",
                "Helen",
                "Letsoalo",
                "helen@123.com",
                "password",
                "Johannesburg"
        );

        assertEquals(0, candidate.getExperiences().size());
    }

    @Test
    public void shouldAddWorkExperience() {
        Candidate candidate = new Candidate(
                "1",
                "Helen",
                "Letsoalo",
                "helen@123.com",
                "password",
                "Johannesburg"
        );

        WorkExperience experience = new WorkExperience(
                "W1",
                "ABC Company",
                "Software Developer",
                LocalDate.of(2025, 1, 1),
                LocalDate.of(2025, 6, 30)
        );

        candidate.addWorkExperience(experience);

        assertEquals(1, candidate.getExperiences().size());
        assertEquals(experience, candidate.getExperiences().get(0));
    }

    @Test
    public void shouldHaveNoReferencesInitially() {
        Candidate candidate = new Candidate(
                "1",
                "Helen",
                "Letsoalo",
                "helen@123.com",
                "password",
                "Johannesburg"
        );

        assertEquals(0, candidate.getReferences().size());
    }

    @Test
    public void shouldAddReference() {
        Candidate candidate = new Candidate(
                "1",
                "Helen",
                "Letsoalo",
                "helen@123.com",
                "password",
                "Johannesburg"
        );

        Reference reference = new Reference(
                "R1",
                "John Smith",
                "Manager",
                "john@example.com",
                "0111234567"
        );

        candidate.addReference(reference);

        assertEquals(1, candidate.getReferences().size());
        assertEquals(reference, candidate.getReferences().get(0));
    }
}