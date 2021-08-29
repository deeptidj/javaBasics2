package com.company.myCompany.basicJava.InheritanceExmaples;

public class Car extends Vehicle {
    String steering;
    boolean engine;
    int wheels;

    public String getSteering() {
        return steering;
    }

    public void setSteering(String steering) {
        this.steering = steering;
    }

    public boolean isEngine() {
        return engine;
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public Car(String steering, boolean engine, int wheels) {
        this.steering = steering;
        this.engine = engine;
        this.wheels = wheels;
    }
    public void startEngine() {
        System.out.println("Engine starting from car");
        this.toString();
    }
    public void brake() {

    }

    @Override
    public String toString() {
        return "Car{" +
                "steering='" + steering + '\'' +
                ", engine=" + engine +
                ", wheels=" + wheels +
                '}';
    }

    void changingGears(int fromGear, int toGear){
        System.out.println("changed gears from "+fromGear+" to "+toGear);
    }
}
