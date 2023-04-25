public class TourGuideProxy implements TourGuide{
    private RealTourGuide realTourGuide;
    private String cityName;

    public TourGuideProxy(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public void showCity(String cityName) {
        if (realTourGuide == null) {
            realTourGuide = new RealTourGuide(this.cityName);
        }
        realTourGuide.showCity(cityName);
    }
}
