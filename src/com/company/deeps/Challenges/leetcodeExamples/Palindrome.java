package com.company.deeps.Challenges.leetcodeExamples;

import java.util.Locale;

public class Palindrome {

    public static void main(String[] args) {
        int n = 12344321;
        System.out.println(isPalindrome(n));
        System.out.println(isPalindrome1(n));


        n = 98;
        System.out.println(isPalindrome(n));
        System.out.println(isPalindrome1(n));
    }
    static public boolean isPalindrome(int x) {
        int reverse = x;
        int n = 0;int rem;
        while(x > 0){
            rem = x % 10; // 3; 2
            n = (n*10) + rem ;// n = 30 + 20
            x = x/10;// x => 12
        }
        System.out.println(n);
        if(reverse == n) return true;
        else return false;
    }
    static boolean isPalindrome1(int n) {
        int copyN = n ;
        String s = String.valueOf(n).toLowerCase();
        int end = s.length()-1; int i = 0 ;
        while(i < end) {
            if (s.charAt(i) != s.charAt(end)) return false;
            i++; end--;
        }
        return true;
    }
}
