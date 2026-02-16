package com.coding;

public class CountCharOccurance {
    public static void main(String[] args) {
        String str = "Manoranjan Java Developer";
        int total_Count = str.length();
        int after_remove = str.replace("a","").length();
        int count = total_Count-after_remove;
        System.out.println("Character occurance:"+count);
    }
}
