package com.etiya.ecommerce.api.controllers;

import com.etiya.ecommerce.entities.concrete.Customer;
import com.etiya.ecommerce.services.abstracts.CustomerService;
import lombok.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
@AllArgsConstructor
public class CustomersController {

    private CustomerService customerService;

    @GetMapping("")
    public List<Customer> getAll() {
        return customerService.getAll();
    }

    @GetMapping("/{id}")
    public Customer getById(@PathVariable Integer id) {
        return customerService.getById(id);
    }

    @PostMapping("")
    public Customer add(Customer customer) {
        return customerService.add(customer);
    }


}
