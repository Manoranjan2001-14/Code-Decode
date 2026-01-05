package Encapsulation;

public class TestEncapsulation {
    public static void main(String[] args) {
        Payment p = new UpiPayment();
        p.pay(500);
    }
}
