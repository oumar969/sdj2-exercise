public class Test {
    public static void main(String[] args) {

        CounterWithNoSafeguards counter = new CounterWithNoSafeguards(0, 10000000);
        //CounterWithNoSafeguards counter = new CounterWithNoSafeguards(0, 10000000);
        //CounterWithBoundaryChecking counter = new CounterWithBoundaryChecking(0, 10000000);
        //CounterWithBoundaryCheckingAndSyncronization counter = new CounterWithBoundaryCheckingAndSyncronization(0, 10000000);
        //CounterWithSyncronization counter = new CounterWithSyncronization(0, 10000000);
        //CounterWithBoundaryCheckingAndSyncronizationAndConditionalChecking counter = new CounterWithBoundaryCheckingAndSyncronizationAndConditionalChecking(0, 10000000);

        Thread incrementerThread = new Thread(new Incrementer(counter, 10000000));
        Thread incrementerThread2 = new Thread(new Incrementer(counter, 10000000));
        Thread decrementerThread = new Thread(new Decrementer(counter, 10000000));
        Thread decrementerThread2 = new Thread(new Decrementer(counter, 10000000));
        incrementerThread.start();
        incrementerThread2.start();
        decrementerThread.start();
        decrementerThread2.start();
        try { //wait for all thread to finish
            incrementerThread.join();
            incrementerThread2.join();
            decrementerThread.join();
            decrementerThread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Counter value: " + counter.getValue());
    }
}
