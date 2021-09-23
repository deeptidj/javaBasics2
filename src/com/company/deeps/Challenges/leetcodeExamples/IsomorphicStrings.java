package com.company.deeps.Challenges.leetcodeExamples;

import java.util.HashMap;

public class IsomorphicStrings {
    public static void main(String[] args) {
//        String s1 = "egg";
//        String s2 = "adg";
//        String s1 = "";
//        String s2 = "";
        String s1 = "paper";
        String s2 = "title";
        System.out.println(areStringsIsomorphic(s1,s2));
    }
    static boolean areStringsIsomorphic(String s1, String s2) {
        if (s1 == null || s2 == null ||(s1.length() != s2.length()) ) {
            throw new IllegalArgumentException("Input not valid");
        }
        if (s1.isBlank() || s2.isBlank() || s1.isEmpty() || s2.isEmpty()) {
            return false;
        }
        HashMap<Character, Character> mapping = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            if (mapping.containsKey(s1.charAt(i))) {
                if (mapping.get(s1.charAt(i)) != s2.charAt(i)) return false;
            }
            mapping.putIfAbsent(s1.charAt(i),s2.charAt(i));
        }
        /*
        e a
        g d
         */
        return true;
    }
}
