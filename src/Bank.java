import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Admin admin = new Admin();
        Boolean window_1 = true;
        Lists.getListsFromFiles();
        while (window_1){
            System.out.println("FCIS Bank Management System");
            System.out.println();
            System.out.println("1- Login As Admin");
            System.out.println("2- Login As Employee");
            System.out.println("3- Login As Client");
            System.out.println("4- Exit");
            int input = scanner.nextInt();
            switch (input){
                case 1:
                    LogInAsAdmin(scanner, admin);
                    break;
                case 2:
                    LogInAsEmployee(scanner);
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
        Lists.addListsToFiles();
    }
    public static void LogInAsAdmin(Scanner scanner, Admin admin){
        String userName, password;
        System.out.print("Username: ");
        userName = scanner.next();
        System.out.print("Password: ");
        password = scanner.next();
        if (userName.equals("admin")){

        }
        else
        {
            System.out.println("Wrong username");
        }
        if(password.equals("admin")) {
            window: while (true) {
                System.out.println("1- Authorize new Employees");
                System.out.println("2- Display All Clients");
                System.out.println("3- Display All Employees");
                System.out.println("4- Show All Transactions");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
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
                                admin.AuthorizeTheNewEmployees(Lists.employees.get(choice2 - 1));
                                break;
                            case 2:
                                admin.DisplayAllNotAuthorizeEmployees();
                                System.out.print("Choose which one do you want to remove: ");
                                int choice3 = scanner.nextInt();
                                admin.NotAuthorizeTheNewEmployees(Lists.employees.get(choice3 - 1));
                            case 3:
                                break window;
                        }
                }
            }
        }
        else
        {
            System.out.println("Wrong Password");
        }

    }
    public static void LogInAsEmployee(Scanner scanner){
        String userName, password;
        System.out.print("Username: ");
        userName = scanner.next();
        System.out.print("Password: ");
        password = scanner.next();
        boolean notValid = true;
        for (Employee employee1: Lists.employees) {
            if (userName.equals(employee1.username) && userName.equals(employee1.password)) {
                notValid = false;
                while (true) {
                    System.out.println("1- Create Client Account");
                    System.out.println("2- Edit Client Account");
                    System.out.println("3- Delete Client Account");
                    System.out.println("4- Search for Client Account");
                    System.out.println("5- Exit");
                    int choice = scanner.nextInt();
                    switch (choice) {
                        case 1:

                    }
                }
            }
        }
        if(notValid) {
            System.out.println("wrong password or username");
        }
    }
    public static void LogInAsClient(Scanner scanner){
        String userName, password;
        System.out.print("Username: ");
        userName = scanner.next();
        System.out.print("Password: ");
        password = scanner.next();
//        if (userName.equals(admin.userName)){
//            System.out.println("Wrong username");
//        }
//        if(password.equals(admin.getPassword())) {
//            System.out.println("Wrong Password");
//        }

    }
}