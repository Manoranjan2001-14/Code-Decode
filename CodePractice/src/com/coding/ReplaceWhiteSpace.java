package com.coding;

public class ReplaceWhiteSpace {
    public static void main(String[] args) {
        String str = " Manoranjan Behera ";
        str=str.replaceAll("\\s","");
        System.out.println(str);
    }
}
