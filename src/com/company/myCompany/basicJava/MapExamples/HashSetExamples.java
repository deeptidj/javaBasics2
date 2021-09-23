package com.company.myCompany.basicJava.MapExamples;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetExamples {
    public static void main(String[] args) {
        String s = "deepti"; //remove dups
        Set<Character> set1 = new LinkedHashSet<>();
        for (Character c : s.toCharArray()) {
            set1.add(c);
        }
        StringBuffer sb = new StringBuffer();
        set1.forEach(c -> {
            sb.append(c);
        });
        System.out.println("Version with out dups "+sb.toString());

        Set<Character> set = new LinkedHashSet<>();
        set.add('a');


        HashSet hs1 = new LinkedHashSet();
        String s1 = "abcdefgh";
        for(Character c: s1.toCharArray()) {
            hs1.add(c);
        }
        System.out.println(hs1);



    }
}
