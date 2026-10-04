package com.sneha.superKeyword;
// access parent method using super
public class xyz {
    void display(){
        System.out.println("display from base");
    }
}
class hello extends xyz{
    void display(){
        super.display();          // important to maintain the order of lines
        System.out.println("display from drive");
    }

    static void main(String[] args) {
        hello obj = new hello();
        obj.display();
    }
}
// output:
//display from base
//display from drive
