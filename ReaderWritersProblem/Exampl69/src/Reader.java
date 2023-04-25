public class Reader implements Runnable {
    private Database database;

    public Reader(Database database) {
        this.database = database;
    }

    public void run() {
        while (true) {
            try {
                // Read data from the database
                database.read();

                // Sleep for a short time to simulate work
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}