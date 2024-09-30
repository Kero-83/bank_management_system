# bank_management_system (OOP Project)

## Classes

### Bank

- Log in As Admin(Scanner scanner, Admin admin): method to - Log in as Admin
- Log in as Employee(Scanner scanner, Admin admin): method to Log in as Employee
- Log in as Client(): method to Log in as Client

### Admin

- AuthorizeTheNewEmployees(Employee e): method to authorize new Employees
- NotAuthorizeTheNewEmployees(Employee e): method to not authorize new Employees
- DisplayAllNotAuthorizeEmployees(): method to display the Not Authorized Employees
- DisplayAllClients(): method to display all Clients data
- DisplayOneClient(int x):  method to display one client with index
- DeleteClient(Client c): method to delete client
- DisplayAllEmployees(): method to display All Employees Data
- ShowAllTransactions(): method to display All Transaction Data

### Bank Account

- checker(): abstract method

#### Current Account

- checker(): method to check if balance > 3000 or not

#### Saving Account

- checker(): method to add interest rate in balance

### Transaction

class to modeling data of Transaction.

- childs: Transfer, Deposit and Withdraw

### User

shared properties of Employee and Client.

- stringForFileS(): method to print String in format to be taken as input for file

### Employee

- CreateClientAccount(Client client): method to Create new Client
- EditClientAccount(Scanner scanner, Client client): method to Edit Client Account
- DeleteClientAccount(Client client): method to Delete Client Account
- SearchForClientAccount(String userame): method to Search for Client Account By Username

### Client

- setAccountState(): Setter for State of the account attribute
- getAccountState(): Getter for State of the account attribute
- Display_details_of_his_account(): method to Display The Details of The Client Account
- Transfer_money_to_another_clients_account(Client recipient, double amount, String date): method to Transfer money form Client's Account Balance to Another's Account Balance
- deposit(double amount, String date, BankAccount bankAccount): method to Take a Deposit
- withdraw(double amount, String date, BankAccount bankAccount): method to Take a Withdraw
- showTransactionHistory(): method to Show Transaction History
