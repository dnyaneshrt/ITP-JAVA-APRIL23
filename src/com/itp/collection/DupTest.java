package com.itp.collection;

import java.util.Set;
import java.util.TreeSet;

public class DupTest {
    public static void main(String[] args) {
        Integer[] numbers=new Integer[]{12,234,45,45,67,67};
        Set<Integer> nums=new TreeSet();
        for(int i=0;i<numbers.length;i++)
        {
            if(!nums.add(numbers[i]))
                System.out.println(numbers[i]);
        }
        System.out.println("---------------------");
        for(Integer i:nums)
        {
            System.out.println(i);
        }
    }
}
