package com.itp.arrays;

public class ArrayTest3 {
    public static void main(String[] args) {
        int[] nums1=new int[]{11,222,3,4,5};
        int[] nums2=new int[]{1,2,3,4,5};
        int[] result=new int[nums1.length];
        for(int i=0;i<nums1.length;i++)
        {
          result[i]=nums1[i]+nums2[i];
        }
        for(int i=0;i<nums1.length;i++)
        {
            System.out.println(result[i]);
        }
        findLargestElement(nums1);
    }

    private static void findLargestElement(int[] nums1) {

        int temp=nums1[0];
        for(int i=0;i<nums1.length;i++)
        {
         if(temp<nums1[i])
            temp=nums1[i];
        }
        System.out.println("largest :"+temp);
    }
}
