package com.sneha.Encapsulation;

  class EMPLOYEE {

    // Private variable
    private double salary;

    // Setter method
    public void setSalary(double salary) {

        if (salary > 0) {
            this.salary = salary;
        }
    }

    // Getter method
    public double getSalary() {
        return salary;
    }
}
    public class GET_SET {

        public static void main(String[] args) {

            EMPLOYEE e = new EMPLOYEE();

            e.setSalary(50000);

            System.out.println(e.getSalary());
        }
    }


