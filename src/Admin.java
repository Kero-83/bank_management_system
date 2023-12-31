public class Admin {
    public void AuthorizeTheNewEmployees(Employee e) {
        Lists.employees.add(e);
        Lists.waitingEmp.remove(e);
    }

    public void NotAuthorizeTheNewEmployees(Employee e) {
        Lists.waitingEmp.remove(e);
    }

    public void DisplayAllNotAuthorizeEmployees() {
        int i = 0;
        for (Employee employee : Lists.waitingEmp) {
            System.out.print(++i);
            System.out.println(" " + employee.toString());
        }

    }

    public void DisplayAllClients() {
        int i = 0;
        for (Client client : Lists.clients) {
            System.out.print(String.valueOf(++i) + "- ");
            System.out.println(client.stringForFileS());
        }
    }

    public void DisplayOneClient(int x) {
        System.out.println(Lists.clients.get(x));
    }

    public void DeleteClient(Client c) {
        Lists.clients.remove(c);
    }

    public void DisplayAllEmployees() {
        for (Employee employee : Lists.employees) {
            System.out.println(employee.toString());
        }
    }

    public void ShowAllTransactions() {
        for (Transaction transaction : Lists.transactions) {
            System.out.println(transaction.toString());
        }
    }
}