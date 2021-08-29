package com.company.deeps.Challenges;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = new int[] {2,3,4,7,8};
        int target = 7;
        int[] result = new int[2];
        result = twoSum(nums, target);
        System.out.println(result[0] + " and "+ result[1]);
    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int delta = target - nums[i];
            if(numMap.containsKey(delta)){
                return new int[]{i, numMap.get(delta)};
            }
            numMap.put(nums[i], i);
        }
        return new int[]{-1,-1};
    }
}
