package com.company.deeps.Challenges.leetcodeExamples;

import java.util.HashMap;
import java.util.HashSet;

public class FindLongestSubArrayBySum {
    public static void main(String[] args) {
        // INCORRECT SOLUTION INCOMPLTETE SOLUTION
        /*
        1. Array [1 2 3 7 5]
        2. sum = 12
        3. result 7 5 or 2 3 7 -> boundaries(indices) of the subarray needs to be returned.
        Arr = {1,2,3,4,5,0,0,0,0,6,7,8,9,10}
        sum = 15
        result 0,4

        nums = {8,0,1}; targetSum = 8;
        nums = {8,1}; targetSum = 8;

         */

        int[] nums = new int[]{1,2,3,4,5,0,0,0,0,6,7,8,9,10};
        int targetSum = 15;

        // int[] nums = new int[]{8, 0, 1};
        // targetSum = 8;

        //int[] nums = new int[]{2,6,1};
       // int targetSum = 8;

        int[] result = longestSubArrayBySum(nums, targetSum);
        System.out.println(result[0] +" "+result[1]);
    }
    public static int[] longestSubArrayBySum(int[] nums, int targetSum) {
        int currentSum = 0 ;
        int left = 0;
        int right = 0;
        int[] result = new int[]{-1, -1};

        while(right < nums.length) {
            currentSum += nums[right++];
            while(left < right && currentSum > targetSum) {
                currentSum -= nums[left++];
            }
            if ((currentSum == targetSum) && ((result[1] - result[0]) < (right-left) || result.length == 1)) {
                return new int[] {left, right};
            }

        }
        return result;
    }

    public static class LongestSubString {
        public static void main(String[] args) {
            System.out.println("longests subsstring");
            /*
            Input: s = "abcabcbb"
            Output: 3
            Explanation: The answer is "abc", with the length of 3.
             */
            String s = "abcabcbb";
            s = "pwwkew";
            //s = "bbb";
            HashMap<Character, Integer> map = new HashMap<>();
            int n = s.length(), ans = 0;
            //current index of character
            for (int j = 0, i = 0; j < n; j++) {
                if (map.containsKey(s.charAt(j))) {
                    i = Math.max(map.get(s.charAt(j)), i);
                }
                ans = Math.max(ans, j - i + 1);
                map.put(s.charAt(j), j + 1);
            }
            System.out.println(ans);





        }


        public static boolean isPresent(HashSet<Character> hs, Character character){

            return true;
        }

    }
}
