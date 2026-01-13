package hierarchical;

public class Test {
    public static void main(String[] args) {
        Car car = new Car();
        car.setSpeed(120);
        car.setDoor(4);
        car.showCarDetails();

        System.out.println("----------------");

        Bike bike = new Bike();
        bike.setSpeed(80);
        bike.setHasCarrier(true);
        bike.showBikeDetails();
    }
}
