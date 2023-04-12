import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Hello extends Remote //Remote interface, som starter jeg med at lave
{
	//Define the remote interface
	String sayHello() throws RemoteException;
}

//RMI starter med:
//1. At lave en remote interface, som skal implementeres af serveren
//2. Implement serveren, som skal implementere remote interface.dvs at serveren skal have en metode, som hedder sayHello(), som returnerer en String.
//3. Implement klienten.
