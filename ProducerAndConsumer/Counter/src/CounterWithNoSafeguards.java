public class CounterWithNoSafeguards implements Counter {

    /*
    Provides no safety
    Can and will go below min and above max
    Operations may be "wasted" ie. incrementing when already at max or decrementing when already at min
     */

    private long value, min, max;

    public CounterWithNoSafeguards(long min, long max) {
        this.min = min;
        this.max = max;
    }

    public void increment() {
        value++;
        if(value > max)
            System.out.println("over max");
    }

    public void decrement() {
        value--;
        if(value < min)
            System.out.println("below min");
    }

    public long getValue() {
        return value;
    }

}
