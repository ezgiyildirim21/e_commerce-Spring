package com.etiya.ecommerce.services.abstracts;

import com.etiya.ecommerce.entities.concrete.Supplier;


import java.util.List;

public interface SupplierService {

    Supplier add(Supplier supplier);

    Supplier getById(Integer id);

    List<Supplier> getAll();
}
