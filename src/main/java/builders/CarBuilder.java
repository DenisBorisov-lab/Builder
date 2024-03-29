package builders;

import cars.Car;
import cars.Type;
import components.Engine;
import components.GPSNavigator;
import components.Transmission;
import components.TripComputer;

public class CarBuilder implements Builder{
    private Type type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator navigator;


    public Car getResult() {
        return new Car(type, seats, engine, transmission, tripComputer, navigator);
    }
    @Override
    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setGPSNavigator(GPSNavigator navigator) {
        this.navigator = navigator;
    }

    @Override
    public void setTripComputer(TripComputer computer) {
        this.tripComputer = computer;
    }
}
