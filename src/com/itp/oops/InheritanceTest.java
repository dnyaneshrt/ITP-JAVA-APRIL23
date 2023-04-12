package com.itp.oops;

class Parent
{
    void bankBalance()
    {
        System.out.println("Parent's Bank Balance : 1 crore");
    }
    void property()
    {
        System.out.println("Parent's proprety");
    }
}
class Child1 extends Parent
{
    void pocketMoney()
    {
        System.out.println("chils's pcket money is 1000/- rs");
    }

}
class Child2 extends Parent
{
    void pocketMoney()
    {
        System.out.println("chils's pcket money is 1000/- rs");
    }
}
public class InheritanceTest {
    public static void main(String[] args) {
        Child1 jay=new Child1();
        jay.pocketMoney();
        jay.property();
        jay.bankBalance();
        Child2 radhika=new Child2();
        radhika.property();
        Parent parent=new Parent();
        parent.bankBalance();
    }
}
