package com.etiya.ecommerce.repositories.abstracts;

import com.etiya.ecommerce.entities.concrete.Product;
import com.etiya.ecommerce.services.dtos.responses.product.ListProductResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductDao extends JpaRepository <Product, Integer> {

    @Query("SELECT p FROM Product p")
    List<Product> findAllByProduct();

    @Query("SELECT p.id FROM Product p")
    List<Product> findAllByProductById();

    @Query("SELECT p FROM Product p WHERE p.name='HP Laptop 15 inc'")
    List<Product>productInHPLaptop();

  /*  @Query("select new com.etiya.ecommerce.services.dtos.responses.product.ListProductResponse(p.price,p.details,p.name)from Product p")
    List<ListProductResponse>getAll();


   */
}
