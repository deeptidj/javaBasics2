package com.company.myCompany.basicJava.InterfaceExmaples;

public class Main {
    public static void main(String[] args) {
        ILaptop l =  new MacLaptop();
        System.out.println(l.hasDock());
        System.out.println(l.ip());
        System.out.println(l.hasStartButton());

        ILaptop wl =  new WindowsLaptop();
        System.out.println(wl.hasDock());
        System.out.println(wl.ip());
        System.out.println(wl.hasStartButton());
    }
}
