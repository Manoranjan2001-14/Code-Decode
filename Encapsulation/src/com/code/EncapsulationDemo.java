package com.code;

public class EncapsulationDemo {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("787389264212", 1000.0);
        myAccount.getAccountNumber();
        myAccount.getBalance();

        myAccount.withdrawl(500);
    }
}
