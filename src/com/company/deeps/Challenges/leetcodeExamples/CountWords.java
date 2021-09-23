package com.company.deeps.Challenges.leetcodeExamples;
import java.util.*;
/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */
public class CountWords {
    static String[][] synonyms = {
            {"hot", "warm"},
            {"warm", "sizzling"},
            {"cold", "cool"},
           {"icy", "cold"}
    };

    public static void main(String[] args) {
        String str = "warm cold hot HOT icy sizzling COLD warm day";
        Map<String, Integer> words = countWords(str);
        System.out.println(words);
        Map<String, Integer> res = countWordsWithSynonyms(words,synonyms);
        System.out.println(res);

    }
    /*
     * Q1 - For the given input string, return a map of case insensitive
     * words and their counts. Do not worry about punctuation or special
     * characters.
     */
    public static Map<String, Integer> countWords(String input) {
        HashMap<String, Integer> map = new HashMap<>();
        String[] strs = input.split(" ");
        for (String s : strs) {
            map.put(s.toLowerCase(), map.getOrDefault(s.toLowerCase(),0)+1);
        }
        return map;
    }

    public static Map<String, Integer> countWordsWithSynonyms(
            Map<String, Integer> wordMap,
            String[][] synonyms)
    {
        HashMap<String, Integer> newWordMap = new HashMap<>();

        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            String s = entry.getKey();
            Integer val = entry.getValue();
            int newVal = val;
            for (int i = 0; i < synonyms.length; i++) {
                boolean presentInRow = false;
                ArrayList<String> synonymsOfWordSet = new ArrayList<>();
                for (int j = 0; j < synonyms[i].length; j++) {
                    synonymsOfWordSet.add(synonyms[i][j]);
                    if (s.equalsIgnoreCase(synonyms[i][j])) {
                        presentInRow = true;
                    }
                }
                if(presentInRow) {

                    for (String word : synonymsOfWordSet) {
                        if(!word.equalsIgnoreCase(s)) {
                            newVal = newVal+ wordMap.getOrDefault(word, 0);
                        }
                    }

                }
            }
            newWordMap.put(s,newVal);
        }

        return newWordMap;
    }
}
