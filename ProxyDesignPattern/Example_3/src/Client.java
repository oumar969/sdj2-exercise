public class Client {
    public static void main(String[] args) {
        TourGuide tourGuide = new TourGuideProxy("Copenhagen");
        // The real tour guide is not created yet
        tourGuide.showCity("Tivoli Gardens");
        // The real tour guide is now created
        tourGuide.showCity("The Little Mermaid statue");
    }
}