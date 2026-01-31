package com.intro.demo.controller;

import com.intro.demo.service.HelloWorldService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    private HelloWorldService helloWorldService;

    //constructor
    public HelloWorldController(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }


    @GetMapping
    public String helloWorld() {
        return helloWorldService.sayHello("Heme");
    }
}
