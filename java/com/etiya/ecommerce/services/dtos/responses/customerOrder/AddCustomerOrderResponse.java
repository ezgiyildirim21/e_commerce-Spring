package com.etiya.ecommerce.services.dtos.responses.customerOrder;


import com.etiya.ecommerce.entities.concrete.Customer;
import com.etiya.ecommerce.services.dtos.responses.customer.AddCustomerResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddCustomerOrderResponse {

    private int customerOrderId;
    private String statusCode;
    private String placed;
    private String paid;
    private String price;
    private int customerId;
    private String fullName;
}
