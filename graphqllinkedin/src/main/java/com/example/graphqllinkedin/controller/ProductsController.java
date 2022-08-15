package com.example.graphqllinkedin.controller;

import com.example.graphqllinkedin.data.Products;
import com.example.graphqllinkedin.data.ProductsRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class ProductsController {
    private final ProductsRepository productsRepository;

    public ProductsController(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    @QueryMapping
    public Iterable<Products> products(){
        return this.productsRepository.findAll();
    }

    @QueryMapping
    public Products productById(@Argument String id){
        return this.productsRepository.findById(id).orElseThrow();
    }
}
