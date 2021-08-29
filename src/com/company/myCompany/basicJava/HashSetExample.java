package com.company.myCompany.basicJava;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetExample {
    //public static HashSet<Character> hs;

    HashSetExample() {
       // hs = new HashSet<>();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a string: ");
        boolean res = isUniqueCharacters(sc.nextLine());
        System.out.println(res);

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
}
