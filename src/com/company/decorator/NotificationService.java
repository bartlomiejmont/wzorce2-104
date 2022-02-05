package com.company.decorator;

public class NotificationService implements Notifier{
    @Override
    public void send(String message) {
        System.out.println(message);
    }
}
