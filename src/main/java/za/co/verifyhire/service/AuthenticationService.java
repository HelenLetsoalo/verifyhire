package za.co.verifyhire.service;

import java.util.ArrayList;
import java.util.List;

import za.co.verifyhire.model.User;

public class AuthenticationService{

    private List<User> users;

    public AuthenticationService() {
        this.users = new ArrayList<>();
    }
}