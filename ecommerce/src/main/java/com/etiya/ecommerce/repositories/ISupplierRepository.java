package com.etiya.ecommerce.repositories;

import com.etiya.ecommerce.entities.concrete.Address;
import com.etiya.ecommerce.entities.concrete.Product;
import com.etiya.ecommerce.entities.concrete.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ISupplierRepository extends JpaRepository<Supplier, Integer> {

    @Query("SELECT sp FROM Supplier sp")
    List<Supplier> findAllBySupplier();

    @Query("SELECT sp.id FROM Supplier sp")
    List<Supplier> findAllBySupplierById();

    @Query("select sp.name from Supplier sp where sp.name='Naz'")
    List<Supplier>supplierInName();

    @Query("select sp.surname from Supplier sp where sp.surname='Deniz'")
    List<Supplier>supplierInSurname();
}
