package com.sneha.Constructor;
class Rect{
    int length, breadth;
    Rect(int x , int y){
        length = x;
        breadth = y;
    }

    int RectArea(){
        return length * breadth;
    }
}
public class Test1_1 {
    static void main(String[] args) {
        Rect r1 = new Rect(10, 20);
        Rect r2 = new Rect(20, 30);
        int area1 = r1.RectArea();
        System.out.println("Area of rect1: " + area1);
        int area2 = r2.RectArea();
        System.out.println("Area of rect2: " + area2);
    }
}
