package com.etiya.ecommerce.services.dtos.responses.address;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListAddressResponse {

    private int id;

    private String address;

    private String city;

    private String country;
}
