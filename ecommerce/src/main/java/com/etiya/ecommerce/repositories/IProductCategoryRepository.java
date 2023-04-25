package com.etiya.ecommerce.repositories;

import com.etiya.ecommerce.entities.concrete.Address;
import com.etiya.ecommerce.entities.concrete.Customer;
import com.etiya.ecommerce.entities.concrete.Product;
import com.etiya.ecommerce.entities.concrete.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductCategoryRepository extends JpaRepository<ProductCategory, Integer>{

    @Query("SELECT pc FROM ProductCategory pc")
    List<ProductCategory> findAllByProductCategory();

    @Query("SELECT pc.id FROM ProductCategory pc")
    List<ProductCategory> findAllByProductCategoryById();

    @Query("SELECT COUNT(pc.product) FROM ProductCategory pc")
    long countProductCategoryProduct();

    @Query("SELECT DISTINCT pc.name FROM ProductCategory pc")
    List<ProductCategory>differentCity();

    @Query("SELECT pc.name,pc.id,p.name FROM ProductCategory pc JOIN pc.product p")
    List<ProductCategory> getProductByProductCategory();

}
