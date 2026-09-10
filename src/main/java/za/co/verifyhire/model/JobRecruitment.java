package za.co.verifyhire.model;

public class JobRecruitment {

    private String recruitmentId;
    private Job job;
    private Organisation organisation;
    private RecruitmentStatus status;

    public enum RecruitmentStatus {
        OPEN,
        CLOSED
    }
}