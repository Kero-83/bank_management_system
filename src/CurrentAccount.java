public class CurrentAccount extends BankAccount{


    public CurrentAccount(int account_number, double balance, String state_of_the_account) {
        super(account_number, balance, state_of_the_account);
        type_of_the_account = "Current";
    }

    @Override
public String toString() {
    return super.toString();
}
}
