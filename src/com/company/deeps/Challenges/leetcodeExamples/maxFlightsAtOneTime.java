package com.company.deeps.Challenges.leetcodeExamples;

import java.util.Collection;
import java.util.HashMap;

public class maxFlightsAtOneTime {
    public static void main(String[] args) {
        int[] f1 = {2,8};
        int[] f2 = {3,5};
        int[] f3 = {4,10};

        HashMap<Integer, Integer> h = new HashMap<>();
        int start = f1[0];
        int end = f1[1];

        for (int i = start; i < end; i++) {
            h.put(i,h.getOrDefault(i,0)+1);
        }
         start = f2[0];
         end = f2[1];

        for (int i = start; i < end; i++) {
            h.put(i,h.getOrDefault(i,0)+1);
        }
         start = f3[0];
         end = f3[1];

        for (int i = start; i < end; i++) {
            h.put(i,h.getOrDefault(i,0)+1);
        }

        System.out.println(h);

        Collection<Integer> l = h.values();
        int m = 0;
        for (Integer i :
                l) {
            //System.out.println(i);
            m = Math.max(i,m);
        }

        System.out.println(m);
    }
}
