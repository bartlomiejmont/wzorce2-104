package com.company.chainOfResponsibility;

public class DeliveryHandler extends BaseHandler {
    @Override
    public void handle() {
        System.out.println("Handling delivery...");
        super.handle();
    }
}
