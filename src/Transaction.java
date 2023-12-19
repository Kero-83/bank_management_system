public abstract class Transaction {
    protected String date;
    protected double value;
    protected BankAccount bankAccount;
    protected String type;
    protected Transaction(String date, double value, BankAccount bankAccount){
        this.date = date;
        this.value = value;
        this.bankAccount = bankAccount;
    }
    @Override
    public String toString() {
        return date + ' ' + String.valueOf(value) + + ' ' + bankAccount.toString() + ' ' + type;
    }

}
