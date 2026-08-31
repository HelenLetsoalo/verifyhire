public class Job {

    private String jobId;
    private String title;
    private String description;
    private String location;
    private String requirements;
    private JobStatus status;

    public enum JobStatus{
        OPEN
        CLOSED
    }


}