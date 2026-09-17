package za.co.verifyhire;

import za.co.verifyhire.model.Candidate;
import za.co.verifyhire.model.Job;
import za.co.verifyhire.model.JobApplication;
import za.co.verifyhire.service.ApplicationService;

public class Main {

    public static void main(String[] args) {

        Candidate candidate = new Candidate(
                "C1",
                "Helen",
                "Letsoalo",
                "helen@example.com",
                "password",
                "Johannesburg"
        );

        Job job = new Job(
                "J1",
                "Software Developer",
                "Develop and maintain software.",
                "Johannesburg",
                "Java"
        );

        ApplicationService applicationService = new ApplicationService();

        JobApplication application = applicationService.createApplication(
                "A1",
                candidate,
                job
        );

        System.out.println("Candidate: "
                + candidate.getFirstName() + " "
                + candidate.getLastName());

        System.out.println("Job: " + job.getTitle());

        System.out.println("Application ID: "
                + application.getApplicationId());

        System.out.println("Application Status: "
                + application.getStatus());

        applicationService.updateApplicationStatus(
                application,
                JobApplication.ApplicationStatus.UNDER_REVIEW
        );

        System.out.println("Updated Application Status: "
                + application.getStatus());
    }

}

