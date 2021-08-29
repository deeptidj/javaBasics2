package com.company.myCompany.crackingCoding;

public class ReplaceAllSpaces {
    //Write a method to replace all spaces in a string with ‘%20’.
    public static void main(String[] args) {
        String s = "hello hello";
        //s = "hello%20hello";
        System.out.println(replaceSpaceWith20(s));
    }
    public static String replaceSpaceWith20(String st){
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == ' ') {
                sb.append("%20");
            }    else sb.append(st.charAt(i));
        }
        return sb.toString();
    }
}
