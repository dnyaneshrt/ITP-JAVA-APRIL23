package com.itp.collection;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortTest {
    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();
        students.add(new Student("Akash","Ingle"));
        students.add(new Student("Ritu","Ingle"));
        students.add(new Student("Surabhi","Kumari"));
        students.add(new Student("Poonam","Kale"));
        students.add(new Student("Rutik","Phaphale"));
        students.add(new Student("Shradha","Kukade"));
        students.add(new Student("Rahul","Shinde"));
        students.add(new Student("Digvijay","Pawar"));
        students.add(new Student("Radhika","Kalyankar"));

        System.out.println("student names before sorting");
        int count=0;
        for(Student s:students)
        {
            count++;
            System.out.println(count+"]"+s.getFirstname()+" "+s.getLastname());
        }

     /*   Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getFirstname().compareTo(o1.getFirstname());
            }
        });*/
        Collections.sort(students, (o1,o2)-> {
                return o2.getFirstname().compareTo(o1.getFirstname());
        });

        System.out.println("\n\n student names after sorting");
        count=0;
        for(Student s:students)
        {
            count++;
            System.out.println(count+"]"+s.getFirstname()+" "+s.getLastname());
        }

    }

}
