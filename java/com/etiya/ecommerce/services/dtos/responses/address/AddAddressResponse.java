package com.etiya.ecommerce.services.dtos.responses.address;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class AddAddressResponse {

    private String address;
    private String city;
}
