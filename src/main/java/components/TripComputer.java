package components;

import cars.Car;

public class TripComputer {
    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public void showFuelLevel() {
        System.out.println("Уровень топлива " + car.getFuel());
    }

    public void showStarter() {
        if (car.getEngine().isStarted()) {
            System.out.println("Машина заведена");
        } else {
            System.out.println("Машина не заведена");
        }
    }
}
