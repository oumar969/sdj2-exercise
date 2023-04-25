import java.rmi.RemoteException;

public class CalculatorImpl implements Calculator {
    @Override
    public int add(int a, int b) throws RemoteException {
        return a + b;
    }
}
