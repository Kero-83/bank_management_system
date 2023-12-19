public class Client extends User {
    private static int counterCli = 0;
    private BankAccount account;
    protected String telephone;

    public Client(int id, String password, String firstName, String surName,
    String username,
            String type_of_the_account, String state_of_the_account, double balance) {
        this.id = id;
        this.password = password;
        this.firstName = firstName;
        this.surName = surName;
        this.username = username;
        if (type_of_the_account.equals("Current")) {
            account = new CurrentAccount(100 + id, balance, state_of_the_account);
        } else {
            account = new SavingAccount(100 + id, balance, state_of_the_account);
        }
    }

    public Client(String password, String firstName, String surName, String username,
            String type_of_the_account) {
        this(200 + ++counterCli, password, firstName, surName, username, type_of_the_account,"Active", 0);
    }

    public void setAccountState(String state) {
        this.account.state_of_the_account = state;
    }

    public String getAccountState() {
        return account.state_of_the_account;
    }
    public void information(int id, String first_name, String last_name, BankAccount account, String username,
            String password, String telephone, String state_of_the_account, String type_of_the_account) {
        this.id = id;
        this.firstName = first_name;
        this.surName = last_name;
        this.account = account;
        this.password = password;
        this.telephone = telephone;
        this.account.state_of_the_account = state_of_the_account;
        this.account.type_of_the_account = type_of_the_account;
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
        System.out.println("Account State  : " + account.state_of_the_account);
        System.out.println("Account Type is : " + account.type_of_the_account);
        System.out.println("Account Balance is : " + account.balance);

    }

    public void Transfer_money_to_another_clients_account(Client recipient, double amount, String date) {
        if (account.balance >= amount) {
            account.balance -= amount;
            recipient.deposit(amount, date, account);
            System.out.println("Transfer successful!");
            recipient.account.balance += amount;
            Lists.transactions.add(new Transfer(date, amount, account, recipient.account));
        } else {
            System.out.println("failed !");
        }
    }

    public void deposit(double amount, String date, BankAccount bankAccount) {
        account.balance += amount;
        System.out.println("Deposit successful ! .\n Current balance :" + account.balance);
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
    
    @Override
    public String stringForFileS() {
        return super.stringForFileS() + ' ' + account.toString();
    }
}