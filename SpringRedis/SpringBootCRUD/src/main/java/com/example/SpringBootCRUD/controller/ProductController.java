package com.example.SpringBootCRUD.controller;

import com.example.SpringBootCRUD.entity.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/")
public class ProductController {
    private static final Map<Long, Product> products;
    private static Long id = 1l;

    static {
        products = new HashMap<>();
        products.put(id, new Product(id++, "John", 80000));
        products.put(id, new Product(id++, "Mary", 75000));
        products.put(id, new Product(id++, "Peter", 60000));
    }

    @GetMapping("/{id}")
    public static Product getProducts(@PathVariable Long id) {
        Optional<Product> product = Optional.ofNullable(products.get(id));
        return product.orElse(null);
    }

}
