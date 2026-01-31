package com.intro.demo;

import com.intro.demo.service.OrderService;
import com.intro.demo.service.StripePaymentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

        //spring app
		//SpringApplication.run(DemoApplication.class, args);

        //running console app
        var orderService = new OrderService(new StripePaymentService());
        orderService.placeOrder();
	}

}
