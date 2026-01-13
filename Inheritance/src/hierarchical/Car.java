package hierarchical;

public class Car extends Vehicle{
    int door;

    void setDoor(int door){
        this.door = door;
    }
    void showCarDetails(){
        showSpeed();
        System.out.println("Doors:"+door);
    }
}
