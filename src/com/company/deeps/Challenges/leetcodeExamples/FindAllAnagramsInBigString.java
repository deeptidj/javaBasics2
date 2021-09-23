package com.company.deeps.Challenges.leetcodeExamples;

import java.util.HashMap;

public class FindAllAnagramsInBigString {
    public static void main(String[] args) {
        System.out.println("Find all anagrams of String 1 in the big string and record the starting indices in an array and return it.");

        String p1 = "cab";
        String s = "abcdebacb";
        int[] result = findAllAnagramsInBigString(p1, s);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
    static int[] findAllAnagramsInBigString(String p1, String s) {
        int[] res = new int[10]; //assuming that no anagrams are present in the big string.
        HashMap<Character, Integer> pMap = new HashMap<>();
        HashMap<Character, Integer> sMap = new HashMap<>();

        pMap = putStringInHashMap(p1);
        int count = 0;

        for (int i = 0; i <= s.length() - p1.length(); i++) {
            System.out.println( "===============================  " +i+"  ===============================");
            String sub = s.substring(i,i+p1.length());
            System.out.println("SubString = "+sub);
            sMap = putStringInHashMap(sub);
            if(equalMaps(pMap, sMap)) {
                res[count++] = i;
            }
        }
        System.out.println("=============================================================================");
        return res;
    }

    static HashMap<Character, Integer> putStringInHashMap(String p1) {
        HashMap<Character, Integer> pMap = new HashMap<>();
        for (int i = 0; i < p1.length(); i++) {
            pMap.put(p1.charAt(i), pMap.getOrDefault(p1.charAt(i), 0)+1);
        }
        System.out.println(pMap);
        return pMap;
    }

    static boolean equalMaps(HashMap<Character, Integer> h1, HashMap<Character, Integer> h2) {
        System.out.println(h1.equals(h2));
        return h1.equals(h2);
    }
}
