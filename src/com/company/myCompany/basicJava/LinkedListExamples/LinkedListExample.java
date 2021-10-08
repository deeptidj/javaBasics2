package com.company.myCompany.basicJava.LinkedListExamples;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class LinkedListExample {
    public static void main(String[] args) {
        //Insertions and deltions are not as expensive as in arrays
        List<String> ll = new LinkedList<String>(Arrays.asList("one", "two", "three"));
        Iterator<String> iterator = ll.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
        ///removing
        ll.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.equalsIgnoreCase("one");
            }
        });

        ll.forEach(str -> {
            System.out.print(str+ " ");
        });
        System.out.println();
    }
}
