package com.itp.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

//how does hashmap work internally?

//hashmap does not allow duplicate keys, it allows duplicate values.

public class MapTest {
    public static void main(String[] args) {
//        Map<Integer,String> students=new HashMap<>();
        Map<Integer,String> students=new TreeMap<>();
        students.put(30,"surabhi");
        students.put(40,"akash");
        students.put(50,"surabhi");
        students.put(10,"surabhi");
        students.put(20,"akash");
        students.put(20,"akash");
        System.out.println(students);

        Set<Map.Entry<Integer, String>> set=students.entrySet();
        for(Map.Entry<Integer,String> map:set)
        {
            System.out.println(map.getKey()+"::"+map.getValue());
        }

        System.out.println("studetnt having roll no. 40 is :"+students.get(40));
    }
}
