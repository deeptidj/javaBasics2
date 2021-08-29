package com.company.myCompany.basicJava.InnerClassExmaples;

import java.util.ArrayList;

public class GearBox {
    private ArrayList<Gear> gears;
    private int currentGear;
    int maxGears;

    GearBox(int maxGears) {
        this.maxGears = maxGears;
        Gear neutral = new Gear(0,0.0);
        this.gears.add(neutral);
    }

    public ArrayList<Gear> getGears() {
        return gears;
    }

    public void setGears(ArrayList<Gear> gears) {
        this.gears = gears;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    public int getMaxGears() {
        return maxGears;
    }

    public void setMaxGears(int maxGears) {
        this.maxGears = maxGears;
    }

    public class Gear{
        private int gearNumber;
        private double ratio;

        Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio =  ratio;
        }
        public double speed() {
            return ratio * 5;
        }
    }
}
