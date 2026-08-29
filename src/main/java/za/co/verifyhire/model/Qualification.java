public class Qualification {

    private String qualificationId;
    private String name;
    private String institutionName;
    private int yearObtained;

    public Qualification (String qualificationId, String name, String institutionName, int yearObtained) {
        this.qualificationId = qualificationId;
        this.name = name;
        this.institutionName = institutionName;
        this.yearObtained = yearObtained;
    }
    public String getQualificationID() {
        return qualificationID;
    }

    public String getInstitutionName(){
        return institutionName;
    }

    public String getName() {
        return name;
    }

    public int getYearObtained(){
        return yearObtained;
    }
}