package Overriding;

public class Test {
    public static void main(String[] args) {
        Payment p = new CardPayment();
        p.pay();
    }
}
