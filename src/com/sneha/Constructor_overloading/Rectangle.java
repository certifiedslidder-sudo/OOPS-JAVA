package com.sneha.Constructor_overloading;

public class Rectangle
{
    double area, length,breadth;
    public Rectangle()
    {
        length = 10;
        breadth = 20;
    }
    public Rectangle(int a,int b)
    {
        length = a;
        breadth = b;
    }
    public Rectangle(double a,double b)
    {
        length = a;
        breadth = b;
    }
    void getArea()
    {
        area = length*breadth;
        System.out.println("area =" + area);
    }
}
