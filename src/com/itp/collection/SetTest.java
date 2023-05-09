package com.itp.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {
        Set numbers=new HashSet();
//        Set numbers=new TreeSet();
        numbers.add(20);
        numbers.add(40);
        numbers.add(50);
        numbers.add(40);
        numbers.add(50);
        numbers.add(10);
        numbers.add(20);
        System.out.println(numbers.add(10));
        System.out.println(numbers.add(11));
        numbers.add(10);

        System.out.println(numbers);
        System.out.println(numbers.size());
        System.out.println("set is as follows:");
       Iterator it= numbers.iterator();
       while (it.hasNext())
       {
           System.out.println(it.next());
       }

    }
}
