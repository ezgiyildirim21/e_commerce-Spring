package com.etiya.ecommerce.repositories;

import com.etiya.ecommerce.entities.concrete.Address;
import com.etiya.ecommerce.entities.concrete.OwnerProduct;
import com.etiya.ecommerce.entities.concrete.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductRepository extends JpaRepository<Product, Integer> {

    @Query("SELECT p FROM Product p")
    List<Product> findAllByProduct();

    @Query("SELECT p.id FROM Product p")
    List<Product> findAllByProductById();

    @Query("SELECT COUNT(p.supplier) FROM Product p")
    long countProductSupplier();

    @Query("select p from Product p where p.name='HP Laptop 15 inc'")
    List<Product>productInHPLaptop();
}
