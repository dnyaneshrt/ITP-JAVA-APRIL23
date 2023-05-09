package com.itp.collection;

import java.util.Stack;
//LIFO
public class StackTest {
    public static void main(String[] args) {
        Stack nums=new Stack();
        nums.push(10);
        nums.push(20);
        nums.push(30);
        nums.push(40);
        nums.push(50);
        nums.push(60);

        System.out.println(nums);
        nums.pop();
        System.out.println(nums);
        nums.pop();
        System.out.println(nums);
        nums.pop();
        System.out.println(nums);
        System.out.println(nums.peek());


    }
}
