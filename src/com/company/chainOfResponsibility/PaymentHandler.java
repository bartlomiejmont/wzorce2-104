package com.company.chainOfResponsibility;

public class PaymentHandler extends BaseHandler{
    @Override
    public void handle() {
        System.out.println("Handling Payment ...");
        super.handle();
    }
}
