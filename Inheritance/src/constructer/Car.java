package constructer;

public class Car extends Vehicle{
    int speed = 120;
    Car(){
        //super();//call parent class constructor
        System.out.println("Car constructor");
    }
    void showDetails(){
        System.out.println(super.speed);//call parent class variable
        System.out.println(speed);
    }
}
