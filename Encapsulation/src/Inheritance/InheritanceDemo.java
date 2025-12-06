package Inheritance;

public class InheritanceDemo {
    public static void main(String[] args) {
        Car myCar = new Car(" Lamborghini", "Urus");
        myCar.displaybrand();
        myCar.hunk();
        myCar.drive();

        ElectricCar myEle = new ElectricCar(" Hummer", " H2", true);
        myEle.displaybrand();
        myEle.hunk();
        myEle.charGing();
    }
}
