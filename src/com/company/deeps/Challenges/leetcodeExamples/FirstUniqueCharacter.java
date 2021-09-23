package com.company.deeps.Challenges.leetcodeExamples;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        //First Unique Character in a String
        //abcdabd
        //a -1
        //b -1
        //c 2s
        //d -1
        //
//        System.out.println(findFirstUniqueCharacter("abcdabd"));
//        System.out.println(isPowerOfThree(9));
//        System.out.println(isPowerOfThree(27));
//        System.out.println(isPowerOfThree(81));
//        System.out.println(isPowerOfThree(6561));
//        System.out.println(containsDuplicate(new int[]{1,2,3,4,5,1}));
//        System.out.println(containsDuplicate(new int[]{11,22,32,42,52,11}));
//        System.out.println(containsDuplicate(new int[]{1,2,3,4}));
//        int[] res = intersect(new int[]{1,2,2,1}, new int[]{2,2});
//        for (int i : res) { System.out.print(i+" "); }

//        int[] res1 = intersect(new int[]{}, new int[]{2,2});
//        for (int i : res1) { System.out.print(i+" "); }

//        int[] res2 = intersect(new int[]{2,3,4}, new int[]{2,2});
//        for (int i : res2) { System.out.print(i+" "); }

        int[] res2 = intersect1(new int[]{4,9,5}, new int[]{9,4,9,8,4});
        for (int i : res2) { System.out.print(i+" "); }

    }
    static int findFirstUniqueCharacter(String s){
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }
        System.out.println(map);
        for (int i = 0; i < s.length(); i++) {
            if(map.get(s.charAt(i)) ==1 ) return i;
        }
        return -1;
    }
    public static boolean isPowerOfThree(int n) {
      while(n > 1) {
          if (n%3 != 0) return false;
          n = n/3;
      }
      return true;
    }
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if(!set.add(nums[i])) return true;
        }
        return false;
    }
    //nums1 = [1,2,2,1], nums2 = [2,2]
    //nums1 = [1,1,2,2], nums2 = [2,2]
    //
    //nums1 = [2,3,4], nums2 = [2,2]
    public static int[] intersect(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null) return new int[]{-1,-1};

        int resLength;
        if (nums1.length <= nums2.length) resLength = nums1.length;
        else resLength = nums2.length;

        int[] res = new int[resLength];
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i =0;int j =0;int k =0;
        while (i < nums1.length && j < nums2.length && k < res.length) {
            if (nums1[i] == nums2[j]) {
                res[k++] = nums1[i];
                i++;j++;
            }
            else if(nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return res;
    }
    public static int[] intersect1(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null) return new int[]{-1,-1};

        ArrayList<Integer> res = new ArrayList<Integer>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i =0;int j =0;int k =0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                res.add(nums1[i]);
                i++;j++;
            }
            else if(nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        int[] ints = new int[res.size()];
        AtomicInteger m = new AtomicInteger();
        res.forEach(num -> {
            ints[m.getAndIncrement()] = num;
        });

        return ints;
    }
    
    public static int[] changeFromArayListToArray(){

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }
       int[] ints = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            ints[i] = arrayList.get(i);
        }
        return ints;
    }
}
