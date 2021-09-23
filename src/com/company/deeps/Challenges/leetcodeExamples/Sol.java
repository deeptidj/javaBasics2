package com.company.deeps.Challenges.leetcodeExamples;


public class Sol {
    public static void main(String[] args) {
//        String[] ips = "13.32.24.002".split("\\.");
//        System.out.println(ips.length);

        String[] strings = {"hello", "World"};
        for (String s :
                strings) {
            System.out.println(s);
            System.out.println(args[0]);
        }


        boolean res = 17%2 == 0 ? true : false;
        System.out.println(res);

        int number = 8;
        String result = (number > 0) ? "Positive" : "Negative";
        System.out.println(result);
    }
}
