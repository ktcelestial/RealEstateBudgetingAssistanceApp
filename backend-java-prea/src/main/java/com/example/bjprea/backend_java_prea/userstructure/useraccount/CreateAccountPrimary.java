package com.example.bjprea.backend_java_prea.userstructure.useraccount;

class CreateAccountPrimary extends AccountPrimary
{
    String ac_firstname;
    String ac_lastname;
    String currUser;
    String currPass;

    CreateAccountPrimary() {
        currUser = ac_username;
        currPass = ac_password;
    }

    void intakeUsername() {
        if (ac_username == null) {
            System.out.println("There is no username received.");
        } else if (ac_username.length() > 16) {
            System.out.println("Username is greater than 16. \n Please ensure that the username is less than or equal to 16.");
        } else if (ac_username.length() < 6) {
            System.out.println("Username is less than 6. \n Please ensure that the username is greate than or equal to 6.");
        } else {
            // continue
        }
    }

    void intakePassword() {
        if (ac_password == null) {
            System.out.println("This is no password received");
        } else if (ac_password.length() > 16) {
            System.out.println("Password is greater than 16. \n Please ensure that the password is less than or equal to 16.");
        } else if (ac_password.length() < 6) {
            System.out.println("Password is less than 6. \n Please ensure that the password is greate than or equal to 6.");
        } else {
            // continue
        }
    }

    void intakeFirstname() {}
    void intakeLastname() {}

    // DB Sendoff



    // DB Pulling
    void fetchPriority() {
        // fetch PVL_Level from datebase when user is logging in
    }

    void editPriority() {
        // AUTH, change priority level in DB with addition pre-elevated account (Admin, etc)

    }
}
