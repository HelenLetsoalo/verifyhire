package za.co.verifyhire.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrganisationTest {

    @Test
    public void shouldReturnOrganisationId() {
        Organisation organisation = new Organisation(
                "O1",
                "ABC Company",
                "Johannesburg",
                "info@abc.com",
                "Software Development",
                "0111234567"
        );

        assertEquals("O1", organisation.getOrganisationId());
    }

    @Test
    public void shouldReturnName() {
        Organisation organisation = new Organisation(
                "O1",
                "ABC Company",
                "Johannesburg",
                "info@abc.com",
                "Software Development",
                "0111234567"
        );

        assertEquals("ABC Company", organisation.getName());
    }

    @Test
    public void shouldReturnLocation() {
        Organisation organisation = new Organisation(
                "O1",
                "ABC Company",
                "Johannesburg",
                "info@abc.com",
                "Software Development",
                "0111234567"
        );

        assertEquals("Johannesburg", organisation.getLocation());
    }

    @Test
    public void shouldReturnEmail() {
        Organisation organisation = new Organisation(
                "O1",
                "ABC Company",
                "Johannesburg",
                "info@abc.com",
                "Software Development",
                "0111234567"
        );

        assertEquals("info@abc.com", organisation.getEmail());
    }
}