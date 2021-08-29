package com.company.myCompany.basicJava.sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {2,6,4,5,1};
        print(nums);
        selectionSort(nums);
        print(nums); //prints sorted array ?
        //understand the static methods have static variable - are they in the same area ?

    }
    public static void print(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + "\t");
        }
        System.out.println();
    }
    public static void selectionSort(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int min = i ;
            for (int j = i+1; j < nums.length; j++) {
                if(nums[j] < nums[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int tmp = nums[i];
                nums[i] = nums[min];
                nums[min] = tmp;
            }
        }
        print(nums);
    }


}
