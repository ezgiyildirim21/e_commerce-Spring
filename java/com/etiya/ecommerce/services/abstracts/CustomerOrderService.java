package com.etiya.ecommerce.services.abstracts;

import com.etiya.ecommerce.services.dtos.requests.customerOrder.AddCustomerOrderRequest;
import com.etiya.ecommerce.services.dtos.responses.customerOrder.AddCustomerOrderResponse;
import com.etiya.ecommerce.services.dtos.responses.customerOrder.GetByIdCustomerOrderResponse;
import com.etiya.ecommerce.services.dtos.responses.customerOrder.ListCustomerOrderResponse;
import jakarta.validation.Valid;


import java.util.List;

public interface CustomerOrderService {

    AddCustomerOrderResponse add(@Valid AddCustomerOrderRequest addCustomerOrderRequest);

    GetByIdCustomerOrderResponse getById(int id);

    List<ListCustomerOrderResponse> getAll();
}
