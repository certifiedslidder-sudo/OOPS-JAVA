package com.sneha.Constructor;
    // default constructor returning default values
class Employee{
    int id;
    String name;

    void display(){
        System.out.println(id+" "+name);
    }
}
public class Test5 {
    static void main(String[] args) {
        Employee e = new Employee();  // here default  constuctor is called and as no signature matches it returns default value.
        e.display();
    }
}
