package com.company.myCompany.basicJava.SetExamples;

import java.util.*;

public class HashSetExample {
    //public static HashSet<Character> hs;
    /*
        Hashset :
        1. Class implements Set Interface - does not allow duplicates
        2. Backed by HashTable
        3. Order not maintained
        4. permits null
        5. Not synchronized.
        6. Can be explicitly synchronized - Collections.synchronizedSet(new HashSet(...))
     */

    HashSetExample() {
       // hs = new HashSet<>();
    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Input a string: ");
//        boolean res = isUniqueCharacters(sc.nextLine());
//        System.out.println(res);

        hashSetMethods();

    }
    public static boolean isUniqueCharacters(String str) {
        System.out.println("Input string "+str);
        HashSet<Character> hs = new HashSet<>();
//
        for (int i = 0; i < str.length(); i++) {
            if(!hs.add(str.charAt(i))) return false;
        }

        hs.forEach(System.out::println);
        return true;
    }
    static void hashSetMethods() {
        Set<Integer> set = Collections.synchronizedSet(new HashSet<>(Arrays.asList(1,1,2,2,2,3,4,5)));
        set.forEach(s -> {
            System.out.print(s + " ");
        });
        System.out.println();
        set.clear();
//        set.forEach(s -> {
//            System.out.print("After clearing "+s+ " ");
//        });

//        Iterator<Integer> ite = set.iterator();
//        while(ite.hasNext()) {
//            System.out.println(ite.next());
//        }

        set.add(1);
        set.add(10);
        set.add(11);
        set.add(12);
        set.add(12);
        set.add(112);
        set.add(512);

        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next()+" ");
        }

        Set<Integer> d2 = new TreeSet<>();
        set.forEach(s -> {
            d2.add(s);
        });
        System.out.println();
        d2.forEach(d -> {
            System.out.print(d+ " | ");
        });

        System.out.println();

        for(Integer i : d2) {
            System.out.println("Values in Treeset = "+i);
        }
    }
}
