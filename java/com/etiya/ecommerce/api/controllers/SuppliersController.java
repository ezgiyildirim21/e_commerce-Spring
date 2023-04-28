package com.etiya.ecommerce.api.controllers;

import com.etiya.ecommerce.services.concretes.SupplierManager;
import com.etiya.ecommerce.services.dtos.responses.supplier.AddSupplierResponse;
import com.etiya.ecommerce.services.dtos.requests.supplier.AddSupplierRequest;
import com.etiya.ecommerce.services.dtos.responses.supplier.GetByIdSupplierResponse;
import com.etiya.ecommerce.services.dtos.responses.supplier.ListSupplierResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/suppliers")
@AllArgsConstructor
public class SuppliersController {

    private SupplierManager supplierManager;

    @GetMapping("")
    public List<ListSupplierResponse> getAll() {
        return supplierManager.getAll();
    }

    @GetMapping("/{id}")
    public GetByIdSupplierResponse getById(@PathVariable Integer id) {
        return supplierManager.getById(id);
    }

    @PostMapping("")
    public AddSupplierResponse add(@Valid @RequestBody AddSupplierRequest addSupplierRequest) {

        return supplierManager.add(addSupplierRequest);
    }
}
