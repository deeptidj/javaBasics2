package com.company.myCompany.basicJava.collectionsExamples;

public class Main {
    public static void main(String[] args) {
        Theatre t = new Theatre("Olym", 5, 10);
        System.out.println(t.getName());
        t.getSeats();
        System.out.println(t.reserveSeat("A01"));
        System.out.println(t.reserveSeat("A01"));
    }
}
