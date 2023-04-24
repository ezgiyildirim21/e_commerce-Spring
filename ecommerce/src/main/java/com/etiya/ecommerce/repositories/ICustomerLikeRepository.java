package com.etiya.ecommerce.repositories;

import com.etiya.ecommerce.entities.concrete.Customer;
import com.etiya.ecommerce.entities.concrete.CustomerLike;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICustomerLikeRepository extends JpaRepository<CustomerLike,Integer> {

    @Query("select cl from CustomerLike cl")
    List<CustomerLike>findAll();

    @Query("select cl from CustomerLike cl")
    List<Integer>getCustomerLikeById();

    @Query("select c.fullName,cl.product from CustomerLike cl inner join Customer c on cl.customer.id=c.id ")
    Customer getCustomerLikeByCustomerAndProduct();

}
