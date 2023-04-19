package com.etiya.ecommerce.entities.concrete;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "customer_likes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerLike {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;


    @ManyToOne()
    @JoinColumn(name="products_id")
    private Product product;

    @ManyToOne()
    @JoinColumn(name="customers_id")
    private Customer customer;

}
