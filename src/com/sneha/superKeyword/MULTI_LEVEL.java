package com.sneha.superKeyword;

 // super in multi level inheritance
    class Grandparent{
        void show(){
            System.out.println("Grandparent");
        }
    }
    class  Parents extends Grandparent{
        void show(){
            System.out.println("Parent");
        }
    }
    class child extends Parents {
        void show() {
            System.out.println("child");
            super.show();               // calls immediate parent method
        }
    }
public class MULTI_LEVEL {
    static void main(String[] args) {
        child c = new child();
        c.show();
    }

}
