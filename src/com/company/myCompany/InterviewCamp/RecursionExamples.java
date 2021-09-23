package com.company.myCompany.InterviewCamp;

public class RecursionExamples {
    public static void main(String[] args) {
        int res = fib(6);
        System.out.println(res);
    }
    /*
    1. Base case
    2. Recursive step

    Stack memory - space complexity - takes more than O(1)

     1, 1, 2, 3 , 5
     n1 = n2 = 1;
     sum=0;;
     while (count == nthElement) {
         sum += n1 + n2 ;
         n1 = n2;
         n2 = sum;
       }
     */
    static int fib(int n) {
        if (n==1 || n==2) return 1;

        return fib(n-1) + fib(n-2);
    }
    /*
    Power Function: Implement a function to calculate X^N. Both X and N can be positiveor negative.
    You can assume that overflow doesn't happen
    For example: 2 ^ 2  = 4 2 ^ -2 = 0.25-2 ^ 3  = -8
     */
}
