package za.co.verifyhire.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import za.co.verifyhire.database.CandidateRepository;
import za.co.verifyhire.model.Candidate;
import za.co.verifyhire.dto.CandidateResponse;

@RestController
public class CandidateController {

    private final CandidateRepository candidateRepository;

    public CandidateController(CandidateRepository candidateRepository) {
        this.candidateRepository = candidateRepository;
    }

    @GetMapping("/candidates/{userId}")
    public CandidateResponse getCandidate(@PathVariable String userId)
            throws Exception {

        Candidate candidate =
                candidateRepository.findCandidateById(userId);

        if (candidate == null) {
            return null;
        }

        return new CandidateResponse(
                candidate.getUserId(),
                candidate.getFirstName(),
                candidate.getLastName(),
                candidate.getEmail(),
                candidate.getLocation()
        );
    }
}