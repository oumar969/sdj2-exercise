public class ReaderWriterExample {
    private int value = 0;
    private int readers = 0;

    public synchronized void write(int value) {
        this.value = value;
    }

    public synchronized int read() {
        readers++;
        int result = value;
        readers--;
        return result;
    }
}