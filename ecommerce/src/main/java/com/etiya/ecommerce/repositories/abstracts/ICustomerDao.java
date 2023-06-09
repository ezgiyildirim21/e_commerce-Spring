package com.etiya.ecommerce.repositories.abstracts;

import com.etiya.ecommerce.entities.concrete.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICustomerDao extends JpaRepository <Customer,Integer> {

    @Query("SELECT c FROM Customer c")
    List<Customer> findAllByCustomer();

    @Query("SELECT c.id FROM Customer c")
    List<Customer> findAllByCustomerById();

    @Query("SELECT count (c) FROM Customer c")
    long countCustomer();

    @Query("SELECT c.id FROM Customer c WHERE c.phone LIKE '90%'")
    List<Customer>getCustomerByTurkeyNumber();


}
