package com.example.bjprea.backend_java_prea;

public class InitApplication implements IApplication {

    private String username;
    private int userType;

    public InitApplication() {
        username = "Empty";
        userType = 0;
    }

    @Override
    public void fetchUserInit() {
        System.out.println("Username: " + username + "\n" + "User Type: " + userType + "\n");
    }
}
