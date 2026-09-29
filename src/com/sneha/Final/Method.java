package com.sneha.Final;

class Parent{
    final void show(){
        System.out.println("parent");
    }
}class Child extends Parent
{

// void show(){
//      System.out.println("child");              // will give eror
//             }
}
public class Method {
    static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
    }

