package com.Code.Assignments;
abstract class bankaccount{
    int accno;
    String name;
    double principal;
    bankaccount(int accNo, String name, double principal){
        this.accno = accno;
        this.name = name;
        this.principal = principal;
    }

    abstract double calculateInterest();
    void display(){
        double interest = calculateInterest();
        System.out.println("Account Number: " + accno);
        System.out.println("Name: " + name);
        System.out.println("Principal: " + principal);
        System.out.println("Interest Rate: " + interest);
        System.out.println("Total Amount: " +( principal+interest));
    }
}
class SavingAccount extends bankaccount{
    SavingAccount(int accNo, String name, double principal){
        super(accNo, name, principal);

    }
    double calculateInterest(){
        return principal*4/100;
    }
}
class finaldeposit extends bankaccount{
    finaldeposit(int accNo, String name, double principal){
        super(accNo, name, principal);

    }
    double calculateInterest(){
        return principal*7*2/100;
    }
}
public class abs01 {
    static void main(String[] args) {
        bankaccount b;
        b = new SavingAccount(11,"sneha",50000);
        System.out.println("Saving Account");
        b.display();
        System.out.println();
        b = new finaldeposit(11,"amit",50000);
        System.out.println("Final Deposit Account");
        b.display();

    }
}
