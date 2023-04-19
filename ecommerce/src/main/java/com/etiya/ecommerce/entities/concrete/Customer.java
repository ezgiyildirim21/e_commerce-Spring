package com.etiya.ecommerce.entities.concrete;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "customers")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "phone")
    private String phone;

    @Column(name = "email")
    private String email;

    @Column(name = "details")
    private String details;


    @OneToMany(mappedBy = "customerLike")
    private List<CustomerLike> customerLikes;

    @OneToMany(mappedBy = "customerOrder")
    private List<CustomerOrder> customerOrders;

    @OneToMany(mappedBy = "customerPreferPayment")
    private List<CustomerPreferPayment> customerPreferPayments;

    @OneToMany(mappedBy = "ownerProduct")
    private List<OwnerProduct> ownerProducts;

    @OneToMany(mappedBy = "customerAddress")
    private List<CustomerAddress>customerAddresses;

}
