package com.etiya.ecommerce.api.controllers;

import com.etiya.ecommerce.services.abstracts.CustomerOrderService;
import com.etiya.ecommerce.services.dtos.requests.customerOrder.AddCustomerOrderRequest;
import com.etiya.ecommerce.services.dtos.responses.customerOrder.AddCustomerOrderResponse;
import com.etiya.ecommerce.services.dtos.responses.customerOrder.GetByIdCustomerOrderResponse;
import com.etiya.ecommerce.services.dtos.responses.customerOrder.ListCustomerOrderResponse;
import lombok.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customerOrders")
@AllArgsConstructor
public class CustomerOrdersController {

    private CustomerOrderService customerOrderService;

    @GetMapping("")
    public List<ListCustomerOrderResponse> getAll() {

        return customerOrderService.getAll();
    }

    @GetMapping("/{id}")
    public GetByIdCustomerOrderResponse getById(@PathVariable int id) {

        return customerOrderService.getById(id);
    }

    @PostMapping("/save")
    public AddCustomerOrderResponse add( @RequestBody AddCustomerOrderRequest addCustomerOrderRequest) {
        return customerOrderService.add(addCustomerOrderRequest);
    }
}
