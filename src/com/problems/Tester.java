package com.problems;

import java.util.Scanner;
class   employee{
    int id;
    String name;
    double salary;

    employee(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    void display(){

    }
}
class manager extends employee {
    double da, hra;
    manager(int id, String name, double salary) {
        super(id, name, salary);

        da = salary * 10 / 100;
        hra = salary * 20 / 100;
    }
}

class Seniormanager extends manager {
    double SpecialAllowance, Bonus,finalsalary;
    Seniormanager(int id,String name, double salary) {
        super(id, name, salary);
        SpecialAllowance = salary * 5 / 100;
        Bonus = salary * 8 / 100;
        finalsalary = salary + hra + da + SpecialAllowance + Bonus;

    }
    void Display(){
        System.out.println(" \nEmployee Details");
        System.out.println("Employee ID : "+id);
        System.out.println("Employee Name : "+name);
        System.out.println("Employee Salary : "+salary);
        System.out.println("HRA: "+ hra);
        System.out.println("DA:" + da);
        System.out.println("SpecialAllowance : "+SpecialAllowance);
        System.out.println("Bonus : "+Bonus);
        System.out.println("Employee final  Salary : "+finalsalary);
    }
}
public class Tester{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee ID");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Employee Name");
        String name =   sc.nextLine();
        System.out.println("Enter Employee Salary");
        double salary = sc.nextDouble();

        Seniormanager s = new Seniormanager(id,name,salary);
        s.Display();

    }
}

//Question 1: Multilevel Inheritance : Employee Salary Management System
//Develop a Java program to implement an Employee Salary Management System using multilevel inheritance.
//Create the following inheritance hierarchy:
//Employee → Manager → SeniorManager
//The Employee class should contain: Employee ID, Employee Name and Basic Salary.
//The Manager class should inherit from Employee and contain: House Rent Allowance (HRA) and Dearness
//Allowance (DA).
//The SeniorManager class should inherit from Manager and contain: Special Allowance and Bonus.
//The program should:
//1. Accept employee details from the user.
//2. Initialize the data using constructors.
//3. Calculate HRA and DA in the Manager class.
//4. Calculate Special Allowance and Bonus in the SeniorManager class.
//5. Calculate the final salary.
//6. Use super() to invoke parent-class constructors.
//7. Display complete employee salary details.
//OOP concepts to demonstrate: Multilevel inheritance, constructors, constructor chaining, super() and method
//inheritance.