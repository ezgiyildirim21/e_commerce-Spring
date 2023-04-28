package com.etiya.ecommerce.services.dtos.responses.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddProductResponse {

    private int supplierId;
    private String price;
    private String details;
    private String name;
}
