package com.etiya.ecommerce.repositories;

import com.etiya.ecommerce.entities.concrete.OwnerProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IOwnerProductRepository extends JpaRepository<OwnerProduct, Integer>{

    @Query("SELECT op FROM OwnerProduct op")
    List<OwnerProduct> findAllByOwnerProduct();

    @Query("SELECT op.id FROM OwnerProduct op")
    List<OwnerProduct> findAllByOwnerProductById();

    @Query("SELECT COUNT(op.customer) FROM OwnerProduct op")
    long countCustomerOrderProductCustomers();

    @Query("SELECT COUNT(op.product) FROM OwnerProduct op")
    long countCustomerOrderProductProducts();
}
