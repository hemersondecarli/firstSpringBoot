package com.intro.demo.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    PaymentService paymentService;

    public OrderService(PaymentService paymentService) {
    this.paymentService = paymentService;
    }

    public void placeOrder() {
        paymentService.amount(100);
    }


    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}
