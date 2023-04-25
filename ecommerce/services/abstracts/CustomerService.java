package com.etiya.ecommerce.services.abstracts;

import com.etiya.ecommerce.entities.concrete.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> getAll();

    Customer getById(Integer id);

    Customer add(Customer customer);





}
