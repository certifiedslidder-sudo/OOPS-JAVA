package com.Code.Assignments;

abstract class Employee{
    int id;
    String name , department;
    public Employee(int id, String name, String department){
        this.id = id;
        this.name = name;
        this.department = department;
    }

    abstract double calculateSalary();
    void display(){
        System.out.println("Employee id : " + id);
        System.out.println("Employee name : " + name);
        System.out.println("Employee department : " + department);
        System.out.println("Employee salary : " + calculateSalary());
    }
}

class PermanentEmployee extends Employee{
    double Basic, HRA,DA,Allowance;
    PermanentEmployee(int id, String name, String department, double Basic, double HRA, double DA, double Allowance) {
        super(id, name, department);
        this.Basic = Basic;
        this.HRA = HRA;
        this.DA = DA;
        this.Allowance = Allowance;

    }
    double calculateSalary(){
        return Basic + HRA + DA + Allowance;
    }
}

class ContractorEmployee extends Employee {
    int hours;
    double rate;
     ContractorEmployee(int id, String name ,String department,int hours, double rate) {
         super(id,name,department);
         this.hours = hours;
         this.rate = rate;
     }

    double calculateSalary() {
        return hours * rate;
    }
}
public class abs03 {
    static void main(String[] args) {
       Employee e = new PermanentEmployee(101,"Sneha", "CSE", 90000, 5000,3000,2000);
       e.display();

       e = new ContractorEmployee(101,"Suhana", "LAW",100,0.5);
       e.display();
    }
}
