public class Client {
    public static void main(String[] args) {
        Image image = new ImageProxy("test_image.jpg");
        // The real image is not loaded yet
        image.display();
        // The real image is now loaded
        image.display();
    }
}


