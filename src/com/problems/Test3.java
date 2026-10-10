package com.problems;

import java.sql.SQLOutput;

class Person{
String name;
int age;
public Person(String name,int age) {
    this.name = name;
    this.age = age;
    }
}

class Employee extends Person{
int emp_id;
String Department;
Double Salary;
 public Employee(String name,int age,int emp_id,String Department,double salary){
     super(name,age);
     this.emp_id = emp_id;
     this.Department = Department;
     this.Salary = salary;
 }
}

class Teacher extends Employee{
    String subject;
    int noOfClasses;
    public Teacher(String name,int age,int emp_id,String Department,double salary,String subject,int noOfClasses){
        super(name,age,emp_id,Department,salary);
        this.subject = subject;
        this.noOfClasses = noOfClasses;
    }

    void display{
        System.out.println("\n     TEACHER'S DETAILS      ");
        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
        System.out.println("Department: " +Department);
        System.out.println("Subject: " +subject);
        System.out.println("No of classes: " +noOfClasses);
        System.out.println("Salary: " +Salary);
    }
}
interface ResearchWork{
    void conductResearch();
    void publishPaper();
}
class Researcher extends Employee  implements ResearchWork{
    String ResearchAreaa;
    int noOfPublication;
    Researcher(String name,int age,int emp_id,String Department,double salary,String subject,int noOfClasses, String ResearchAreaa, int noOfPublication){
        super(name,age,emp_id,Department,salary,subject,noOfClasses);
    }
}


public class Test3 {
}
