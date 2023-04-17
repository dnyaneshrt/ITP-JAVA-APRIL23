package com.itp.arrays;

/*Arrays: Array is collection of similler type of data elements.
Array defination:
DataType[] var_name=new DataType[ArrayMaxSize];

datatype[ ] var_name=new datatype[array_size];
int[ ] marks=new int[5];// 5 elements

--Array index always starts with zero and ends with (size-1).
--Array always stores in contiguos memory location.
--the moment you define an array with sepicific size, array initizes with default values of that type of array.
* */
public class ArrayTest2 {
    public static void main(String[] args) {
        int[] numbers=new int[10]; //size of this array is 10.
        numbers[2]=33;
        numbers[5]=66;

//        numbers[10]=99;    Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException

        for(int i=0;i<numbers.length;i++)
        {
            System.out.println(numbers[i]);
        }

//        String= default value null
        String[] names=new String[4];
        for(int i=0;i< names.length;i++)
        {
            System.out.println(names[i]);
        }
        boolean[] b=new boolean[4];
        b[2]=true;
        for(int i=0;i< b.length;i++)
        {
            System.out.println(b[i]);
        }
    }
}
