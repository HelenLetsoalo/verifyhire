package za.co.verifyhire.service;

import java.util.ArrayList;
import java.util.List;

import za.co.verifyhire.model.Candidate;
import za.co.verifyhire.model.Job;
import za.co.verifyhire.model.JobApplication;

public class ApplicationService {

    private List<JobApplication> applications;

    public ApplicationService() {
        this.applications = new ArrayList<>();
    }

    public JobApplication createApplication(
            String applicationId,
            Candidate candidate,
            Job job) {

        JobApplication application =
                new JobApplication(applicationId, candidate, job);

        applications.add(application);

        return application;
    }

    public JobApplication findApplicationById(String applicationId) {
        for (JobApplication application : applications) {
            if (application.getApplicationId().equals(applicationId)) {
                return application;
            }
        }

        return null;
    }
}