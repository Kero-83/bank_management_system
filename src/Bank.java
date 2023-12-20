import java.time.LocalDate;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Admin admin = new Admin();
        Boolean window_1 = true;
//        Lists.waitingEmp.add(new Employee("test", "kero", "gerges", "kerog", "imbaba", "AinShams", "Newbie", "2026", "VeryGood"));
//        Lists.waitingEmp.add(new Employee("test", "kero", "magdy", "keromagdy", "Marg", "AinShams", "Newbie", "2026", "VeryGood"));
        Lists.getListsFromFiles();
//        Lists.waitingEmp.add(new Employee("test", "kero", "fawzy", "kerosarwat", "imbaba", "AinShams", "Leader", "2026", "VeryGood"));
//        Lists.waitingEmp.add(new Employee("test", "kero", "magdy", "keromagdy", "Marg", "AinShams", "Newbie", "2026", "VeryGood"));
        System.out.println(String.valueOf(Lists.savedClients) + ' ' + String.valueOf(Lists.savedEmployees) + ' '
                + String.valueOf(Lists.savedWaiting) + ' ' + String.valueOf(Lists.savedTransactions));
          while (window_1) {
          System.out.println("FCIS Bank Management System");
          System.out.println("---------------------------");
          System.out.println("1- Login As Admin");
          System.out.println("2- Login As Employee");
          System.out.println("3- Login As Client");
          System.out.println("4- Exit");
          int input = scanner.nextInt();
          switch (input) {
          case 1:
          LogInAsAdmin(scanner, admin);
          break;
          case 2:
          LogInAsEmployee(scanner, admin);
          break;
          case 3:
          LogInAsClient(scanner);
          case 4:
          window_1 = false;
          break;
          default:
          System.out.println("Invalid input");
          continue;
          }
          }

        scanner.close();
        Lists.addListsToFiles();
    }

    public static void LogInAsAdmin(Scanner scanner, Admin admin) {
        String userName, password;
        boolean window = true , window1 = true;
        System.out.print("Username: ");
        userName = scanner.next();
        System.out.print("Password: ");
        password = scanner.next();
        if (userName.equals("admin")) {

        } else {
            System.out.println("Wrong username");
        }
        if (password.equals("admin")) {
            while (window) {
                System.out.println("1- Authorize new Employees");
                System.out.println("2- Display All Clients");
                System.out.println("3- Display All Employees");
                System.out.println("4- Show All Transactions");
                System.out.println("5- Back");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        while (window1) {
                            System.out.println("Actions:");
                            System.out.println("1- Authorize Employee");
                            System.out.println("2- Remove from Waiting");
                            System.out.println("3- Exit");
                            int choice1 = scanner.nextInt();
                            switch (choice1) {
                                case 1:
                                    admin.DisplayAllNotAuthorizeEmployees();
                                    System.out.print("Choose which one do you want to authorize: ");
                                    int choice2 = scanner.nextInt();
                                    admin.AuthorizeTheNewEmployees(Lists.waitingEmp.get(choice2 - 1));
                                    break;
                                case 2:
                                    admin.DisplayAllNotAuthorizeEmployees();
                                    System.out.print("Choose which one do you want to remove: ");
                                    int choice3 = scanner.nextInt();
                                    admin.NotAuthorizeTheNewEmployees(Lists.employees.get(choice3 - 1));
                                    break;
                                case 3:
                                    window1 = false;
                                    break;
                            }
                        }
                    case 2:
                        admin.DisplayAllClients();
                        break;
                    case 3:
                        admin.DisplayAllEmployees();
                        break;
                    case 4:
                        admin.ShowAllTransactions();
                        break;
                    case 5:
                        window = false;
                        break;
                    default:
                        System.out.println("Wrong choice");
                }
            }
        } else {
            System.out.println("Wrong Password");
        }

    }

    public static void LogInAsEmployee(Scanner scanner, Admin admin) {
        String userName, password;
        System.out.print("Username: ");
        userName = scanner.next();
        System.out.print("Password: ");
        password = scanner.next();
        boolean notValid = true;
        for (Employee employee1 : Lists.employees) {
            if (userName.equals(employee1.username) && password.equals(employee1.password)) {
                notValid = false;
                window: while (true) {
                    System.out.println("1- Create Client Account");
                    System.out.println("2- Edit Client Account");
                    System.out.println("3- Delete Client Account");
                    System.out.println("4- Search for Client Account");
                    System.out.println("5- Exit");
                    int choice = scanner.nextInt();
                    switch (choice) {
                        case 1:
                            int id;
                            String clientPassword;
                            String firstName;
                            String surName;
                            String username;
                            String type_of_the_account;
                            String telephone;
                            System.out.println("Enter New Client Information");
                            System.out.print("Enter Client Password: ");
                            clientPassword = scanner.next();
                            System.out.print("Enter First Name: ");
                            firstName = scanner.next();
                            System.out.print("Enter Last Name: ");
                            surName = scanner.next();
                            System.out.print("Enter User Name: ");
                            username = scanner.next();
                            System.out.print("Enter Type of the Account: ");
                            type_of_the_account = scanner.next();
                            System.out.println("Enter Telephone: ");
                            telephone = scanner.next();
                            Lists.clients.add(
                                    new Client(clientPassword, firstName, surName, username, type_of_the_account, telephone));
                            break;
                        case 2:
                            admin.DisplayAllClients();
                            System.out.print("Choose which one do you want to Edit: ");
                            int choice2 = scanner.nextInt();
                            Client c = Lists.clients.get(choice2 - 1);
                            System.out.println("Choose which Information do you want to Edit: ");
                            System.out.println("1- user Name");
                            System.out.println("2- Password");
                            int choice3 = scanner.nextInt();
                            switch (choice3) {
                                case 1:
                                    System.out.print("Enter username: ");
                                    c.username = scanner.next();
                                    break;
                                case 2:
                                    System.out.print("Enter Password: ");
                                    c.password = scanner.next();
                            }
                            break;
                        case 3:
                            admin.DisplayAllClients();
                            System.out.print("Choose which one do you want to Delete: ");
                            int choice4 = scanner.nextInt();
                            admin.DeleteClient(Lists.clients.get(choice4 - 1));
                            break;
                        case 4:
                            System.out.println("Enter username of client: ");
                            employee1.SearchForClientAccount(scanner.next());
                            break;
                        case 5:
                            break window;
                    }
                }
            }
        }
        if (notValid) {
            System.out.println("wrong password or username");
        }
    }

    public static void LogInAsClient(Scanner scanner) {
        String userName, password;
        System.out.print("Username: ");
        userName = scanner.next();
        System.out.print("Password: ");
        password = scanner.next();
        boolean notValid = true;
        for (Client client : Lists.clients) {
            if (userName.equals(client.username) && password.equals(client.password)) {
                notValid = false;
                window: while (true) {
                    System.out.println("1- Display details of your account");
                    System.out.println("2- Transfer money to another account");
                    System.out.println("3- Deposit");
                    System.out.println("4- Withdraw");
                    System.out.println("5- Show Transaction History");
                    System.out.println("6- Back");
                    int choice = scanner.nextInt();
                    switch (choice) {
                        case 1:
                            client.Display_details_of_his_account();
                            break;
                        case 2:
                            while (true) {
                                int counter = 0;
                                for (Client clientn : Lists.clients) {
                                    if (client != clientn) {
                                        System.out.print(++counter);
                                        System.out.println(' ' + clientn.toString());
                                    }
                                }
                                System.out.println("Choose client to transfer to");
                                int choice1 = scanner.nextInt();
                                if (choice1 <= counter) {
                                    for (int i = 0; i < counter; ++i) {
                                        if (client == Lists.clients.get(i)) {
                                            choice1++;
                                            break;
                                        }
                                    }
                                }
                                System.out.print("Enter value: ");
                                double value = scanner.nextDouble();
                                while (value > client.account.balance) {
                                    System.out.print("Enter value: ");
                                    value = scanner.nextDouble();
                                    client.Transfer_money_to_another_clients_account(Lists.clients.get(choice1), value, "2022-12-20");
                                }
                            }
                            // break;
                        case 3:
                            System.out.println("Enter value: ");
                            double value = scanner.nextDouble();
                            System.out.print("Enter value: ");
                            client.deposit(value, "2022-12-20", client.account);
                            break;
                        case 4:
                            System.out.println("Enter value: ");
                            double value3 = scanner.nextDouble();
                            while (value3 > client.account.balance) {
                                System.out.print("Enter value: ");
                                value = scanner.nextDouble();
                                client.withdraw(value, "2022-12-20", client.account);
                            }
                            break;
                        case 5:
                            client.showTransactionHistory();
                            break;
                        case 6:
                            break window;
                        default:
                            System.out.println("Wrong choice");
                            break;
                    }
                }
            }
        }
        if (notValid) {
            System.out.println("wrong password or username");
        }

    }
}