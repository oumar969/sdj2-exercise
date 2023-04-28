public class CounterWithAllSafeguards implements Counter {

    private long value, min, max;

    public CounterWithAllSafeguards(long min, long max) {
        this.min = min;
        this.max = max;
    }


    public synchronized void increment() {

        while (value >= max) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        value++;
        notifyAll();
    }

    public synchronized void decrement() {
        while (value <= min) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        value--;
        notifyAll();
    }

    public long getValue() {
        return value;
    }


}
