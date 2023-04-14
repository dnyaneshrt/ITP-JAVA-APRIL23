package com.itp.inheritance;

 class Parent
{
    void property()
    {
        System.out.println("parent's cash, bankbalance, cars");
    }
    //final decision.. final method cannot be overridden
  /* final void marriage()
    {
        System.out.println("geetanjali / pushpanjali");
    }*/
    void marriage()
    {
        System.out.println("geetanjali / pushpanjali");
    }
}
class Child extends Parent
{
    void marriage()
    {
        System.out.println("alia, katrina");
    }

}
public class UpCastingTest {
    public static void main(String[] args) {
        Parent p=new Child();// upcasting
        p.marriage();

    }
}
