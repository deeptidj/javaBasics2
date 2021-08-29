package com.company.myCompany.basicJava.InheritanceExmaples;

public class Mazda extends Car{
    String model;
    int noOfSeats;

    public Mazda(String steering, boolean engine, int wheels) {
        super(steering, engine, wheels);
    }

    @Override
    public void startEngine() {
        System.out.println("Engine starting from Mazda");
    }

    @Override
    public void brake() {
        super.brake();
    }

    @Override
    void changingGears(int fromGear, int toGear) {
        super.changingGears(fromGear, toGear);
    }
}
