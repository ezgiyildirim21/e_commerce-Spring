package com.etiya.ecommerce.entities.concrete;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "customer_orders_products")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerOrderProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "comments")
    private String comments;


    @ManyToOne()
    @JoinColumn(name="customer_orders_id")
    private CustomerOrder order;

    @ManyToOne()
    @JoinColumn(name="products_id")
    private Product product;

}
