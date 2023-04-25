package com.etiya.ecommerce.api.controllers;

import com.etiya.ecommerce.entities.concrete.CustomerOrder;
import com.etiya.ecommerce.services.abstracts.CustomerOrderService;
import lombok.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customerOrders")
@AllArgsConstructor
public class CustomerOrdersController {

    private CustomerOrderService customerOrderService;

    @GetMapping("")
    public List<CustomerOrder> getAll() {
        return customerOrderService.getAll();
    }

    @GetMapping("/{id}")
    public CustomerOrder getById(@PathVariable Integer id) {
        return customerOrderService.getById(id);
    }

    @PostMapping("")
    public void add(CustomerOrder customerOrder) {
        customerOrderService.add(customerOrder);
    }
}
