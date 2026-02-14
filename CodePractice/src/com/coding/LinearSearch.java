package com.coding;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10, 12, 50, 34, 56, 67, 23, 45};
        int target = 34;
        int ans = search(arr, target);
        System.out.println(ans);
    }
    static int search(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];

            if (element == target){
                return index;
            }
        }
        return -1;
    }
}
