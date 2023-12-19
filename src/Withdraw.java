public class Withdraw extends Transaction {
    public Withdraw(String date, double value, BankAccount bankAccount) {
        super(date, value, bankAccount);
        type = "Withdraw";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
