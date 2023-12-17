public class Withdraw extends Transaction{
    public Withdraw(String date, int value, BankAccount bankAccount) {
        super(date, value, bankAccount);
    }
    @Override
    public String toString() {
        return super.toString() + ' ' + "withdraw";
    }
}
