package com.etiya.ecommerce.entities.concrete;

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
    private double price;

    @Column(name = "details")
    private String details;

    @Column(name = "name")
    private String name;


    @ManyToOne()
    @JoinColumn(name="supplier_id")
    private Supplier supplier;

    @OneToMany(mappedBy = "customerLike")
    private List<CustomerLike> customerLikes;

    @OneToMany(mappedBy = "customerOrderProduct")
    private List<CustomerOrderProduct> customerOrderProducts;

    @OneToMany(mappedBy = "ownerProduct")
    private List<OwnerProduct> ownerProducts;

    @OneToMany(mappedBy = "productCategory")
    private List<ProductCategory> productCategories;
}
