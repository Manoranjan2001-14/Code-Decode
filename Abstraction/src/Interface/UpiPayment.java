package Interface;

public class UpiPayment implements Payment{
    @Override
    public void pay(double amount){
        System.out.println("Pay:"+amount+" using UPI");
    }
}
