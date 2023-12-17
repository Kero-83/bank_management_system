import java.util.Scanner;

public class Client extends User{
    public Client(int id, String password, String firstName, String surName, String username, String type_of_the_account) {
        this.id = id;
        this.password = password;
        this.firstName = firstName;
        this.surName = surName;
        this.username = username;
        if (type_of_the_account.equals("Current")) {
            account = new CurrentAccount();
        } else {
            account = new SavingAccount();
        }
    }

    public void setAccountState(boolean state) {
        this.account.activeStatus = state;
    }
    public boolean getAccountState() {
        return account.activeStatus;
    }

    private BankAccount account;
    private String telephone;
    private String state_of_the_account;
    private String type_of_the_account;


    public void information(int id, String first_name, String last_name, BankAccount account, String username, String password, String telephone, String state_of_the_account, String type_of_the_account) {
        this.id = id;
        this.firstName = first_name;
        this.surName = last_name;
        this.account = account;
        this.username = username;
        this.password = password;
        this.telephone = telephone;
        this.state_of_the_account = state_of_the_account;
        this.type_of_the_account = type_of_the_account;
        this.account.balance = account.balance;
    }

    public void Edit_personal_information(String first_name, String last_name, String telephone) {
        this.firstName = first_name;
        this.surName = last_name;
        this.telephone = telephone;

    }

    public void Display_details_of_his_account() {
        System.out.println("Account Number is : " + account.account_number);
        System.out.println("First Name is  : " + firstName);
        System.out.println("Last Name is : " + firstName);
        System.out.println("Telephone Number is : " + telephone);
        System.out.println("Account State  : " + state_of_the_account);
        System.out.println("Account Type is : " + type_of_the_account);
        System.out.println("Account Balance is : " + account.balance);

    }

    public void Transfer_money_to_another_clients_account(Client recipient , double amount, String date){
        if(account.balance >=amount){
            account.balance-=amount;
            recipient.deposit(amount , date, account);
            System.out.println("Transfer successful !");
            recipient.account.balance += amount;
            Lists.transactions.add(new Transfer(date, amount, account, recipient.account));
        }else{
            System.out.println("failed !");
        }
    }
    public void deposit(double amount, String date, BankAccount bankAccount){
        account.balance+=amount;
        System.out.println("Deposit successful ! .\n Current balance :"+account.balance );
        Lists.transactions.add(new Deposit(date, amount, bankAccount));
    }
    public void showTransactionHistory() {
        for (Transaction transaction : Lists.transactions) {
            if (transaction.bankAccount == account) {
                System.out.println(transaction);
            }
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}