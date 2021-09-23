package com.company.myCompany.educativeCoderust;

import javax.swing.plaf.IconUIResource;
import java.util.ArrayDeque;
import java.util.Deque;

public class MaxSlidingWindow {
    /*
    Given a large array of integers and a window of size w,
    find the current maximum value in the window as the window slides through the entire array.
     */
    public static void main(String[] args) {
        int[] arr = new int[]{-4,2-5,3,6};
        int windowSize = 3;
        
        int[] res = new int[5];
        Deque<Integer> deque = new ArrayDeque<>(); int i = -1;



            int left;
            int right;
            int currentMax;
            do {
                left = i+1;
                right = left + windowSize;
                currentMax = arr[left]; // -4
                while (left < right) { // 0 < 3; 2 < 3 ; 3<3
                    currentMax = Math.max(currentMax, arr[left]); // -4,2 => 2 ; 2,-5 => 2;
                    left++; // 2 , 3
                }
                deque.add(currentMax);
            } while (right<arr.length);

        System.out.println(deque.stream().count());
        deque.forEach( t -> {
                    System.out.println(t);
        }
        );
    }
}
