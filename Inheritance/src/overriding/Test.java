package overriding;

public class Test {
    public static void main(String[] args) {
        Payment payment = new CardPayment();
        payment.pay();
    }
}
