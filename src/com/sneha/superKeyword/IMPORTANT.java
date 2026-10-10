package com.sneha.superKeyword;
class Room{
    int length,breadth;
    Room(int l,int b){
        length = l;
        breadth = b;
    }

    void Area(){
        int area = length*breadth;
        System.out.println(area);
    }
}

class Room1 extends Room{
    int h;
    Room1(int l,int b, int z){
        super(l,b);           // important line
        h = z;
    }
    void Volume(){
        int volume = length*breadth*h;
        System.out.println(volume);
    }
}
public class IMPORTANT {
    static void main(String[] args) {
        Room1 r = new Room1(10,20,30);
        r.Area();
        r.Volume();
    }
}
