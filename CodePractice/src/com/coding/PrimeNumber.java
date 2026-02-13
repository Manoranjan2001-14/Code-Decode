package com.coding;
//it is a natural number which has only deviede into 1 and itself
public class PrimeNumber {
    public static void main(String[] args) {
        int num=13;
        int count=0;
        if (num > 0){
            for (int i = 1; i <= num; i++) {
                if(num%i == 0)
                    count++;
            }
            if (count==2){
                System.out.println("Prime number...");
            }else {
                System.out.println("Not a prime number...");
            }
        }else {
            System.out.println("prime number...");
        }
    }
}
