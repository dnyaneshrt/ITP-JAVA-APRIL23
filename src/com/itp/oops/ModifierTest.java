package com.itp.oops;
class PrivateTest
{
    {
        ModifierTest mt=new ModifierTest();
        System.out.println(mt.number1);
    }
}
public class ModifierTest {
    //instance
    public int number1=999;
    //private members can be acessible within the same class only
    private int number2=888;
    public static void main(String[] args) {
        ModifierTest mt=new ModifierTest();
        System.out.println(mt.number2);
    }
}
