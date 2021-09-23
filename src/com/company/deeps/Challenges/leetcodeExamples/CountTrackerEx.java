package com.company.deeps.Challenges.leetcodeExamples;
import java.util.*;
//Your implementation here.
class CountTracker<T> {
    //Increment the count for the key if known, else set it to 1.
    public void increment(T key) {
    }
    //Get and clear the counts accumulated so far
    public Map<T,?> getAndClearCounts() {
        Map<T,Integer> k = new HashMap<>();
        return k;
    }
}
class Solution {
    public static void main(String[] args) {
        CountTracker<String> countTracker = new CountTracker<>();
        countTracker.increment("foo");
        countTracker.increment("foo");
        countTracker.increment("bar");
        Map<String, ?> counts = countTracker.getAndClearCounts();
        System.out.println("Map has 2 keys? " + (2 == counts.size()));
       // System.out.println("foo was counted twice? " + (2 == counts.getOrDefault("foo", 0)));
        // System.out.println("bar was counted once? " + (1 == counts.getOrDefault("bar", 0)));
        countTracker.increment("foo");
        countTracker.increment("world");
        counts = countTracker.getAndClearCounts();
        System.out.println("Map has 2 keys? " + (2 == counts.size()));
        //System.out.println("foo was counted once? " + (1 == counts.getOrDefault("foo", 0)));
        //System.out.println("world was counted once? " + (1 == counts.getOrDefault("world", 0)));
    }
}
public class CountTrackerEx {
}
