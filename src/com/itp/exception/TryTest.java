package com.itp.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
//exception:  unwanted event that occures during program exceution and distr=urbs the exceution flow.
//why do we need to handle exception..:- to get the graceful output..
//excption handling: - findling alternative ways, whenver exeption arises.
//2 types of excptions:  compile time(checked) and Runtime (un-checked).
//catch block will exceute only when exception arises...
//finally block always exceutes.

//A single block can be follwed by multiple catch blocks, but last catch block must have Main Parent Exception class.


public class TryTest {
    public static void main(String[] args) {
//        FileInputStream fis=new FileInputStream("c:abc.txt");  checked exception
     try
     {
         int[] nums=new int[2];
         nums[0]=10;
         nums[1]=20;
//         nums[2]=30;
//         int a=100/0;

         System.out.println("array elements are as follows:");
         for(int i=0;i<nums.length;i++)
         {
             System.out.println(nums[i]);
         }
     }
     catch(Exception e)
     {
         System.out.println("please enter vaid input");
         e.printStackTrace();

     }
  /*   catch (ArithmeticException ae)  Exception is already caught in first catch, so will get compile time error here at this line
     {

     }*/
     finally
     {
         System.out.println("imp code line no.999");
         System.out.println("imp code line no. 1000");
     }

    }
}
