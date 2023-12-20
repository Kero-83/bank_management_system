import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Lists {
    public static ArrayList<Client> clients = new ArrayList<Client>();
    public static ArrayList<Employee> employees = new ArrayList<Employee>();
    public static ArrayList<Employee> waitingEmp = new ArrayList<>();
    public static ArrayList<Transaction> transactions = new ArrayList<Transaction>();
    public static int savedClients = clients.size();
    public static int savedEmployees = employees.size();
    public static int savedWaiting = waitingEmp.size();
    public static int savedTransactions = transactions.size();

    public static void getListsFromFiles() {
        // Numbers Restoring
        getNumbers();

        // Clients Restoring
        getClients();

        // Employees Restoring
        getEmployees();

        // Waiting Restoring
        getWaiting();

        // Transactions Restoring
        getTransactions();
    }

    public static void addListsToFiles() {
        // Numbers Saving
        addNumbers();

        // Clients Saving
        addClients();

        // Waiting Employees Saving
        addWaiting();

        // Employees Saving
        addEmployees();

        // Transactions Saving
        addTransactions();
    }

    private static void getNumbers() {
        final String filePathNumbers = "numbers.txt";
        try {
            Scanner fileScanner = new Scanner(new File(filePathNumbers));
            savedClients = fileScanner.nextInt();
            savedEmployees = fileScanner.nextInt();
            savedWaiting = fileScanner.nextInt();
            savedTransactions = fileScanner.nextInt();
            fileScanner.close();
            System.out.println();
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + filePathNumbers);
            e.printStackTrace();
        }
    }

    private static void addNumbers() {
        final String filePathNumbers = "numbers.txt";
        try {
            FileWriter fileWriter = new FileWriter(filePathNumbers, false);
            fileWriter.write(String.valueOf(Lists.clients.size()) + ' ' + String.valueOf(Lists.employees.size()) + ' '
                    + String.valueOf(Lists.waitingEmp.size()) + ' ' + String.valueOf(Lists.transactions.size()));
            fileWriter.close();

            System.out.println("Data has been written to the file.");
        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void getClients() {
        final String filePathClients = "clients.txt";
        try {
            Scanner fileScanner = new Scanner(new File(filePathClients));
            for (int i = 0; i < savedClients; i++) {
                final int id = fileScanner.nextInt();
                final String password = fileScanner.next();
                final String firstName = fileScanner.next();
                final String surName = fileScanner.next();
                final String userName = fileScanner.next();
                final int account_number = fileScanner.nextInt();
                final double balance = fileScanner.nextDouble();
                final String state_of_the_account = fileScanner.next();
                final String type_of_the_account = fileScanner.next();
                final String telephone = fileScanner.next();
                clients.add(new Client(id, password, firstName, surName, userName, type_of_the_account,
                        telephone,state_of_the_account, balance));
            }
            fileScanner.close();
            System.out.println(); // Add a newline for better separation of file contents
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + filePathClients);
            e.printStackTrace();
        }
    }

    private static void addClients() {
        final String filePathClients = "clients.txt";
        try {
            FileWriter fileWriter = new FileWriter(filePathClients, false);
            for (Client client : clients) {
                fileWriter.write(client.stringForFileS());
                fileWriter.write('\n');
            }
            fileWriter.close();

            System.out.println("Data has been written to the file.");
        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void getEmployees() {
        String filePath = "employees.txt";

        try {
            Scanner fileScanner = new Scanner(new File(filePath));
            for (int i = 0; i < savedEmployees; i++) {
                final int id = fileScanner.nextInt();
                final String password = fileScanner.next();
                final String firstName = fileScanner.next();
                final String surName = fileScanner.next();
                final String userName = fileScanner.next();
                final String address = fileScanner.next();
                final String graduatedCollage = fileScanner.next();
                final String position = fileScanner.next();
                final String yearOfGraduatioString = fileScanner.next();
                final String totalGrades = fileScanner.next();
                employees.add(new Employee(id, password, firstName, surName, userName, address, graduatedCollage, position,
                        yearOfGraduatioString, totalGrades));
            }
            fileScanner.close();
            System.out.println();
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + filePath);
            e.printStackTrace();
        }
    }

    private static void addEmployees() {
        String filePathEmp = "employees.txt";
        try {
            FileWriter fileWriter = new FileWriter(filePathEmp, false);

            for (Employee employee : Lists.employees) {
                fileWriter.write(employee.stringForFileS());
                fileWriter.write('\n');
            }

            fileWriter.close();

            System.out.println("Data has been written to the file.");
        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void getWaiting() {
        final String filePath = "waiting_employees.txt";

        try {
            Scanner fileScanner = new Scanner(new File(filePath));
            for (int i = 0; i < savedWaiting; i++) {
                final int id = fileScanner.nextInt();
                final String password = fileScanner.next();
                final String firstName = fileScanner.next();
                final String surName = fileScanner.next();
                final String userName = fileScanner.next();
                final String address = fileScanner.next();
                final String graduatedCollage = fileScanner.next();
                final String position = fileScanner.next();
                final String yearOfGraduatioString = fileScanner.next();
                final String totalGrades = fileScanner.next();
                waitingEmp.add(new Employee(id, password, firstName, surName, userName, address, graduatedCollage, position,
                        yearOfGraduatioString, totalGrades));
            }
            fileScanner.close();
            System.out.println(); // Add a newline for better separation of file contents
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + filePath);
            e.printStackTrace();
        }
    }

    private static void addWaiting() {
        final String filePathWaiting = "waiting_employees.txt";
        try {
            FileWriter fileWriter = new FileWriter(filePathWaiting, false);

            for (Employee employee : Lists.waitingEmp) {
                fileWriter.write(employee.stringForFileS());
                fileWriter.write('\n');
            }

            fileWriter.close();

            System.out.println("Data has been written to the file.");
        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void getTransactions() {
        final String filePath = "transactions.txt";
        try {
            Scanner fileScanner = new Scanner(new File(filePath));
            for (int i = 0; i < savedTransactions; i++) {
                final String date = fileScanner.next();
                final double value = fileScanner.nextDouble();
                final double balance = fileScanner.nextDouble();
                final int account_number = fileScanner.nextInt();
                final String state_of_the_account = fileScanner.next();
                final String type_of_the_account = fileScanner.next();
                final String transaction_type = fileScanner.next();
                if (transaction_type.equals("Transfer")) {
                    final double rbalance = fileScanner.nextDouble();
                    final int raccount_number = fileScanner.nextInt();
                    final String rstate_of_the_account = fileScanner.next();
                    final String rtype_of_the_account = fileScanner.next();
                    if (type_of_the_account.equals("Current") && rtype_of_the_account.equals("Current")) {
                        Lists.transactions.add(new Transfer(date, value,
                                new CurrentAccount(account_number, balance, state_of_the_account),
                                new CurrentAccount(raccount_number, rbalance, rstate_of_the_account)));
                    } else if(type_of_the_account.equals("Current")) {
                        Lists.transactions.add(new Transfer(date, value,
                                new CurrentAccount(account_number, balance, state_of_the_account),
                                new SavingAccount(raccount_number, rbalance, rstate_of_the_account)));
                    }
                    else {
                        Lists.transactions.add(new Transfer(date, value,
                                new SavingAccount(account_number, balance, state_of_the_account),
                                new SavingAccount(raccount_number, rbalance, rstate_of_the_account)));
                    }
                }
                else if (transaction_type.equals("Deposit")) {
                 if (type_of_the_account.equals("Current")) {
                        Lists.transactions.add(new Deposit(date, value,
                        new CurrentAccount(account_number, balance, state_of_the_account)));
                            }
                    else {
                        Lists.transactions.add(new Deposit(date, value,
                        new SavingAccount(account_number, balance, state_of_the_account)));
                    }
                }
                else {
                    if (type_of_the_account.equals("Current")) {
                        Lists.transactions.add(new Withdraw(date, value,
                        new CurrentAccount(account_number, balance, state_of_the_account)));
                            }
                    else {
                        Lists.transactions.add(new Withdraw(date, value,
                        new SavingAccount(account_number, balance, state_of_the_account)));
                    }
                }
            }
            fileScanner.close();
            System.out.println(); // Add a newline for better separation of file contents
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + filePath);
            e.printStackTrace();
        }
    }

    private static void addTransactions() {
        final String filePath = "transactions.txt";
        try {
            FileWriter fileWriter = new FileWriter(filePath, false);
            for (Transaction transaction : transactions) {
                fileWriter.write(transaction.toString() + '\n');
            }
            fileWriter.close();

            System.out.println("Data has been written to the file.");
        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
