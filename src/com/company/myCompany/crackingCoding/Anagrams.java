package com.company.myCompany.crackingCoding;

import java.util.HashMap;
import java.util.Map;

public class Anagrams {
    public static void main(String[] args) {
        System.out.println("Anagrams");
        String s1 = "abca";
        String s2 = "bcaa";
        if ((s1 == null) || (s2 == null)) System.out.println("strings are null");
        if (s1.isEmpty() || s2.isEmpty()) System.out.println("String are empty");

        boolean res = isAnagrams(s1, s2);
        if (res) System.out.println("Are anagrams") ;
        else System.out.println(" Not Anagrams");;

    }
    public static boolean isAnagrams(String s1, String s2) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            hm.put(s1.charAt(i), hm.getOrDefault(s1.charAt(i),0)+1);
        }

        for(Map.Entry<Character, Integer> entry: hm.entrySet()) {
            System.out.println("Hashmap : "+entry.getKey() + " : "+ entry.getValue());
        }

        for (int i = 0; i < s2.length(); i++) {
            hm.put(s2.charAt(i), (hm.getOrDefault(s2.charAt(i),0) - 1));
        }

        for(Map.Entry<Character, Integer> entry: hm.entrySet()) {
            System.out.println("Hashmap : "+entry.getKey() + " : "+ entry.getValue());
        }

        for(Map.Entry<Character, Integer> entry: hm.entrySet()) {
            if (entry.getValue() != 0) return false;
        }
        return true;
    }


}
