package com.etiya.ecommerce.services.abstracts;

import com.etiya.ecommerce.entities.concrete.Supplier;
import com.etiya.ecommerce.services.dtos.requests.supplier.AddSupplierRequest;
import com.etiya.ecommerce.services.dtos.responses.supplier.AddSupplierResponse;
import com.etiya.ecommerce.services.dtos.responses.supplier.GetByIdSupplierResponse;
import com.etiya.ecommerce.services.dtos.responses.supplier.ListSupplierResponse;


import java.util.List;

public interface SupplierService {

    AddSupplierResponse add(AddSupplierRequest addSupplierRequest);

    GetByIdSupplierResponse getById(Integer id);

    List<ListSupplierResponse> getAll();
}
