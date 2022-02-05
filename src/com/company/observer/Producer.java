package com.company.observer;

public interface Producer {
    void addSubscriber(Subscriber s);
    void removeSubscriber(Subscriber s);
    void notifySubscribers();
}
