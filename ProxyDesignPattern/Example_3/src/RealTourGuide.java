public class RealTourGuide implements TourGuide{
    private String cityName;

    public RealTourGuide(String cityName) {
        this.cityName = cityName;
        System.out.println("Creating a tour guide for " + cityName);
    }
    @Override
    public void showCity(String cityName) {
        System.out.println("Showing " + cityName);

    }
}
