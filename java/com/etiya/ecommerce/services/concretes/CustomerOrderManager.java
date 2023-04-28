package com.etiya.ecommerce.services.concretes;

import com.etiya.ecommerce.core.utils.mapping.ModelMapperService;
import com.etiya.ecommerce.entities.concrete.Customer;
import com.etiya.ecommerce.repositories.abstracts.CustomerOrderDao;
import com.etiya.ecommerce.services.abstracts.CustomerOrderService;
import com.etiya.ecommerce.entities.concrete.CustomerOrder;
import com.etiya.ecommerce.services.dtos.requests.customerOrder.AddCustomerOrderRequest;
import com.etiya.ecommerce.services.dtos.responses.customer.AddCustomerResponse;
import com.etiya.ecommerce.services.dtos.responses.customer.GetByIdCustomerResponse;
import com.etiya.ecommerce.services.dtos.responses.customerOrder.AddCustomerOrderResponse;
import com.etiya.ecommerce.services.dtos.responses.customerOrder.GetByIdCustomerOrderResponse;
import com.etiya.ecommerce.services.dtos.responses.customerOrder.ListCustomerOrderResponse;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CustomerOrderManager implements CustomerOrderService {

    private CustomerOrderDao customerOrderDao;

    private ModelMapperService modelMapperService;

    private CustomerManager customerManager;


    @Override
    public AddCustomerOrderResponse add(AddCustomerOrderRequest addCustomerOrderRequest) {

        Customer customer = customerManager.customerId(addCustomerOrderRequest.getCustomerId());

        CustomerOrder customerOrder = modelMapperService.forRequest().map(addCustomerOrderRequest, CustomerOrder.class);
        CustomerOrder saveCustomerOrder= customerOrderDao.save(customerOrder);

        AddCustomerOrderResponse response =modelMapperService.forResponse().map(saveCustomerOrder, AddCustomerOrderResponse.class);


        BeanUtils.copyProperties(customer, response);


        return response;

/*
        CustomerOrder customerOrder=new CustomerOrder();
        customerOrder.setCustomer(customer);
        customerOrder.setPlaced(addCustomerOrderRequest.getPlaced());
        customerOrder.setDetails(addCustomerOrderRequest.getDetails());
        customerOrder.setStatusCode(addCustomerOrderRequest.getStatusCode());
        customerOrder.setPaid(addCustomerOrderRequest.getPaid());
        customerOrder.setPrice(addCustomerOrderRequest.getPrice());

        customerOrderDao.save(customerOrder);

        AddCustomerOrderResponse response=new AddCustomerOrderResponse();


        response.setId(customerOrder.getId());
        response.setPaid(customerOrder.getPaid());
        response.setPrice(customerOrder.getPrice());
        response.setPlaced(customerOrder.getPlaced());
        response.setStatusCode(customerOrder.getStatusCode());
        response.setCustomerId(customerOrder.getCustomer().getId());
        response.setFullName(customerOrder.getCustomer().getFullName());


        return response;


 */

    }


    @Override
    public List<ListCustomerOrderResponse> getAll() {
        List<CustomerOrder> customerOrder = customerOrderDao.findAll();

        List<ListCustomerOrderResponse> responses = customerOrder.stream().map(customerOrder1 -> {
            ListCustomerOrderResponse customerOrder2 = modelMapperService.forResponse().
                    map(customerOrder1, ListCustomerOrderResponse.class);
            return customerOrder2;
        }).collect(Collectors.toList());

        return responses;
    }

    @Override
    public GetByIdCustomerOrderResponse getById(int id) {


        Optional<CustomerOrder> customerOrderOptional = customerOrderDao.findById(id);
        if (customerOrderOptional.isEmpty()) {
            throw new RuntimeException("İstenilen id değerinde bir sipariş (customer order) bulunamadı.");
        }
        CustomerOrder customerOrder = customerOrderOptional.get();
        GetByIdCustomerOrderResponse response = modelMapperService.forResponse().map(customerOrder, GetByIdCustomerOrderResponse.class);
        return response;
    }

}


