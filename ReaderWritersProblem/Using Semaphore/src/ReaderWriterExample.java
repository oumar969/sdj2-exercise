import java.util.concurrent.Semaphore;

public class ReaderWriterExample {
    private int value = 0;
    private Semaphore readSemaphore = new Semaphore(1);
    private Semaphore writeSemaphore = new Semaphore(1);

    //Semaphore har to hovedmetoder: acquire() og release().

    //Trådene kan så forsøge at tage en tilladelse fra Semaphore ved hjælp af acquire()-metoden,
    // og når de er færdige med at bruge ressourcen,
    // kan de frigive tilladelsen ved hjælp af release()-metoden.

    public void write(int value) throws InterruptedException {
        writeSemaphore.acquire();
        try {
            this.value = value;
        } finally {
            writeSemaphore.release();
        }
    }

    public int read() throws InterruptedException {
        readSemaphore.acquire();
        try {
            return value;
        } finally {
            readSemaphore.release();
        }
    }
}