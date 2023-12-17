public class Deposit extends Transaction{
    protected Deposit(String date, double value, BankAccount bankAccount) {
        super(date, value, bankAccount);
    }
    @Override
    public String toString() {
        return super.toString() + ' ' + "deposit";
    }
}
