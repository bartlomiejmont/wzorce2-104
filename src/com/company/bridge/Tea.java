package com.company.bridge;

public class Tea implements Drink{
    @Override
    public String getVolume() {
        return "250ml";
    }

    @Override
    public boolean isAddictive() {
        return false;
    }
}
