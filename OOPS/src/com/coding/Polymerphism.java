package com.coding;
//one method behave differently in different situation
class Dog{
    void speak(){
        System.out.println("Bhau Bhau");
    }
}
class Cat{
    void speak(){
        System.out.println("Meow Meow");
    }
}
class Lion{
    void speak(){
        System.out.println("Ghrrrrr");
    }
}
public class Polymerphism {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        Lion l = new Lion();
        d.speak();
        c.speak();
        l.speak();
    }
}
