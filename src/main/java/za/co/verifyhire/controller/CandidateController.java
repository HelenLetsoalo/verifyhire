package za.co.verifyhire.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import za.co.verifyhire.database.CandidateRepository;

import java.util.List;

@RestController
public class CandidateController {

    private final CandidateRepository candidateRepository;

    public CandidateController(CandidateRepository candidateRepository) {
        this.candidateRepository = candidateRepository;
    }

    @GetMapping("/candidates")
    public List<String> getCandidates() throws Exception {
        return candidateRepository.findAllCandidates();
    }
}