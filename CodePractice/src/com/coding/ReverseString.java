package com.coding;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string:");
        String str = sc.nextLine();
        String rev = "";
//        int len = str.length();
//        for(int i=len-1; i>=0; i--){
//            rev=rev+str.charAt(i);
//        }
//        System.out.println("After reverse:"+rev);

        char[] c = str.toCharArray();
        int len = c.length;
        for (int i = len-1; i >= 0 ; i--) {
            rev=rev+c[i];
        }
        System.out.println("After reverse:"+rev);
    }
}
