package com.etiya.ecommerce.services.dtos.responses.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListProductResponse {
    private double price;
    private String details;
    private String name;
}
