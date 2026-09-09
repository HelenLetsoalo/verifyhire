package za.co.verifyhire.model;

public class Recruiter extends User{

    private String companyName;
    private boolean isVerified;

    public Recruiter(String userId, String firstName, String lastName, String email, String password, String location, String companyName){
        super(userId,firstName,lastName,email,password,location);
        this.companyName = companyName;
        this.isVerified = false;
    }

    public String getCompanyName(){return companyName;}

    public boolean isVerified(){return isVerified;}

}