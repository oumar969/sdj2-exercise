public class CounterWithBoundaryChecking implements Counter {

    /*
    Provides some safety
    Will not go below min or above max
    Can still "waste" operations ie. incrementing when already at max or decrementing when already at min
     */

    private long value, min, max;

    public CounterWithBoundaryChecking(long min, long max) {
        this.min = min;
        this.max = max;
    }

    public void increment() {
        if (value < max) {
            value++;
            if (value > max)
                System.out.println("over max");
        }
    }

    public void decrement() {
        if (value > min) {
            value--;
            if (value < min)
                System.out.println("below min");
        }
    }

    public long getValue() {
        return value;
    }

}
