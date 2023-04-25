package com.etiya.ecommerce.services.abstracts;

import com.etiya.ecommerce.entities.concrete.Address;


import java.util.List;

public interface AddressService {

    Address addAddress(Address address);

    Address addressGetById(Integer id);

    List<Address> getAll();

}
