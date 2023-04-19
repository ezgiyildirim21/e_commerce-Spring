package com.etiya.ecommerce.entities.concrete;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "addresses")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "address_info")
    private String address;

    @Column(name = "city")
    private String city;

    @Column(name = "postcode")
    private int postcode;

     @Column(name = "country")
     private String country;

     @Column(name = "country_code")
     private String countryCode;

     @Column(name = "details")
     private String details;


     @OneToMany(mappedBy = "customerAddress")
     private List<CustomerAddress>customerAddresses;


}
