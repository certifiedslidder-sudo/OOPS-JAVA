package com.Code.Assignments;

abstract class Product{
   int id;
   String name;
   double price;

   Product(int id, String name, double price){
       this.id = id;
       this.name = name;
   }
   abstract double calculateDiscount();
   abstract double calculateFinalPrice();

   void display(){
       System.out.println("Product is: " +id);
       System.out.println("Product name is: " +name);
       System.out.println("Product price is: " +price);
       System.out.println("Discount is: " +calculateDiscount());
       System.out.println("Final price is: " +calculateFinalPrice());

   }
}

class Electronics extends Product{
   int id;
   String name;
   double price;
   Electronics(int id, String name, double price){
       
   }
}
public class abs02 {
    static void main(String[] args) {

    }
}
