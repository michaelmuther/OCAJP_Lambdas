package com.OCAJP.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class CarMall {
    List<Car> cars = new ArrayList<>();

    CarMall() {
        cars.add(new Car("Honda", 2012, 9000.0, "HATCH"));
        cars.add(new Car("Honda", 2018, 17000.0, "SEDAN"));
        cars.add(new Car("Toyota", 2014, 19000.0, "SUV"));
        cars.add(new Car("Ford", 2014, 13000.0, "SPORTS"));
        cars.add(new Car("Nissan", 2017, 8000.0, "SUV"));
    }

    // showCars update to use the Predicate interface:
    public List<Car> showCars(Predicate<Car> cp) {
        ArrayList<Car> carsToShow = new ArrayList<>();
        for (Car c : cars) {
            if (cp.test(c)) { // showCar method declared in the CarFilter interface
                carsToShow.add(c);
            }
        }
        return carsToShow;
    }
}

// First version of showCars using CarFilter interface:
//    public List<Car> showCars(CarFilter cf) { // passing the CarFilter interface to the showCars method.  CarFilter contains showCar method
//        // CarFilter is the target type of the lambda expression
//        // A lambda expression can be written only where the target type is
//        // an interface with exactly one abstract method.
//        // This is called a functional interface
//        // There are several functional interfaces in the java.util.function package.
//        ArrayList<Car> carsToShow = new ArrayList<>();
//        for (Car c : cars) {
//            if (cf.showCar(c)) { // showCar method declared in the CarFilter interface
//                carsToShow.add(c);
//            }
//        }
//        return carsToShow;
//    }