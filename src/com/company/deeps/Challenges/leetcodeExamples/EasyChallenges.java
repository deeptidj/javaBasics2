package com.company.deeps.Challenges.leetcodeExamples;

import java.util.HashMap;

public class EasyChallenges {

    public static void main(String[] args) {

        int num =  2561;
        System.out.println(isPowerOF4(num));

        int max = Integer.MAX_VALUE;
        System.out.println(max);
        int rev = (int) reverseNumber(max);
        System.out.println("Reverse of Number :" +max + " is = "+rev);

//         rev = (int) reverseNumber(max);
//        System.out.println("Reverse of Number :" +max + " is = "+rev);
//
//        long rev1 = reverseNumber(max);
//        System.out.println("Reverse of Number :" +max + " is = "+rev);

        //System.out.println(detectCapitalUsage("ABCD"));
    }

    private static int reverseNumber(int n) {
        int rem =0 ; long rev = 0 ;
        while(n>0) {
            rem = n%10;
            rev = rev*10 + rem;
            n = n/10;
            if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
                return 0;
            }
        }
        return (int)rev;
    }
    static void integerToRoman(int n){
        String str = "VII"; //7
        str = "IV";//4
        //42 = IVII
        HashMap<Character, Integer> h = new HashMap<>();
        h.put('I',1);
        h.put('I',1);
    }
    static boolean isPowerOF4(int num) {
        //16 => 4*4 = 16
        int res=1;
        for (int i = 0; i < num; i++) {
            res = res *4;
            if(res == num) return true;
        }
        return false;
    }
    static boolean detectCapitalUsage(String s) {
        //1. all capitals
        //2. first letter is capital and all remaining are lower cases
        //3. all lower
        char c = 'a';
        boolean firstLetterCap = false;
        boolean allCaps = false;
        boolean allLower = false;

        System.out.println((int) c);
        for (int i = 0; i < s.length(); i++) {
            if (((int) s.charAt(i)) >= 65 && ((int) s.charAt(i)) <= 91)
            {

                allCaps = true;
            }
            else if (((int) s.charAt(i)) >= 97 && ((int) s.charAt(i)) <= 123)
            { allLower = true;}

        }
        System.out.println(c);
        return true;
    }

}
