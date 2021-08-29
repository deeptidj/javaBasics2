package com.company.myCompany.basicJava.InterfaceExmaples;

public class WindowsLaptop implements ILaptop {
    @Override
    public String ip() {
        return "Windows IP";
    }

    @Override
    public boolean hasStartButton() {
        return true;
    }

    @Override
    public boolean hasDock() {
        return false;
    }
}
