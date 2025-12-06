package Inheritance;

public class ElectricCar extends Car{//multilevel inheritance
    boolean autonomous;
    public ElectricCar(String brand, String model, boolean autonomous){
        super(brand, model);
        this.autonomous = autonomous;
    }
    @Override
    public void hunk(){
        System.out.println("silent electric car hum!");
    }
    public void charGing(){
        System.out.println(brand+" "+model+" is charging");
    }
}
