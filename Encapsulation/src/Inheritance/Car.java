package Inheritance;

public class Car extends Vehicle{//child class inherit from parent class
    String model;
    public Car(String brand, String model){
        super(brand);//call parent class constructor.
        this.model = model;
    }
    @Override //override parent class method
    public void hunk(){
        System.out.println("Car horn!!");
    }
    public void drive(){
        System.out.println(brand+" "+model+" is driving.");
    }
}
