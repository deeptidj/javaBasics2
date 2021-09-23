package com.company.myCompany.InterviewCamp;

import javax.swing.tree.ExpandVetoException;

public class MaxSumSubArraySlidingWindow {
    public static void main(String[] args) {
        System.out.println("Kadaines algorithms");
        int[] nums = new int[]{1,-7,2,10,-8,5-8};
        System.out.println(maxSubArray(nums));

        System.out.println(maxSubArrayKadanes(nums));
        int[] nums1 = new int[]{1,2,3,-1,5,1,2};

        int[] res = subArraySumTarget(nums1, 8);
        for (int re : res) {
            System.out.print(re+" ");
        }
    }
    public static int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0 )
            throw new IllegalArgumentException("Input Array is empty or null");

        int sum; int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            sum = 0; // 1
            for (int j = i; j < nums.length; j++) { // 1 , 2
                sum += nums[j]; // 1 -7 = -6 + 2 = -4
                max = Math.max(sum, max); // -6, 1 = 1; -4,1= 1;
            }
        }
        return max;
    }
    public static int maxSubArrayKadanes(int[] nums) {
        if (nums == null || nums.length == 0 )
            throw new IllegalArgumentException("Input array is empty or null");
        int max = nums[0]; int currentMax = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentMax = Math.max(nums[i] + currentMax, nums[i]);
            max = Math.max(max, currentMax);
        }

        return max;
    }

    static int[] subArraySumTarget(int[] nums, int targetSum) {
        if (nums == null || nums.length == 0 )
            throw new IllegalArgumentException("Input array is empty or null");
       int left = 0 ; int right = 0 ; int currentSum = 0;
        while ( right < nums.length && left < nums.length) {
            if (currentSum > targetSum) {
                currentSum -= nums[left];
                left++;
            } else if (currentSum < targetSum) {
                currentSum += nums[right];
                right++;
            } else {
                return new int[] {left, right};
            }
        }
        return new int[] {-1, -1};
    }
    /*
    Given a String, find the longest substring with unique characters.
    For example: "whatwhywhere" --> "atwhy"
     */
    static void longestSubString(String s) {

    }

}
