public abstract class Transaction {
    protected String date;
    protected int value;
    protected BankAccount bankAccount;
    protected Transaction(String date, int value, BankAccount bankAccount){
        this.date = date;
        this.value = value;
        this.bankAccount = bankAccount;
    }
}
