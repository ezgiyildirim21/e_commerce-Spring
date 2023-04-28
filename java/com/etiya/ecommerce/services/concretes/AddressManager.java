package com.etiya.ecommerce.services.concretes;

import com.etiya.ecommerce.core.utils.mapping.ModelMapperService;
import com.etiya.ecommerce.entities.concrete.Address;
import com.etiya.ecommerce.repositories.abstracts.IAddressDao;
import com.etiya.ecommerce.services.abstracts.AddressService;
import com.etiya.ecommerce.services.dtos.requests.address.AddAddressRequest;
import com.etiya.ecommerce.services.dtos.responses.address.AddAddressResponse;
import com.etiya.ecommerce.services.dtos.responses.address.GetByIdAddressResponse;
import com.etiya.ecommerce.services.dtos.responses.address.ListAddressResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class AddressManager implements AddressService {

    private final IAddressDao addressDao;
    private ModelMapperService mapperService;


    @Override
    public GetByIdAddressResponse addressGetById(Integer id) {

        Optional<Address> addressOptional = addressDao.findById(id);
        if (addressOptional.isEmpty()) {
            throw new RuntimeException("Aranılan Id değerinde Adres Bulunamadı ");
        }
        Address addressToId = addressOptional.get();
        GetByIdAddressResponse response = mapperService.forResponse().map(addressToId, GetByIdAddressResponse.class);
        return response;
    }

    @Override
    public AddAddressResponse addAddress(AddAddressRequest addAddressRequest) {

        Address address = mapperService.forRequest().map(addAddressRequest, Address.class);
        addressDao.save(address);

         AddAddressResponse addressResponse = mapperService.forResponse().map(address, AddAddressResponse.class);
         return addressResponse;

    }

    @Override
    public List<ListAddressResponse> getAll() {
        return addressDao.getAll();
    }
}
