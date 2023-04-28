package com.etiya.ecommerce.services.dtos.responses.customerOrder;

import com.etiya.ecommerce.entities.concrete.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListCustomerOrderResponse {
    private int id;
    private String statusCode;
    private String placed;
    private String paid;
    private String price;
    private String details;
    private String customerName;
}
