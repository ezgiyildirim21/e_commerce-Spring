package com.etiya.ecommerce.services.concretes;

import com.etiya.ecommerce.repositories.abstracts.ICustomerOrderDao;
import com.etiya.ecommerce.services.abstracts.CustomerOrderService;
import com.etiya.ecommerce.entities.concrete.CustomerOrder;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CustomerOrderManager implements CustomerOrderService {

    private final ICustomerOrderDao customerOrderDao;

    @Override
    public CustomerOrder add(CustomerOrder customerOrder) {

        if (customerOrder.getStatusCode().isEmpty() || customerOrder.getPrice().isEmpty()) {
            return null;
        }
        return customerOrderDao.save(customerOrder);
    }


    @Override
    public List<CustomerOrder> getAll() {
        return customerOrderDao.findAll();
    }

    @Override
    public CustomerOrder getById(Integer id) {
        Optional<CustomerOrder> customerOrderOptional = customerOrderDao.findById(id);
        if (customerOrderOptional.isPresent()) {
            CustomerOrder customerOrderToId = customerOrderOptional.get();
            return customerOrderToId;
        }
        return null;
    }

}
