package com.constructer;

public class Car {
    String name;
    int seats;
    double length;
    String fuelType;
    Car(String name, int seats, double length, String fuelType){
        this.name = name;
        this.seats = seats;
        this.length = length;
        this.fuelType = fuelType;
    }
    void display(){
        System.out.println(name+" "+seats+".Siter "+length+"m "+fuelType);
    }
    public static void main(String[] args) {
        Car c1 = new Car("Huracan", 2, 3.00, "Petrol");
        c1.display();
    }
}
