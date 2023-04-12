import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server implements Hello
{
	public Server() {}


	@Override public String sayHello() throws RemoteException
	{
		return "Hello, world!";
	}

	public static void main(String args[]) {

		try {
			//Serverens hovedmetode skal oprette det eksterne objekt, der leverer tjenesten.
			// Derudover skal fjernobjektet eksporteres til Java RMI-runtime, så det kan modtage indgående fjernopkald.
			// Dette kan gøres på følgende måde:

			Server obj = new Server();
			Hello stub = (Hello) UnicastRemoteObject.exportObject(obj, 1099);

			// Bind the remote object's stub in the registry
			//Registrer fjernobjektet med et Java RMI-register, så det kan findes af klienter.
			Registry registry = LocateRegistry.getRegistry();
			registry.bind("Hello", stub);

			System.err.println("Server ready");
		} catch (Exception e) {
			System.err.println("Server exception: " + e.toString());
			e.printStackTrace();
		}
	}
}
