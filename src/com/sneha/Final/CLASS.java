package com.sneha.Final;
final class Parentt{
    void show(){
        System.out.println("This is a Parentt");
    }
}

 //class Child extends Parentt{                     will raise an error as we cant inherit from a final class.

 //                            }
public class CLASS {
    static void main(String[] args) {
        Parentt p = new Parentt();
        p.show();
    }
}
