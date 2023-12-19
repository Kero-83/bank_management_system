public class Deposit extends Transaction {
    protected Deposit(String date, double value, BankAccount bankAccount) {
        super(date, value, bankAccount);
        type = "Deposit";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
