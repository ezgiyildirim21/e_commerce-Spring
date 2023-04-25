package com.etiya.ecommerce.repositories;

import com.etiya.ecommerce.entities.concrete.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IAddressRepository extends JpaRepository<Address,Integer>{

    @Query("SELECT COUNT (a)FROM Address a")
    long countAddressBy();

    @Query("SELECT a FROM Address a WHERE a.city='Ankara'")
    List<Address>addressesInAnkara();

    @Query("SELECT DISTINCT a.city FROM Address a")
    List<Address>differentCity();

    @Query("SELECT a.city,ca.id FROM Address a JOIN a.customerAddresses ca")
    List<Address>getAddressByCustomerAddresses();

}
