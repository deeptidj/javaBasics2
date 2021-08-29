package com.company.myCompany.basicJava.compositionExamples;

public class Bedroom {
    int noOfPeople;
    String color;
    Bed bed;
    SideTable sideTable;
    Closet closet;
    Bedroom(int noOfPeople, Bed bed,SideTable sideTable, Closet closet, String color){
        this.noOfPeople = noOfPeople;
        this.bed = bed;
        this.sideTable = sideTable;
        this.closet = closet;
        this.color = color;
    }

    public void printBedroomFacts() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Bedroom{" +
                "noOfPeople=" + noOfPeople +
                ", color='" + color + '\'' +
                ", bed size =" + bed.size + " and Type is " + bed.bedType+ " "+
                ", sideTable has " + sideTable.noOfDrawers + " drawers. "+
                "The closet has " + closet.noOfHangers + " hangers and " + closet.noOfShelves + " shelves." +
                '}';
    }
}
