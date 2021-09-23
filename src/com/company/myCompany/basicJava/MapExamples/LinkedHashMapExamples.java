package com.company.myCompany.basicJava.MapExamples;

import java.util.LinkedHashMap;

public class LinkedHashMapExamples {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
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
