package com.OCAJP.lambdas;

public class Car {
    private final String company;
    private final int year;
    private final double price;
    private final String type;

    public Car(String c, int y, double p, String t) {
        this.company = c;
        this.year = y;
        this.price = p;
        this.type = t;
    }

    public String toString() {
        return "(" + company + " " + year + ")";
    }

    public String getCompany() {
        return company;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }
}
