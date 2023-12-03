import java.util.Scanner;

public abstract class User {
    public int id;
    protected String password;
    public String firstName;
    public String surName;

    public void EditPersonalInformation(Scanner scanner){
        window: while (true) {
            System.out.println("Choose What you want to edit");
            System.out.println("1- Edit User Name");
            System.out.println("2- Edit Password");
            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    System.out.print("Enter new First Name: ");
                    firstName = scanner.next();
                    System.out.print("Enter new Sur Name: ");
                    surName = scanner.next();
                    break window;
                case 2:
                    System.out.print("Enter new Password: ");
                    password = scanner.next();
                    break window;
                default:
                    continue window;
            }
        }
    }
}
