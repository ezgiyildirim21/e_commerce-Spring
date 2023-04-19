package com.etiya.ecommerce.entities.concrete;

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

    @OneToMany(mappedBy = "accountCard")
    private List<AccountCard> accountCards;

    @OneToMany(mappedBy = "creditCard")
    private List<CreditCard> creditCards;

    @OneToMany(mappedBy = "virtualCard")
    private List<VirtualCard> virtualCards;

}
