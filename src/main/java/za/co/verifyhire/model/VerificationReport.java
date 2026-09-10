package za.co.verifyhire.model;

public class VerificationReport {

    private String reportId;
    private JobApplication application;
    private VerificationResult result;
    private String reason;

    public enum VerificationResult {
        VERIFIED,
        FAILED,
        PENDING
    }

    public VerificationReport(String reportId,JobApplication application,VerificationResult result,String reason) {
        this.reportId = reportId;
        this.application = application;
        this.result = result;
        this.reason = reason;
    }
}