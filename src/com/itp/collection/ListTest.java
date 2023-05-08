package com.itp.collection;

import java.util.*;
public class ListTest {
    public static void main(String[] args) {

        List special_numbers=new ArrayList();
        special_numbers.add(999);
        special_numbers.add(888);

        List<Integer> numbers=new ArrayList();  //upcasting
        numbers.add(10);
        numbers.add(50);
        numbers.add(80);
        numbers.add(90);
        numbers.add(100);
        numbers.add(100);
        numbers.add(100);
        numbers.add(100);
        numbers.add(550);
        numbers.add(107);
        numbers.add(5078);
        numbers.add(1078);
//        numbers.add("Five");
        numbers.add(5099);
        numbers.add(58);
        numbers.add(878);
        numbers.add(599);
        numbers.set(1,555);
        numbers.addAll(0,special_numbers);

        System.out.println("before sorting: "+numbers);
        Collections.sort(numbers);
        System.out.println("after sorting: asc: "+numbers);
        Collections.sort(numbers, Comparator.reverseOrder());
        System.out.println("after sorting: desc: "+numbers);

        System.out.println("number at 4th index is :"+numbers.get(4));
        System.out.println("total size of above list is :"+numbers.size());
        System.out.println(numbers);
        numbers.remove(3);
//        numbers.clear();

        System.out.println("total size of above list after clearing is :"+numbers.size());
        System.out.println("after removing 90: "+numbers);

        //first way to iterate
        Iterator it=numbers.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next()+" ******");
        }

        //second way to iterate
        System.out.println("traversing using for each ::");
        for(Integer i:numbers)
        {
            System.out.println(i);
        }

        //third way to iterate
        System.out.println("traversing using for loop ::");
        for(int i=0;i<numbers.size();i++)
        {
            System.out.println(numbers.get(i));
        }
        System.out.println("for each() method");
        numbers.forEach(s-> System.out.println(s));

        System.out.println("for each() method with :: opeartor");
        numbers.forEach(System.out::println);
    }
}
