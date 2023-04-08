import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMIInterface extends Remote
{
	public String echo(Object obj) throws RemoteException;

}
