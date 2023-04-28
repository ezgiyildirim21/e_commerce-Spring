package com.etiya.ecommerce.services.dtos.responses.supplier;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddSupplierResponse {
 private String name;
 private String surname;
 private String details;
 private String productName;
}

