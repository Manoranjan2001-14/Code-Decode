package com.lambda;

public class Main {
    public static void main(String[] args) {
        System.out.println("My System start....");

        MyInter i = () -> System.out.println("Hello this is First lambda expression");
        i.sayHello();

        MyInter i2 = () -> System.out.println("Hello this is second lambda expression");
        i2.sayHello();

        SumInterface sum = (a, b) -> a + b;
        System.out.println(sum.add(4, 7));
    }
}
