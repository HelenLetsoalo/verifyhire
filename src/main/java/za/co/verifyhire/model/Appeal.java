package za.co.verifyhire.model;

public class Appeal {

    private String appealId;
    private JobApplication application;
    private String reason;
    private AppealStatus status;

    public enum AppealStatus {
        PENDING,
        APPROVED,
        REJECTED
    }
}