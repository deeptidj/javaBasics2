package com.company.myCompany.crackingCoding;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string:");
        String str = sc.nextLine();
        System.out.println(str.toString());
        System.out.println("Len "+ str.length());
        String res = reverse(str);
        System.out.println(res);
    }
    
    public static String reverse(String st) {
        StringBuffer sb = new StringBuffer();
        for (int i = st.length()-2; i >=0 ; i--) {
            sb.append(st.charAt(i));
        }
        sb.append(st.charAt(st.length()-1));
        return sb.toString();
    }



}
