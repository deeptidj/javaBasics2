package com.company.myCompany.basicJava.compositionExamples;

public class KidsRoom extends Bedroom{
    int noOfKids;
    String color;
    Bed bed;
    SideTable sideTable;
    Closet closet;
    KidsRoom(int noOfKids, Bed bed,SideTable sideTable, Closet closet, String color){
        super(noOfKids,bed, sideTable,closet, "Blue");
    }
}
