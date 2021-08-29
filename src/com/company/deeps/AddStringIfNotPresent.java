package com.company.deeps;
import java.util.*;
    /*
     * To execute Java, please define "static void main" on a class
     * named Solution.
     *
     * If you need more classes, simply define them inline.
     */
    class AddStringIfNotPresent {
        public static void main(String[] args) {
            final List<String> strings = new ArrayList<String>();
            strings.add("Foo");
            strings.add("Bar");
            strings.add("Baz");
            strings.add("Zoo");
            print(strings);
            System.out.println();
            String addString = "Boo";

            if(!isStringInList(addString, strings)) {
                strings.add(addString);
            }
            print(strings);

        }
        public static void print(List<String> list) {
            for (String string : list) {
                System.out.println(string);
            }
        }
        public static synchronized boolean isStringInList(String str, List<String> strings) {
           // List<String> list = Collections.synchronizedList(strings);
            boolean found = false;
            for (String s : strings) {
                if (s.trim().equalsIgnoreCase(str)) {
                    found = true;
                    System.out.println("found "+str);
                }
            }
            return found;
        }
    /**
     * Q1: Create a method to add a string to the list only if it does not already
     *     exist in the list.
     * Q2: Make the method you created in Q1 thread safe.
     * Q3: Assuming the order of items was important, show how you could make the
     *     code you created in Q1 more efficient.
     * Q4: Write a method to return the concetenation of all the strings in the
     *     list in order.
     **/
//collections.unmodifiable list or synchronized ...
}
