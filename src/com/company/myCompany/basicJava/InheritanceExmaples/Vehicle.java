package com.company.myCompany.basicJava.InheritanceExmaples;

public class Vehicle {
    String name;
    String size;
    double speed ;


    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return " { "+ this.name +" "+ this.size +" } " ;
    }
}
