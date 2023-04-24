package com.etiya.ecommerce.repositories;

import com.etiya.ecommerce.entities.concrete.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IAddressRepository extends JpaRepository<Address,Integer>{

    @Query("select count (a)from Address a")
    long countAddressBy();

    @Query("select a from Address a where a.city='Ankara'")
    List<Address>addressesInAnkara();

    @Query("select distinct a.city from Address a")
    List<Address>differentCity();

}
