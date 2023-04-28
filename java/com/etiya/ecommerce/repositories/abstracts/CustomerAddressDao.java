package com.etiya.ecommerce.repositories.abstracts;

import com.etiya.ecommerce.entities.concrete.CustomerAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerAddressDao extends JpaRepository<CustomerAddress,Integer>{

    @Query("SELECT c FROM CustomerAddress c")
    List<CustomerAddress> findAllCustomerAddress();

    @Query("SELECT a.id FROM CustomerAddress a")
    List<Integer>findAllCustomerAddressId();

    @Query("SELECT COUNT (a)FROM CustomerAddress a")
    long countCustomerAddressBy();

    @Query("SELECT ca.id,ad.country FROM CustomerAddress ca JOIN ca.address ad")
    List<CustomerAddress>getCustomerAddressByAddress();

    @Query("SELECT ca.id,c.fullName FROM CustomerAddress ca JOIN ca.customer c ")
    List<CustomerAddress>getCustomerAddressByCustomers();




}
