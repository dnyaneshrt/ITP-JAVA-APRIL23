package com.itp.basic_programs;

public class SwappingTest {
    public static void main(String[] args) {
        int num1=555;
        int num2=888;
        System.out.println("values of num1 and num2 before swapping: num1: "+num1+" num2: "+num2);

        int temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("values of num1 and num2 after swapping: num1: "+num1+" num2: "+num2);
    }
}
