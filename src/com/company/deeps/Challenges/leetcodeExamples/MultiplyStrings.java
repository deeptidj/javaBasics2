package com.company.deeps.Challenges.leetcodeExamples;

public class MultiplyStrings {
    public static void main(String[] args) {
        //System.out.println(multiplyString("4", "5"));
        //System.out.println(multiplyString("410", "598"));
        //System.out.println(multiplyString("0", "5"));
        //System.out.println(multiplyString("41", "598"));
        get1("0");//48
        get1("9");//57
        get1("410");//48
        get1("567");//57
    }
    static String multiplyString(String s1, String s2){
        int res = Integer.valueOf(s1) * Integer.valueOf(s2);
        return String.valueOf(res);
    }

    static void get1(String s) {
        int num =0;
        for (int i = 0; i < s.length(); i++) {
            num = num * 10 + ((int) s.charAt(i)) - 48;
        }
        System.out.println(num);
    }
}
