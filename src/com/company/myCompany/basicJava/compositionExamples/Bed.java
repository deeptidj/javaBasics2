package com.company.myCompany.basicJava.compositionExamples;

public class Bed {
    int size;
    enum BedType {
        QUEEN,
        KING,
        CALIFORNIAKING,
        FULL
    }
    BedType bedType;
    boolean heardBoard;
    boolean boxSpring;
    boolean footBoard;
    Bed(int size, BedType t) {
        size = 1;
        heardBoard = true;
        boxSpring =  true;
        footBoard = true;
        bedType = t;
    }
}
