package com.company.myCompany.basicJava;

import java.util.HashSet;
import java.util.Random;

public class RandomNum {
    public static void main(String[] args) {
        Random random =  new Random();
//        for (int i = 0; i < 5; i++) {
//            System.out.println(random.nextInt());
//        }


//        for(int i = 0; i <= 255; i++)
//        {
//            System.out.println(" The ASCII value of " + (char)i + "  =  " + i);
//        }

        String s = "asdfgqwertzxcvbyuiophjklnm";
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i)+" "+(int)s.charAt(i));
        }

    }
}
