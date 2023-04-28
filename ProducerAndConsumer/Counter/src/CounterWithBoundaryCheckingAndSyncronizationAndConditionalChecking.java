public class CounterWithBoundaryCheckingAndSyncronizationAndConditionalChecking implements Counter {

    /*
    Provides guaranteed safety
    Will not go below min or above max
    Will not "waste" operations ie. incrementing when already at max or decrementing when already at min
     */

    private long value, min, max;

    public CounterWithBoundaryCheckingAndSyncronizationAndConditionalChecking(long min, long max) {
        this.min = min;
        this.max = max;
    }

    public synchronized void increment() {
        while (value >= max) { //notice the change from if to while. Ensures that the condition is checked again after the wait
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        value++;
        if (value > max)
            System.out.println("over max");
        notifyAll();
    }

    public synchronized void decrement() {
        while (value <= min) { //notice the change from if to while. Ensures that the condition is checked again after the wait
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        value--;
        if (value < min)
            System.out.println("below min");
        notifyAll();
    }

    public long getValue() {
        return value;
    }
}
