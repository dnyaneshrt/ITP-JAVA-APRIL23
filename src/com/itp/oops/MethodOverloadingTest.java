package com.itp.oops;

//method overloading.
//in a single class we can have any no.of methods with the same name by passing different type of argument list
//or passing argument list in different order.
public class MethodOverloadingTest
{
    //instance method

   static void add()
    {
        System.out.println("add method with zero param");
    }
    void add(int num1,int num2)
    {
        System.out.println("add method with two param:"+(num1+num2));
    }
    void add(int num1,int num2,int num3)
    {
        System.out.println("add method with three param"+(num1+num2+num3));
    }
    public static void main(String[] args) {
        MethodOverloadingTest methodOverloadingTest=new MethodOverloadingTest();
        MethodOverloadingTest.add();
        methodOverloadingTest.add(10,20);
        methodOverloadingTest.add(10,25,50);
    }
}
