package com.company.myCompany.crackingCoding;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDupsInString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter s string: ");
        String str = s.nextLine();
        String res = removeDups(str);
        System.out.println(res);
    }
    public static String removeDups(String str) {
        HashSet<Character> hs = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            hs.add(str.charAt(i));
        }
        StringBuffer sb = new StringBuffer();

        for(Character c:hs) {
            sb.append(c);
        }
        return sb.toString();
    }
}
