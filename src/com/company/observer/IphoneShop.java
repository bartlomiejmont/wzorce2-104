package com.company.observer;

import java.util.ArrayList;
import java.util.List;

public class IphoneShop implements Producer{

    List<Subscriber> subscribers = new ArrayList<Subscriber>();
    private int currentPrice;

    public IphoneShop(int currentPrice) {
        this.currentPrice = currentPrice;
    }

    @Override
    public void addSubscriber(Subscriber s) {
        subscribers.add(s);
        s.makeDecision(this.currentPrice);
    }

    @Override
    public void removeSubscriber(Subscriber s) {
        subscribers.remove(s);
    }

    public void updatePrice(int newPrice){
        this.currentPrice = newPrice;
        notifySubscribers();
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber subscriber: subscribers) {
            subscriber.makeDecision(this.currentPrice);
        }
    }
}
