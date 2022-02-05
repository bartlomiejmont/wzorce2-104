package com.company.facade;

public class OrderFacade {
    private final PaymentService paymentService;
    private final DeliveryService deliveryService;

    public OrderFacade(PaymentService paymentService, DeliveryService deliveryService) {
        this.paymentService = paymentService;
        this.deliveryService = deliveryService;
    }

    public boolean placeOrder(String productId, String userId, Double price){
        boolean paymentStatus = this.paymentService.pay(price,userId);
        if(!paymentStatus){
            return false;
        }
        this.deliveryService.deliver(productId, userId);
        return true;
    }

}
