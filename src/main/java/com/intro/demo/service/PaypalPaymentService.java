package com.intro.demo.service;

public class PaypalPaymentService implements PaymentService {
    @Override
    public void amount(double amount){
        System.out.println("PAYPAL");
        System.out.println("amount: "+ amount);
    }
}
