package za.co.verifyhire.model;

import java.time.LocalDate;

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

    public String getExperienceId() {
        return experienceId;
    }

    public String getCompanyName(){return companyName;}

    public String getJobTitle(){
        return jobTitle;
    }

    public LocalDate getStartDate(){return startDate;}

    public LocalDate getEndDate(){return endDate;}
}