package com.company.myCompany.InterviewCamp.Recursion;

import java.util.HashMap;

/*
Recursion
1. Base case
2. Recursive step
 */
public class SimpleRecursionProblems {
    /*
    fibonacci

     */
    public static void main(String[] args) {
        int n = 5;
        int res= fib(n);
        System.out.println(res);

        res = fib(n, new HashMap<Integer, Integer>());
        System.out.println(res);

        float result = power(2,8);
        System.out.println(result);
    }
    static int fib(int n){
        if (n == 1 || n ==2) {
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }
    static int fib(int n, HashMap<Integer, Integer> memo){
        if (n == 1 || n ==2) {
            return 1;
        }
        int res= fib(n-1, memo) + fib(n-2, memo);
        memo.put(n, res);
        return res;
    }
    static float power(int x, int power){ //x to power of n

        if (x == 0 && power <= 0) throw new ArithmeticException("Undefined");

        //if (x == 0) throw new IllegalArgumentException("X cannot be zero");
        float  result = positivePower(Math.abs(x),Math.abs(power));

        if (power < 0) {
            result = 1 / positivePower(x, Math.abs(power));
        }
       if (x < 0) {
           result = result * -1;
       }
        return result;
    }
    static int positivePower(int x, int power) { //x to power of n
        if (x == 1) return 1;
        if (power == 1) return x;

        int halfPower = positivePower(x, power/2);
        if (power % 2 == 0) {
            return halfPower * halfPower;
        } else {
            return  halfPower * halfPower * x;
        }

    }

}
