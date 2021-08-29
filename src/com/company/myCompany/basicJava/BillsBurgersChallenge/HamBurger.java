package com.company.myCompany.basicJava.BillsBurgersChallenge;

public class HamBurger {

    private String name;
    private BreadRollType breadRollType;
    private Meat meat;
    private int additionalItems;
    private double basePrice;

    private static final int MAX_ALLOWED_ADDITIONAL_ITEMS = 4;

    public int getMaxAllowedAdditionalItems() {
        return MAX_ALLOWED_ADDITIONAL_ITEMS;
    }

    public HamBurger(String name, BreadRollType breadRollType, Meat meat, double basePrice) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.basePrice = basePrice;
        this.additionalItems = 0;
    }


    public int getAdditionalItems() {
        return additionalItems;
    }

    public void setAdditionalItems(int additionalItems) {
        this.additionalItems = additionalItems;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BreadRollType getBreadRollType() {
        return breadRollType;
    }

    public void setBreadRollType(BreadRollType breadRollType) {
        this.breadRollType = breadRollType;
    }

    public Meat getMeat() {
        return meat;
    }

    public void setMeat(Meat meat) {
        this.meat = meat;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double totPrice() {
        return basePrice + (this.additionalItems * 1.0);
    }

}
