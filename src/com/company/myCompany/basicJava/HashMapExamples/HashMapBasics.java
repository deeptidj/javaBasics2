package com.company.myCompany.basicJava.HashMapExamples;

import java.util.*;

public class HashMapBasics {
    public static void main(String[] args) {
        HashMap<String,Integer> hs = new HashMap<String,Integer>();
        hs.put("one", 1);
        hs.put("two", 2);
        hs.put("three", 3);
        hs.put("four", 4);
        hs.put("five", 5);
        System.out.println(hs);
        hs.putIfAbsent("six",6);
        System.out.println("6 should be addded" +hs);
        hs.put("four", 40);
        System.out.println("put if absent one 1");
        hs.putIfAbsent("one", 10);
        System.out.println(hs);
        hs.putIfAbsent("seven", 7);
        System.out.println("put again one 1");
        hs.put("one",100);
        System.out.println(hs);

        Set<Map.Entry<String, Integer>> entries = hs.entrySet();
        entries.forEach(entry -> {
            System.out.println(" Values of the map in a set "+ entry.toString());
        });

        for (Map.Entry<String, Integer> s :
                entries) {
            System.out.println(s);
        }
        Set<String> hsKeys = hs.keySet();
        System.out.println(hsKeys);
        Collection<Integer> hsValues = hs.values();
        System.out.println(hsValues);
        Map<String, String> countryISOCodeMapping = new HashMap<>();

        //Iterating over the hash map using lambda
        hs.forEach((str, i) -> {
            System.out.println(str + " ==> "+ i);
        });
        System.out.println();


        //Iterating hashmap using the iterator
        Set<Map.Entry<String, Integer>> hsSet = hs.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = hsSet.iterator();
        while(iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey()+ " ==> "+entry.getValue());
        }

        System.out.println();

        countryISOCodeMapping.put("India", "InDiA");
        countryISOCodeMapping.put("United States of America", "US");
        countryISOCodeMapping.put("Russia", "RU");
        countryISOCodeMapping.put("Japan", "JP");
        countryISOCodeMapping.put("China", "CN");
        countryISOCodeMapping.put("India", "IN"); //this will over write the existing value while putIfAbsent
        // will out it in only f it is absent.

        // HashMap's entry set
        Set<Map.Entry<String, String>> countryISOCodeEntries = countryISOCodeMapping.entrySet();
        System.out.println("countryISOCode entries : " + countryISOCodeEntries);

        // HashMap's key set
        Set<String> countries = countryISOCodeMapping.keySet();
        System.out.println("countries : " + countries);

        // HashMap's values
        Collection<String> isoCodes = countryISOCodeMapping.values();
        System.out.println("isoCodes : " + isoCodes);

        Map<String, Double> employeeSalary = new HashMap<>();
        employeeSalary.put("David", 76000.00);
        employeeSalary.put("John", 120000.00);
        employeeSalary.put("Mark", 95000.00);
        employeeSalary.put("Steven", 134000.00);

        System.out.println("=== Iterating over a HashMap using Java 8 forEach and lambda ===");
        employeeSalary.forEach((employee, salary) -> {
            System.out.println(employee + " => " + salary);
        });


        System.out.println("\n=== Iterating over the HashMap's entrySet using iterator() ===");
        Set<Map.Entry<String, Double>> employeeSalaryEntries = employeeSalary.entrySet();
        Iterator<Map.Entry<String, Double>> employeeSalaryIterator = employeeSalaryEntries.iterator();
        while (employeeSalaryIterator.hasNext()) {
            Map.Entry<String, Double> entry = employeeSalaryIterator.next();
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }


    }
}
