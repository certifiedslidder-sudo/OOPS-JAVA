package com.sneha.Constructor_overloading;

public class Display
{
    static void main(String[] args)
    {
        Student s1 = new Student();
        System.out.println(s1.roll_no + " " + s1.name);
        Student s2 = new Student(10);
        System.out.println(s2.roll_no + " " + s2.name);
        Student s3 = new Student(10,"sneha");
        System.out.println(s3.roll_no+" "+s3.name);
    }
}
