package com.example.graphqllinkedin.controller;

import com.example.graphqllinkedin.data.Products;

import java.math.BigDecimal;

public class ProductsInput {
    private String id;
    private String name;
    private int size;
    private String variety;
    private BigDecimal price;
    private String status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Products getProductEntity(){
        Products products = new Products();
        products.setName(this.name);
        products.setSize(this.size);
        products.setVariety(this.variety);
        products.setPrice(this.price);
        products.setStatus(this.status);
        return products;
    }
}
