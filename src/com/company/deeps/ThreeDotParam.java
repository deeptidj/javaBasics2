package com.company.deeps;

public class ThreeDotParam {
    public static void main(String[] args) {
        int res = sumOfParameters(1,2,3,4,5);
        System.out.println(res);
        res = sumOfParameters(1,2,3);
        System.out.println(res);
        res = sumOfParameters(1,2,3,4);
        System.out.println(res);
        res = sumOfParameters(1,2,3,4,5);
        System.out.println(res);
    }
    public static int sumOfParameters (int ...  a) {
        int sum = 0;
        for (int i : a) {
            sum = sum + i;
        }
        return sum;
    }
}
