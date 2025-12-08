package com.constructer;

public class ConstructerDemo {
    public static void main(String[] args) {
        Dog dog1 = new Dog();//call no argument constructer
        dog1.bark();

        Dog dog2 = new Dog("Max", 5);
        dog2.bark();

        Dog dog3 = new Dog("Lucy");
        dog3.bark();
    }
}
