public class CurrentAccount extends BankAccount{
    private final double fees = 50; 

    public CurrentAccount(int account_number, double balance, String state_of_the_account) {
        super(account_number, balance, state_of_the_account);
        type_of_the_account = "Current";
    }
    @Override
    public void checker() {
        if (balance > 3000) {
            balance -= fees;
        }
    }
}
