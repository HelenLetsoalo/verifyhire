package za.co.verifyhire.service;

import java.util.ArrayList;
import java.util.List;

import za.co.verifyhire.model.Candidate;
import za.co.verifyhire.database.CandidateRepository;

public class CandidateService {

    private List<Candidate> candidates;
    private CandidateRepository repository;

    public CandidateService(CandidateRepository repository) {
        this.candidates = new ArrayList<>();
        this.repository = repository;
    }

    public void addCandidate(Candidate candidate) throws Exception{
        repository.saveCandidate(candidate);
    }

    public Candidate findCandidateById(String userId) throws Exception {
        return repository.findCandidateById(userId);
    }
}