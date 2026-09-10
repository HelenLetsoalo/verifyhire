package za.co.verifyhire.model;

public class Document {

    private String documentId;
    private Candidate candidate;
    private String documentType;
    private String fileName;
    private DocumentStatus status;

    public enum DocumentStatus {
        PENDING,
        VERIFIED,
        REJECTED
    }

    public Document(String documentId, Candidate candidate,String documentType, String fileName) {
        this.documentId = documentId;
        this.candidate = candidate;
        this.documentType = documentType;
        this.fileName = fileName;
        this.status = DocumentStatus.PENDING;
    }

    public String getDocumentId() {
        return documentId;
    }

    public Candidate getCandidate() {
        return candidate;
    }

    public String getDocumentType() {
        return documentType;
    }

    public String getFileName() {
        return fileName;
    }

    public DocumentStatus getStatus() {
        return status;
    }

}