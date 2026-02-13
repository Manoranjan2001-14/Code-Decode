package com.coding;

public class PrintEvenOddNum_Array {
    public static void main(String[] args) {
        int[] arr = {10, 20, 23, 34, 15, 46, 67, 12, 11};

        for (int value:arr){
            if(value%2 == 0){
                System.out.println("Even number:"+value);
            }else {
                System.out.println("Odd number:"+value);
            }
        }
    }
}
