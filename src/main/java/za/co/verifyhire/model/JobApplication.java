package za.co.verifyhire.model;

import java.time.LocalDate;

public class JobApplication{

    private String applicationId;
    private Candidate candidate;
    private Job job;
    private LocalDate applicationDate;
    private ApplicationStatus status;

    public enum ApplicationStatus {
        PENDING,
        UNDER_REVIEW,
        ACCEPTED,
        REJECTED
    }

    public JobApplication(String applicationId, Candidate candidate, Job job) {
        this.applicationId = applicationId;
        this.candidate = candidate;
        this.job = job;
        this.applicationDate = LocalDate.now();
        this.status = ApplicationStatus.PENDING;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public Candidate getCandidate() {
        return candidate;
    }

    public Job getJob() {
        return job;
    }

    public LocalDate getApplicationDate() {
        return applicationDate;
    }

    public ApplicationStatus getStatus() {
        return status;
    }
}