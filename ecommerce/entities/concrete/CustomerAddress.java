package com.etiya.ecommerce.entities.concrete;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
    @JsonIgnore
    @JoinColumn(name = "customers_id")
    private Customer customer;

    @ManyToOne()
    @JsonIgnore
    @JoinColumn(name = "addresses_id")
    private Address address;
}
