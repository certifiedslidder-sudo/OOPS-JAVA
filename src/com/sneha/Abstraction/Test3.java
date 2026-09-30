package com.sneha.Abstraction;

           // ABSTRACT CLASS WITH MULTIPLE ABSTRACT METHOD
abstract class Shape{
    abstract void area();
    abstract void perimeter();
    }

class Rectangle extends Shape{
    int length = 10;
    int breadth = 5;

    void area(){
        System.out.println("Area of Rectangle: "+ length*breadth);
    }

    void perimeter(){
        System.out.println("Perimeter of Rectangle: "+ 2*(length*breadth));
    }
}
public class Test3 {
    static void main(String[] args) {
        Rectangle obj = new Rectangle();
        obj.area();
        obj.perimeter();
    }
}
