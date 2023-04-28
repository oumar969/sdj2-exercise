public class Incrementer implements Runnable{

    private Counter counter;
    private int updates;

    public Incrementer(Counter counter, int updates) {
        this.counter = counter;
        this.updates = updates;
    }


    @Override
    public void run() {
        for (int i = 0; i < updates; i++) {
            counter.increment();
        }
    }
}
