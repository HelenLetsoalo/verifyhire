public class Candidate extends User{

    private List<Qualification> qualification;
    private List<WorkExperience> experience;
    private List<Reference> reference;

    public Candidate(String userId, String firstName, String lastName, String email,String password,String location, Qualification qualification, WorkExperience experience,Reference reference) {
        super(userId, firstName, lastName,email,password,location);
        this.qualification = qualification;
        this.experience = experience;
        this.reference = reference;
    }

    // Getters

    public Qualification getQualification() {
        return qualification;
    }

    public WorkExperience getExperience() {
        return experience;
    }

    public Reference getReference() {
        return reference;
    }
}