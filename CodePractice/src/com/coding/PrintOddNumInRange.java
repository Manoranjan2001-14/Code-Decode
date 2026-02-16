package com.coding;

import java.util.Scanner;

public class PrintOddNumInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            if(i%2 != 0){
                System.out.println(i);
            }
        }
    }
}
