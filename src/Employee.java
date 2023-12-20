import java.util.Scanner;

public class Employee extends User {
    private static int counterEmp = 0;
    private String address;
    private String graduatedCollage;
    private String position;
    private String yearOfGraduatioString;
    private String totalGrades;

    public Employee(int id, String password, String firstName, String surName, String username, String address,
            String graduatedCollage, String position, String yearOfGraduatioString, String totalGrades) {
        counterEmp++;
        this.id = id;
        this.password = password;
        this.firstName = firstName;
        this.surName = surName;
        this.username = username;
        this.address = address;
        this.graduatedCollage = graduatedCollage;
        this.position = position;
        this.yearOfGraduatioString = yearOfGraduatioString;
        this.totalGrades = totalGrades;
    }

    public Employee(String password, String firstName, String surName, String username,
            String address,
            String graduatedCollage,
            String position,
            String yearOfGraduatioString,
            String totalGrades) {
        this(101 + counterEmp, password, firstName, surName, username, address, graduatedCollage, position,
                yearOfGraduatioString, totalGrades);
    }

    public void CreateClientAccount(Client client) {
        Lists.clients.add(client);
    }

    public void EditClientAccount(Scanner scanner, Client client) {
        window: while (true) {
            System.out.println("1- Edit password");
            System.out.println("2- Edit State of The Account");
            System.out.println("3- Edit Telephone");
            System.out.println("4- Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter New Password: ");
                    client.password = scanner.next();
                    break;
                case 2:
                    System.out.print("The Current State of The Acount is ");
                    System.out.println(client.getAccountState());
                    System.out.println("Enter Yes if you want to change it the another state");
                    String choice2 = scanner.next();
                    if (choice2.equals("Yes")) {
                        if (client.getAccountState().equals("Active")) {
                            client.setAccountState("closed");
                        } else {
                            client.setAccountState("Active");
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter new Telephone Number: ");
                    client.telephone = scanner.next();
                    break;
                case 4:
                    break window;
                default:
                    continue;
            }
        }
    }

    public void DeleteClientAccount(Client client) {
        Lists.clients.remove(client);
    }

    public void SearchForClientAccount(String clientName) {
        for (Client client : Lists.clients) {
            if (client.username.equals(clientName)) {
                System.out.println(client);
            }
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String stringForFileS() {
        return super.stringForFileS() + ' ' + address + ' ' + graduatedCollage + ' ' + position + ' '
                + yearOfGraduatioString + ' ' + totalGrades;
    }
}
