package com.example.ProductService.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/product" )
public class ProductController {

    @GetMapping
    public String getProduct() {
        return "Hello from service product";
    }
}
