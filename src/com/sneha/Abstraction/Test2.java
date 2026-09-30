package com.sneha.Abstraction;

// ABSTRACT CLASS WITH BOTH CONCRETE AND ABSTRACT METHOD.

abstract class Carnivores{
    abstract void sound();
    void eat(){
        System.out.println("meat");
    }
}
class Tiger extends Carnivores{
    void sound(){
        System.out.println("Roar");
    }
}
public class Test2 {
    static void main(String[] args) {
        Tiger t = new Tiger();
        t.eat();
        t.sound();
    }
}
