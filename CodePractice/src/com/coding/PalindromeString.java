package com.coding;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        String org = str;
        String rev = "";
        int len = str.length();
        for (int i = len-1; i >= 0 ; i--) {
            rev=rev+str.charAt(i);
        }
        if(org.equals(rev)){
            System.out.println(rev+" is a Palindrome String..");
        }else {
            System.out.println(rev+" Not a palindrome String..");
        }
    }
}
