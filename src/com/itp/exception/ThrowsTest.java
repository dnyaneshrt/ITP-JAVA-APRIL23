package com.itp.exception;

public class ThrowsTest {

    public static void throwsDemo() throws NegativeNumberException {
        int num=5;

        if(num<0)
            throw new NegativeNumberException("need only positive numbers");
        else
            System.out.println("positive number.. Alright");
        System.out.println("rest code..");
    }
    public static void main(String[] args)  {
        try {
            ThrowsTest.throwsDemo();
        } catch (NegativeNumberException e) {
            throw new RuntimeException(e);
        }
    }
}
