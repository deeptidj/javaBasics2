package com.company.deeps.Challenges.leetcodeExamples;

import java.util.ArrayList;
import java.util.List;

public class Examples {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");

        addIfStringNotPresent("four", list);
        System.out.println(list);
    }
    public static void addIfStringNotPresent(String s, List<String> list){
        boolean found = false;
        for (String string :list) {
            if(s.trim().equalsIgnoreCase(string)) {
                found = true;
            }
        }
        if (!found) {
            list.add(s);
        }
    }
}
