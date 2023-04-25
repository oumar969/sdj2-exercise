public class Database {
    private int data = 0;
    private int readCount = 0;

    public synchronized void read() {
        // Acquire the read lock
        synchronized(this) {
            readCount++;
            if (readCount == 1) {
                // Acquire the write lock if this is the first reader
                synchronized(this) {
                    // Read data from the database
                    System.out.println("Reading data: " + data);
                }
            }
        }

        // Release the read lock
        synchronized(this) {
            readCount--;
            if (readCount == 0) {
                // Release the write lock if this is the last reader
                synchronized(this) {}
            }
        }
    }

    public synchronized void write() {
        // Acquire the write lock
        synchronized(this) {
            // Write data to the database
            data++;
            System.out.println("Writing data: " + data);
        }
    }
}