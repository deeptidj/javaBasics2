package com.company.deeps.Challenges.leetcodeExamples;

import javax.swing.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class EasyHashTableChallenges {
    public static void main(String[] args) {
        int[] res = new int[5];
        res[0] = majorityElement(new int[]{2,2,2,2,2,2,3,4,5,6});
        res[1] = majorityElement(new int[]{1,1,1,1,1,2,2});
        res[2] = majorityElement(new int[]{3,2,3,6,7,7,7,7,7,7,7,7,7});
        res[3] = majorityElement(new int[]{0,1,2,3,4,5});
        res[4] = majorityElement(new int[]{-3,12,-3, -3, -3, -3});
        for (int i : res) {
            System.out.println(" majority = "+i);
        }
    }
    /*
    Given an array nums of size n, return the majority element.

    The majority element is the element that appears more than
 ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

    Example 1:

    Input: nums = [3,2,3]
    Output: 3
    Example 2:

    Input: nums = [2,2,1,1,1,2,2]
    Output: 2
     */
    static int majorityElement(int[] arr){
        if(arr == null || arr.length ==0) return -1;
        int n = arr.length; //10
        System.out.println("Length "+ arr.length);

        int count = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }

        System.out.println(map);
        AtomicInteger majorityElement = new AtomicInteger(-1);
        map.entrySet().forEach((i -> {
            if(i.getValue() >= n/2) majorityElement.set(i.getKey());
        }));

        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<Integer, Integer>> iterator = entries.iterator();

        int majority = -1;
        while(iterator.hasNext()) {
            Map.Entry<Integer, Integer> entry =  iterator.next();
            if (entry.getValue() >= n/2) majority = entry.getKey();
        }

        return  majority;
       // return majorityElement.get();
    }

}
