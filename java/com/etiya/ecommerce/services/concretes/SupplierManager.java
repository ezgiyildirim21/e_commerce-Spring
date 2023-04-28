package com.etiya.ecommerce.services.concretes;

import com.etiya.ecommerce.core.exception.ServiceException;
import com.etiya.ecommerce.core.utils.mapping.ModelMapperService;
import com.etiya.ecommerce.entities.concrete.Supplier;
import com.etiya.ecommerce.repositories.abstracts.ISupplierDao;
import com.etiya.ecommerce.services.abstracts.SupplierService;
import com.etiya.ecommerce.services.dtos.requests.supplier.AddSupplierRequest;
import com.etiya.ecommerce.services.dtos.responses.supplier.AddSupplierResponse;
import com.etiya.ecommerce.services.dtos.responses.supplier.GetByIdSupplierResponse;
import com.etiya.ecommerce.services.dtos.responses.supplier.ListSupplierResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@AllArgsConstructor
public class SupplierManager implements SupplierService {

    private final ISupplierDao supplierDao;
    private final ModelMapperService mapperService;

    @Override
    public GetByIdSupplierResponse getById(Integer id) {
        Optional<Supplier> supplierOptional = supplierDao.findById(id);
        if (supplierOptional.isEmpty()) {
            throw new ServiceException("Aranılan Id'de supplier bulunamadı");
        }
        Supplier supplierToId = supplierOptional.get();
        GetByIdSupplierResponse response=mapperService.forResponse().map(supplierToId,GetByIdSupplierResponse.class);
        return response;
    }

    @Override
    public AddSupplierResponse add(AddSupplierRequest addSupplierRequest) {
        if (addSupplierRequest.getName().isEmpty() || addSupplierRequest.getSurname().isEmpty()) {
            throw new ServiceException("Supplier'ın Ad ve Soyad Alanı Boş Olamaz");
        }
        AddSupplierResponse response=mapperService.forResponse().map(addSupplierRequest,AddSupplierResponse.class);
        return response;
    }

    @Override
    public List<ListSupplierResponse> getAll() {
       return supplierDao.getAll();
    }
}
