package com.company.mediator;

public class MainMediator implements Mediator{
    @Override
    public void notify(Component c) {
        System.out.println("Notification from " + c.toString());
    }
}
