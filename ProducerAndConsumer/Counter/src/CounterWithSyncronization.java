public class CounterWithSyncronization implements Counter {

    /*
    Still provides no safety
    Can and will go below min and above max
    Operations may be "wasted" ie. incrementing when already at max or decrementing when already at min
     */

    private long value, min, max;

    public CounterWithSyncronization(long min, long max) {
        this.min = min;
        this.max = max;
    }

    public synchronized void increment() {
        value++;
        if (value > max)
            System.out.println("over max");
    }

    public synchronized void decrement() {
        value--;
        if (value < min)
            System.out.println("below min");
    }

    public long getValue() {
        return value;
    }

}
