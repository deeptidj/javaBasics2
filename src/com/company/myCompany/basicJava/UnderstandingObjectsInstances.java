package com.company.myCompany.basicJava;

public class UnderstandingObjectsInstances {
    private String name;

    public static void main(String[] args) {
        UnderstandingObjectsInstances u1 = new UnderstandingObjectsInstances();
        UnderstandingObjectsInstances u2 = new UnderstandingObjectsInstances();
        u2.name = "Hello";
        u1.name = u2.name;

        System.out.println(u1 + " & " +u2);
        System.out.println(u1.name + " & " +u2.name);

        UnderstandingObjectsInstances u3 = new UnderstandingObjectsInstances();
        u3.name = "U3name";
        UnderstandingObjectsInstances u4 = u3;
        UnderstandingObjectsInstances u5 = u3;
        System.out.println(" u3 name "+u3.name);
        System.out.println(" u4 name "+u4.name);
        System.out.println(" u5 name "+u5.name);

        System.out.println(u3 + " & " + u4 +" & "+ u5);

        u3.name = "u3 changed name";

        System.out.println(" u3 name "+u3.name);
        System.out.println(" u4 name "+u4.name);
        System.out.println(" u5 name "+u5.name);


    }
}
