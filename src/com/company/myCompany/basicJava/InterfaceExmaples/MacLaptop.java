package com.company.myCompany.basicJava.InterfaceExmaples;

public class MacLaptop implements ILaptop{
    @Override
    public String ip() {
        return "Mac IP";
    }

    @Override
    public boolean hasStartButton() {
        return false;
    }

    @Override
    public boolean hasDock() {
        return true;
    }
}
