package com.itp.arrays;
public class LargestNumberFromArray {
    public static void main(String[] args) {
        int[] numbers=new int[]{10,20,85,63,47,999,34565,7};//Array intializetion
        System.out.println("max number from this array:"+largestNumber(numbers));;//calling function by passing array
        System.out.println("min number from this array:"+minNumber(numbers));
        System.out.println("second largest number from this array:"+secondlargestNumber(numbers));
    }
    private static int secondlargestNumber(int[] numbers) {
        int secondLargest = 0;

        int max=numbers[0];
        for(int i=0;i<numbers.length;i++)
        {
            if (numbers[i] > max) {
                secondLargest = max;
                max = numbers[i];

            } else if (numbers[i] > secondLargest) {
                secondLargest = numbers[i];
            }
        }
        return secondLargest;
    }

    private static int minNumber(int[] numbers) {
        int min=numbers[0];
        for(int i=0;i<numbers.length;i++)
        {
            if (numbers[i] < min)
            {
                min=numbers[i];
            }
        }
        return min;

    }

    private static int largestNumber(int[] numbers) {
        int max=numbers[0];
        for(int i=0;i<numbers.length;i++)
        {
            if (numbers[i] > max)
            {
                max=numbers[i];
            }
        }
        return max;

    }
}
