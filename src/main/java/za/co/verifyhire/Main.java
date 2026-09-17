package za.co.verifyhire;

import za.co.verifyhire.model.Candidate;
import za.co.verifyhire.model.Job;

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

    }
}

