package com.Code.Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Student {
    private String name;
    private int rollNo;
    private int[] marks = new int[5];
    private double average;
    private char grade;

    void inputDetails(Scanner sc)
    {
        System.out.print("Enter your name: ");
        name = sc.nextLine();
        System.out.print("Enter your roll no: ");
        rollNo = sc.nextInt();
        int total =0;
        for(int i =0;i<5;i++)
        {
            System.out.print("Enter marks for subject " + (i +1)+ ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }
        sc.nextLine();
        average = total / 5;
        calculateGrade();

    }
    void  calculateGrade()
    {
        if(average >= 90) grade = 'A';
        else if(average >= 80) grade = 'B';
        else if(average >= 70) grade = 'C';
        else if(average >= 60) grade = 'D';
        else if(average >= 5) grade = 'E';
        else grade = 'F';

    }
    void displayDetails()
    {
        System.out.println("Name: " + name);
        System.out.println("Roll no: " + rollNo);
        System.out.println("Marks: " + Arrays.toString(marks));
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
    }
}

