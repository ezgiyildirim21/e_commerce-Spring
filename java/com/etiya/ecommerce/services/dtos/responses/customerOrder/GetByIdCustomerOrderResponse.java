package com.etiya.ecommerce.services.dtos.responses.customerOrder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetByIdCustomerOrderResponse {

    private int id;
    private String statusCode;

}
