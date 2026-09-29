package com.sneha.Final;

class Student {
    final int ROLL_NO = 101;
    void display(){
        System.out.println((" roll no.: "+ ROLL_NO));
         // ROLL_N0 = 123;     WILL RAISE AN ERROR AS I CANNOT ASSIGN A NEW VALUE TO VARIABLE WITH WHICH WE PUTTED FINAL.
    }
}
public class Variable{
    static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}
