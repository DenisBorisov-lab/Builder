package components;

public class GPSNavigator {
    private String road ;

    public GPSNavigator(){
        this.road = "Москва-Самара";
    }

    public GPSNavigator(String manualRoute) {
        this.road = manualRoute;
    }

    public String getRoad() {
        return road;
    }
}
