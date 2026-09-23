package za.co.verifyhire.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CandidateController {

    @GetMapping("/candidates")
    public List<String> getCandidates() {
        return List.of("U001");
    }
}