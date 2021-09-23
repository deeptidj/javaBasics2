package com.company.myCompany.InterviewCamp;

public class PartioningArrays {
    public static void main(String[] args) {
        System.out.println("Partioning Arrays");
        int[] nums = new int[]{5,2,4,4,6,4,4,3};
        rearrangePivot(nums,4);
        System.out.println();
        for (int i : nums) {
            System.out.print(i);
        }
    }
    /*
    You are given an array of integers and a pivot.
    Rearrange the array in the following order:[all elements less than pivot, elements equal to pivot,
    elements greater than pivot]For example,a = [1,2,4,4,6,4,4,3] and pivot = 4 --> result = [3,2,4,4,4,4,5,6]
     */
    static void rearrangePivot(int[] nums, int pivot) {
        int left=0; int right = nums.length-1;
        for (int i = 0; i < nums.length; i++) {// i = 1
            if (nums[i] > pivot) {
                swap(nums,i,right); //[5,2,4,4,6,4,4,3] ==> 5 > 4 ==> [2,5,4,4,6,4,4,3]
                left++;
            } else if (nums[i] < pivot) {
                swap(nums,i, left); //[1,2,4,4,6,4,4,3] ==> 1 < 4 ==> [1,2,4,4,6,4,4,3] //left = 2
            }
        }
    }

    /*
        Interview camp dutch national interview camp
     */
    public static void dutchNationalFlag(int[] a, int pivot) {
        int low_boundary = 0, high_boundary = a.length - 1;
        int i = 0;
        while (i <= high_boundary) {
            if (a[i] < pivot) {
                swap(a, i, low_boundary);
                low_boundary++;
                i++;        }
            else if (a[i] > pivot) {
                swap(a, i, high_boundary);
                 high_boundary--;
                } else {
                i++;
            }
        }}

    /*
    Given an array with n marbles colored Red, White or Blue,
    sort them so that marbles of the same color are adjacent,
    with the colors in the order Red, White and Blue.
    Assume the colors are given as numbers - 0 (Red), 1 (White) and 2 (Blue).
    For example, if A = [1,0,1,2,1,0,1,2], Output = [0,0,1,1,1,1,2,2].
    */
    static void sortMarbles1() {
        int[] arr  = new int[]{1, 0, 1, 2, 1, 0, 1, 2};

        int red = 0; int blue = arr.length-1;
        for (int i = 0; i < arr.length; i++) {

        }
    }

    /*
    You are given an array of integers. Rearrange the array so that all zeroes are at the beginning of the array.
    For example, [4,2,0,1,0,3,0] -> [0,0,0,4,1,2,3]
    For example, [0,0,2,0,0,7,3,8] -> [0,0,0,4,1,2,3]
     */
    static int[] moveZeroesToBeginning(int[] nums) {
        if (nums == null || nums.length == 0) return nums;

        int boundary = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                swap(nums, i, boundary);
                boundary++;
            }
        }

        return nums;
    }
    /*
    Given an array of integers, rearrange the elements such that all zeros are moved to the end of the array.
    For example, [4,2,0,1,0,3,0] -> [4,1,2,3,0,0,0]
     */
    static void moveZeroesToEnd(int[] nums) {
        if (nums == null || nums.length == 0) return;

        int boundary = nums.length -1;
        for (int i = nums.length -2 ; i >= 0; i--) {
            if (nums[i] == 0) {
                swap(nums, i, boundary);
                boundary--;
            }
        }

    }
    static void swap(int[] nums, int i, int boundary) {
        int temp;
        temp = nums[boundary];
        nums[boundary] = nums[i];
        nums[i] = temp;
    }
    /*
    Given an array with n marbles colored Red, White or Blue, sort them so that marbles of the same color are adjacent,
    with the colors in the order Red, White and Blue.
    Assume the colors are given as numbers - 0 (Red), 1 (White) and 2 (Blue).
    For example, if A = [1,0,1,2,1,0,1,2], Output = [0,0,1,1,1,1,2,2].
     */
    static void sortMarbles() {

    }
}
