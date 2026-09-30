package com.sneha.Constructor;

// PARAMETERISED CONSTRUCTOR

class Student{
    int roll_no;
    String name;
    float fee;

    Student( int roll_no, String name , float fee){
        this.roll_no = roll_no;
        this.name = name;
        this.fee = fee;

    }

    void display(){
        System.out.println("Roll no: " + roll_no+ " "+ "name:" + name + " fee:" + fee);
    }
}
public class Test4 {
    static void main(String[] args) {
        Student s1 = new Student(1,"Sam",12.5f);
        Student s2 = new Student(2,"Aaru",13.6f);
        s1.display();
        s2.display();
    }
}
