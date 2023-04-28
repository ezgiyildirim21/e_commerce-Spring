package com.etiya.ecommerce.repositories.abstracts;

import com.etiya.ecommerce.entities.concrete.CustomerPreferPayment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICustomerPreferPaymentDao extends JpaRepository<CustomerPreferPayment, Integer> {

    @Query("SELECT cpp FROM CustomerPreferPayment cpp")
    List<CustomerPreferPayment> findAllByCustomerPreferPayment();

    @Query("SELECT count (cpp) FROM CustomerPreferPayment cpp")
    long countCustomerPreferPayment();

    @Query("SELECT cpp.id FROM CustomerPreferPayment cpp")
    List<CustomerPreferPayment> findAllByCustomerPreferPaymentById();

    @Query("SELECT c.fullName,cpp.id FROM CustomerPreferPayment cpp " +
            "JOIN cpp.customer c")
    List<CustomerPreferPayment> getCustomerPreferPaymentByCustomers();

}
