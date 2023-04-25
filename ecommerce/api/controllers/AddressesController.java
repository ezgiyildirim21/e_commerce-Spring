package com.etiya.ecommerce.api.controllers;

import com.etiya.ecommerce.entities.concrete.Address;
import com.etiya.ecommerce.services.concretes.AddressManager;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
@AllArgsConstructor
public class AddressesController {

    private final AddressManager addressManager;

    @GetMapping("")
    public List<Address> getAllAddress() {
        return addressManager.getAll();
    }

    @PostMapping("/save")
    public Address createAddress(Address address) {
        return addressManager.addAddress(address);
    }

    @GetMapping("/{id}")
    public Address getByIdAddress(@PathVariable Integer id) {
        return addressManager.addressGetById(id);
    }
}
