package com.sneha.superKeyword;

public class Parent {
    void show(){
        System.out.println("parent class");
    }
}
class Child extends Parent {
    void show(){
        System.out.println("child class");
    }

    void display(){
        show();
        super.show();
    }
}
class Testing{
    static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}
