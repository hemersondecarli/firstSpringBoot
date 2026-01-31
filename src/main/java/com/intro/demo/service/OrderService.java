package com.intro.demo.service;

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

}
