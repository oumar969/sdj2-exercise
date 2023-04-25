public class Writer implements Runnable {
    private Database database;

    public Writer(Database database) {
        this.database = database;
    }

    public void run() {
        while (true) {
            try {
                // Write data to the database
                database.write();

                // Sleep for a short time to simulate work
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}