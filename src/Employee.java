import java.util.Scanner;
import java.util.List ;

public class Employee extends User{
    public void CreateClientAccount()
    {
        Lists.clients.add(new Client());
    }
    public void EditClientAccount(Client client)
    {

    }
    public void DeleteClientAccount(int ID)
    {
       Lists.clients.remove(ID-1) ;
    }
    public Client SearchForClientAccount(int ID)
    {
      return   Lists.clients.get(ID-1);

    }

    }

