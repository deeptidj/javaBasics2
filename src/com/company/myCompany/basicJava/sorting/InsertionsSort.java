package com.company.myCompany.basicJava.sorting;

public class InsertionsSort {
    public static void main(String[] args) {
        int[] arr = {1,7,3,2,6};
        insertionSort(arr);
        print(arr);
    }
    public static void insertionSort(int[] nums) {
        for (int i = 1; i < nums.length-1; i++) {
            int j = i+1;
            while( (j>0) && nums[j-1] > nums[j]) {
                int t = nums[j-1];
                nums[j-1] = nums[j];
                nums[j] = t;
                j--;
            }
        }
    }
    public static void print(int[] nums) {
        for (int i : nums) {
            System.out.print(i+ "\t");
        }
        System.out.println();
    }
}
