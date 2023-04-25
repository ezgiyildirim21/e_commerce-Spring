package com.etiya.ecommerce.services.concretes;

import com.etiya.ecommerce.entities.concrete.Address;
import com.etiya.ecommerce.repositories.abstracts.IAddressDao;
import com.etiya.ecommerce.repositories.abstracts.ICustomerOrderDao;
import com.etiya.ecommerce.services.abstracts.AddressService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class AddressManager implements AddressService {

    private final IAddressDao addressDao;


    @Override
    public Address addressGetById(Integer id) {

        Optional<Address> addressOptional = addressDao.findById(id);
        if (addressOptional.isPresent()) {
            Address addressToId = addressOptional.get();
            return addressToId;
        }
        return null;
    }

    @Override
    public Address addAddress(Address address) {

        if (address.getAddress().isEmpty() || address.getCity().isEmpty()) {
            return null;
        }
        return addressDao.save(address);

    }

    @Override
    public List<Address> getAll() {
        return addressDao.findAll();
    }
}
