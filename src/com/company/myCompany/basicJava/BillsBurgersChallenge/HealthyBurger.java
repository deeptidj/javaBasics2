package com.company.myCompany.basicJava.BillsBurgersChallenge;

public class HealthyBurger extends HamBurger {

    private static final int MAX_ALLOWED_ADDITIONAL_ITEMS = 6;

    public int getMaxAllowedAdditionalItems() {
        return MAX_ALLOWED_ADDITIONAL_ITEMS;
    }

    public HealthyBurger(String name, Meat meat, double basePrice) {
        super(name, BreadRollType.BROWNRYE, meat, basePrice);
    }

    public double totPrice() {
        return this.getBasePrice() + (this.getAdditionalItems() * 1.0);
    }
}
