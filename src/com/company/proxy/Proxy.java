package com.company.proxy;

public class Proxy implements ServiceInterface{

    private final Service service;

    public Proxy(Service service) {
        this.service = service;
    }

    @Override
    public float getTemperature() {
        return this.service.getTemperature()*9/5+32;
    }
}
