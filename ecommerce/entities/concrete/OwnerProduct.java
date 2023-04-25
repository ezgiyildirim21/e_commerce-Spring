package com.etiya.ecommerce.entities.concrete;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "owner_products")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OwnerProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;


    @ManyToOne()
    @JsonIgnore
    @JoinColumn(name="customers_id")
    private Customer customer;

    @ManyToOne()
    @JsonIgnore
    @JoinColumn(name="products_id")
    private Product product;
}
