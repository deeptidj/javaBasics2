package com.company.deeps.Challenges.leetcodeExamples;

public class CompressString {
    public static void main(String[] args) {
        String s = "aaabccc";
        System.out.println(compress(s));

    }
    static String compress(String s) {
        //aaabccc => a3b1c3 => a3bc3 (not consistent with other characters) parsing could be tricky
        //dgdg
        //dgdg => d1g1
        //null or "   " or ""

        // a 3
        // b 1
        // c 3
        // O(1) ; HashMap space complexity O(1)

        if (s.trim().isEmpty() || s == null) {
            throw new IllegalArgumentException("Input string is empty or null or just spaces");
        }




        return s;
    }
}
