package com.OCAJP.lambdas;

import java.util.List;

public class TestClass {

    public static void main(String[] args) {
        CarMall cm = new CarMall();
        List<Car> carsByCompany = cm.showCars(c -> c.getCompany().equals("Honda"));
        // the compiler knows that it must pass an object of a class that implements CarFilter to the
        // showCars(CarFilter cf) method. It knows that this class must implement the boolean showCar(Car c)
        // method because that is the only abstract method declared in the CarFilter interface.
        // The only thing the compiler cannot generate on its own is the boolean expression that goes inside the
        // showCar method.
        List<Car> carsByType = cm.showCars(c -> c.getType().equals("SUV"));
        List<Car> carsByPrice = cm.showCars(c -> c.getPrice() < (10000));
        List<Car> carsByMM = cm.showCars(c -> c.getPrice() < (10000) && c.getType().equals("SUV"));


//        CarFilter cf = new CompanyFilter("Honda");
//        CarFilter tf = new TypeFilter("SUV");
//        List<Car> carsByCompany = cm.showCars(cf); // this is functional programming here.  Collections + streams.
//        // The original data (cm.cars) is not changed and there are no side effects.
//        List<Car> carsByType = cm.showCars(tf);
        System.out.println(carsByCompany);
        System.out.println(carsByType);
        System.out.println(carsByMM);
    }
}
