package hierarchical;

public class Bike extends Vehicle{
    boolean hasCarrier;

    void setHasCarrier(boolean hasCarrier){
        this.hasCarrier = hasCarrier;
    }

    void showBikeDetails(){
        showSpeed();
        System.out.println("Has Carrier:"+hasCarrier);
    }
}
