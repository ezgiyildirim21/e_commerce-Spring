package com.etiya.ecommerce.repositories;

import com.etiya.ecommerce.entities.concrete.CustomerOrder;
import com.etiya.ecommerce.entities.concrete.OwnerProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICustomerOrderRepository extends JpaRepository<CustomerOrder,Integer>{

    @Query("SELECT co FROM CustomerOrder co")
    List<CustomerOrder> findAllByCustomerOrder();

    @Query("SELECT co.id FROM CustomerOrder co")
    List<CustomerOrder> findAllByCustomerOrderById();

    @Query("SELECT co.price FROM CustomerOrder co")
    List<CustomerOrder> findAllByCustomerOrderByPrice();

    @Query("SELECT c.fullName, c.phone, c.email, c.details  FROM CustomerOrder co " +
            "JOIN co.customer c WHERE c.id = :customerId")
    List<CustomerOrder> getCustomerOrderByCustomers(int customerId);

}
