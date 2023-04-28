package com.etiya.ecommerce.services.dtos.responses.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetByIdProductResponse {

    private int id;
    private String name;
}
