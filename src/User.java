

public abstract class User {
    protected int id;
    protected String password;
    protected String firstName;
    protected String surName;
    protected String username;

    @Override
    public String toString() {
        return "ID: " + String.valueOf(id) + " First Name: " + firstName + " Last Name: " + surName;
    }
    public String stringForFileS() {
        return String.valueOf(id) + ' ' + password + ' ' + firstName + ' ' + surName + ' ' + username;
    }
}
