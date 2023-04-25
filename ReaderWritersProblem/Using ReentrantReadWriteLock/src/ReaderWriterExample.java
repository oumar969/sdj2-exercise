import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReaderWriterExample {
    private int value = 0;
    private ReadWriteLock lock = new ReentrantReadWriteLock();
    // ReadWriteLock-grænsefladen definerer to typer låse som er Læselås og Skrivelås

    //Læselås og Skrivelås kan opnås fra samme ReadWriteLock-objekt.
    // Når en tråd tager en skrivelås, blokerer den alle læselåse og andre skrivelåse,
    // indtil den slipper sin lås. På samme måde blokerer en læselås andre skrivelåse,
    // men tillader samtidig, at andre læselåse tages.

    public void write(int value) {
        lock.writeLock().lock();
        try {
            this.value = value;
        } finally {
            lock.writeLock().unlock();
        }
    }

    public int read() {
        lock.readLock().lock();
        try {
            return value;
        } finally {
            lock.readLock().unlock();
        }
    }
}