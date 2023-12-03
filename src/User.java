import java.util.Scanner;

public abstract class User {
    public int id;
    protected String password;
    public String firstName;
    public String surName;
    public double salary;
    public abstract void EditPersonalInformation(Scanner scanner);
}
