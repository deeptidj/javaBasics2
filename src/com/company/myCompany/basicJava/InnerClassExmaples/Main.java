package com.company.myCompany.basicJava.InnerClassExmaples;

public class Main {
    public static void main(String[] args) {
        GearBox mcLaren = new GearBox(5);
        GearBox.Gear first = mcLaren.new Gear(2,5.0);
        System.out.println(first.speed());
    }
}
