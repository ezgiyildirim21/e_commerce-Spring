package com.etiya.ecommerce.api.controllers;

import com.etiya.ecommerce.entities.concrete.Customer;
import com.etiya.ecommerce.entities.concrete.Product;
import com.etiya.ecommerce.services.abstracts.CustomerService;
import com.etiya.ecommerce.services.abstracts.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@AllArgsConstructor
public class ProductsController {

    private ProductService productService;

    @GetMapping("")
    public List<Product> getAll() {
        return productService.getAll();
    }

    @GetMapping("/{id}")
    public Product getById(@PathVariable Integer id) {
        return productService.getById(id);
    }

    @PostMapping("/save")
    public void add(Product product) {
        productService.add(product);
    }
}
