package com.example.bjprea.backend_java_prea;

public class InitApplication implements IApplication {

    private String userHash;
    private int userType;

    public InitApplication() {
        userHash = "Empty";
        userType = 0;
    }

    @Override
    public void fetchUserInit() {
        System.out.println("Username: " + userHash + "\n" + "User Type: " + userType + "\n");
    }
}
