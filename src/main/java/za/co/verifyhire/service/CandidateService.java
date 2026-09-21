package za.co.verifyhire.service;

import java.util.ArrayList;
import java.util.List;

import za.co.verifyhire.model.Candidate;
import za.co.verifyhire.database.CandidateRepository;

public class CandidateService {

    private List<Candidate> candidates;
    private CandidateRepository repository;

    public CandidateService() {
        this.candidates = new ArrayList<>();
    }

    public CandidateService(CandidateRepository repository) {
        this.repository = repository;
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