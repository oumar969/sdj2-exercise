public class Main {
    public static void main(String[] args) throws InterruptedException {
        ReaderWriterExample readerWriterExample= new ReaderWriterExample();
        readerWriterExample.read();
        readerWriterExample.write(27);
        System.out.println(readerWriterExample.read());
        System.out.println("Hi");
    }
}
