package com.coding;
 class Student{
    String name;
    int age;
    int roll;
    double cgpa;
}
public class UserDefinedDataTypes {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Manoranjan";
        s1.age = 24;
        s1.roll = 20;
        s1.cgpa = 7.8;
        System.out.println(s1.name);
    }
}
