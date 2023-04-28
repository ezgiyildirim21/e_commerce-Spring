package com.etiya.ecommerce.repositories.abstracts;

import com.etiya.ecommerce.entities.concrete.Supplier;
import com.etiya.ecommerce.services.dtos.responses.supplier.ListSupplierResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ISupplierDao extends JpaRepository<Supplier, Integer> {

    @Query("SELECT sp FROM Supplier sp")
    List<Supplier> findAllBySupplier();

    @Query("SELECT sp.supplierId FROM Supplier sp")
    List<Supplier> findAllBySupplierById();

    @Query("SELECT sp.name FROM Supplier sp WHERE sp.name='Naz'")
    List<Supplier>supplierInName();

    @Query("SELECT sp.surname FROM Supplier sp WHERE sp.surname='Deniz'")
    List<Supplier>supplierInSurname();


    @Query("select new com.etiya.ecommerce.services.dtos.responses.supplier.ListSupplierResponse(s.name,s.surname)" +
            "from Supplier s ")
    List<ListSupplierResponse>getAll();
}
