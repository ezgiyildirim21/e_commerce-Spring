package com.etiya.ecommerce.services.abstracts;

import com.etiya.ecommerce.entities.concrete.CustomerOrder;


import java.util.List;

public interface CustomerOrderService {

    CustomerOrder add(CustomerOrder customerOrder);

    CustomerOrder getById(Integer id);

    List<CustomerOrder> getAll();
}
