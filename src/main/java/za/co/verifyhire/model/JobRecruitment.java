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

    public JobRecruitment(String recruitmentId, Job job, Organisation organisation) {
        this.recruitmentId = recruitmentId;
        this.job = job;
        this.organisation = organisation;
        this.status = RecruitmentStatus.OPEN;
    }

}