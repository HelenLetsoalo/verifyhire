package za.co.verifyhire.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DocumentTest {

    @Test
    public void shouldReturnDocumentId() {
        Document document = new Document(
                "D1",
                null,
                "Qualification Certificate",
                "degree.pdf"
        );

        assertEquals("D1", document.getDocumentId());
    }
}