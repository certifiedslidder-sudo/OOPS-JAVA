package com.problems;
import java.util.Scanner;

class Student{
    int rollNo;
    String name;
    String course;
    int semester;

   public Student(int rollNo, String name, String course, int semester){
       this.rollNo = rollNo;
       this.name = name;
       this.course = course;
       this.semester = semester;
   }
   void Detail(){
       System.out.println("\n------STUDENT DETAILS------");
       System.out.println("Roll No: "+rollNo);
       System.out.println("Name: "+name);
       System.out.println("Course: "+course);
       System.out.println("Semester: "+semester);
   }
}

class Academic extends Student{
    int MathsMarks, EnglishMarks, ScienceMarks, SocialMarks, HindiMarks;
    public Academic(int rollNo, String name, String course, int semester, int MathsMarks, int EnglishMarks, int ScienceMarks, int SocialMarks, int HindiMarks) {
        super(rollNo, name, course, semester);
            this.MathsMarks = MathsMarks;
            this.EnglishMarks = EnglishMarks;
            this.ScienceMarks = ScienceMarks;
            this.SocialMarks = SocialMarks;
            this.HindiMarks = HindiMarks;
    }

    void Details1(){
        System.out.println("\n-----ACADEMIC DETAILS------");
        System.out.println("Maths Marks: " + MathsMarks);
        System.out.println("English Marks: " + EnglishMarks);
        System.out.println("Science Marks: " + ScienceMarks);
        System.out.println("Social Marks: " + SocialMarks);
        System.out.println("Hindi Marks: " + HindiMarks);
    }
}

class Result extends Academic{
    int TotalMarks;
    double  Percentage;
    char Grade;
    public Result(int rollNo, String name, String course, int semester , int MathsMarks, int EnglishMarks, int ScienceMarks, int SocialMarks, int HindiMarks)
    {
        super(rollNo, name, course, semester, MathsMarks, EnglishMarks, ScienceMarks, SocialMarks, HindiMarks);

    }
    void Details2(){
        super.Detail();
        super.Details1();
        TotalMarks =  MathsMarks+ EnglishMarks+ ScienceMarks+ ScienceMarks+ HindiMarks;
        Percentage = (  TotalMarks/500.0)*100;
        System.out.println("\n-----FINAL RESULT-----");
        System.out.println("Total Marks: " + TotalMarks);
        System.out.println("Percentage: " + Percentage+"%");

        Grade();
        }

       void  Grade(){
            if(Percentage >= 90) System.out.println("Grade A+");
            else if(Percentage >= 80 && Percentage<= 89) System.out.println("Grade A");
            else if(Percentage >= 70 && Percentage<= 79) System.out.println("Grade B");
            else if(Percentage >= 60 && Percentage<= 69) System.out.println("Grade C");
            else if(Percentage >= 50 && Percentage<= 59) System.out.println("Grade D");
            else System.out.println("FAIL!");
        }
    }

public class Test2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Roll No: ");
        int rollNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Student Course: ");
        String course = sc.nextLine();
        System.out.print("Enter Student Semester: ");
        int semester = sc.nextInt();
        System.out.print("Enter Student Maths Marks: ");
        int MathsMarks = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Student English Marks: ");
        int EnglishMarks = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Student Science Marks: ");
        int ScienceMarks = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Student Social Marks: ");
        int SocialMarks = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Student Hindi Marks: ");
        int HindiMarks = sc.nextInt();
        sc.nextLine();
        Result r = new Result(rollNo,name,course,semester,MathsMarks, EnglishMarks, ScienceMarks, SocialMarks, HindiMarks);
        r.Details2();
        sc.close();

    }
}

//Java Assignment CSE-3 Sem Dr. Rakesh Sharma
//Question 3: Multilevel Inheritance : Student Result Management System
//Develop a Java program using multilevel inheritance for calculating student results.
//Create the following hierarchy: Student → Academic → Result
//The Student class should contain: Roll Number, Student Name, Course and Semester.
//The Academic class should contain marks of five subjects.
//The Result class should calculate total marks, percentage and grade and display the complete result.
//Use the following grading criteria: • 90% and above – Grade A+ • 80% to 89% – Grade A • 70% to 79% – Grade B • 60% to 69% – Grade C • 50% to 59% – Grade D • Below 50% – Fail
//The program must: 1. Accept all student details. 2. Use constructors to initialize data. 3. Use inheritance to access parent-class members. 4. Use super wherever appropriate. 5. Calculate and display the final result.
//OOP concepts to demonstrate: Multilevel