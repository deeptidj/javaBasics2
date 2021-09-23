package com.company.myCompany.basicJava.ArrayListExamples;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer,Student> students = new HashMap<>();
        students.put(1,new Student("Deepti"));
        students.put(2,new Student("bbb"));
        students.put(3,new Student("cccc"));

        System.out.println(students);
    }

}
