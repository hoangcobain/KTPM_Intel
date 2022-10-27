package com.example.SpringBootCRUD.entity;

public class Product {
    private Long id;
    private String name;
    private int priceLong;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriceLong() {
        return priceLong;
    }

    public void setPriceLong(int priceLong) {
        this.priceLong = priceLong;
    }

    public Product() {
    }

    public Product(Long id, String name, int priceLong) {
        this.id = id;
        this.name = name;
        this.priceLong = priceLong;
    }
}
