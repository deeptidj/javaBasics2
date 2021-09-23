package com.company.myCompany.basicJava.SetExamples;

import java.util.*;

public class LinkedHashSetExample {
    /*
    Maintains the insertions order.

     */
    public static void main(String[] args) {
        LinkedHashSet<String> list = new LinkedHashSet<>();

        list.add("zz");
        list.add("aa");
        list.add("gg");
        list.add("h");
        list.add("k");
        list.add("l");

        list.forEach(str -> {
            System.out.print(str+" ");
        });

        Iterator<String> ite = list.iterator();
        System.out.println();
        while(ite.hasNext()) {
            System.out.print(ite.next()+" ");
        }
        System.out.println();

        TreeSet<String> tList = new TreeSet<>();

        list.forEach(str -> {
            tList.add(str);
        });

        tList.forEach(t -> {
            System.out.print(t +" ");
        });

        NavigableSet<String> navSet = tList.descendingSet();
        Iterator<String> iter = navSet.iterator();
        System.out.println();
        while(iter.hasNext()){
            System.out.print(iter.next()+ " ");
        }
        System.out.println();
        LinkedHashSet<Integer> integers = new LinkedHashSet<>(Arrays.asList(1,2,3,4,5));
        integers.forEach(i -> {
            System.out.print(i+" ");
        });

        System.out.println();
        LinkedHashSet<String> strings = new LinkedHashSet<>(Arrays.asList("sdfsdf", "zzzz", "aaaaadfsw"));
        strings.forEach(str -> {
            System.out.print(str + " ");
        });



    }
}
