package com.coding;
//sequence of number each number sum of
public class FibonacciSeries {
    public static void main(String[] args) {
        int n1=0;
        int n2=1;
        int sum=0;
        System.out.print(n1+" "+n2);//0, 1
        for (int i = 2; i < 10; i++) {//2, 3, 4, 5, 6, 7, 8, 9, 10
            sum= n1+n2;//0+1=1 1+1=2 1+2=3 2+3=5 3+5=8 8+5=13 8+13=21 13+21=31
            System.out.print(" "+sum);//1, 2, 3, 5, 8, 13, 21, 34
            n1=n2;//1, 1, 2, 3, 5, 8, 13, 21
            n2=sum;//1, 2, 3, 5, 8, 13, 21, 31
        }
    }
}
