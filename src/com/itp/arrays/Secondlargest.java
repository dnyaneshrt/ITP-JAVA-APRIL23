package com.itp.arrays;

import java.util.Arrays;

public class Secondlargest {
    public static void main(String[] args) {
        int[] nums=new int[]{34,55,23,99,43,10,88,45,65,87};

      /*  Arrays.sort(nums);
        System.out.println(nums[nums.length-2]);*/

        Arrays.sort(nums);
        System.out.println(nums[0]);

        //largest : 88
        //secondLargest: 45
       int max=nums[0];
       int secondLargest=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>max)
            {
                secondLargest=max;
                max=nums[i];
            }else if(secondLargest<nums[i])
            {
                secondLargest=nums[i];
            }
        }
        System.out.println("max value: "+max);
        System.out.println("2nd max value: "+secondLargest);
    }
}
