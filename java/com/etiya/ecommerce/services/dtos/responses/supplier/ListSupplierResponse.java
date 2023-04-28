package com.etiya.ecommerce.services.dtos.responses.supplier;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListSupplierResponse{
    private String name;
    private String surname;
}
