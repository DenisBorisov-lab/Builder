package director;

import builders.Builder;
import cars.Type;
import components.Engine;
import components.GPSNavigator;
import components.Transmission;
import components.TripComputer;

public class Director {

    public void constructSportCar(Builder builder) {
        builder.setType(Type.SPORTCAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setGPSNavigator(new GPSNavigator());
        builder.setTripComputer(new TripComputer());
    }

    public void constructCityCar(Builder builder) {
        builder.setType(Type.CITYCAR);
        builder.setSeats(4);
        builder.setEngine(new Engine(1.2, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setGPSNavigator(new GPSNavigator());
        builder.setTripComputer(null);
    }
}
