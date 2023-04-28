package com.etiya.ecommerce.entities.concrete;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "customer_orders")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "customer_order_id")
    private int customerOrderId;

    @Column(name = "status_code")
    private String statusCode;

    @Column(name = "placed")
    private String placed;

    @Column(name = "paid")
    private String paid;

    @Column(name = "price")
    private String price;

    @Column(name = "details")
    private String details;


    @ManyToOne
    @JoinColumn(name = "customers_id")
    private Customer customer;

    @OneToMany(mappedBy = "order")
    private List<CustomerOrderProduct> customerOrderProducts;

}
