package za.co.verifyhire;

import za.co.verifyhire.model.Candidate;
import za.co.verifyhire.model.Job;
import za.co.verifyhire.model.JobApplication;
import za.co.verifyhire.model.VerificationReport;
import za.co.verifyhire.service.ApplicationService;
import za.co.verifyhire.model.Appeal;

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

        VerificationReport report = new VerificationReport(
                "R1",
                application,
                true,
                "Candidate information verified successfully."
        );

        System.out.println("Verification Result: "
                + report.isVerified());

        System.out.println("Verification Reason: "
                + report.getReason());

        if (report.isVerified()) {
            applicationService.updateApplicationStatus(
                    application,
                    JobApplication.ApplicationStatus.ACCEPTED
            );

            System.out.println("Final Application Status: "
                    + application.getStatus());
        }

        JobApplication secondApplication =
                applicationService.createApplication(
                        "A2",
                        candidate,
                        job
                );

        applicationService.updateApplicationStatus(
                secondApplication,
                JobApplication.ApplicationStatus.UNDER_REVIEW
        );

        VerificationReport secondReport = new VerificationReport(
                "R2",
                secondApplication,
                false,
                "Candidate information could not be verified."
        );

        System.out.println("Second Application Verification Result: "
                + secondReport.isVerified());

        System.out.println("Second Application Verification Reason: "
                + secondReport.getReason());

        if (!secondReport.isVerified()) {
            applicationService.updateApplicationStatus(
                    secondApplication,
                    JobApplication.ApplicationStatus.REJECTED
            );


        }

        System.out.println("Second Application Final Status: "
                + secondApplication.getStatus());

        Appeal appeal = new Appeal(
                "AP1",
                secondApplication,
                "I believe my application was incorrectly rejected."
        );

        System.out.println("Appeal ID: "
                + appeal.getAppealId());

        System.out.println("Appeal Reason: "
                + appeal.getReason());

        System.out.println("Appeal Status: "
                + appeal.getStatus());
    }

}

