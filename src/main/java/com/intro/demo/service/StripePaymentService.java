package com.intro.demo.service;

import org.springframework.stereotype.Service;

@Service
public class StripePaymentService implements PaymentService {
    @Override
    public void amount(double amount) {
        System.out.println("STRIPE");
        System.out.println("amount: "+ amount);
    }
}
