package com.company.deeps.Challenges.leetcodeExamples;

public class HappyNumber {

    public static void main(String[] args) {
//        int[] arr = new int[]{19,82,2};
//        for(int i: arr) {
//            System.out.println(isNumberHappy(i));
//        }
    isNumberHappy(19);
    }
    /*
    Write an algorithm to determine if a number n is happy.
    A happy number is a number defined by the following process:

   starting with any positive integer,
   replace the number by the sum of the squares of its digits.
    Repeat the process until the number equals 1 (where it will stay),
    or it loops endlessly in a cycle which does not include 1.
    Those numbers for which this process ends in 1 are happy.
    Return true if n is a happy number, and false if not.

    Input: n = 19
    Output: true

     */
    static boolean isNumberHappy(int n) {
        int remainder; int sum ;int count = 10;
        while(count >= 0) {
            sum = 0;
            while (n > 0) {
                remainder = n % 10;
                sum = sum + (remainder * remainder);
                System.out.print(sum+" ");
                n = n / 10;
                count--;
            }
            if (sum == 1) return true;
            else n = sum;
        }
        return false;
    }
}
