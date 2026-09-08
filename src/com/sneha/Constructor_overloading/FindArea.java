package com.sneha.Constructor_overloading;

public class FindArea 
{
    static void main(String[] args) 
    {
        Rectangle rs = new Rectangle();
        rs.getArea();
        Rectangle rs2 = new Rectangle(12,21);
        rs2.getArea();
        Rectangle rs3 = new Rectangle(10.2,56.9);
        rs3.getArea();
    }
}
