package com.sneha.Method_overloading;

public class Ex1 {
    void sum()
    {
        int x = 10;
        int y =20;
        System.out.println(x+y);
    }
    void sum(int x,int y)
    {
        System.out.println(x+y);
    }
    void sum(double x , double y)
    {
        System.out.println(x+y);
    }

    static void main(String[] args)
    {
      Ex1 obj = new Ex1();
      obj.sum();
      obj.sum(10,20);
      obj.sum(123.3,30.0);
    }

}
