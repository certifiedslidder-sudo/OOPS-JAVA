package com.sneha.Final;
final class parent{
    void show(){
        System.out.println("parent");
    }
}
//class son extends parent{               Cannot inherit from final class 'com.sneha.Final.parent'

//                         }

public class glass{
    static void main(String[] args) {
        parent p = new parent();
        p.show();
    }

}


