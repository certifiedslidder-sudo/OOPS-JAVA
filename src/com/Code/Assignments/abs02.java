package com.Code.Assignments;

abstract class Product{
   int id;
   String name;
   double price;

   Product(int id, String name, double price){
       this.id = id;
       this.name = name;
       this.price = price;
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
   Electronics(int id, String name, double price){
       super(id,name,price);
   }
   double calculateDiscount(){
       return price *0.1;
   }
   double calculateFinalPrice(){
       double discounted = price - calculateDiscount();
       return discounted;
   }
}
class Clothing extends Product{
    Clothing(int id, String name, double price){
        super(id,name,price);
    }
    double calculateDiscount(){
        return price * 20/100;
    }
    double calculateFinalPrice(){
        double discounted = price - calculateDiscount();
        return discounted;
    }
}
public class abs02 {
    static void main(String[] args) {
        Electronics e =   new Electronics(101,"Laptop", 35000);
        e.display();
        System.out.println();

        Clothing p = new Clothing(102,"Shirt",950);
        p.display();
    }
}
