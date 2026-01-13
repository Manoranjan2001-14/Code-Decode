package Interface;

public class Test {
    public static void main(String[] args) {
        Payment pm;
        pm = new UPIPayment();
        pm.pay();
        pm = new CardPayment();
        pm.pay();
    }
}
