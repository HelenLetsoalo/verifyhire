package za.co.verifyhire.model;

public class Document {

    package za.co.verifyhire.model;

    public class Document {

    }

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

}