package com.etiya.ecommerce.api.controllers;

import com.etiya.ecommerce.entities.concrete.Supplier;
import com.etiya.ecommerce.services.abstracts.SupplierService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/suppliers")
@AllArgsConstructor
public class SuppliersController {

    private SupplierService supplierService;

    @GetMapping("")
    public List<Supplier> getAll() {

        List<Supplier>suppliers= supplierService.getAll();
        return suppliers;
    }

    @GetMapping("/{id}")
    public Supplier getById(Integer id) {
        return supplierService.getById(id);
    }

    @PostMapping("")
    public void add(Supplier supplier) {
        supplierService.add(supplier);
    }
}
