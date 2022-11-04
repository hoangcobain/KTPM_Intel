package com.example.OrderService.controller;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/order" )
public class OrderController {
    @GetMapping
    @CircuitBreaker(name = "inventory",fallbackMethod = "fallbackMethod")
    public String getOrder() {
        return "Hello from Order Service";
    }

    public String fallbackMethod(RuntimeException runtimeException) {
        return "Something went wrong, please request order a next time";
    }
}
