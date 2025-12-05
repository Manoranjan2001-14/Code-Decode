package com.code;

public class BankAccount {
    private String accountNumber;//Encapsulated data.
    private double balance;//Encapsulated data.

    public BankAccount(String accountNumber, double initialBalance){
        this.accountNumber = accountNumber;

        if(initialBalance >= 0){//validation in constructer
            this.balance = initialBalance;
        }
        else {
            this.balance = 0;
        }
    }
    //public getter for account number(read-only)
    public String getAccountNumber(){
        return accountNumber;
    }
    //public getter for balance
    public double getBalance(){
        return balance;
    }

    //public setter for deposit with validation
    public void deposit(double amount){
        if(amount > 0){
            this.balance = balance;
            System.out.println("Deposit:"+amount+".New Balance"+this.balance);
        }else {
            System.out.println("Deposit amount should be positive");
        }
    }

    //public setter for withdrawl with validation
    public void withdrawl(double amount){
        if(amount > 0 && this.balance >= amount){
            this.balance -= amount;
            System.out.println("Withdrawl:"+amount+".New Balance"+amount);
        }else {
            System.out.println("Invalid withdrawl amount or insufficient balance");
        }
    }

}
