package za.co.verifyhire.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import za.co.verifyhire.database.CandidateRepository;
import za.co.verifyhire.model.Candidate;

@RestController
public class CandidateController {

    private final CandidateRepository candidateRepository;

    public CandidateController(CandidateRepository candidateRepository) {
        this.candidateRepository = candidateRepository;
    }

    @GetMapping("/candidates/{userId}")
    public Candidate getCandidate(@PathVariable String userId) throws Exception {
        return candidateRepository.findCandidateById(userId);
    }
}