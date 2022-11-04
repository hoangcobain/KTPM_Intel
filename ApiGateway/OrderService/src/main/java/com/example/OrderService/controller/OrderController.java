package com.example.OrderService.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/order" )
public class OrderController {
    @GetMapping
    public String getOrder() {
        return "Hello from Order Service";
    }
}
