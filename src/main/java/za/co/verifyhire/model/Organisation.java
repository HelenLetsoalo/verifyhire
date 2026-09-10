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

}