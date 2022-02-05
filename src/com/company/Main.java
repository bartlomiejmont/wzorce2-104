package com.company;

import com.company.adapter.Adapter;
import com.company.adapter.OldAPI;
import com.company.bridge.Coffee;
import com.company.bridge.CoffeePurchase;
import com.company.bridge.Drink;
import com.company.chainOfResponsibility.DeliveryHandler;
import com.company.chainOfResponsibility.Handler;
import com.company.chainOfResponsibility.PaymentHandler;
import com.company.composite.Box;
import com.company.composite.Component;
import com.company.composite.Product;
import com.company.decorator.FacebookDecorator;
import com.company.decorator.NotificationService;
import com.company.decorator.Notifier;
import com.company.decorator.SlackDecorator;
import com.company.mediator.ComponentA;
import com.company.mediator.ComponentB;
import com.company.mediator.ComponentC;
import com.company.mediator.MainMediator;
import com.company.observer.Customer;
import com.company.observer.IphoneShop;
import com.company.observer.Producer;
import com.company.proxy.Proxy;
import com.company.proxy.Service;

public class Main {

    public static void main(String[] args) {
        // Adapter
        OldAPI api = new OldAPI();
        Adapter adapter = new Adapter(api);

//        System.out.println(adapter.getTemperature());

        // Bridge

//        Drink drink = new CoffeePurchase().buy(5.5);
//        System.out.println(drink.getVolume());

        // Composite

        Box c1 = new Box();
        Box c2 = new Box();
        Product c3 = new Product(10.0);
        Product c4 = new Product(2.5);
        Product c5 = new Product(5.0);

        c1.addChild(c2);
        c1.addChild(c3);

        c2.addChild(c4);
        c2.addChild(c5);

//        System.out.println(c1.calculatePrice());
//        System.out.println(c2.calculatePrice());


        // Decorator

        // implementuje interfejs Notifier ale nie jest dekoratorem
        NotificationService notificationService = new NotificationService();

        Notifier notifierWithSlack = new SlackDecorator(notificationService);

        Notifier notifierWithSlackAndFacebook = new FacebookDecorator(notifierWithSlack);

//        Notifier notifier = new FacebookDecorator( new SlackDecorator(notificationService));

//        notifierWithSlackAndFacebook.send("new notification");

        // Proxy

        Service service = new Service();

        Proxy proxy = new Proxy(service);

//        System.out.println(service.getTemperature());
//        System.out.println(proxy.getTemperature());

        // chain of responsibility

        Handler h1 = new DeliveryHandler();
        Handler h2 = new PaymentHandler();

        h2.setNext(h1);

//        h2.handle();

        // Observer

        IphoneShop iphoneShop = new IphoneShop(2000);

        Customer customer1 = new Customer(1500);
        Customer customer2 = new Customer(2500);

//        iphoneShop.addSubscriber(customer1);
//        iphoneShop.addSubscriber(customer2);
//
//        iphoneShop.removeSubscriber(customer2);
//
//        iphoneShop.updatePrice(1200);

        // Mediator

        MainMediator mediator = new MainMediator();

        ComponentA componentA = new ComponentA(mediator);
        ComponentB componentB = new ComponentB(mediator);
        ComponentC componentC = new ComponentC(mediator);

        componentB.operationB();


    }
}
