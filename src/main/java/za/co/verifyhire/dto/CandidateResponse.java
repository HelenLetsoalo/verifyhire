package za.co.verifyhire.dto;

public record CandidateResponse(
        String userId,
        String firstName,
        String lastName,
        String email,
        String location
) {
}