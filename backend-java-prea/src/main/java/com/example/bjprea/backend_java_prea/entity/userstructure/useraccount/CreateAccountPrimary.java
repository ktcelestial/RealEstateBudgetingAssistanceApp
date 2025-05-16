package com.example.bjprea.backend_java_prea.entity.userstructure.useraccount;

public class CreateAccountPrimary extends AccountPrimary
{
    String ac_firstname;
    String ac_lastname;
    String ac_DOB;

    public CreateAccountPrimary() {
        System.out.println("Account Creation Module started");
    }

    String intakeUsername() {
        char char_idx;
        if (ac_username == null) {
            System.out.println("There is no username received.");
            return "";
        } else if (ac_username.length() > 16) {
            System.out.println("Username is greater than 16. \n Please ensure that the username is less than or equal to 16.");
            return "";
        } else if (ac_username.length() < 6) {
            System.out.println("Username is less than 6. \n Please ensure that the username is greater than or equal to 6.");
            return "";
        } else {
            // empty
        }

        for (int idx = 0; idx < ac_username.length(); idx++) {
            // &seriscool123
            char_idx = ac_username.charAt(idx);
            if (Character.isLetterOrDigit(char_idx) && !Character.isWhitespace(char_idx)) {
               // empty
            } else {
                System.out.println("Username using invalid characters: Non-alphanumeric combination");
                return "";
            }

        }
        return ac_username;
    }

    String intakePassword() {
        if (ac_password == null) {
            System.out.println("This is no password received");
            return "";
        } else if (ac_password.length() > 25) {
            System.out.println("Password is greater than 25. \n Please ensure that the password is less than or equal to 25.");
            return "";
        } else if (ac_password.length() < 10) {
            System.out.println("Password is less than 10. \n Please ensure that the password is greater than or equal to 10.");
            return "";
        } else {
            // continue
        }

        char char_idx;
        for (int idx = 0; idx < ac_password.length(); idx++) {
            // &seriscool123 (temporary/demo)
            char_idx = ac_password.charAt(idx);

            if (Character.isLetterOrDigit(char_idx) || !Character.isWhitespace(char_idx)) {
                // success, part 1/2

            } else if (char_idx == '!' || char_idx == '@' || char_idx == '#' || char_idx == '$'
                || char_idx == '%' || char_idx == '^' || char_idx == '&' || char_idx == '*' ||  char_idx == '(' || char_idx == ')') {
                // success, part 2/2

            } else {
                System.out.println("Error: Password using invalid characters/whitespace: Non-alphanumeric combination");
                return "";
            }

        }

        return ac_password;
    }

    String intakeFirstname() {
        if (ac_firstname == null) {
            System.out.println("This is no First Name received");
            return "";
        } else if (ac_firstname.length() > 30) {
            System.out.println("First name is greater than 30. \n Please ensure that the password is less than or equal to 30.");
            return "";
        } else if (ac_firstname.length() < 2) {
            System.out.println("First name is less than 2. \n Please ensure that the password is greater than or equal to 2.");
            return "";
        } else {
            // continue
        }

        char char_idx;
        for (int idx = 0; idx < ac_firstname.length(); idx++) {
            char_idx = ac_firstname.charAt(idx);

            if (Character.isLetter(char_idx) && !Character.isWhitespace(char_idx)) {
                // success

            } else {
                System.out.println("Error: First name has whitespace.");
                return "";
            }

        }
        return ac_firstname;
    }

    String intakeLastname() {
        if (ac_lastname == null) {
            System.out.println("This is no Last Name received");
            return "";
        } else if (ac_lastname.length() > 30) {
            System.out.println("Last name is greater than 30. \n Please ensure that the password is less than or equal to 30.");
            return "";
        } else if (ac_lastname.length() < 2) {
            System.out.println("Last name is less than 2. \n Please ensure that the password is greater than or equal to 2.");
            return "";
        } else {
            // continue
        }

        char char_idx;
        for (int idx = 0; idx < ac_lastname.length(); idx++) {
            char_idx = ac_lastname.charAt(idx);

            if (Character.isLetter(char_idx) && !Character.isWhitespace(char_idx)) {
                // success

            } else {
                System.out.println("Error: Last name has whitespace.");
                return "";
            }

        }
        return ac_lastname;

    }


    // DB Sendoff - New account credentials valid, sent to database



    // DB Pulling
    void confirmUsernameNotTaken() {
        // confirm in DB, pull request
    }

    void fetchPriority() {
        // fetch PVL_Level from database when user is logging in

    }

    void editPriority() {
        // AUTH, change priority level in DB with addition pre-elevated account (Admin, etc)

    }


    // getter function
    public String inputUsername() {
        return intakeUsername();
    }
    public String inputPassword() {
        return intakePassword();
    }
    public String inputFirstName() {
        return intakeFirstname();
    }
    public String inputLastName() {
        return intakeLastname();
    }
}
