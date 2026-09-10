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

    public Appeal(String appealId, JobApplication application, String reason) {
        this.appealId = appealId;
        this.application = application;
        this.reason = reason;
        this.status = AppealStatus.PENDING;
    }

    public String getAppealId() {
        return appealId;
    }

    public JobApplication getApplication() {
        return application;
    }

    public String getReason() {
        return reason;
    }

    public AppealStatus getStatus() {
        return status;
    }
}