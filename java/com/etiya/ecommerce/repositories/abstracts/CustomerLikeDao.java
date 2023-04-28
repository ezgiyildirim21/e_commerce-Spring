package com.etiya.ecommerce.repositories.abstracts;

import com.etiya.ecommerce.entities.concrete.Customer;
import com.etiya.ecommerce.entities.concrete.CustomerLike;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerLikeDao extends JpaRepository<CustomerLike,Integer> {

    @Query("SELECT cl FROM CustomerLike cl")
    List<CustomerLike>findAll();

    @Query("SELECT cl FROM CustomerLike cl")
    List<Integer>getCustomerLikeById();

    @Query("SELECT c.fullName,cl.id FROM CustomerLike cl JOIN cl.customer c")
    List<Customer> getCustomerLikeByCustomerAndProduct();

}
