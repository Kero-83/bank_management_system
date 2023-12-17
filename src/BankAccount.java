public abstract class BankAccount {
    Client client;
    protected double balance;
    protected int account_number;
    protected Boolean activeStatus;

    @Override
    public String toString() {
        return client.toString() + ' ' + balance;
    }
}
