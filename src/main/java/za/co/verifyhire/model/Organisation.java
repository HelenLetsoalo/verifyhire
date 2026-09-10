package za.co.verifyhire.model;

public class Organisation {

    private String organisationId;
    private String name;
    private String location;
    private String email;
    private String services;
    private String phone;

    public Organisation(String organisationId,String name,String location,String email,String services,String phone) {
        this.organisationId = organisationId;
        this.name = name;
        this.location = location;
        this.email = email;
        this.services = services;
        this.phone = phone;
    }

    public String getOrganisationId() {
        return organisationId;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getEmail() {
        return email;
    }

    public String getServices() {
        return services;
    }

    public String getPhone() {
        return phone;
    }
}