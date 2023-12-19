public class Transfer extends Transaction{
    BankAccount recivingBankAccount;
    protected Transfer(String date, double value, BankAccount bankAccount, BankAccount recivingBankAccount) {
        super(date, value, bankAccount);
        type = "Transfer";
        this.recivingBankAccount = recivingBankAccount;
    }

    @Override
    public String toString() {
        return super.toString() + " " + recivingBankAccount;
    }
}
