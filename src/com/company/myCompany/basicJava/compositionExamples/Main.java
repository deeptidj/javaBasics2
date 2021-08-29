package com.company.myCompany.basicJava.compositionExamples;

public class Main {
    public static void main(String[] args) {
        Bed bed = new Bed(2, Bed.BedType.QUEEN);
        SideTable sideTable = new SideTable(2);
        Closet closet = new Closet(10,4);
        Bedroom masterBed = new Bedroom(2,bed,sideTable, closet, "Red");
        masterBed.printBedroomFacts();
        Bed bed2 = new Bed(0, Bed.BedType.FULL);
        KidsRoom kidsroom = new KidsRoom(2, bed2, sideTable, closet, "Blue");
        kidsroom.printBedroomFacts();
    }
}
