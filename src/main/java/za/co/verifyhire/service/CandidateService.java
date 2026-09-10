package za.co.verifyhire.service;

import java.util.ArrayList;
import java.util.List;

import za.co.verifyhire.model.Candidate;

public class CandidateService {

    private List<Candidate> candidates;

    public CandidateService() {
        this.candidates = new ArrayList<>();
    }

    public void addCandidate(Candidate candidate) {
        candidates.add(candidate);
    }

    public Candidate findCandidateById(String UserId){
        for(Candidate candidate : candidates) {
            if(candidate.getUserId().equals(UserId)){
                return candidate;
            }
        }
        return null;
    }
}