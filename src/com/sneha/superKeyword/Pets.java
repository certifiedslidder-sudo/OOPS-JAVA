package com.sneha.superKeyword;
// for accessing variable from parent class
class ANimaal {
   String type = "Animal";
}
class DOg extends ANimaal{
    String type = "Dog";
    public void printType(){
        System.out.println(super.type);         // animal
        System.out.println(type);               // dog
    }
}

public class Pets{
    static void main(String[] args) {
        DOg mydog = new DOg();
        mydog.printType();

    }

}


