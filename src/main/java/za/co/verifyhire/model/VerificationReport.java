package za.co.verifyhire.model;

public class VerificationReport {

    private String reportId;
    private JobApplication application;
    private boolean verified;
    private String reason;

//    public enum VerificationResult {
//        VERIFIED,
//        FAILED,
//        PENDING
//    }

    public VerificationReport(String reportId,JobApplication application,boolean verified,String reason) {
        this.reportId = reportId;
        this.application = application;
        this.verified = verified;
        this.reason = reason;
    }

    public String getReportId() {
        return reportId;
    }

    public JobApplication getApplication() {
        return application;
    }

    public boolean isVerified() {
        return verified;
    }

    public String getReason() {
        return reason;
    }
}