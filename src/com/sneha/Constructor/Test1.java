package com.sneha.Constructor;
class abc {
    int x, y;

    public abc() {
        x = 10;
        y = 20;
    }

    void sum() {
        int c = x + y;
        System.out.println(c);
    }
}
public class Test1 {
    static void main(String[] args) {
        abc obj = new abc();
        obj.sum();
    }
}
