package com.etiya.ecommerce.entities.concrete;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "customer_prefer_payments")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerPreferPayment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;


    @ManyToOne()
    @JoinColumn(name="customers_id")
    private Customer customer;

    @OneToMany(mappedBy = "customerPreferPayment")
    private List<AccountCard> accountCards;

    @OneToMany(mappedBy = "customerPreferPayment")
    private List<CreditCard> creditCards;

    @OneToMany(mappedBy = "customerPreferPayment")
    private List<VirtualCard> virtualCards;

}
