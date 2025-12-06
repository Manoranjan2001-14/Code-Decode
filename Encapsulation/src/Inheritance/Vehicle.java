package Inheritance;

public class Vehicle {
    String brand;
    public Vehicle(String brand){
        this.brand = brand;
    }
    public void hunk(){
        System.out.println("Vehicle sound");
    }
    public void displaybrand(){
        System.out.println("Brand"+brand);
    }
}
