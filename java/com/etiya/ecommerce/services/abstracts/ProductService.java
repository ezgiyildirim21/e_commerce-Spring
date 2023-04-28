package com.etiya.ecommerce.services.abstracts;

import com.etiya.ecommerce.core.utils.result.DataResult;
import com.etiya.ecommerce.entities.concrete.Product;
import com.etiya.ecommerce.services.dtos.requests.product.AddProductRequest;
import com.etiya.ecommerce.services.dtos.responses.customer.GetByIdCustomerResponse;
import com.etiya.ecommerce.services.dtos.responses.product.AddProductResponse;
import com.etiya.ecommerce.services.dtos.responses.product.GetByIdProductResponse;
import com.etiya.ecommerce.services.dtos.responses.product.ListProductResponse;


import java.util.List;

public interface ProductService  {

    DataResult<AddProductResponse> add(AddProductRequest addProductRequest);

    GetByIdProductResponse getById(Integer id);

 //   List<ListProductResponse> getAll();

}
