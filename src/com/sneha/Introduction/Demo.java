package com.sneha.Introduction;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args){
        // store 5 roll nos
        int[] numbers = new int[5];

        // store 5 names
        String[] names = new String[5];

        // data of 5 students (roll no, name , marks )
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students  = new Student[5];

        // just declaring
        //Student sneha;
      //  System.out.println(Arrays.toString(students));     // output -- [null, null, null, null, null] , when students are not initialized.

        Student sneha = new Student();
//        sneha.name = "sneha rawat";
//        sneha.rno = 12345;
//        sneha.marks = 98.98f;
        sneha.changeName("shoe lover");
        sneha.greeting();
//        System.out.println(sneha.rno);    // 0
//        System.out.println(sneha.name);   // null
//        System.out.println(sneha.marks);  // 0.0
    }
}
// create a class
// CLASS --> TEMPLETE OF OBJECT{ LOGICAL CONSTRUCT}      OBJECT --> INSTANCE{ PHYSICAL FRAMEWORK} OF CLASS
// OBJECT HAVE 3 ESSENTIAL PROPERTIES - STATE(vale; data type) , IDENTITY(value stored in memory ) , BEHAVIOUR(effect of operation like function etc)
class Student{
    int rno ;
    String name;
    float marks ;

    void greeting(){
        System.out.println("hello! My name is " + this.name);
    }

    void changeName(String newName){
       name = newName;
    }


    // we need a way to add values of the above properties object by object
    // we need one word to access every object  ----->>>>    "this" keyword
    Student () {
        this.name = "sneha rawat";    // this does the work of line 25,26,27 internally
        this.rno = 12345;
        this.marks = 98.98f;
    }
}
