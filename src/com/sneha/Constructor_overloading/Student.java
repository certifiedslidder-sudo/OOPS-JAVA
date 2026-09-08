package com.sneha.Constructor_overloading;

public class Student {
    int roll_no;
    String name;
    Student()
    {
        roll_no = 0;
        name = "unknown";
    }
    Student(int r)
    {
        roll_no = r;
        name = "unknown";
    }
    Student(int r,String n)
    {
        roll_no = r;
        name = n;
    }
    void display()
    {
        System.out.println("Roll no: " + roll_no);
        System.out.println("Name: " + name);
    }
}
