package za.co.verifyhire.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppealTest {

    @Test
    public void shouldReturnAppealId() {
        Appeal appeal = new Appeal(
                "A1",
                null,
                "I believe my qualification was incorrectly rejected."
        );

        assertEquals("A1", appeal.getAppealId());
    }
}