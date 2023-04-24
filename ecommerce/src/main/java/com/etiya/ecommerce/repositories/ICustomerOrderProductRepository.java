package com.etiya.ecommerce.repositories;

import com.etiya.ecommerce.entities.concrete.CustomerOrderProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICustomerOrderProductRepository extends JpaRepository<CustomerOrderProduct,Integer> {

    @Query("SELECT cop FROM CustomerOrderProduct cop")
    List<CustomerOrderProduct> findAllByCustomerOrderProduct();

    @Query("SELECT cop.id FROM CustomerOrderProduct cop")
    List<CustomerOrderProduct> findAllByCustomerOrderProductById();

    @Query("SELECT cop.order FROM CustomerOrderProduct cop")
    List<CustomerOrderProduct> findAllByCustomerOrderProductByOrder();

    @Query("SELECT cop.product FROM CustomerOrderProduct cop")
    List<CustomerOrderProduct> findAllByCustomerOrderProductByProduct();

    @Query("SELECT COUNT(cop.comments) FROM CustomerOrderProduct cop")
    long countCustomerOrderProductComments();

}
