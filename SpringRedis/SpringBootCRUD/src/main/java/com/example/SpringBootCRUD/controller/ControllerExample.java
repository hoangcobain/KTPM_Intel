package com.example.SpringBootCRUD.controller;

import com.example.SpringBootCRUD.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ControllerExample {
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/get-for-object")
    public Product getForObject() {
        int id = 1;
        return restTemplate.getForObject("/" + id,Product.class);
    }
    @GetMapping("/get-for-entity")
    public Product getForEntity() {
        int id = 2;
        ResponseEntity<Product> entity = restTemplate.getForEntity("/" + id, Product.class);
        return entity.getBody();
    }
}
