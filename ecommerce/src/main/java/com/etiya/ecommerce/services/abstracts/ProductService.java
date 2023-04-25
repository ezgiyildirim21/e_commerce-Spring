package com.etiya.ecommerce.services.abstracts;

import com.etiya.ecommerce.entities.concrete.Product;


import java.util.List;

public interface ProductService  {

    Product add(Product product);

    Product getById(Integer id);

    List<Product> getAll();
}
