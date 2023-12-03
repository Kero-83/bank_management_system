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
                    System.out.println("Invaild input");
                    continue;
            }
        }
        Lists.addListsToFiles();
    }
    public static void LogInAsEmployee(Scanner scanner){
        String userName, password;
        System.out.print("Username: ");
        userName = scanner.next();
        System.out.print("Password: ");
        password = scanner.next();
//        if (userName.equals(.userName)){
//            System.out.println("Wrong username");
//        }
//        if(password.equals(admin.getPassword())) {
//            System.out.println("Wrong Password");
//        }

    }
    public static void LogInAsAdmin(Scanner scanner, Admin admin){
        String userName, password;
        System.out.print("Username: ");
        userName = scanner.next();
        System.out.print("Password: ");
        password = scanner.next();
        if (userName.equals(admin.userName)){
            System.out.println("Wrong username");
        }
        if(password.equals(admin.getPassword())) {
            System.out.println("Wrong Password");
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