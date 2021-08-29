package com.company.deeps;

import java.util.HashMap;

public class TimesWordIsPresentInSuppliedLetters {
        //public static HashMap<Character,Integer> h = new HashMap<>();
        /*
         * Question: How many times can the word be made using the supplied letters?
         *
         * Ex 1: word = "car",      letters = "car",        output = 1
         * Ex 2: word = "car",      letters = "ca",         output = 0
         * Ex 3: word = "car",      letters = "carr",       output = 1
         * Ex 4: word = "car",      letters = "carcar",     output = 2
         * Ex 5: word = "aaccerr",  letters = "racecar",    output = 1
         * Ex 6: word = "car",      letters = "racecar",    output = 2
         * Ex 7: word = "aa",       letters = "aaaaaa",     output = 3
         *
         */
        public static void main(String[] args) {
            System.out.println(howManyTimes("bb", "aaaaaa") + " = 0 ");
            System.out.println(howManyTimes("bb", "b") + " = 0 ");
            System.out.println(howManyTimes("car", "car") + " = 1 ");
            System.out.println(howManyTimes("car", "ca") + " = 0 ");
            System.out.println(howManyTimes("car", "carr") + " = 1 ");
            System.out.println(howManyTimes("car", "carcar") + " = 2 ");
            System.out.println(howManyTimes("aaccerr", "racecar") + " = 1 ");
            System.out.println(howManyTimes("car", "racecar") + " = 2 ");
            System.out.println(howManyTimes("aa", "aaaaaa") + " = 3 ");
        }
        public static int howManyTimes(String word, String letters) {
            HashMap<Character,Integer> h = new HashMap<>();
            int noOfTimes =0;
            for (int i = 0; i < letters.length(); i++) {
                h.put(letters.charAt(i), h.getOrDefault(letters.charAt(i),0)+1);
            }

            boolean AreAllLetterPresent = false;
            boolean anotherRound = true;
            int count = 1;
            while(anotherRound) {
                for (int i = 0; i < word.length(); i++) {
                    if (h.get(word.charAt(i)) == null) {
                        return noOfTimes;
                    } else if (h.get(word.charAt(i)) <= 0) {
                        anotherRound = false;
                        AreAllLetterPresent = false;
                    } else if (h.get(word.charAt(i)) > 0) {
                        AreAllLetterPresent = true;
                        h.put(word.charAt(i), (h.get(word.charAt(i)) - 1));
                        anotherRound = true;
                    }
                }
                if (AreAllLetterPresent) noOfTimes++;
            }
            return noOfTimes;
        }

}
