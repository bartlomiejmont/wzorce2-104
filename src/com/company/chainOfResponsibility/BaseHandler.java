package com.company.chainOfResponsibility;

public abstract class BaseHandler implements Handler{

    private Handler nextHandler;

    @Override
    public void setNext(Handler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void handle() {
        if(nextHandler == null){
            return;
        }
        this.nextHandler.handle();
    }
}
