package com.etiya.ecommerce.services.dtos.responses.supplier;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class GetByIdSupplierResponse {

    private String name;
    private String surname;
}
