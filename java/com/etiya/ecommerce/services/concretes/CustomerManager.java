package com.etiya.ecommerce.services.concretes;

import com.etiya.ecommerce.core.exception.ServiceException;
import com.etiya.ecommerce.core.utils.mapping.ModelMapperService;
import com.etiya.ecommerce.core.utils.result.DataResult;
import com.etiya.ecommerce.entities.concrete.Customer;
import com.etiya.ecommerce.repositories.abstracts.ICustomerDao;
import com.etiya.ecommerce.services.abstracts.CustomerService;
import com.etiya.ecommerce.services.dtos.requests.customer.AddCustomerRequest;
import com.etiya.ecommerce.services.dtos.responses.customer.AddCustomerResponse;
import com.etiya.ecommerce.services.dtos.responses.customer.GetByIdCustomerResponse;
import com.etiya.ecommerce.services.dtos.responses.customer.ListCustomerResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CustomerManager implements CustomerService {

    private ICustomerDao customerDao;
    private ModelMapperService mapperService;

    @Override
    public List<ListCustomerResponse> getAll() {
        List<Customer> customersList = customerDao.findAll();

        List<ListCustomerResponse> customerResponses = customersList.
                stream().
                map(customer -> {

                ListCustomerResponse customerResponse = mapperService.forResponse().map(customer, ListCustomerResponse.class);
                    return customerResponse;

                }).collect(Collectors.toList());

        return customerResponses;
    }

    @Override
    public GetByIdCustomerResponse getById(Integer id) {
        Optional<Customer> customerOptional = customerDao.findById(id);
        if (customerOptional.isEmpty()) {
            throw new RuntimeException("Aranılan id değerde customer bulunamadı");
        }
        Customer customerToId = customerOptional.get();
        GetByIdCustomerResponse response = mapperService.forResponse().map(customerToId, GetByIdCustomerResponse.class);
        return response;
    }

    @Override
    public DataResult<AddCustomerResponse> add(AddCustomerRequest addCustomerRequest) {
        Customer customer=new Customer();
        customer=mapperService.forRequest().map(addCustomerRequest,Customer.class);
        customerDao.save(customer);
        AddCustomerResponse addCustomerResponse= mapperService.forResponse().map(customer, AddCustomerResponse.class);
        return new DataResult<AddCustomerResponse>(addCustomerResponse,true,"Müşteri Eklendi");
    }

    protected Customer customerId(Integer customer){
       Optional <Customer>customerOptional=customerDao.findById(customer);
       if (customerOptional.isEmpty()){
           throw new ServiceException("ID Bulunamadı");
       }
       Customer customerr=customerOptional.get();
      return customerr;
    }

    /*
    customer.setFullName(addCustomerRequest.getFull_name());
        customer.setDetails(addCustomerRequest.getDetails());
        customer.setEmail(addCustomerRequest.getEmail());
        customer.setPhone(addCustomerRequest.getPhone());
     */

}
