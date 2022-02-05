package com.company.bridge;

public class Coffee implements Drink{
    @Override
    public String getVolume() {
        return "70ml";
    }

    @Override
    public boolean isAddictive() {
        return true;
    }
}
