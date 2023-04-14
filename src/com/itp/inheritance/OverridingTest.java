package com.itp.inheritance;

class OppoA5
{
    int price=15000;
    public void camera()
    {
        System.out.println("16 mp camera");
    }
    public void musicPlayer()
    {
        System.out.println("Oppo A5's music player is good");
    }
}
class OppoA9 extends  OppoA5
{
    int price=20000;
    @Override
    public void camera()
    {
        System.out.println("32 mp camera");
    }
    //super keyword at variable level
    //super keyword at method level
    public void printDetails()
    {
        System.out.println("price of OppoA5 is  "+super.price);//calling super class price property
        super.camera();//calling super class camera method
    }
}
public class OverridingTest {
    public static void main(String[] args) {
        OppoA9 a9=new OppoA9();
        a9.musicPlayer();
        a9.camera();
        System.out.println(a9.price);
        a9.printDetails();
    }
}
//this and super keyword we can never use inside static context.

//Upcasting in Java:
//holding child class object into Parent class reference is called as Upcasting.
//Parent p=new Child();