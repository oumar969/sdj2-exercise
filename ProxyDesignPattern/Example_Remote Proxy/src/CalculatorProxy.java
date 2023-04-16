import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CalculatorProxy implements Calculator {
    private String hostname;
    private int port;
    private Calculator calculator;

    public CalculatorProxy(String hostname, int port) {
        this.hostname = hostname;
        this.port = port;
    }

    private void connect() throws RemoteException {
        try {
            Registry registry = LocateRegistry.getRegistry(hostname, port);
            calculator = (Calculator) registry.lookup("CalculatorService");
        } catch (Exception e) {
            throw new RemoteException("Failed to connect to remote calculator", e);
        }
    }


    @Override
    public int add(int a, int b) throws RemoteException {
        if (calculator == null) {
            connect();
        }
        return calculator.add(a, b);
    }
}
