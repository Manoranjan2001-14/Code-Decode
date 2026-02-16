package com.coding;

public class ReplaceJunk {
    public static void main(String[] args) {
        String s = "@#$%^*+-++*! hfytguhjjbyfy 09763222677";
        s=s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(s);
    }
}
