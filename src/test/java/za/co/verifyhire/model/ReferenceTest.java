package za.co.verifyhire.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReferenceTest {
    @Test
    public void shouldReturnReferenceId() {
        Reference reference = new Reference(
                "R1",
                "John Smith",
                "Manager",
                "john@example.com",
                "0111234567"
        );

        assertEquals("R1", reference.getReferenceId());
    }

    @Test
    public void shouldReturnName() {
        Reference reference = new Reference(
                "R1",
                "John Smith",
                "Manager",
                "john@example.com",
                "0111234567"
        );

        assertEquals("John Smith", reference.getName());
    }

    @Test
    public void shouldReturnRelationship() {
        Reference reference = new Reference(
                "R1",
                "John Smith",
                "Manager",
                "john@example.com",
                "0111234567"
        );

        assertEquals("Manager", reference.getRelationship());
    }

    @Test
    public void shouldReturnEmail() {
        Reference reference = new Reference(
                "R1",
                "John Smith",
                "Manager",
                "john@example.com",
                "0111234567"
        );

        assertEquals("john@example.com", reference.getEmail());
    }

    @Test
    public void shouldReturnEmail() {
        Reference reference = new Reference(
                "R1",
                "John Smith",
                "Manager",
                "john@example.com",
                "0111234567"
        );

        assertEquals("john@example.com", reference.getEmail());
    }
}

