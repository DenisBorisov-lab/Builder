package builders;

import cars.Manual;
import cars.Type;
import components.Engine;
import components.GPSNavigator;
import components.Transmission;
import components.TripComputer;

public class CarManualBuilder implements Builder{

    private Type type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator navigator;

    public Manual getResult() {
        return new Manual(type, seats, engine, transmission, tripComputer, navigator);
    }

    @Override
    public void setType(Type type) {

    }

    @Override
    public void setSeats(int seats) {

    }

    @Override
    public void setEngine(Engine engine) {

    }

    @Override
    public void setTransmission(Transmission transmission) {

    }

    @Override
    public void setGPSNavigator(GPSNavigator navigator) {

    }

    @Override
    public void setTripComputer(TripComputer computer) {

    }
}
