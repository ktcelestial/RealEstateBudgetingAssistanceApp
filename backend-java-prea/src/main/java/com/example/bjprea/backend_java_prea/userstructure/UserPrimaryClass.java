package com.example.bjprea.backend_java_prea.userstructure;

public abstract class UserPrimaryClass implements IUserPrimary {

    private enum PVL_Level {
        SUPER, HIGH, MEDIUM, LOW, NONE;
    }

    public UserPrimaryClass() {
        // session = PVL_Level.NONE;
    }

    @Override
    public void loginNecessary(int ans) {
        if (ans == 1) {
            // log in
            System.out.println("User needs to log in...");
        } else {
            System.out.println("Not logging in, session remaining in Guest state...");
        }

    }

    @Override
    public void fetchUserPrivilege() {
        // check DB (PostgresSQL) or user priv delivery
        // give user proper privilege

    }
}
