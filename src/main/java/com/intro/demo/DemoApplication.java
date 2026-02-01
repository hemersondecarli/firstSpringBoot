package com.intro.demo;

import com.intro.demo.service.OrderService;
import com.intro.demo.service.PaypalPaymentService;
import com.intro.demo.service.StripePaymentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
        //spring app
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);


        //running console app
        var orderService = context.getBean(OrderService.class);

        //orderService.setPaymentService(new StripePaymentService());
        orderService.placeOrder();

        //orderService.setPaymentService(new PaypalPaymentService());
        //orderService.placeOrder();
	}

}
