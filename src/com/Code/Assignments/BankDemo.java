package com.Code.Assignments;

import java.util.Scanner;

public class BankDemo {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount[] accounts = new BankAccount[10];
        for(int i =0;i<10;i++)
        {
            accounts[i] = new BankAccount();
            System.out.println("\nCustomer "+(i+1)+": ");
        }
    }
}
