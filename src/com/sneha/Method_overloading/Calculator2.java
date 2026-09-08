package com.sneha.Method_overloading;

public class Calculator2
{
    // method with 2 int parameters
    int add(int a, int b)
    {
        return a+b;
    }
    // method with 3 int parameters
    int add(int a,int b , int c)
    {
        return a+b+c;
    }
    double add(double a,double b)
    {
        return a+b;
    }
    public static void main(String[] args)
    {
        Calculator2 c = new Calculator2();
        System.out.println("sum of two integers=" + c.add(10,20));
        System.out.println("sum of three integers= "+ c.add(10,20,30));
        System.out.println("sum of two double= " + c.add(10.2,20.2));
    }
}
