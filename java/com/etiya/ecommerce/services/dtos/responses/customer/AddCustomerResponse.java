package com.etiya.ecommerce.services.dtos.responses.customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddCustomerResponse {

    private int customerId;
    private String fullName;
    private String customerDetails;
}
