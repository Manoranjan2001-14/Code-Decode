package com.constructer;

public class Dog {
    String name;
    int age;

    public Dog(){
        this("Buddy",3);//calls the parametersized constructer.
        System.out.println("Dog object created with default value");
    }

    //parameterized constructer
    public Dog(String name, int age){
        this.name = name;
        this.age = age;

        System.out.println("Dog object created:"+name+","+age+"Years old");
    }

    //another overloaded constructer
    public Dog(String name){
        this(name, 0);//call parametersized with default age
        System.out.println("Dog object is created with name only");
    }

    public void bark(){
        System.out.println(name+"says Woof!.");
    }
}
