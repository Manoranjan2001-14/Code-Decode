package Overriding;

public class CardPayment extends Payment{
    @Override
    void pay(){
        System.out.println("Processing card payment");
    }
}
