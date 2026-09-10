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

    @Test
    public void shouldReturnCandidate() {
        Document document = new Document(
                "D1",
                null,
                "Qualification Certificate",
                "degree.pdf"
        );

        assertEquals(null, document.getCandidate());
    }

    @Test
    public void shouldReturnDocumentType() {
        Document document = new Document(
                "D1",
                null,
                "Qualification Certificate",
                "degree.pdf"
        );

        assertEquals("Qualification Certificate", document.getDocumentType());
    }

    @Test
    public void shouldReturnFileName() {
        Document document = new Document(
                "D1",
                null,
                "Qualification Certificate",
                "degree.pdf"
        );

        assertEquals("degree.pdf", document.getFileName());
    }

    @Test
    public void shouldBePendingInitially() {
        Document document = new Document(
                "D1",
                null,
                "Qualification Certificate",
                "degree.pdf"
        );

        assertEquals(Document.DocumentStatus.PENDING, document.getStatus());
    }

    @Test
    public void shouldHaveAllDocumentStatuses() {
        assertEquals(3, Document.DocumentStatus.values().length);
    }
}