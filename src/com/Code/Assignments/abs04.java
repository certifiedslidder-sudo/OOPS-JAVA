package com.Code.Assignments;

abstract class Shape{
    abstract double CalculateArea();
    abstract double CalculatePerimeter();
}
class Circle  extends Shape{
    double r;
    Circle(double r){
        this.r = r;
    }
    double CalculateArea() {
        return Math.PI * r * r;
    }
    double CalculatePerimeter() {
        return 2 * Math.PI * r;
    }
}
class Rectangle extends Shape{
    double l,b;
    Rectangle(double l,double b){
        this.l = l;
        this.b = b;
    }
    double CalculateArea() {
        return l*b;
    }
    double CalculatePerimeter() {
        return 2*(l+b);
    }
}
class Triangle extends Shape{
    double a , b ,c;
    Triangle(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c =c;
    }
    double CalculateArea() {
        double s = (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    double CalculatePerimeter() {
        return a+b+c;
    }
}
public class abs04 {
    static void main(String[] args) {
        Shape[] shapes = {
                new Circle(7),
        new Rectangle(3, 4),
        new Triangle(5, 6, 3)
  };
                for(Shape s :shapes){
                    if( s  instanceof Circle) System.out.println("Shape:  Circle");
                     else if( s  instanceof Rectangle ) System.out.println("Shape:  Rectangle");
                   else  if( s  instanceof Triangle ) System.out.println("Shape:  Triangle");
                    System.out.println("Area is: "+s.CalculateArea());
                    System.out.println("Perimeter is: "+s.CalculatePerimeter());
                    System.out.println();
                }

    }
}

//Develop a Java program using an abstract class named Shape.
//The abstract class should contain two abstract methods: calculateArea() and calculatePerimeter().
//Create the following subclasses: Circle, Rectangle and Triangle.
//The Circle class should calculate the area and perimeter of a circle.
//The Rectangle class should calculate the area and perimeter of a rectangle.
//The Triangle class should calculate the area and perimeter of a triangle.
//The program should: 1. Accept the required dimensions. 2. Create objects of different shapes. 3. Store different shape objects using Shape references. 4. Invoke the appropriate methods. 5. Display area and perimeter for each shape.
//Additional Requirement: Use an array of Shape references to demonstrate runtime polymorphism.
//OOP concepts to demonstrate: Abstract class, abstract methods, inheritance, method overriding and runtime polymorphism.