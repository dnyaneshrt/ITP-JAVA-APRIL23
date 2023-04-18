package com.itp.arrays;

public class BubbleSortTest {
    public static void main(String[] args) {
        int[] nums=new int[]{34,45,23,43,10,88,5};

        System.out.println("array before sorting");
        for(int i=0;i< nums.length;i++)
        {
            System.out.println(nums[i]);
        }
        int[] sortedArray= sortAsc(nums);
        System.out.println("array after sorting in ASc");
        for(int i=0;i< sortedArray.length;i++)
        {
            System.out.println(sortedArray[i]);
        }
        int[] sortedDescArray= sortDesc(nums);
        System.out.println("array after sorting in desc");
        for(int i=0;i< sortedDescArray.length;i++)
        {
            System.out.println(sortedDescArray[i]);
        }
        int[] nums2=new int[]{55,78,88,1,5,1,52,1,5};
        int[] sortedNums2= sortAsc(nums2);
        System.out.println("array after sorting in asc soredNums2");
        for(int i=0;i< sortedNums2.length;i++)
        {
            System.out.println(sortedNums2[i]);
        }
    }

    private static int[] sortDesc(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j< nums.length-1-i;j++)
            {

                if(nums[j]<nums[j+1])
                {
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        return nums;
    }
    private static int[] sortAsc(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length-1-i;j++)
            {
                if(nums[j]>nums[j+1])
                {
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        return nums;
    }
}
