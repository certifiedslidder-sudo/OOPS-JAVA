package com.Code.Assignments;

public class BankAccount {
    private String name;
    private int accNO;
    private char type;
    private double balance;

    void initialize(Scanner sc )
    {
        System.out.println("depositor name: ");
        name = sc.nextLine();
    }
}
