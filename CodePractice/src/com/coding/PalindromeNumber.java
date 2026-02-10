package com.coding;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        int org = num;
        int rev = 0;
        while (num != 0){
            rev=rev*10 + num%10;
            num=num/10;
        }
        if(rev == org){
            System.out.println(rev+" Palindrome number..");
        }else {
            System.out.println(rev+" Not a palindrome number..");
        }
    }
}
