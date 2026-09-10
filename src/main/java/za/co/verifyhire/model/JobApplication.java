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
}