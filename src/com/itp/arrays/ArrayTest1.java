package com.itp.arrays;

/*Arrays: Array is collection of similler type of data elements.
Array defination:
DataType[] var_name=new DataType[ArrayMaxSize];
int[] marks=new int[5];
--Array index always starts with zero and ends with (size-1).
--Array always stores in contiguos memory location.
--the moment you define an array with sepicific size, array initizes with defaut values of that type of array.
* */
public class ArrayTest1 {
    public static void main(String[] args) {

        int[] marks=new int[5];
        marks[2]=88;
      /*  marks[0]=55;
        marks[1]=45;
        marks[2]=65;
        marks[3]=87;
        marks[4]=99;*/
//        marks[5]=55;
        for(int i=0;i< marks.length;i++)
        {
            System.out.println(marks[i]);  //marks[0],marks[1],marks[2].... using indexes only we can retirve the data
        }

/*
        --the moment you define an array with sepicific size, array initizes with defaut values of that type of array.
        String[] names=new String[10];
        for(String s:names)
        {
            System.out.println(s);
        }

        char[] chars=new char[10];
        for(char s:chars)
        {
            System.out.println(s);
        }*/
        System.out.println("the value at index no.3 is is :"+marks[3]);

    }
}
