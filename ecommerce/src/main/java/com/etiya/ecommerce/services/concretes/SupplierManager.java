package com.etiya.ecommerce.services.concretes;

import com.etiya.ecommerce.entities.concrete.Supplier;
import com.etiya.ecommerce.repositories.abstracts.ISupplierDao;
import com.etiya.ecommerce.services.abstracts.SupplierService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@AllArgsConstructor
public class SupplierManager implements SupplierService {

    private ISupplierDao supplierDao;

    @Override
    public Supplier getById(Integer id) {
        Optional<Supplier> supplierOptional = supplierDao.findById(id);
        if (supplierOptional.isPresent()) {
            Supplier supplierToId = supplierOptional.get();
            return supplierToId;
        }
        return null;
    }

    @Override
    public Supplier add(Supplier supplier) {
        if (supplier.getName().isEmpty() || supplier.getSurname().isEmpty() || supplier.getDetails().isEmpty()) {
            return null;
        }
        return supplierDao.save(supplier);
    }

    @Override
    public List<Supplier> getAll() {
       List<Supplier>list= supplierDao.findAll();
       return list;
    }
}
