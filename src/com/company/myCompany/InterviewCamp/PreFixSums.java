package com.company.myCompany.InterviewCamp;

import java.util.Arrays;
import java.util.HashMap;

public class PreFixSums {
    public static void main(String[] args) {
//        int[] arr = new int[]{-1,2,1,-4,2,3,-1,2};
//          int[] res = findSubArraysSumsToZero(arr);
//        for (int i : res) {
//            System.out.println(i);
//        }

       // int[] arr1 = new int[]{2,4,-2,1,-3,5,-3};
        int[] arr1 = new int[]{4,2,-5,-2,1,2,5};
        int[] res1 = findSubArraySumsToX(arr1, 3);
        for (int i : res1) {
            System.out.print(i +" ");
        }

    }
    static int[] findSubArraysSumsToZero(int[] arr) {
        int sum =0; int globalMaxSum = Integer.MIN_VALUE; int leftIndex=-1; int rightIndex=-1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            System.out.print(" "+sum);
            if (map.containsKey(sum)) {
                leftIndex = map.get(sum) +1;
                rightIndex = i;
            }
            else {
                map.put(sum, i);
            }
            globalMaxSum = Math.max(globalMaxSum, sum);
        }
        System.out.println();
        System.out.println("Global Sum till = "+globalMaxSum);
        return new int[]{leftIndex, rightIndex};
    }
    /*
    Given an array of positive and negative integers, find a subarray whose sum equals X.

    For example: Input = [2,4,-2,1,-3,5,-3], X = 5 --> Result = [2,4,-2,1]
     */
    static int[] findSubArraySumsToX(int[] arr, int x) {
        if (arr == null || arr.length == 0) return null;

        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == x) {
                return new int[]{0,i};
            }
            if(map.containsKey(sum - x)) {
                return new int[]{map.get(sum-x)+1,i};
            }
            map.put(sum, i);
        }
        return null;
    }

}
