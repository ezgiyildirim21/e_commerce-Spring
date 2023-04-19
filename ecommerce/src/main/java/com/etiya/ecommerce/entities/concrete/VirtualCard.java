package com.etiya.ecommerce.entities.concrete;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "virtual_card")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VirtualCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;


    @ManyToOne()
    @JoinColumn(name = "customer_prefer_payment_id")
    private CustomerPreferPayment customerPreferPayment;
}
