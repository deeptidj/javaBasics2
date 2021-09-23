package com.company.myCompany.basicJava.MapExamples;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TreeMapExamples {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "sdfsdf");
        map.put(21, "yyysdfsdf");
        map.put(61, "tttsdfsdf");
        map.put(31, "rrrsdfsdf");
        map.put(0, "sdfsdsdfsdf");
        System.out.println();
        map.forEach((i,str) -> {
            System.out.print(i+" => "+str+" ");
        });
    }
}
