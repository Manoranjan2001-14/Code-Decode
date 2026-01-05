package Encapsulation;

public class TestEncapsulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
                account.setAccountNumber("ACC123");
                account.deposite(5000);
        System.out.println(account.getAccountNumber());
        System.out.println(account.getBalance());

    }
}
