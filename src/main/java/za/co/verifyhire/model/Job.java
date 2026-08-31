public class Job {

    private String jobId;
    private String title;
    private String description;
    private String location;
    private String requirements;
    private JobStatus status;

    public enum JobStatus{
        OPEN,
        CLOSED
    }

    public Job(String jobId, String title, String description, String location, String requirements) {
        this.jobId = jobId;
        this.title = title;
        this.description = description;
        this.location = location;
        this.requirements = requirements;
        this.status = JobStatus.OPEN;

    }

    public String getJobId() {
        return jobId;
    }

    public String getDescription() {
        return description;
    }

    public String getLocation() {
        return location;
    }

    public String getRequirements() {
        return requirements;
    }

    public String getTitle() {
        return title;
    }

    public JobStatus getStatus() {
        return status;
    }
}