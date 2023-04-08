import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject implements RMIInterface
{
	public Server() throws RemoteException
	{
		super();
	}



	public String echo(Object obj) throws RemoteException
	{
		return obj.toString();
	}

	public static void main(String[] args) {
		try {
			System.out.println("[+] Trying to bind...");
			//Below IP:PORT can be changed
			Naming.rebind("rmi://192.168.1.212/RMIInterface", new Server());
			System.out.println("[+] Server started. ");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


