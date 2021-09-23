package com.company.myCompany.basicJava.SetExamples;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

        Set<Integer> d2 = new TreeSet<>(Arrays.asList(1,2,3,4,5,6,22,11,2122,3434));
        d2.forEach(d -> {
            System.out.print(d+ " | ");
        });

        System.out.println();

        for(Integer i : d2) {
            System.out.println("Values in Treeset = "+i);
        }

        System.out.println("Convert to array");

        //int[] arr = new int[d2.size()];
        Integer[] arr = new Integer[d2.size()];
        d2.toArray(arr);

        System.out.println("Descending array");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(i+" ");
        }

        Iterator<Integer> iterator = d2.iterator();
        while (iterator.hasNext()){
            System.out.println("tree map in ascending order = "+iterator.next());
        }

    }
}
