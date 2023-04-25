package com.etiya.ecommerce.services.concretes;

import com.etiya.ecommerce.entities.concrete.Customer;
import com.etiya.ecommerce.repositories.abstracts.ICustomerDao;
import com.etiya.ecommerce.services.abstracts.CustomerService;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CustomerManager implements CustomerService {

    private ICustomerDao customerDao;

    @Override
    public List<Customer> getAll() {
        return customerDao.findAll();
    }

    @Override
    public Customer getById(Integer id) {
        Optional<Customer> customerOptional = customerDao.findById(id);
        if (customerOptional.isPresent()) {
            Customer customerToId = customerOptional.get();
            return customerToId;
        }
        return null;
    }

    @Override
    public Customer add(Customer customer) {
        if (customer.getFullName().isEmpty()) {
            return null;
        }
        return customerDao.save(customer);
    }


}
