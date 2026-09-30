package com.sneha.Constructor;
class Rectangle{
    int area, length, breadth;
    public Rectangle(){
        length = 30;
        breadth = 40;
    }

    void GetArea(){
        area = length * breadth;
        System.out.println("Area = " + area);
    }
}
public class Test3 {
    static void main(String[] args) {
        Rectangle rs =  new Rectangle();
        rs.GetArea();
    }
}
