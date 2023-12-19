public abstract class BankAccount {
    protected double balance;
    protected int account_number;
    protected String state_of_the_account;
    protected String type_of_the_account;
    public BankAccount(int account_number, double balance, String state_of_the_account) {
        this.account_number = account_number;
        this.balance = balance;
        this.state_of_the_account = state_of_the_account;
    }
    public abstract void checker();
    @Override
    public String toString() {
        return String.valueOf(account_number) + ' ' + String.valueOf(balance) + ' ' + state_of_the_account + ' ' + type_of_the_account;
    }
}
