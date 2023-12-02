public class Transfer extends Transaction{
    BankAccount recivingBankAccount;
    protected Transfer(String date, int value, BankAccount bankAccount, BankAccount recivingBankAccount) {
        super(date, value, bankAccount);
        this.recivingBankAccount = recivingBankAccount;
    }
}
