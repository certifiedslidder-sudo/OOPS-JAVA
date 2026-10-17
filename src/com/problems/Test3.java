package com.problems;

import java.util.Scanner;
interface ResearchWork{
    void conductResearch();
    void publishPaper();
}
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
 public Employee(String n,int a,int id,String d,double s){
     super(n,a);
     this.emp_id = id;
     this.Department = d;
     this.Salary = s;
 }
}

class Teacher extends Employee{
    String subject;
    int noOfClasses;
    public Teacher(String n,int a,int id,String d,double s,String sub,int noOfClasses){
        super(n,a,id,d,s);
        this.subject = sub;
        this.noOfClasses = noOfClasses;
    }

    void display(){
        System.out.println("\n     TEACHER'S DETAILS      ");
        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
        System.out.println("Department: " +Department);
        System.out.println("Subject: " +subject);
        System.out.println("No of classes: " +noOfClasses);
        System.out.println("Salary: " +Salary);
    }
}

class Researcher extends Employee  implements ResearchWork{
    String ResearchArea;
    int noOfPublication;
    Researcher(String n,int a,int id,String d,double s,String sub,int noOfClasses, String ResearchArea, int noOfPublication){
        super(n,a,id,d,s);
        this.ResearchArea = ResearchArea;
        this.noOfPublication = noOfPublication;
    }

    public void conductResearch(){
        System.out.println("Research area: " +ResearchArea);
    }

    public void publishPaper(){
        System.out.println("Number of paper published: "+ noOfPublication);

}
void display(){
    System.out.println("Name: " +name);
    System.out.println("Age: " +age);
    System.out.println("employee id: "+emp_id);
    System.out.println("Department: " +Department);
    System.out.println("salary"+Salary);

    conductResearch();
    publishPaper();

    }
}

public class Test3 {
    static void main(String[] args) {
        Teacher t = new Teacher("aman",30,101,"cse",5000,"java",4);
        Researcher r = new Researcher("sneha",20,101,"it", 30000,"cse",7000,"ai",5);
        t.display();
        System.out.println();
        r.display();
    }
}

