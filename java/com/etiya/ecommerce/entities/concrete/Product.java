package com.etiya.ecommerce.entities.concrete;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "products")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "price")
    private String price;

    @Column(name = "details")
    private String details;

    @Column(name = "name")
    private String name;


    @OneToMany(mappedBy = "product")
    private List<CustomerLike> customerLikes;

    @OneToMany(mappedBy = "product")
    private List<CustomerOrderProduct> customerOrderProducts;

    @OneToMany(mappedBy = "product")
    private List<OwnerProduct> ownerProducts;

    @OneToMany(mappedBy = "product")
    private List<ProductCategory> productCategories;
}
