package com.coding;

public class MaxMinElementInArray {
    public static void main(String[] args) {
        int[] arr = {23, 45, 56, 65, 76, 100, 230, 96};
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Maximum element:"+max);

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Maximum element:"+min);
    }
}
