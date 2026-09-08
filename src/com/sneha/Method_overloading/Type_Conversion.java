package com.sneha.Method_overloading;

public class Type_Conversion {
    void test()
    {
        System.out.println("no parameters");
    }
    void test(int a , int b)
    {
        System.out.println("a and b:" + a + " "+ b);
    }
    void test(double a)
    {
        System.out.println("inside test (double) a: " + a );
    }
}
class Overload
{
    static void main(String[] args) {
        Type_Conversion obj = new Type_Conversion();
        int i = 88;
        obj.test(i);
        obj.test(10,20);
        obj.test(i);        // double a will be ivoked as we dont have any maching PARAMETER for one int asn will be in double 88.0
        obj.test(123.3);
    }
}
