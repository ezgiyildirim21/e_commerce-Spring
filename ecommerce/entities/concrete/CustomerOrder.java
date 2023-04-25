package com.etiya.ecommerce.entities.concrete;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

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
    @JsonIgnore
    @JoinColumn(name = "customers_id")
    private Customer customer;

    @OneToMany(mappedBy = "order")
    private List<CustomerOrderProduct> customerOrderProducts;

}
