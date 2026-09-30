package com.sneha.Abstraction;


// ABSTRACT CLASS WITH PARAMETERIZED CONSTRUCTOR

abstract class Person{
    String name;
    Person(String name){
        this.name = name;
        System.out.println("Person constructor called");
    }

    abstract void display();
}
class Student extends Person{
    Student(String name){
        super(name);
    }

    void display(){
        System.out.println("Student name is: "+name);
    }
}
public class Test4 {
    static void main(String[] args) {
        Student s1 = new Student("Sam");
        s1.display();
    }
}
