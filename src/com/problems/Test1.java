package com.problems;


import java.util.Scanner;

class Account{
    int no;
    String name;
    double balance;

    Account(int no,String name,double balance){
        this.no = no;
        this.name = name;
        this.balance = balance;
    }

    void Deposit(double amount){
        if(amount>0){
            balance += amount;
            System.out.println("Deposited "+amount);
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }

    void Withdraw(double amount)    {
        if(amount>0 && balance >= amount){
            balance -= amount;
            System.out.println("Withdrawn "+amount);
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }

    void DisplayDetails(){
        System.out.println("Account number: "+ no);
        System.out.println(" Account Holder Name: "+ name);
        System.out.println("Balance: "+ balance);
    }
}

class SavingAccount extends Account{
    double annual_interest;

    SavingAccount(int no,String name,double balance){
        super(no,name,balance);
    }

    void DisplayDetails(){
        super.DisplayDetails();
        double rate= 5;
        annual_interest=balance*rate/100;
        System.out.println("Annual interest is "+annual_interest);
    }

}

class CurrentAccount extends Account{
    double overdraftLimit = 2000;
    boolean eligible;
    CurrentAccount(int no,String name,double balance){
        super(no,name,balance);

        if(balance >= overdraftLimit){
            eligible=true;
        }
        else{
            eligible=false;
        }

    }
    void DisplayOverDraft(){
        System.out.println("eligible for overdraft: "+eligible);
        if(eligible){
            System.out.println("overdraft limit: "+overdraftLimit);
            System.out.println("available balance: "+balance);

        }
        else{
            System.out.println("over draft facility not available");
            System.out.println("available balance: "+balance);
        }
    }

}
public class Test1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("SAVINGS ACCOUNT");
        System.out.println("Enter Account number: ");
        int no = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Account Holder Name: ");
        String name1 = sc.nextLine();
        System.out.println("Enter initial balance:");
        double balance1= sc.nextDouble();
        SavingAccount s = new SavingAccount(no,name1,balance1);
        System.out.println("Enter deposit ammount: ");
        double deposit1 = sc.nextDouble();
        s.Deposit(deposit1);
        System.out.println("Enter withdraw ammount: ");
        double withdraw1 = sc.nextDouble();
        s.Withdraw(withdraw1);

        s.DisplayDetails();
        System.out.println("\n CURRENT ACCOUNT");
        System.out.println("Account number: ");
        int no2 = sc.nextInt();
        sc.nextLine();
        System.out.println("Account Holder Name: ");
        String name2 = sc.nextLine();
        System.out.println("Enter initial balance:");
        double balance2= sc.nextDouble();
        CurrentAccount c = new CurrentAccount(no,name1,balance1);
        System.out.println("Enter deposit ammount: ");
        double deposit2 = sc.nextDouble();
        s.Deposit(deposit2);
        System.out.println("Enter withdraw ammount: ");
        double withdraw2 = sc.nextDouble();
        c.Withdraw(withdraw2);
        c.DisplayDetails();
        sc.close();



    }
}

//Question 2: Hierarchical Inheritance – Bank Account Management System
//Develop a Java program for a Bank Account Management System using hierarchical inheritance.
//Create a parent class named Account and two child classes named SavingsAccount and CurrentAccount.
//The Account class should contain: Account Number, Account Holder Name and Balance. It should provide methods
//for Deposit, Withdrawal and Display Account Details.
//The SavingsAccount class should calculate annual interest on the account balance and display the interest amount.
//The CurrentAccount class should check whether the account holder is eligible for overdraft, apply an overdraft limit
//and display the available balance/overdraft information.
//The program should:
//1. Create objects of both SavingsAccount and CurrentAccount.
//2. Use constructors to initialize account information.
//3. Override a suitable method in the child classes.
//4. Perform deposit and withdrawal operations.
//5. Display the final account details.
//OOP concepts to demonstrate: Hierarchical inheritance, method overriding, constructors and super.