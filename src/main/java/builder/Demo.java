package builder;

import builders.CarBuilder;
import builders.CarManualBuilder;
import cars.Car;
import cars.Manual;
import director.Director;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        director.constructSportCar(carBuilder);

        Car result = carBuilder.getResult();
        System.out.println(result.getSeats());

        CarManualBuilder carManualBuilder2 = new CarManualBuilder();
        director.constructSportCar(carManualBuilder2);
        Manual result1 = carManualBuilder2.getResult();
        System.out.println(result1.print());
        System.out.println();
        CarManualBuilder carManualBuilder = new CarManualBuilder();
        director.constructCityCar(carManualBuilder);
        Manual result2 = carManualBuilder.getResult();
        System.out.println(result2.print());
    }
}
