public class Candidate extends User{

    private List<Qualification> qualifications;
    private List<WorkExperience> experiences;
    private List<Reference> references;

    public Candidate(String userId, String firstName, String lastName, String email,String password,String location, Qualification qualification, WorkExperience experience,Reference reference) {
        super(userId, firstName, lastName,email,password,location);
        this.qualification = new ArrayList<>();
        this.experience = new ArrayList<>();
        this.reference = new ArrayList<>();
    }

    // Getters

    public List<Qualification> getQualifications() {
        return qualifications;
    }

    public List<WorkExperience> getExperiences() {
        return experiences;
    }

    public List<Referenc> getReferences() {
        return references;
    }
}