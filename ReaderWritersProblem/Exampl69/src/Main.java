public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Create a shared database object
        Database database = new Database();

        // Create two reader threads and one writer thread
        Reader reader1 = new Reader(database);
        Reader reader2 = new Reader(database);
        Writer writer = new Writer(database);

        // Start the threads
        Thread t1 = new Thread(reader1);
        Thread t2 = new Thread(reader2);
        Thread t3 = new Thread(writer);
        t1.start();
        t2.start();
        t3.start();

        // Sleep for 10 seconds
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Stop the reader threads
        t1.interrupt();
        t2.interrupt();
    }

}