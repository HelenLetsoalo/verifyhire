package za.co.verifyhire.model;

public class User{

    private String userId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String location;

    public User(String userId, String firstName, String lastName, String email,String password,String location) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.location = location;
    }

    public String getUserId() {
        return userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getLocation() {
        return location;
    }
}