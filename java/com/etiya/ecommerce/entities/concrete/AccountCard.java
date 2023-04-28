package com.etiya.ecommerce.entities.concrete;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "account_card")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountCard{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne()
    @JoinColumn(name = "customerPreferPayment_id")
    private CustomerPreferPayment customerPreferPayment;

}
