package com.sneha.superKeyword;
// for accessing method from parent class
public class Animals {
    void eat(){
        System.out.println("eating");
    }
}
class Dogs extends Animals{
    void eat(){
        System.out.println("eating bread");
    }
    void bark(){
        System.out.println("barking");
    }
    void sleep(){
        super.eat();             // eating
        bark();                  // barking
    }
}
class Test{
    static void main(String[] args) {
        Dogs d = new Dogs();
        d.sleep();
    }
}
