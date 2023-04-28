package com.etiya.ecommerce.services.abstracts;

import com.etiya.ecommerce.entities.concrete.Address;
import com.etiya.ecommerce.services.dtos.requests.address.AddAddressRequest;
import com.etiya.ecommerce.services.dtos.responses.address.AddAddressResponse;
import com.etiya.ecommerce.services.dtos.responses.address.GetByIdAddressResponse;
import com.etiya.ecommerce.services.dtos.responses.address.ListAddressResponse;


import java.util.List;

public interface AddressService {

    AddAddressResponse addAddress(AddAddressRequest addAddressRequest);

    GetByIdAddressResponse addressGetById(Integer id);

    List<ListAddressResponse> getAll();

}
