package com.etiya.ecommerce.repositories;

import com.etiya.ecommerce.entities.concrete.CreditCard;
import com.etiya.ecommerce.entities.concrete.CustomerAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICustomerAddressRepository extends JpaRepository<CustomerAddress,Integer>{

    @Query("SELECT c FROM CustomerAddress c")
    List<CustomerAddress> findAllCustomerAddress();

    @Query("SELECT a.id FROM CustomerAddress a")
    List<Integer>findAllCustomerAddressId();

    @Query("select count (a)from CustomerAddress a")
    long countCustomerAddressBy();


}
