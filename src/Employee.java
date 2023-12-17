import java.util.Scanner;

public class Employee extends User{
    public void CreateClientAccount(Client client)
    {
        Lists.clients.add(client);
    }
    public void EditClientAccount(Scanner scanner, Client client)
    {
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
                    if(client.getAccountState()) {
                        System.out.println("Active");
                    }
                    else
                    {
                        System.out.println("Not Active");
                    }
                    System.out.println("Enter Yes if you want to change it the another state");
                    String choice2 = scanner.next();
                    if(choice2.equals("choice")) {
                    client.setAccountState(!client.getAccountState());}
                    break;
                case 3:
                    System.out.print("Enter new Telephone Number: ");
                    String choice3 = scanner.next();
                    break;
                case 4:
                    break window;
                default:
                    continue;
            }
        }
    }
    public void DeleteClientAccount(Client client)
    {
        Lists.clients.remove(client);
    }
    public void SearchForClientAccount(String clientName)
    {
        for (Client client: Lists.clients) {
            String name = client.firstName + ' ' + client.surName;
            if (name.equals(clientName)) {
                System.out.println(client);
            }
        }
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
