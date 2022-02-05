package com.company.decorator;

public class SlackDecorator extends BaseDecorator{
    public SlackDecorator(Notifier wrappee) {
        super(wrappee);
    }

    @Override
    public void send(String message) {
        System.out.println("Sending notification to Slack");
        super.send(message);
    }
}
