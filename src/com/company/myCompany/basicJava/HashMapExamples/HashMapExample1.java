package com.company.myCompany.basicJava.HashMapExamples;

import com.company.myCompany.basicJava.BinaryTreeExamples.Tree;

import java.util.*;

public class HashMapExample1 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("one", 1);
        hm.put("two", 2);

        hm.forEach( (str,i) -> {
            System.out.println(str+ " " +i);
                }
        );
        HashMap<Character, Integer> hm1 = new HashMap<>();




        String s = "deepti"; //count of characters in hashmap

        for (Character c : s.toCharArray()) {
            hm1.put(c, hm1.getOrDefault(c, 0)+1 );
        }

        hm1.forEach( (c,i) -> {
                    System.out.println(c+ " is present " +i + " times.");
                }
        );



       s = "deepti"; //remove dups
        //HashMap<Character, Integer> hm2 = new HashMap<>();
        Set<Character> set1 = new LinkedHashSet<>();
        for (Character c : s.toCharArray()) {
           set1.add(c);
        }
        StringBuffer sb = new StringBuffer();
        set1.forEach(c -> {
            sb.append(c);
        });
        System.out.println("Version with out dups "+sb.toString());



    }
}
