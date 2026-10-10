package com.sneha.superKeyword;
class Dad{
    void show(){
        System.out.println("Parent");
    }
}
class Son extends Dad{
   Son(){
       super();       // can skip for default
       System.out.println("Child constructor");           // you cant call super after this
   }
}
public class Constructor_super {
    static void main(String[] args) {
        Son son = new Son();
    }
}
