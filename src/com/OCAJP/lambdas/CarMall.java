package com.OCAJP.lambdas;

import java.util.ArrayList;
import java.util.List;

class CarMall {
    List<Car> cars = new ArrayList<>();

    CarMall() {
        cars.add(new Car("Honda", 2012, 9000.0, "HATCH"));
        cars.add(new Car("Honda", 2018, 17000.0, "SEDAN"));
        cars.add(new Car("Toyota", 2014, 19000.0, "SUV"));
        cars.add(new Car("Ford", 2014, 13000.0, "SPORTS"));
        cars.add(new Car("Nissan", 2017, 8000.0, "SUV"));
    }

    public List<Car> showCars(CarFilter cf) {
        ArrayList<Car> carsToShow = new ArrayList<>();
        for (Car c : cars) {
            if (cf.showCar(c)) carsToShow.add(c); // showCar method declared in the CarFilter interface
        }
        return carsToShow;
    }
}
