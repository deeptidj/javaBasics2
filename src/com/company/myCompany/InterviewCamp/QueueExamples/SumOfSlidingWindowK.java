package com.company.myCompany.InterviewCamp.QueueExamples;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

/*
Array on integers , find the sum of each sliding window of size k
march 2017
august 2019 | december 2018 | most laid off at this time - jan 2019 My boss left the company -
 */
public class SumOfSlidingWindowK {
    public static void main(String[] args) {
        int k = 3;
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,0};
        sumSlidingWindow(arr, k);
    }

    /*
    You are given stock prices and the corresponding day of each stock price.
    For example:(32, 1), (45, 1), (37,2), (42,3)
     */
    public static void stockPricesMaxLast3Days(int newPrice) {
            Queue q = new LinkedList();


    }

    /*
    Given an array of integers A, find the sum of each sliding window of size K.V
    ariation:​ Instead of an array, what if you were presented with a ​stream​ of numbers. A new numbercan be added anytime. You want to find the sum of the last K elements.Note​: The above problem can be solved without a Queue as well - just maintain a sum with 2pointers. However, a queue is needed for the Variation problem. We use this problem to illustratethe sliding window concept.

     */
    public static void sumSlidingWindow(int[] arr, int k) {
        if (k == 0 )
            throw new IllegalArgumentException("K cannot be zero");

        if (arr == null || arr.length == 0)
            throw new IllegalArgumentException("Array cannot be null or empty");

        Queue<Integer> q = new ArrayDeque();
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
           if (q.size() == k) {
               int last = q.remove();
               sum -= last;
           }
            q.add(arr[i]);
            sum += arr[i];
            if (q.size() == k) System.out.println(sum);
        }

    }
}
