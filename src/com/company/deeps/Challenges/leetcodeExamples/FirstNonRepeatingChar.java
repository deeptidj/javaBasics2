package com.company.deeps.Challenges.leetcodeExamples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        System.out.println("First non repeating character");
        String s = "aabcdefghbdefghci";
        System.out.println(firstNonRepeatingCharPositionEff(s));
    }
    static char firstNonRepeatingChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            boolean seenDup = false;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j) && (i!=j)) {
                    seenDup = true;
                }
            }
            if (!seenDup) {
                System.out.println("Non Duplicating character = "+s.charAt(i));
                return s.charAt(i);
            }
        }
        return '_';
    }

    static int firstNonRepeatingCharPositionEff(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i)))  {
                map.put(s.charAt(i), -1); //-1 means that it is repeating character.
            } else {
                map.put(s.charAt(i), i);
            }
        }
        System.out.println(map);
        int min = s.length()-1;
        Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<Character, Integer>> ite = entrySet.iterator();
        while(ite.hasNext()){
            Map.Entry<Character, Integer> entry = ite.next();
            if(entry.getValue() != -1) {
                min = Math.min(min, entry.getValue());
            }
        }
        System.out.println(s.charAt(min));
        return min;
    }
}
