package com.Code.Assignments;

import java.util.Scanner;

public class StudentDemo {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        s.inputDetails(sc);
        s.displayDetails();
        sc.close();

    }
}
