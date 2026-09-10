package za.co.verifyhire.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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