package com.sneha.superKeyword;

public class Animal {
    String color = "white";
}

class Dog extends Animal{
    String color = "black";
    void Tellcolor() {
        System.out.println(color);
        System.out.println(super.color);
    }
}
 class abc {
     public static void main(String[] args) {
         Dog d = new Dog();
         d.Tellcolor();

     }
 }
