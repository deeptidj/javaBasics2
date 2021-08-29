package com.company.myCompany.basicJava.leetcodeExamples;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubString {
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
