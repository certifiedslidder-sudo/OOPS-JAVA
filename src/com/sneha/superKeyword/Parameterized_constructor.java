package com.sneha.superKeyword;
class Person{
    Person(String name){
        System.out.println("Name: "+ name);
    }
}
class New extends Person{
    New(String name){
        super(name);
        System.out.println("New constructor");
    }
}
public class Parameterized_constructor {
    static void main(String[] args) {
        New n = new New("SNEHA");
    }
}
