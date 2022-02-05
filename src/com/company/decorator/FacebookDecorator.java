package com.company.decorator;

public class FacebookDecorator extends BaseDecorator{
    public FacebookDecorator(Notifier wrappee) {
        super(wrappee);
    }

    @Override
    public void send(String message) {
        System.out.println("Sending notification to Facebook");
        super.send(message);
    }
}
