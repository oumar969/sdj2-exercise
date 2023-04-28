public class Decrementer implements Runnable{

    private Counter counter;
    private int updates;

    public Decrementer(Counter counter, int updates) {
        this.counter = counter;
        this.updates = updates;
    }


    @Override
    public void run() {
        for (int i = 0; i < updates; i++) {
            counter.decrement();
        }
    }
}
