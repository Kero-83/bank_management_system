public class SavingAccount extends BankAccount {
    private final double interestRate = 1.1;
    public SavingAccount(int account_number, double balance, String state_of_the_account) {
        super(account_number, balance, state_of_the_account);
    }
    @Override
    public void checker() {
        balance *= interestRate;
    }
  
}
