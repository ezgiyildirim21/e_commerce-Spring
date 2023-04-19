package com.etiya.ecommerce.entities.concrete;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "customer_addresses")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @ManyToOne()
    @JoinColumn(name = "customers_id")
    private Customer customers;

    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;
}
