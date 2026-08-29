public class WorkExperience{

    private String experienceId;
    private String companyName;
    private String jobTitle;
    private LocalDate startDate;
    private LocalDate endDate;

    public WorkExperience(String experienceId, String companyName,String jobTitle, LocalDate startDate, LocalDate endDate){
        this.experienceId = experienceId;
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}