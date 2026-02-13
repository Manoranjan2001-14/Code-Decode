package com.coding;

public class CheckArrayEquality {
    public static boolean isEqual(int[] a, int[] b){
        if(a.length != b.length){
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
            int[] arr1 = {1, 2, 3, 4, 5};
            int[] arr2 = {1, 2, 3, 4, 5};

        System.out.println(isEqual(arr1, arr2));
    }
}
