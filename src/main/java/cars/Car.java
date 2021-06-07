package cars;

import components.Engine;
import components.GPSNavigator;
import components.Transmission;
import components.TripComputer;

public class Car {
    private final Type type;
    private final double fuel = 0.0;
    private final int seats;
    private final Engine engine;
    private final GPSNavigator gpsNavigator;
    private final TripComputer tripComputer;
    private final Transmission transmission;

    public Type getType() {
        return type;
    }

    public double getFuel() {
        return fuel;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public GPSNavigator getGpsNavigator() {
        return gpsNavigator;
    }

    public TripComputer getTripComputer() {
        return tripComputer;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public Car(Type type,  int seats, Engine engine,Transmission transmission , TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.type = type;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }
}
