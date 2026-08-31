public class Recruiter extends User{

    private String companyName;
    private boolean isVerified;

    public Recruiter(String userId, String firstName, String lastName, String email, String password, String location, String companyName, boolean isVerified){
        super(userId,firstName,lastName,email,password,location);
        this.companyName = companyName;
        this.isVerified = false;
    }

}