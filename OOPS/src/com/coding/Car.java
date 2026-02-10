package com.coding;

public class Car {
    int seats;
    String type;
    String name;
    double length;
    double price;
    void print(){
        System.out.println(seats+" "+type+" "+name+" "+length+"m "+price);
    }
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.seats = 7;
        c1.type = "SUV";
        c1.name = "XUV 700";
        c1.length = 5.9;
        c1.price = 2500000;
        c1.print();
    }
}
