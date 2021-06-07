package cars;

import components.Engine;
import components.GPSNavigator;
import components.Transmission;
import components.TripComputer;

public class Manual {
    private final Type type; //+
    private final int seats; //+
    private final Engine engine;//+
    private final GPSNavigator gpsNavigator;
    private final TripComputer tripComputer;
    private final Transmission transmission;//+

    public Manual(Type type,  int seats, Engine engine,Transmission transmission , TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.type = type;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }
    public String print(){
        String manual = "type:" + type + "\n" + "seats: " + seats + "\n" + "engine volume: " + engine.getVolume() + "\n" + "engine mileage: " + engine.getMileage() + "\n" + "transmission: " + transmission;
        if (gpsNavigator != null){
            manual += "\n" + "GPSNavigator: " + gpsNavigator.getRoad();
        }
        if (this.tripComputer != null){
            manual += "\n" + "trip computer: " + true;
        }
        return manual;
    }
}
