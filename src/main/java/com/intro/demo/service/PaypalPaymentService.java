package com.intro.demo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PaypalPaymentService implements PaymentService {
    @Override
    public void amount(double amount){
        System.out.println("PAYPAL");
        System.out.println("amount: "+ amount);
    }
}
