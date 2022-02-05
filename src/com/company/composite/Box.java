package com.company.composite;

import java.util.ArrayList;
import java.util.List;

// Composite
public class Box implements Component{

    private List<Component> children = new ArrayList<Component>();

    public void addChild(Component c){
        children.add(c);
    }

    public void removeChild(Component c) {
        children.remove(c);
    }

    @Override
    public double calculatePrice() {
        double totalPrice = 0;
        for (Component c: children) {
            totalPrice += c.calculatePrice();
        }
        return totalPrice;
    }
}
