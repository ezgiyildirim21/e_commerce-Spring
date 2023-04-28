package com.etiya.ecommerce.services.dtos.responses.customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListCustomerResponse{

    private String fullName;
    private String details;

}
