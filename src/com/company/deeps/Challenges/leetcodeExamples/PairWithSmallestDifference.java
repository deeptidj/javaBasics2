package com.company.deeps.Challenges.leetcodeExamples;

public class PairWithSmallestDifference {

    /*
     * To execute Java, please define "static void main" on a class
     * named Solution.
     *
     * If you need more classes, simply define them inline.
     Given two arrays of integers, compute the pair of values (one value in each array) with the smallest (non-    negative) difference. Print the difference and Pair values
      Input : A[] = {l, 3, 15, 11, 2}
              B[] = {23, 127, 235, 19, 8}
      Output : 3
      That is, the pair (11, 8) .
     */
        public static void main(String[] args)
        {
            int a[] = {5, 3, 200, 11, 80} ; //{ 9, 14, 6, 2, 11 };
            int b[] =  {278, 127, 235, 50, 345};  // { 8, 4, 7, 20 };
            int saveA = a[0], saveB= b[0];
            System.out.println("Difference is ");

            int diff, min = Math.abs(a[0] - b[0]);
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b.length; j++) {
                    diff = Math.abs(a[i] - b[j]);
                    System.out.print(diff +" ");
                    if (diff < min) {
                        min  = diff;
                        saveA = a[i];
                        saveB = b[j];
                    }
                }
                System.out.println();
            }
            System.out.println("Min = "+min);
            System.out.println("pair = "+saveA+" "+saveB);
        }

}
