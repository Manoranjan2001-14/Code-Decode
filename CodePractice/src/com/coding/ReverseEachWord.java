package com.coding;

public class ReverseEachWord {
    public static void main(String[] args) {
        String str = "weicome to java developer pitstop";
        String[] words=str.split(" ");
        String reverseString="";
        for (String w:words){
            String reverseWord="";
            for (int i=w.length()-1; i>=0; i--){
                reverseWord=reverseWord+w.charAt(i);
            }
            reverseString=reverseString+reverseWord+" ";
        }
        System.out.println(reverseString);
    }
}
