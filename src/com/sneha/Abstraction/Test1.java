package com.sneha.Abstraction;

abstract class Parent {
    abstract void sound();
}
class Child extends Parent {
    void sound(){
        System.out.println("shouting");
    }
}
public class Test1{
    static void main(String[] args) {
        Child obj = new Child();
        obj.sound();
    }
}
