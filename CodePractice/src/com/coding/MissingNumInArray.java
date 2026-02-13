package com.coding;

public class MissingNumInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int sum1 = 0;

        for (int i = 0; i < arr.length; i++) {
            sum1 += arr[i];
        }
        System.out.println("Sum of Array:"+sum1);

        int sum2 = 0;
        for (int i = 0; i <= 5; i++) {
            sum2 += i;
        }
        System.out.println("Sum of Range:"+sum2);
        System.out.println("Missing Num in Array:"+(sum2 - sum1));
    }
}
